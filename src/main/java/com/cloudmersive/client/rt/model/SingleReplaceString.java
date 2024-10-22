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
 * A single string replacement request
 */
@JsonPropertyOrder({
  SingleReplaceString.JSON_PROPERTY_MATCH_STRING,
  SingleReplaceString.JSON_PROPERTY_REPLACE_STRING,
  SingleReplaceString.JSON_PROPERTY_MATCH_CASE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SingleReplaceString {
  public static final String JSON_PROPERTY_MATCH_STRING = "MatchString";
  private String matchString;

  public static final String JSON_PROPERTY_REPLACE_STRING = "ReplaceString";
  private String replaceString;

  public static final String JSON_PROPERTY_MATCH_CASE = "MatchCase";
  private Boolean matchCase;

  public SingleReplaceString() {
  }

  public SingleReplaceString matchString(String matchString) {
    
    this.matchString = matchString;
    return this;
  }

  /**
   * String to search for and match against, to be replaced
   * @return matchString
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMatchString() {
    return matchString;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchString(String matchString) {
    this.matchString = matchString;
  }

  public SingleReplaceString replaceString(String replaceString) {
    
    this.replaceString = replaceString;
    return this;
  }

  /**
   * String to replace the matched values with
   * @return replaceString
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLACE_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplaceString() {
    return replaceString;
  }


  @JsonProperty(JSON_PROPERTY_REPLACE_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplaceString(String replaceString) {
    this.replaceString = replaceString;
  }

  public SingleReplaceString matchCase(Boolean matchCase) {
    
    this.matchCase = matchCase;
    return this;
  }

  /**
   * True if the case should be matched, false for case insensitive match
   * @return matchCase
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMatchCase() {
    return matchCase;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchCase(Boolean matchCase) {
    this.matchCase = matchCase;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleReplaceString singleReplaceString = (SingleReplaceString) o;
    return Objects.equals(this.matchString, singleReplaceString.matchString) &&
        Objects.equals(this.replaceString, singleReplaceString.replaceString) &&
        Objects.equals(this.matchCase, singleReplaceString.matchCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchString, replaceString, matchCase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleReplaceString {\n");
    sb.append("    matchString: ").append(toIndentedString(matchString)).append("\n");
    sb.append("    replaceString: ").append(toIndentedString(replaceString)).append("\n");
    sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
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

