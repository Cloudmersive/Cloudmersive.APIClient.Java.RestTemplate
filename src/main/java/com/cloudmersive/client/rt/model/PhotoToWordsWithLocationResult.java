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
import com.cloudmersive.client.rt.model.OcrPhotoTextElement;
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
 * Result of an photo to words-with-location OCR operation
 */
@ApiModel(description = "Result of an photo to words-with-location OCR operation")
@JsonPropertyOrder({
  PhotoToWordsWithLocationResult.JSON_PROPERTY_SUCCESSFUL,
  PhotoToWordsWithLocationResult.JSON_PROPERTY_TEXT_ELEMENTS,
  PhotoToWordsWithLocationResult.JSON_PROPERTY_DIAGNOSTIC_IMAGE
})
@JsonTypeName("PhotoToWordsWithLocationResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:53:17.009-07:00[America/Los_Angeles]")
public class PhotoToWordsWithLocationResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TEXT_ELEMENTS = "TextElements";
  private List<OcrPhotoTextElement> textElements = null;

  public static final String JSON_PROPERTY_DIAGNOSTIC_IMAGE = "DiagnosticImage";
  private byte[] diagnosticImage;


  public PhotoToWordsWithLocationResult successful(Boolean successful) {
    
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


  public PhotoToWordsWithLocationResult textElements(List<OcrPhotoTextElement> textElements) {
    
    this.textElements = textElements;
    return this;
  }

  public PhotoToWordsWithLocationResult addTextElementsItem(OcrPhotoTextElement textElementsItem) {
    if (this.textElements == null) {
      this.textElements = new ArrayList<OcrPhotoTextElement>();
    }
    this.textElements.add(textElementsItem);
    return this;
  }

   /**
   * Word elements in the image
   * @return textElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Word elements in the image")
  @JsonProperty(JSON_PROPERTY_TEXT_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OcrPhotoTextElement> getTextElements() {
    return textElements;
  }


  public void setTextElements(List<OcrPhotoTextElement> textElements) {
    this.textElements = textElements;
  }


  public PhotoToWordsWithLocationResult diagnosticImage(byte[] diagnosticImage) {
    
    this.diagnosticImage = diagnosticImage;
    return this;
  }

   /**
   * Typically null.  To analyze OCR performance, enable diagnostic mode by adding the HTTP header \&quot;DiagnosticMode\&quot; with the value \&quot;true\&quot;.  When this is true, a diagnostic image showing the details of the OCR result will be set in PNG format into DiagnosticImage.
   * @return diagnosticImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typically null.  To analyze OCR performance, enable diagnostic mode by adding the HTTP header \"DiagnosticMode\" with the value \"true\".  When this is true, a diagnostic image showing the details of the OCR result will be set in PNG format into DiagnosticImage.")
  @JsonProperty(JSON_PROPERTY_DIAGNOSTIC_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getDiagnosticImage() {
    return diagnosticImage;
  }


  public void setDiagnosticImage(byte[] diagnosticImage) {
    this.diagnosticImage = diagnosticImage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhotoToWordsWithLocationResult photoToWordsWithLocationResult = (PhotoToWordsWithLocationResult) o;
    return Objects.equals(this.successful, photoToWordsWithLocationResult.successful) &&
        Objects.equals(this.textElements, photoToWordsWithLocationResult.textElements) &&
        Arrays.equals(this.diagnosticImage, photoToWordsWithLocationResult.diagnosticImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, textElements, Arrays.hashCode(diagnosticImage));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhotoToWordsWithLocationResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    textElements: ").append(toIndentedString(textElements)).append("\n");
    sb.append("    diagnosticImage: ").append(toIndentedString(diagnosticImage)).append("\n");
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

