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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OcrPageResult
 */
@JsonPropertyOrder({
  OcrPageResult.JSON_PROPERTY_PAGE_NUMBER,
  OcrPageResult.JSON_PROPERTY_MEAN_CONFIDENCE_LEVEL,
  OcrPageResult.JSON_PROPERTY_TEXT_RESULT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:02.095460100Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OcrPageResult {
  public static final String JSON_PROPERTY_PAGE_NUMBER = "PageNumber";
  private Integer pageNumber;

  public static final String JSON_PROPERTY_MEAN_CONFIDENCE_LEVEL = "MeanConfidenceLevel";
  private Float meanConfidenceLevel;

  public static final String JSON_PROPERTY_TEXT_RESULT = "TextResult";
  private String textResult;

  public OcrPageResult() {
  }

  public OcrPageResult pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Page number of the page that was OCR-ed, starting with 1 for the first page in the PDF file
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

  public OcrPageResult meanConfidenceLevel(Float meanConfidenceLevel) {
    
    this.meanConfidenceLevel = meanConfidenceLevel;
    return this;
  }

  /**
   * Confidence level rating of the OCR operation; ratings above 80% are strong.
   * @return meanConfidenceLevel
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEAN_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getMeanConfidenceLevel() {
    return meanConfidenceLevel;
  }


  @JsonProperty(JSON_PROPERTY_MEAN_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeanConfidenceLevel(Float meanConfidenceLevel) {
    this.meanConfidenceLevel = meanConfidenceLevel;
  }

  public OcrPageResult textResult(String textResult) {
    
    this.textResult = textResult;
    return this;
  }

  /**
   * Converted text string from the image input.
   * @return textResult
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextResult() {
    return textResult;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextResult(String textResult) {
    this.textResult = textResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrPageResult ocrPageResult = (OcrPageResult) o;
    return Objects.equals(this.pageNumber, ocrPageResult.pageNumber) &&
        Objects.equals(this.meanConfidenceLevel, ocrPageResult.meanConfidenceLevel) &&
        Objects.equals(this.textResult, ocrPageResult.textResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, meanConfidenceLevel, textResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrPageResult {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    meanConfidenceLevel: ").append(toIndentedString(meanConfidenceLevel)).append("\n");
    sb.append("    textResult: ").append(toIndentedString(textResult)).append("\n");
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

