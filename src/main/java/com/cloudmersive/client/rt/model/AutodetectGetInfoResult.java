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
import com.cloudmersive.client.rt.model.AlternateFileFormatCandidate;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Result of an autodetect/get-info operation
 */
@ApiModel(description = "Result of an autodetect/get-info operation")
@JsonPropertyOrder({
  AutodetectGetInfoResult.JSON_PROPERTY_SUCCESSFUL,
  AutodetectGetInfoResult.JSON_PROPERTY_DETECTED_FILE_EXTENSION,
  AutodetectGetInfoResult.JSON_PROPERTY_DETECTED_MIME_TYPE,
  AutodetectGetInfoResult.JSON_PROPERTY_PAGE_COUNT,
  AutodetectGetInfoResult.JSON_PROPERTY_AUTHOR,
  AutodetectGetInfoResult.JSON_PROPERTY_DATE_MODIFIED,
  AutodetectGetInfoResult.JSON_PROPERTY_ALTERNATE_FILE_TYPE_CANDIDATES
})
@JsonTypeName("AutodetectGetInfoResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:47:19.979-08:00[America/Los_Angeles]")
public class AutodetectGetInfoResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_DETECTED_FILE_EXTENSION = "DetectedFileExtension";
  private String detectedFileExtension;

  public static final String JSON_PROPERTY_DETECTED_MIME_TYPE = "DetectedMimeType";
  private String detectedMimeType;

  public static final String JSON_PROPERTY_PAGE_COUNT = "PageCount";
  private Long pageCount;

  public static final String JSON_PROPERTY_AUTHOR = "Author";
  private String author;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "DateModified";
  private OffsetDateTime dateModified;

  public static final String JSON_PROPERTY_ALTERNATE_FILE_TYPE_CANDIDATES = "AlternateFileTypeCandidates";
  private List<AlternateFileFormatCandidate> alternateFileTypeCandidates = null;


  public AutodetectGetInfoResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public AutodetectGetInfoResult detectedFileExtension(String detectedFileExtension) {
    
    this.detectedFileExtension = detectedFileExtension;
    return this;
  }

   /**
   * Detected file extension of the file format, with a leading period
   * @return detectedFileExtension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Detected file extension of the file format, with a leading period")
  @JsonProperty(JSON_PROPERTY_DETECTED_FILE_EXTENSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetectedFileExtension() {
    return detectedFileExtension;
  }


  public void setDetectedFileExtension(String detectedFileExtension) {
    this.detectedFileExtension = detectedFileExtension;
  }


  public AutodetectGetInfoResult detectedMimeType(String detectedMimeType) {
    
    this.detectedMimeType = detectedMimeType;
    return this;
  }

   /**
   * MIME type of this file extension
   * @return detectedMimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MIME type of this file extension")
  @JsonProperty(JSON_PROPERTY_DETECTED_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetectedMimeType() {
    return detectedMimeType;
  }


  public void setDetectedMimeType(String detectedMimeType) {
    this.detectedMimeType = detectedMimeType;
  }


  public AutodetectGetInfoResult pageCount(Long pageCount) {
    
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Number of pages in a page-based document; for presentations, this is the number of slides and for a spreadsheet this is the number of worksheets.  Contains 0 when the page count cannot be determined, or if the concept of page count does not apply (e.g. for an image)
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of pages in a page-based document; for presentations, this is the number of slides and for a spreadsheet this is the number of worksheets.  Contains 0 when the page count cannot be determined, or if the concept of page count does not apply (e.g. for an image)")
  @JsonProperty(JSON_PROPERTY_PAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPageCount() {
    return pageCount;
  }


  public void setPageCount(Long pageCount) {
    this.pageCount = pageCount;
  }


  public AutodetectGetInfoResult author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * User name of the creator/author of the document, if available, null if not available
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User name of the creator/author of the document, if available, null if not available")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    this.author = author;
  }


  public AutodetectGetInfoResult dateModified(OffsetDateTime dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * The timestamp that the document was last modified, if available, null if not available
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp that the document was last modified, if available, null if not available")
  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateModified() {
    return dateModified;
  }


  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }


  public AutodetectGetInfoResult alternateFileTypeCandidates(List<AlternateFileFormatCandidate> alternateFileTypeCandidates) {
    
    this.alternateFileTypeCandidates = alternateFileTypeCandidates;
    return this;
  }

  public AutodetectGetInfoResult addAlternateFileTypeCandidatesItem(AlternateFileFormatCandidate alternateFileTypeCandidatesItem) {
    if (this.alternateFileTypeCandidates == null) {
      this.alternateFileTypeCandidates = new ArrayList<AlternateFileFormatCandidate>();
    }
    this.alternateFileTypeCandidates.add(alternateFileTypeCandidatesItem);
    return this;
  }

   /**
   * Alternate file type options and their probability
   * @return alternateFileTypeCandidates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alternate file type options and their probability")
  @JsonProperty(JSON_PROPERTY_ALTERNATE_FILE_TYPE_CANDIDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AlternateFileFormatCandidate> getAlternateFileTypeCandidates() {
    return alternateFileTypeCandidates;
  }


  public void setAlternateFileTypeCandidates(List<AlternateFileFormatCandidate> alternateFileTypeCandidates) {
    this.alternateFileTypeCandidates = alternateFileTypeCandidates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutodetectGetInfoResult autodetectGetInfoResult = (AutodetectGetInfoResult) o;
    return Objects.equals(this.successful, autodetectGetInfoResult.successful) &&
        Objects.equals(this.detectedFileExtension, autodetectGetInfoResult.detectedFileExtension) &&
        Objects.equals(this.detectedMimeType, autodetectGetInfoResult.detectedMimeType) &&
        Objects.equals(this.pageCount, autodetectGetInfoResult.pageCount) &&
        Objects.equals(this.author, autodetectGetInfoResult.author) &&
        Objects.equals(this.dateModified, autodetectGetInfoResult.dateModified) &&
        Objects.equals(this.alternateFileTypeCandidates, autodetectGetInfoResult.alternateFileTypeCandidates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, detectedFileExtension, detectedMimeType, pageCount, author, dateModified, alternateFileTypeCandidates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutodetectGetInfoResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    detectedFileExtension: ").append(toIndentedString(detectedFileExtension)).append("\n");
    sb.append("    detectedMimeType: ").append(toIndentedString(detectedMimeType)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    alternateFileTypeCandidates: ").append(toIndentedString(alternateFileTypeCandidates)).append("\n");
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
