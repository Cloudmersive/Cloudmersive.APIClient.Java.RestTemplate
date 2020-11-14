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


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Request to replace a string in a string
 */
@ApiModel(description = "Request to replace a string in a string")
@JsonPropertyOrder({
  ReplaceStringSimpleRequest.JSON_PROPERTY_TEXT_CONTENT,
  ReplaceStringSimpleRequest.JSON_PROPERTY_TARGET_STRING,
  ReplaceStringSimpleRequest.JSON_PROPERTY_REPLACE_WITH_STRING
})
@JsonTypeName("ReplaceStringSimpleRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:29.247-08:00[America/Los_Angeles]")
public class ReplaceStringSimpleRequest {
  public static final String JSON_PROPERTY_TEXT_CONTENT = "TextContent";
  private String textContent;

  public static final String JSON_PROPERTY_TARGET_STRING = "TargetString";
  private String targetString;

  public static final String JSON_PROPERTY_REPLACE_WITH_STRING = "ReplaceWithString";
  private String replaceWithString;


  public ReplaceStringSimpleRequest textContent(String textContent) {
    
    this.textContent = textContent;
    return this;
  }

   /**
   * Input text content
   * @return textContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input text content")
  @JsonProperty(JSON_PROPERTY_TEXT_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextContent() {
    return textContent;
  }


  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }


  public ReplaceStringSimpleRequest targetString(String targetString) {
    
    this.targetString = targetString;
    return this;
  }

   /**
   * Target input string to match and be replaced
   * @return targetString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target input string to match and be replaced")
  @JsonProperty(JSON_PROPERTY_TARGET_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetString() {
    return targetString;
  }


  public void setTargetString(String targetString) {
    this.targetString = targetString;
  }


  public ReplaceStringSimpleRequest replaceWithString(String replaceWithString) {
    
    this.replaceWithString = replaceWithString;
    return this;
  }

   /**
   * Replacement for target string
   * @return replaceWithString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Replacement for target string")
  @JsonProperty(JSON_PROPERTY_REPLACE_WITH_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplaceWithString() {
    return replaceWithString;
  }


  public void setReplaceWithString(String replaceWithString) {
    this.replaceWithString = replaceWithString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceStringSimpleRequest replaceStringSimpleRequest = (ReplaceStringSimpleRequest) o;
    return Objects.equals(this.textContent, replaceStringSimpleRequest.textContent) &&
        Objects.equals(this.targetString, replaceStringSimpleRequest.targetString) &&
        Objects.equals(this.replaceWithString, replaceStringSimpleRequest.replaceWithString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textContent, targetString, replaceWithString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceStringSimpleRequest {\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
    sb.append("    targetString: ").append(toIndentedString(targetString)).append("\n");
    sb.append("    replaceWithString: ").append(toIndentedString(replaceWithString)).append("\n");
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

