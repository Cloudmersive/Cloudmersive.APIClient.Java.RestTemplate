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
import com.cloudmersive.client.rt.model.DocxImage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Input to a request to replace matching paragraphs in a Word DOCX document
 */
@JsonPropertyOrder({
  ReplaceDocxParagraphRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  ReplaceDocxParagraphRequest.JSON_PROPERTY_INPUT_FILE_URL,
  ReplaceDocxParagraphRequest.JSON_PROPERTY_FIND_STRING,
  ReplaceDocxParagraphRequest.JSON_PROPERTY_MATCH_CASE,
  ReplaceDocxParagraphRequest.JSON_PROPERTY_REPLACEMENT_IMAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ReplaceDocxParagraphRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_FIND_STRING = "FindString";
  private String findString;

  public static final String JSON_PROPERTY_MATCH_CASE = "MatchCase";
  private Boolean matchCase;

  public static final String JSON_PROPERTY_REPLACEMENT_IMAGE = "Replacement_Image";
  private DocxImage replacementImage;

  public ReplaceDocxParagraphRequest() {
  }

  public ReplaceDocxParagraphRequest inputFileBytes(byte[] inputFileBytes) {
    
    this.inputFileBytes = inputFileBytes;
    return this;
  }

  /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }

  public ReplaceDocxParagraphRequest inputFileUrl(String inputFileUrl) {
    
    this.inputFileUrl = inputFileUrl;
    return this;
  }

  /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputFileUrl() {
    return inputFileUrl;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }

  public ReplaceDocxParagraphRequest findString(String findString) {
    
    this.findString = findString;
    return this;
  }

  /**
   * Required: The target string to search for in the paragraphs of the document
   * @return findString
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIND_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFindString() {
    return findString;
  }


  @JsonProperty(JSON_PROPERTY_FIND_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFindString(String findString) {
    this.findString = findString;
  }

  public ReplaceDocxParagraphRequest matchCase(Boolean matchCase) {
    
    this.matchCase = matchCase;
    return this;
  }

  /**
   * Optional: True to match case, false to ignore case when matching
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

  public ReplaceDocxParagraphRequest replacementImage(DocxImage replacementImage) {
    
    this.replacementImage = replacementImage;
    return this;
  }

  /**
   * Get replacementImage
   * @return replacementImage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLACEMENT_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocxImage getReplacementImage() {
    return replacementImage;
  }


  @JsonProperty(JSON_PROPERTY_REPLACEMENT_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplacementImage(DocxImage replacementImage) {
    this.replacementImage = replacementImage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceDocxParagraphRequest replaceDocxParagraphRequest = (ReplaceDocxParagraphRequest) o;
    return Arrays.equals(this.inputFileBytes, replaceDocxParagraphRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, replaceDocxParagraphRequest.inputFileUrl) &&
        Objects.equals(this.findString, replaceDocxParagraphRequest.findString) &&
        Objects.equals(this.matchCase, replaceDocxParagraphRequest.matchCase) &&
        Objects.equals(this.replacementImage, replaceDocxParagraphRequest.replacementImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, findString, matchCase, replacementImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceDocxParagraphRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    findString: ").append(toIndentedString(findString)).append("\n");
    sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
    sb.append("    replacementImage: ").append(toIndentedString(replacementImage)).append("\n");
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

