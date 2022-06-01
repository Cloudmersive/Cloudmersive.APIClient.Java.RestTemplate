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
import com.cloudmersive.client.rt.model.OcrPageResultWithWordsWithLocation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Response from an OCR to words with location operation.  Includes the confience rating and converted text result, along with the locations of the words in the pages.
 */
@ApiModel(description = "Response from an OCR to words with location operation.  Includes the confience rating and converted text result, along with the locations of the words in the pages.")
@JsonPropertyOrder({
  PdfToWordsWithLocationResult.JSON_PROPERTY_SUCCESSFUL,
  PdfToWordsWithLocationResult.JSON_PROPERTY_OCR_PAGES
})
@JsonTypeName("PdfToWordsWithLocationResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:53:17.009-07:00[America/Los_Angeles]")
public class PdfToWordsWithLocationResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_OCR_PAGES = "OcrPages";
  private List<OcrPageResultWithWordsWithLocation> ocrPages = null;


  public PdfToWordsWithLocationResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public PdfToWordsWithLocationResult ocrPages(List<OcrPageResultWithWordsWithLocation> ocrPages) {
    
    this.ocrPages = ocrPages;
    return this;
  }

  public PdfToWordsWithLocationResult addOcrPagesItem(OcrPageResultWithWordsWithLocation ocrPagesItem) {
    if (this.ocrPages == null) {
      this.ocrPages = new ArrayList<OcrPageResultWithWordsWithLocation>();
    }
    this.ocrPages.add(ocrPagesItem);
    return this;
  }

   /**
   * OCR page results
   * @return ocrPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OCR page results")
  @JsonProperty(JSON_PROPERTY_OCR_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OcrPageResultWithWordsWithLocation> getOcrPages() {
    return ocrPages;
  }


  public void setOcrPages(List<OcrPageResultWithWordsWithLocation> ocrPages) {
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
    PdfToWordsWithLocationResult pdfToWordsWithLocationResult = (PdfToWordsWithLocationResult) o;
    return Objects.equals(this.successful, pdfToWordsWithLocationResult.successful) &&
        Objects.equals(this.ocrPages, pdfToWordsWithLocationResult.ocrPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, ocrPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfToWordsWithLocationResult {\n");
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

