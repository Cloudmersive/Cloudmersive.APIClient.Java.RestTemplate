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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A single Word DOCX file corresponding to one page in the original document
 */
@ApiModel(description = "A single Word DOCX file corresponding to one page in the original document")
@JsonPropertyOrder({
  SplitDocumentResult.JSON_PROPERTY_PAGE_NUMBER,
  SplitDocumentResult.JSON_PROPERTY_U_R_L,
  SplitDocumentResult.JSON_PROPERTY_DOCUMENT_CONTENTS
})
@JsonTypeName("SplitDocumentResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class SplitDocumentResult {
  public static final String JSON_PROPERTY_PAGE_NUMBER = "PageNumber";
  private Integer pageNumber;

  public static final String JSON_PROPERTY_U_R_L = "URL";
  private String URL;

  public static final String JSON_PROPERTY_DOCUMENT_CONTENTS = "DocumentContents";
  private byte[] documentContents;


  public SplitDocumentResult pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of the converted page, starting with 1 for the first page
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page number of the converted page, starting with 1 for the first page")
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public SplitDocumentResult URL(String URL) {
    
    this.URL = URL;
    return this;
  }

   /**
   * URL to the DOCX file of this slide; file is stored in an in-memory cache and will be deleted
   * @return URL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to the DOCX file of this slide; file is stored in an in-memory cache and will be deleted")
  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getURL() {
    return URL;
  }


  public void setURL(String URL) {
    this.URL = URL;
  }


  public SplitDocumentResult documentContents(byte[] documentContents) {
    
    this.documentContents = documentContents;
    return this;
  }

   /**
   * Contents of the document in bytes
   * @return documentContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contents of the document in bytes")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getDocumentContents() {
    return documentContents;
  }


  public void setDocumentContents(byte[] documentContents) {
    this.documentContents = documentContents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitDocumentResult splitDocumentResult = (SplitDocumentResult) o;
    return Objects.equals(this.pageNumber, splitDocumentResult.pageNumber) &&
        Objects.equals(this.URL, splitDocumentResult.URL) &&
        Arrays.equals(this.documentContents, splitDocumentResult.documentContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, URL, Arrays.hashCode(documentContents));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitDocumentResult {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    documentContents: ").append(toIndentedString(documentContents)).append("\n");
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

