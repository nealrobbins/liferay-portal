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

package com.liferay.headless.delivery.client.dto.v1_0;

import com.liferay.headless.delivery.client.function.UnsafeSupplier;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class BlogPosting {

	public static enum ViewableBy {

		ANYONE("Anyone"), MEMBERS("Members"), OWNER("Owner");

		public static ViewableBy create(String value) {
			for (ViewableBy viewableBy : values()) {
				if (Objects.equals(viewableBy.getValue(), value)) {
					return viewableBy;
				}
			}

			return null;
		}

		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private ViewableBy(String value) {
			_value = value;
		}

		private final String _value;

	}

	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	public void setAggregateRating(
		UnsafeSupplier<AggregateRating, Exception>
			aggregateRatingUnsafeSupplier) {

		try {
			aggregateRating = aggregateRatingUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected AggregateRating aggregateRating;

	public String getAlternativeHeadline() {
		return alternativeHeadline;
	}

	public void setAlternativeHeadline(String alternativeHeadline) {
		this.alternativeHeadline = alternativeHeadline;
	}

	public void setAlternativeHeadline(
		UnsafeSupplier<String, Exception> alternativeHeadlineUnsafeSupplier) {

		try {
			alternativeHeadline = alternativeHeadlineUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String alternativeHeadline;

	public String getArticleBody() {
		return articleBody;
	}

	public void setArticleBody(String articleBody) {
		this.articleBody = articleBody;
	}

	public void setArticleBody(
		UnsafeSupplier<String, Exception> articleBodyUnsafeSupplier) {

		try {
			articleBody = articleBodyUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String articleBody;

	public Creator getCreator() {
		return creator;
	}

	public void setCreator(Creator creator) {
		this.creator = creator;
	}

	public void setCreator(
		UnsafeSupplier<Creator, Exception> creatorUnsafeSupplier) {

		try {
			creator = creatorUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Creator creator;

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setDateCreated(
		UnsafeSupplier<Date, Exception> dateCreatedUnsafeSupplier) {

		try {
			dateCreated = dateCreatedUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date dateCreated;

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public void setDateModified(
		UnsafeSupplier<Date, Exception> dateModifiedUnsafeSupplier) {

		try {
			dateModified = dateModifiedUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date dateModified;

	public Date getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}

	public void setDatePublished(
		UnsafeSupplier<Date, Exception> datePublishedUnsafeSupplier) {

		try {
			datePublished = datePublishedUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date datePublished;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

		try {
			description = descriptionUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String description;

	public String getEncodingFormat() {
		return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	public void setEncodingFormat(
		UnsafeSupplier<String, Exception> encodingFormatUnsafeSupplier) {

		try {
			encodingFormat = encodingFormatUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String encodingFormat;

	public String getFriendlyUrlPath() {
		return friendlyUrlPath;
	}

	public void setFriendlyUrlPath(String friendlyUrlPath) {
		this.friendlyUrlPath = friendlyUrlPath;
	}

	public void setFriendlyUrlPath(
		UnsafeSupplier<String, Exception> friendlyUrlPathUnsafeSupplier) {

		try {
			friendlyUrlPath = friendlyUrlPathUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String friendlyUrlPath;

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public void setHeadline(
		UnsafeSupplier<String, Exception> headlineUnsafeSupplier) {

		try {
			headline = headlineUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String headline;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setId(UnsafeSupplier<Long, Exception> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long id;

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public void setImage(UnsafeSupplier<Image, Exception> imageUnsafeSupplier) {
		try {
			image = imageUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Image image;

	public String[] getKeywords() {
		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	public void setKeywords(
		UnsafeSupplier<String[], Exception> keywordsUnsafeSupplier) {

		try {
			keywords = keywordsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String[] keywords;

	public Number getNumberOfComments() {
		return numberOfComments;
	}

	public void setNumberOfComments(Number numberOfComments) {
		this.numberOfComments = numberOfComments;
	}

	public void setNumberOfComments(
		UnsafeSupplier<Number, Exception> numberOfCommentsUnsafeSupplier) {

		try {
			numberOfComments = numberOfCommentsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Number numberOfComments;

	public Long getSiteId() {
		return siteId;
	}

	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}

	public void setSiteId(
		UnsafeSupplier<Long, Exception> siteIdUnsafeSupplier) {

		try {
			siteId = siteIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long siteId;

	public TaxonomyCategory[] getTaxonomyCategories() {
		return taxonomyCategories;
	}

	public void setTaxonomyCategories(TaxonomyCategory[] taxonomyCategories) {
		this.taxonomyCategories = taxonomyCategories;
	}

	public void setTaxonomyCategories(
		UnsafeSupplier<TaxonomyCategory[], Exception>
			taxonomyCategoriesUnsafeSupplier) {

		try {
			taxonomyCategories = taxonomyCategoriesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected TaxonomyCategory[] taxonomyCategories;

	public Long[] getTaxonomyCategoryIds() {
		return taxonomyCategoryIds;
	}

	public void setTaxonomyCategoryIds(Long[] taxonomyCategoryIds) {
		this.taxonomyCategoryIds = taxonomyCategoryIds;
	}

	public void setTaxonomyCategoryIds(
		UnsafeSupplier<Long[], Exception> taxonomyCategoryIdsUnsafeSupplier) {

		try {
			taxonomyCategoryIds = taxonomyCategoryIdsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long[] taxonomyCategoryIds;

	public ViewableBy getViewableBy() {
		return viewableBy;
	}

	public String getViewableByAsString() {
		if (viewableBy == null) {
			return null;
		}

		return viewableBy.toString();
	}

	public void setViewableBy(ViewableBy viewableBy) {
		this.viewableBy = viewableBy;
	}

	public void setViewableBy(
		UnsafeSupplier<ViewableBy, Exception> viewableByUnsafeSupplier) {

		try {
			viewableBy = viewableByUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ViewableBy viewableBy;

}