/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
import com.cloudmersive.client.rt.model.TextItem;
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
 * Result of an operation to detect text in a photo
 */
@JsonPropertyOrder({
  TextDetectionResult.JSON_PROPERTY_SUCCESSFUL,
  TextDetectionResult.JSON_PROPERTY_TEXT_ITEMS,
  TextDetectionResult.JSON_PROPERTY_TEXT_ITEMS_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:15.299595200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TextDetectionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TEXT_ITEMS = "TextItems";
  private List<TextItem> textItems = new ArrayList<>();

  public static final String JSON_PROPERTY_TEXT_ITEMS_COUNT = "TextItemsCount";
  private Integer textItemsCount;

  public TextDetectionResult() {
  }

  public TextDetectionResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if the operation was successful, false otherwise
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

  public TextDetectionResult textItems(List<TextItem> textItems) {
    
    this.textItems = textItems;
    return this;
  }

  public TextDetectionResult addTextItemsItem(TextItem textItemsItem) {
    if (this.textItems == null) {
      this.textItems = new ArrayList<>();
    }
    this.textItems.add(textItemsItem);
    return this;
  }

  /**
   * Text items found in the input image
   * @return textItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TextItem> getTextItems() {
    return textItems;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextItems(List<TextItem> textItems) {
    this.textItems = textItems;
  }

  public TextDetectionResult textItemsCount(Integer textItemsCount) {
    
    this.textItemsCount = textItemsCount;
    return this;
  }

  /**
   * Count of text items found in the input image
   * @return textItemsCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_ITEMS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTextItemsCount() {
    return textItemsCount;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_ITEMS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextItemsCount(Integer textItemsCount) {
    this.textItemsCount = textItemsCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextDetectionResult textDetectionResult = (TextDetectionResult) o;
    return Objects.equals(this.successful, textDetectionResult.successful) &&
        Objects.equals(this.textItems, textDetectionResult.textItems) &&
        Objects.equals(this.textItemsCount, textDetectionResult.textItemsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, textItems, textItemsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextDetectionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    textItems: ").append(toIndentedString(textItems)).append("\n");
    sb.append("    textItemsCount: ").append(toIndentedString(textItemsCount)).append("\n");
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

