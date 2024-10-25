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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of removing whitespace from a string
 */
@JsonPropertyOrder({
  RemoveWhitespaceFromTextResponse.JSON_PROPERTY_SUCCESSFUL,
  RemoveWhitespaceFromTextResponse.JSON_PROPERTY_TEXT_CONTENT_RESULT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RemoveWhitespaceFromTextResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TEXT_CONTENT_RESULT = "TextContentResult";
  private String textContentResult;

  public RemoveWhitespaceFromTextResponse() {
  }

  public RemoveWhitespaceFromTextResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if successful, false otherwise
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

  public RemoveWhitespaceFromTextResponse textContentResult(String textContentResult) {
    
    this.textContentResult = textContentResult;
    return this;
  }

  /**
   * Result of performing a remove whitespace from string operation
   * @return textContentResult
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_CONTENT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextContentResult() {
    return textContentResult;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_CONTENT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextContentResult(String textContentResult) {
    this.textContentResult = textContentResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveWhitespaceFromTextResponse removeWhitespaceFromTextResponse = (RemoveWhitespaceFromTextResponse) o;
    return Objects.equals(this.successful, removeWhitespaceFromTextResponse.successful) &&
        Objects.equals(this.textContentResult, removeWhitespaceFromTextResponse.textContentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, textContentResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveWhitespaceFromTextResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    textContentResult: ").append(toIndentedString(textContentResult)).append("\n");
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

