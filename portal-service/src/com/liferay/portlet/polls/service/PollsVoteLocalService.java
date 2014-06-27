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

package com.liferay.portlet.polls.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for PollsVote. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see PollsVoteLocalServiceUtil
 * @see com.liferay.portlet.polls.service.base.PollsVoteLocalServiceBaseImpl
 * @see com.liferay.portlet.polls.service.impl.PollsVoteLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface PollsVoteLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PollsVoteLocalServiceUtil} to access the polls vote local service. Add custom service methods to {@link com.liferay.portlet.polls.service.impl.PollsVoteLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the polls vote to the database. Also notifies the appropriate model listeners.
	*
	* @param pollsVote the polls vote
	* @return the polls vote that was added
	*/
	public com.liferay.portlet.polls.model.PollsVote addPollsVote(
		com.liferay.portlet.polls.model.PollsVote pollsVote);

	/**
	* Creates a new polls vote with the primary key. Does not add the polls vote to the database.
	*
	* @param voteId the primary key for the new polls vote
	* @return the new polls vote
	*/
	public com.liferay.portlet.polls.model.PollsVote createPollsVote(
		long voteId);

	/**
	* Deletes the polls vote with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param voteId the primary key of the polls vote
	* @return the polls vote that was removed
	* @throws PortalException if a polls vote with the primary key could not be found
	*/
	public com.liferay.portlet.polls.model.PollsVote deletePollsVote(
		long voteId) throws com.liferay.portal.kernel.exception.PortalException;

	/**
	* Deletes the polls vote from the database. Also notifies the appropriate model listeners.
	*
	* @param pollsVote the polls vote
	* @return the polls vote that was removed
	*/
	public com.liferay.portlet.polls.model.PollsVote deletePollsVote(
		com.liferay.portlet.polls.model.PollsVote pollsVote);

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.polls.model.impl.PollsVoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.polls.model.impl.PollsVoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.polls.model.PollsVote fetchPollsVote(long voteId);

	/**
	* Returns the polls vote with the matching UUID and company.
	*
	* @param uuid the polls vote's UUID
	* @param companyId the primary key of the company
	* @return the matching polls vote, or <code>null</code> if a matching polls vote could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.polls.model.PollsVote fetchPollsVoteByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

	/**
	* Returns the polls vote matching the UUID and group.
	*
	* @param uuid the polls vote's UUID
	* @param groupId the primary key of the group
	* @return the matching polls vote, or <code>null</code> if a matching polls vote could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.polls.model.PollsVote fetchPollsVoteByUuidAndGroupId(
		java.lang.String uuid, long groupId);

	/**
	* Returns the polls vote with the primary key.
	*
	* @param voteId the primary key of the polls vote
	* @return the polls vote
	* @throws PortalException if a polls vote with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.polls.model.PollsVote getPollsVote(long voteId)
		throws com.liferay.portal.kernel.exception.PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.portal.kernel.lar.PortletDataContext portletDataContext);

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException;

	/**
	* Returns the polls vote with the matching UUID and company.
	*
	* @param uuid the polls vote's UUID
	* @param companyId the primary key of the company
	* @return the matching polls vote
	* @throws PortalException if a matching polls vote could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.polls.model.PollsVote getPollsVoteByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException;

	/**
	* Returns the polls vote matching the UUID and group.
	*
	* @param uuid the polls vote's UUID
	* @param groupId the primary key of the group
	* @return the matching polls vote
	* @throws PortalException if a matching polls vote could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.polls.model.PollsVote getPollsVoteByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException;

	/**
	* Returns a range of all the polls votes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.polls.model.impl.PollsVoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of polls votes
	* @param end the upper bound of the range of polls votes (not inclusive)
	* @return the range of polls votes
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.polls.model.PollsVote> getPollsVotes(
		int start, int end);

	/**
	* Returns the number of polls votes.
	*
	* @return the number of polls votes
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPollsVotesCount();

	/**
	* Updates the polls vote in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pollsVote the polls vote
	* @return the polls vote that was updated
	*/
	public com.liferay.portlet.polls.model.PollsVote updatePollsVote(
		com.liferay.portlet.polls.model.PollsVote pollsVote);

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public com.liferay.portlet.polls.model.PollsVote addVote(long userId,
		long questionId, long choiceId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.polls.model.PollsVote> getChoiceVotes(
		long choiceId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getChoiceVotesCount(long choiceId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portlet.polls.model.PollsVote> getQuestionVotes(
		long questionId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getQuestionVotesCount(long questionId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portlet.polls.model.PollsVote getVote(long questionId,
		long userId) throws com.liferay.portal.kernel.exception.PortalException;
}