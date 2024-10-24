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
 * A single PDF file corresponding to one page in the original document
 */
@JsonPropertyOrder({
  PdfDocument.JSON_PROPERTY_PAGE_NUMBER,
  PdfDocument.JSON_PROPERTY_U_R_L,
  PdfDocument.JSON_PROPERTY_DOCUMENT_CONTENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PdfDocument {
  public static final String JSON_PROPERTY_PAGE_NUMBER = "PageNumber";
  private Integer pageNumber;

  public static final String JSON_PROPERTY_U_R_L = "URL";
  private String URL;

  public static final String JSON_PROPERTY_DOCUMENT_CONTENTS = "DocumentContents";
  private byte[] documentContents;

  public PdfDocument() {
  }

  public PdfDocument pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Page number of the converted page, starting with 1 for the first page
   * @return pageNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNumber() {
    return pageNumber;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PdfDocument URL(String URL) {
    
    this.URL = URL;
    return this;
  }

  /**
   * URL to the PDF file of this worksheet; file is stored in an in-memory cache and will be deleted
   * @return URL
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getURL() {
    return URL;
  }


  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setURL(String URL) {
    this.URL = URL;
  }

  public PdfDocument documentContents(byte[] documentContents) {
    
    this.documentContents = documentContents;
    return this;
  }

  /**
   * If returnDocumentContents is set to true, will contain the contents of the document; otherwise will be set to null and the document contents will be available via the URL parameter
   * @return documentContents
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getDocumentContents() {
    return documentContents;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    PdfDocument pdfDocument = (PdfDocument) o;
    return Objects.equals(this.pageNumber, pdfDocument.pageNumber) &&
        Objects.equals(this.URL, pdfDocument.URL) &&
        Arrays.equals(this.documentContents, pdfDocument.documentContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, URL, Arrays.hashCode(documentContents));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfDocument {\n");
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

