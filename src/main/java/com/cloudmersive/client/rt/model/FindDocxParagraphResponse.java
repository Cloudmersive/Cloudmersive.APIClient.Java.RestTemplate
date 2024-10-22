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
import com.cloudmersive.client.rt.model.DocxParagraph;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of performing a find matching paragraphs operation on a Word Document
 */
@JsonPropertyOrder({
  FindDocxParagraphResponse.JSON_PROPERTY_SUCCESSFUL,
  FindDocxParagraphResponse.JSON_PROPERTY_MATCHING_PARAGRAPHS,
  FindDocxParagraphResponse.JSON_PROPERTY_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FindDocxParagraphResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_MATCHING_PARAGRAPHS = "MatchingParagraphs";
  private List<DocxParagraph> matchingParagraphs = new ArrayList<>();

  public static final String JSON_PROPERTY_COUNT = "Count";
  private Integer count;

  public FindDocxParagraphResponse() {
  }

  public FindDocxParagraphResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if successful; false otherwise
   * @return successful
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public FindDocxParagraphResponse matchingParagraphs(List<DocxParagraph> matchingParagraphs) {
    
    this.matchingParagraphs = matchingParagraphs;
    return this;
  }

  public FindDocxParagraphResponse addMatchingParagraphsItem(DocxParagraph matchingParagraphsItem) {
    if (this.matchingParagraphs == null) {
      this.matchingParagraphs = new ArrayList<>();
    }
    this.matchingParagraphs.add(matchingParagraphsItem);
    return this;
  }

  /**
   * Matching paragraphs
   * @return matchingParagraphs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCHING_PARAGRAPHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxParagraph> getMatchingParagraphs() {
    return matchingParagraphs;
  }


  @JsonProperty(JSON_PROPERTY_MATCHING_PARAGRAPHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchingParagraphs(List<DocxParagraph> matchingParagraphs) {
    this.matchingParagraphs = matchingParagraphs;
  }

  public FindDocxParagraphResponse count(Integer count) {
    
    this.count = count;
    return this;
  }

  /**
   * Count of matching paragraphs
   * @return count
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Integer count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindDocxParagraphResponse findDocxParagraphResponse = (FindDocxParagraphResponse) o;
    return Objects.equals(this.successful, findDocxParagraphResponse.successful) &&
        Objects.equals(this.matchingParagraphs, findDocxParagraphResponse.matchingParagraphs) &&
        Objects.equals(this.count, findDocxParagraphResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, matchingParagraphs, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindDocxParagraphResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    matchingParagraphs: ").append(toIndentedString(matchingParagraphs)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

