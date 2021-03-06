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

package com.liferay.headless.delivery.client.serdes.v1_0;

import com.liferay.headless.delivery.client.dto.v1_0.ParentKnowledgeBaseFolder;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ParentKnowledgeBaseFolderSerDes {

	public static ParentKnowledgeBaseFolder toDTO(String json) {
		ParentKnowledgeBaseFolderJSONParser
			parentKnowledgeBaseFolderJSONParser =
				new ParentKnowledgeBaseFolderJSONParser();

		return parentKnowledgeBaseFolderJSONParser.parseToDTO(json);
	}

	public static ParentKnowledgeBaseFolder[] toDTOs(String json) {
		ParentKnowledgeBaseFolderJSONParser
			parentKnowledgeBaseFolderJSONParser =
				new ParentKnowledgeBaseFolderJSONParser();

		return parentKnowledgeBaseFolderJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		ParentKnowledgeBaseFolder parentKnowledgeBaseFolder) {

		if (parentKnowledgeBaseFolder == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"folderId\": ");

		if (parentKnowledgeBaseFolder.getFolderId() == null) {
			sb.append("null");
		}
		else {
			sb.append(parentKnowledgeBaseFolder.getFolderId());
		}

		sb.append(", ");

		sb.append("\"folderName\": ");

		if (parentKnowledgeBaseFolder.getFolderName() == null) {
			sb.append("null");
		}
		else {
			sb.append("\"");

			sb.append(parentKnowledgeBaseFolder.getFolderName());

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	private static class ParentKnowledgeBaseFolderJSONParser
		extends BaseJSONParser<ParentKnowledgeBaseFolder> {

		protected ParentKnowledgeBaseFolder createDTO() {
			return new ParentKnowledgeBaseFolder();
		}

		protected ParentKnowledgeBaseFolder[] createDTOArray(int size) {
			return new ParentKnowledgeBaseFolder[size];
		}

		protected void setField(
			ParentKnowledgeBaseFolder parentKnowledgeBaseFolder,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "folderId")) {
				if (jsonParserFieldValue != null) {
					parentKnowledgeBaseFolder.setFolderId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "folderName")) {
				if (jsonParserFieldValue != null) {
					parentKnowledgeBaseFolder.setFolderName(
						(String)jsonParserFieldValue);
				}
			}
			else {
				throw new IllegalArgumentException(
					"Unsupported field name " + jsonParserFieldName);
			}
		}

	}

}