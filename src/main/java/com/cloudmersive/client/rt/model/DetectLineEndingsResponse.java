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
  DetectLineEndingsResponse.JSON_PROPERTY_SUCCESSFUL,
  DetectLineEndingsResponse.JSON_PROPERTY_PRIMARY_NEWLINE_TYPE,
  DetectLineEndingsResponse.JSON_PROPERTY_PRIMARY_NEWLINE_TERMINATOR,
  DetectLineEndingsResponse.JSON_PROPERTY_INPUT_LENGTH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DetectLineEndingsResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_PRIMARY_NEWLINE_TYPE = "PrimaryNewlineType";
  private String primaryNewlineType;

  public static final String JSON_PROPERTY_PRIMARY_NEWLINE_TERMINATOR = "PrimaryNewlineTerminator";
  private String primaryNewlineTerminator;

  public static final String JSON_PROPERTY_INPUT_LENGTH = "InputLength";
  private Integer inputLength;

  public DetectLineEndingsResponse() {
  }

  public DetectLineEndingsResponse successful(Boolean successful) {
    
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

  public DetectLineEndingsResponse primaryNewlineType(String primaryNewlineType) {
    
    this.primaryNewlineType = primaryNewlineType;
    return this;
  }

  /**
   * Type of newline in the file; possible vlaues are \&quot;Mac\&quot; (legacy Mac OS uses carriage return only); \&quot;Unix\&quot; (Unix and Linux OSes, and modern Mac OS); \&quot;Windows\&quot; (Windows operating systems)
   * @return primaryNewlineType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_NEWLINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryNewlineType() {
    return primaryNewlineType;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_NEWLINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryNewlineType(String primaryNewlineType) {
    this.primaryNewlineType = primaryNewlineType;
  }

  public DetectLineEndingsResponse primaryNewlineTerminator(String primaryNewlineTerminator) {
    
    this.primaryNewlineTerminator = primaryNewlineTerminator;
    return this;
  }

  /**
   * Characters used to terminate a newline; can be carriage return, linefeed, or carriage return + linefeed
   * @return primaryNewlineTerminator
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_NEWLINE_TERMINATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryNewlineTerminator() {
    return primaryNewlineTerminator;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_NEWLINE_TERMINATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryNewlineTerminator(String primaryNewlineTerminator) {
    this.primaryNewlineTerminator = primaryNewlineTerminator;
  }

  public DetectLineEndingsResponse inputLength(Integer inputLength) {
    
    this.inputLength = inputLength;
    return this;
  }

  /**
   * Length of the input string in characters
   * @return inputLength
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInputLength() {
    return inputLength;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputLength(Integer inputLength) {
    this.inputLength = inputLength;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectLineEndingsResponse detectLineEndingsResponse = (DetectLineEndingsResponse) o;
    return Objects.equals(this.successful, detectLineEndingsResponse.successful) &&
        Objects.equals(this.primaryNewlineType, detectLineEndingsResponse.primaryNewlineType) &&
        Objects.equals(this.primaryNewlineTerminator, detectLineEndingsResponse.primaryNewlineTerminator) &&
        Objects.equals(this.inputLength, detectLineEndingsResponse.inputLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, primaryNewlineType, primaryNewlineTerminator, inputLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectLineEndingsResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    primaryNewlineType: ").append(toIndentedString(primaryNewlineType)).append("\n");
    sb.append("    primaryNewlineTerminator: ").append(toIndentedString(primaryNewlineTerminator)).append("\n");
    sb.append("    inputLength: ").append(toIndentedString(inputLength)).append("\n");
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

