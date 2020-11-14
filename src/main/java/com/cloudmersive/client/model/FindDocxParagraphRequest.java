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
 * Input to a request to find matching paragraphs in a Word DOCX document
 */
@ApiModel(description = "Input to a request to find matching paragraphs in a Word DOCX document")
@JsonPropertyOrder({
  FindDocxParagraphRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  FindDocxParagraphRequest.JSON_PROPERTY_INPUT_FILE_URL,
  FindDocxParagraphRequest.JSON_PROPERTY_FIND_STRING,
  FindDocxParagraphRequest.JSON_PROPERTY_MATCH_CASE
})
@JsonTypeName("FindDocxParagraphRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:29.247-08:00[America/Los_Angeles]")
public class FindDocxParagraphRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_FIND_STRING = "FindString";
  private String findString;

  public static final String JSON_PROPERTY_MATCH_CASE = "MatchCase";
  private Boolean matchCase;


  public FindDocxParagraphRequest inputFileBytes(byte[] inputFileBytes) {
    
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }


  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }


  public FindDocxParagraphRequest inputFileUrl(String inputFileUrl) {
    
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputFileUrl() {
    return inputFileUrl;
  }


  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }


  public FindDocxParagraphRequest findString(String findString) {
    
    this.findString = findString;
    return this;
  }

   /**
   * Required: The target string to search for in the paragraphs of the document
   * @return findString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required: The target string to search for in the paragraphs of the document")
  @JsonProperty(JSON_PROPERTY_FIND_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFindString() {
    return findString;
  }


  public void setFindString(String findString) {
    this.findString = findString;
  }


  public FindDocxParagraphRequest matchCase(Boolean matchCase) {
    
    this.matchCase = matchCase;
    return this;
  }

   /**
   * Optional: True to match case, false to ignore case when matching
   * @return matchCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: True to match case, false to ignore case when matching")
  @JsonProperty(JSON_PROPERTY_MATCH_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMatchCase() {
    return matchCase;
  }


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
    FindDocxParagraphRequest findDocxParagraphRequest = (FindDocxParagraphRequest) o;
    return Arrays.equals(this.inputFileBytes, findDocxParagraphRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, findDocxParagraphRequest.inputFileUrl) &&
        Objects.equals(this.findString, findDocxParagraphRequest.findString) &&
        Objects.equals(this.matchCase, findDocxParagraphRequest.matchCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, findString, matchCase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindDocxParagraphRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    findString: ").append(toIndentedString(findString)).append("\n");
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

