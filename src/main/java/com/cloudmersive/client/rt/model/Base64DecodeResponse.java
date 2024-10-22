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
 * Result of base 64 decoding
 */
@JsonPropertyOrder({
  Base64DecodeResponse.JSON_PROPERTY_SUCCESSFUL,
  Base64DecodeResponse.JSON_PROPERTY_CONTENT_RESULT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class Base64DecodeResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_CONTENT_RESULT = "ContentResult";
  private byte[] contentResult;

  public Base64DecodeResponse() {
  }

  public Base64DecodeResponse successful(Boolean successful) {
    
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

  public Base64DecodeResponse contentResult(byte[] contentResult) {
    
    this.contentResult = contentResult;
    return this;
  }

  /**
   * Result of performing a base 64 decode operation, binary file content
   * @return contentResult
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getContentResult() {
    return contentResult;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentResult(byte[] contentResult) {
    this.contentResult = contentResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Base64DecodeResponse base64DecodeResponse = (Base64DecodeResponse) o;
    return Objects.equals(this.successful, base64DecodeResponse.successful) &&
        Arrays.equals(this.contentResult, base64DecodeResponse.contentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, Arrays.hashCode(contentResult));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base64DecodeResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    contentResult: ").append(toIndentedString(contentResult)).append("\n");
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

