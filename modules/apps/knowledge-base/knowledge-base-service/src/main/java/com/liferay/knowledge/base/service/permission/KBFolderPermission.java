/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.knowledge.base.service.permission;

import com.liferay.knowledge.base.constants.KBFolderConstants;
import com.liferay.knowledge.base.model.KBFolder;
import com.liferay.knowledge.base.service.KBFolderLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.util.PropsValues;

import org.osgi.service.component.annotations.Component;

/**
 * @author Adolfo Pérez
 * @author Roberto Díaz
 */
@Component(
	property = {"model.class.name=com.liferay.knowledge.base.model.KBFolder"},
	service = BaseModelPermissionChecker.class
)
public class KBFolderPermission implements BaseModelPermissionChecker {

	public static void check(
			PermissionChecker permissionChecker, KBFolder kbFolder,
			String actionId)
		throws PortalException {

		if (!contains(permissionChecker, kbFolder, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(
			PermissionChecker permissionChecker, long groupId, long kbFolderId,
			String actionId)
		throws PortalException {

		if (!contains(permissionChecker, groupId, kbFolderId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(
			PermissionChecker permissionChecker, long kbFolderId,
			String actionId)
		throws PortalException {

		KBFolder kbFolder = KBFolderLocalServiceUtil.getKBFolder(kbFolderId);

		check(permissionChecker, kbFolder, actionId);
	}

	public static boolean contains(
			PermissionChecker permissionChecker, KBFolder kbFolder,
			String actionId)
		throws PortalException {

		if (actionId.equals(ActionKeys.VIEW) &&
			PropsValues.PERMISSIONS_VIEW_DYNAMIC_INHERITANCE) {

			if (!contains(
					permissionChecker, kbFolder.getGroupId(),
					kbFolder.getParentKBFolderId(), actionId)) {

				return false;
			}
		}

		if (permissionChecker.hasOwnerPermission(
				kbFolder.getCompanyId(), KBFolder.class.getName(),
				kbFolder.getKbFolderId(), kbFolder.getUserId(), actionId)) {

			return true;
		}

		return permissionChecker.hasPermission(
			kbFolder.getGroupId(), KBFolder.class.getName(),
			kbFolder.getKbFolderId(), actionId);
	}

	public static boolean contains(
			PermissionChecker permissionChecker, long groupId, long kbFolderId,
			String actionId)
		throws PortalException {

		if (kbFolderId == KBFolderConstants.DEFAULT_PARENT_FOLDER_ID) {
			return AdminPermission.contains(
				permissionChecker, groupId, actionId);
		}

		KBFolder kbFolder = KBFolderLocalServiceUtil.getKBFolder(kbFolderId);

		return contains(permissionChecker, kbFolder, actionId);
	}

	@Override
	public void checkBaseModel(
			PermissionChecker permissionChecker, long groupId, long primaryKey,
			String actionId)
		throws PortalException {

		check(permissionChecker, groupId, primaryKey, actionId);
	}

}