/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.rt.model.OcrPageResultWithLinesWithLocation;
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
 * Response from an OCR to lines with location operation.  Includes the confience rating and converted text result, along with the locations of the lines in the pages.
 */
@JsonPropertyOrder({
  PdfToLinesWithLocationResult.JSON_PROPERTY_SUCCESSFUL,
  PdfToLinesWithLocationResult.JSON_PROPERTY_OCR_PAGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:05.887469400Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PdfToLinesWithLocationResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_OCR_PAGES = "OcrPages";
  private List<OcrPageResultWithLinesWithLocation> ocrPages = new ArrayList<>();

  public PdfToLinesWithLocationResult() {
  }

  public PdfToLinesWithLocationResult successful(Boolean successful) {
    
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

  public PdfToLinesWithLocationResult ocrPages(List<OcrPageResultWithLinesWithLocation> ocrPages) {
    
    this.ocrPages = ocrPages;
    return this;
  }

  public PdfToLinesWithLocationResult addOcrPagesItem(OcrPageResultWithLinesWithLocation ocrPagesItem) {
    if (this.ocrPages == null) {
      this.ocrPages = new ArrayList<>();
    }
    this.ocrPages.add(ocrPagesItem);
    return this;
  }

  /**
   * OCR results for each page
   * @return ocrPages
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OCR_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OcrPageResultWithLinesWithLocation> getOcrPages() {
    return ocrPages;
  }


  @JsonProperty(JSON_PROPERTY_OCR_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcrPages(List<OcrPageResultWithLinesWithLocation> ocrPages) {
    this.ocrPages = ocrPages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfToLinesWithLocationResult pdfToLinesWithLocationResult = (PdfToLinesWithLocationResult) o;
    return Objects.equals(this.successful, pdfToLinesWithLocationResult.successful) &&
        Objects.equals(this.ocrPages, pdfToLinesWithLocationResult.ocrPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, ocrPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfToLinesWithLocationResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    ocrPages: ").append(toIndentedString(ocrPages)).append("\n");
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

