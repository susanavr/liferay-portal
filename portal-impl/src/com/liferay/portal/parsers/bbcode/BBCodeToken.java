/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.parsers.bbcode;

/**
 * @author Iliyan Peychev
 */
public class BBCodeToken {

	public BBCodeToken(
			String startTag, String attribute, String endTag, int start,
			int end) {

		_attribute = attribute;
		_end = end;
		_endTag = endTag != null ? endTag.toLowerCase() : null;
		_start = start;
		_startTag = startTag != null ? startTag.toLowerCase() : null;
	}

	public BBCodeToken(String endTag) {
		_endTag = endTag;
	}

	public String getAttribute() {
		return _attribute;
	}

	public int getEnd() {
		return _end;
	}

	public String getEndTag() {
		return _endTag;
	}

	public int getStart() {
		return _start;
	}

	public String getStartTag() {
		return _startTag;
	}

	public void setAttribute(String attribute) {
		this._attribute = attribute;
	}

	private String _attribute;
	private int _end;
	private String _endTag;
	private int _start;
	private String _startTag;

}