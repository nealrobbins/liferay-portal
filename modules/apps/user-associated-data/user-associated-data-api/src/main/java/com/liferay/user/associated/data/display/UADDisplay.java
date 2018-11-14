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

package com.liferay.user.associated.data.display;

import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.user.associated.data.component.UADComponent;

import java.io.Serializable;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Provides the necessary methods to count, retrieve, and display information
 * about entities of type {@code T} related to a user. Can also provide a URL to
 * allow an admin to edit the an entity.
 *
 * @author William Newbury
 */
public interface UADDisplay<T> extends UADComponent<T> {

	/**
	 * Returns a count of the number of entities of type {@code T} associated
	 * with the given userId.
	 *
	 * @param userId the userId whose data to count
	 * @return the number of entities associated with the userId
	 */
	public long count(long userId);

	/**
	 * Retrieves an entity of type {@code T}
	 *
	 * @param primaryKey the primaryKey of the entity to retrieve
	 * @return an entity of type {@code T}
	 * @throws Exception
	 */
	public T get(Serializable primaryKey) throws Exception;

	/**
	 * Returns an array of strings defining the field names to be used as table
	 * column headers when displaying a list of entities of type {@code T}
	 *
	 * @return an array of field names used for column headers
	 */
	public default String[] getColumnFieldNames() {
		return getDisplayFieldNames();
	}

	/**
	 * Returns an array of strings defining the names of fields to display
	 * when showing details about an entity of type {@code T}
	 *
	 * @return an array of field names identifying which information to display
	 */
	public String[] getDisplayFieldNames();

	/**
	 * Returns a string URL that allows the admin user to edit the entity. If
	 * {@code null} is returned then no edit option will be presented to the
	 * admin user.
	 *
	 * @param t the entity of type {@code T}
	 * @param liferayPortletRequest the current portlet request
	 * @param liferayPortletResponse the current portlet response
	 * @return a string URL, or {@code null}
	 * @throws Exception
	 */
	public default String getEditURL(
			T t, LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse)
		throws Exception {

		return null;
	}

	/**
	 * Returns a map of field names and values to be displayed in the UI.
	 *
	 * @param t the entity of type {@code T}
	 * @param fieldNames the field names for getting values from the entity
	 * @return a map of values to be displayed in the UI
	 */
	public Map<String, Object> getFieldValues(T t, String[] fieldNames);

	/**
	 * Returns the value representing the primary key of the entity of type
	 * {@code T}
	 *
	 * @param t the entity to retrieve the primary key for
	 * @return the primary key of the entity
	 */
	public Serializable getPrimaryKey(T t);

	/**
	 * Returns a paginated list of entities of type {@code T} associated with a
	 * user.
	 *
	 * @param userId the userId whose data to get
	 * @param start the starting index of the result set, for pagination
	 * @param end the ending index of the result set, for pagination
	 * @return a paginated list of entities related to the userId
	 */
	public List<T> getRange(long userId, int start, int end);

	/**
	 * Returns a localized string representing type {@code T}.
	 *
	 * @param locale the current locale
	 * @return a localized string representing type {@code T}
	 */
	public String getTypeName(Locale locale);

}