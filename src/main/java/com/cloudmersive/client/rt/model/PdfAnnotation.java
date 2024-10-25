/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.rt.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PDF Annotation details
 */
@JsonPropertyOrder({
  PdfAnnotation.JSON_PROPERTY_TITLE,
  PdfAnnotation.JSON_PROPERTY_ANNOTATION_TYPE,
  PdfAnnotation.JSON_PROPERTY_PAGE_NUMBER,
  PdfAnnotation.JSON_PROPERTY_ANNOTATION_INDEX,
  PdfAnnotation.JSON_PROPERTY_SUBJECT,
  PdfAnnotation.JSON_PROPERTY_TEXT_CONTENTS,
  PdfAnnotation.JSON_PROPERTY_CREATION_DATE,
  PdfAnnotation.JSON_PROPERTY_MODIFIED_DATE,
  PdfAnnotation.JSON_PROPERTY_LEFT_X,
  PdfAnnotation.JSON_PROPERTY_TOP_Y,
  PdfAnnotation.JSON_PROPERTY_WIDTH,
  PdfAnnotation.JSON_PROPERTY_HEIGHT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PdfAnnotation {
  public static final String JSON_PROPERTY_TITLE = "Title";
  private String title;

  public static final String JSON_PROPERTY_ANNOTATION_TYPE = "AnnotationType";
  private String annotationType;

  public static final String JSON_PROPERTY_PAGE_NUMBER = "PageNumber";
  private Integer pageNumber;

  public static final String JSON_PROPERTY_ANNOTATION_INDEX = "AnnotationIndex";
  private Integer annotationIndex;

  public static final String JSON_PROPERTY_SUBJECT = "Subject";
  private String subject;

  public static final String JSON_PROPERTY_TEXT_CONTENTS = "TextContents";
  private String textContents;

  public static final String JSON_PROPERTY_CREATION_DATE = "CreationDate";
  private OffsetDateTime creationDate;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "ModifiedDate";
  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_LEFT_X = "LeftX";
  private Double leftX;

  public static final String JSON_PROPERTY_TOP_Y = "TopY";
  private Double topY;

  public static final String JSON_PROPERTY_WIDTH = "Width";
  private Double width;

  public static final String JSON_PROPERTY_HEIGHT = "Height";
  private Double height;

  public PdfAnnotation() {
  }

  public PdfAnnotation title(String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Title of the annotation; this is often the author of the annotation in Acrobat-created PDF files
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }

  public PdfAnnotation annotationType(String annotationType) {
    
    this.annotationType = annotationType;
    return this;
  }

  /**
   * Type of the annotation; possible values are Text
   * @return annotationType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANNOTATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnnotationType() {
    return annotationType;
  }


  @JsonProperty(JSON_PROPERTY_ANNOTATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnotationType(String annotationType) {
    this.annotationType = annotationType;
  }

  public PdfAnnotation pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * The 1-based index of the page containing the annotation
   * @return pageNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNumber() {
    return pageNumber;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PdfAnnotation annotationIndex(Integer annotationIndex) {
    
    this.annotationIndex = annotationIndex;
    return this;
  }

  /**
   * The 0-based index of the annotation in the document
   * @return annotationIndex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANNOTATION_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAnnotationIndex() {
    return annotationIndex;
  }


  @JsonProperty(JSON_PROPERTY_ANNOTATION_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnotationIndex(Integer annotationIndex) {
    this.annotationIndex = annotationIndex;
  }

  public PdfAnnotation subject(String subject) {
    
    this.subject = subject;
    return this;
  }

  /**
   * Subject of the annotation
   * @return subject
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }

  public PdfAnnotation textContents(String textContents) {
    
    this.textContents = textContents;
    return this;
  }

  /**
   * Text contents of the annotation
   * @return textContents
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextContents() {
    return textContents;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextContents(String textContents) {
    this.textContents = textContents;
  }

  public PdfAnnotation creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date that the annotation was created
   * @return creationDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public PdfAnnotation modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Date that the annotation was last modified
   * @return modifiedDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public PdfAnnotation leftX(Double leftX) {
    
    this.leftX = leftX;
    return this;
  }

  /**
   * Left X coordinate for the location of the annotation
   * @return leftX
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEFT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLeftX() {
    return leftX;
  }


  @JsonProperty(JSON_PROPERTY_LEFT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeftX(Double leftX) {
    this.leftX = leftX;
  }

  public PdfAnnotation topY(Double topY) {
    
    this.topY = topY;
    return this;
  }

  /**
   * Top Y coordination of the location of the annotation
   * @return topY
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOP_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTopY() {
    return topY;
  }


  @JsonProperty(JSON_PROPERTY_TOP_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopY(Double topY) {
    this.topY = topY;
  }

  public PdfAnnotation width(Double width) {
    
    this.width = width;
    return this;
  }

  /**
   * Width of the annotation
   * @return width
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Double width) {
    this.width = width;
  }

  public PdfAnnotation height(Double height) {
    
    this.height = height;
    return this;
  }

  /**
   * Height of the annotation
   * @return height
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Double height) {
    this.height = height;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfAnnotation pdfAnnotation = (PdfAnnotation) o;
    return Objects.equals(this.title, pdfAnnotation.title) &&
        Objects.equals(this.annotationType, pdfAnnotation.annotationType) &&
        Objects.equals(this.pageNumber, pdfAnnotation.pageNumber) &&
        Objects.equals(this.annotationIndex, pdfAnnotation.annotationIndex) &&
        Objects.equals(this.subject, pdfAnnotation.subject) &&
        Objects.equals(this.textContents, pdfAnnotation.textContents) &&
        Objects.equals(this.creationDate, pdfAnnotation.creationDate) &&
        Objects.equals(this.modifiedDate, pdfAnnotation.modifiedDate) &&
        Objects.equals(this.leftX, pdfAnnotation.leftX) &&
        Objects.equals(this.topY, pdfAnnotation.topY) &&
        Objects.equals(this.width, pdfAnnotation.width) &&
        Objects.equals(this.height, pdfAnnotation.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, annotationType, pageNumber, annotationIndex, subject, textContents, creationDate, modifiedDate, leftX, topY, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfAnnotation {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    annotationType: ").append(toIndentedString(annotationType)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    annotationIndex: ").append(toIndentedString(annotationIndex)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    textContents: ").append(toIndentedString(textContents)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    leftX: ").append(toIndentedString(leftX)).append("\n");
    sb.append("    topY: ").append(toIndentedString(topY)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

