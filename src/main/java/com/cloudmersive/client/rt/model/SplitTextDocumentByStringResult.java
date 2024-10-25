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
import com.cloudmersive.client.rt.model.TextDocumentElement;
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
 * The result of splitting a Text document into separate elements
 */
@JsonPropertyOrder({
  SplitTextDocumentByStringResult.JSON_PROPERTY_RESULT_ELEMENTS,
  SplitTextDocumentByStringResult.JSON_PROPERTY_SUCCESSFUL,
  SplitTextDocumentByStringResult.JSON_PROPERTY_ELEMENT_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SplitTextDocumentByStringResult {
  public static final String JSON_PROPERTY_RESULT_ELEMENTS = "ResultElements";
  private List<TextDocumentElement> resultElements = new ArrayList<>();

  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_ELEMENT_COUNT = "ElementCount";
  private Integer elementCount;

  public SplitTextDocumentByStringResult() {
  }

  public SplitTextDocumentByStringResult resultElements(List<TextDocumentElement> resultElements) {
    
    this.resultElements = resultElements;
    return this;
  }

  public SplitTextDocumentByStringResult addResultElementsItem(TextDocumentElement resultElementsItem) {
    if (this.resultElements == null) {
      this.resultElements = new ArrayList<>();
    }
    this.resultElements.add(resultElementsItem);
    return this;
  }

  /**
   * Get resultElements
   * @return resultElements
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TextDocumentElement> getResultElements() {
    return resultElements;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultElements(List<TextDocumentElement> resultElements) {
    this.resultElements = resultElements;
  }

  public SplitTextDocumentByStringResult successful(Boolean successful) {
    
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

  public SplitTextDocumentByStringResult elementCount(Integer elementCount) {
    
    this.elementCount = elementCount;
    return this;
  }

  /**
   * The count of elements in the text file
   * @return elementCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELEMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getElementCount() {
    return elementCount;
  }


  @JsonProperty(JSON_PROPERTY_ELEMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElementCount(Integer elementCount) {
    this.elementCount = elementCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitTextDocumentByStringResult splitTextDocumentByStringResult = (SplitTextDocumentByStringResult) o;
    return Objects.equals(this.resultElements, splitTextDocumentByStringResult.resultElements) &&
        Objects.equals(this.successful, splitTextDocumentByStringResult.successful) &&
        Objects.equals(this.elementCount, splitTextDocumentByStringResult.elementCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultElements, successful, elementCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitTextDocumentByStringResult {\n");
    sb.append("    resultElements: ").append(toIndentedString(resultElements)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    elementCount: ").append(toIndentedString(elementCount)).append("\n");
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

