/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portalweb.stagingcommunity.webcontentdisplay.usecase.demo1;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class WCC_SubmitForPublicationMainVariationHomeSiteStagingTest
	extends BaseTestCase {
	public void testWCC_SubmitForPublicationMainVariationHomeSiteStaging()
		throws Exception {
		selenium.open("/web/community-site-test/home");
		loadRequiredJavaScriptModules();

		for (int second = 0;; second++) {
			if (second >= 90) {
				fail("timeout");
			}

			try {
				if (selenium.isVisible("link=Staging")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.clickAt("link=Staging", RuntimeVariables.replace("Staging"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		assertTrue(selenium.isTextPresent("This is a Web Content article"));
		assertEquals(RuntimeVariables.replace("Draft"),
			selenium.getText("//strong[@class='workflow-status-draft']"));
		assertEquals(RuntimeVariables.replace("Submit for Publication"),
			selenium.getText("//button[3]"));
		selenium.clickAt("//button[3]",
			RuntimeVariables.replace("Submit for Publication"));
		Thread.sleep(5000);
		assertEquals(RuntimeVariables.replace("Pending (Review)"),
			selenium.getText("//strong[@class='workflow-status-pending']"));
		selenium.open("/web/community-site-test/home");
		loadRequiredJavaScriptModules();
		assertFalse(selenium.isTextPresent("This is a Web Content article"));
	}
}