/*
 * barcodeapi
 * Barcode APIs let you generate barcode images, and recognize values from images of barcodes.
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
 * Result of the barcode scan
 */
@JsonPropertyOrder({
  BarcodeScanResult.JSON_PROPERTY_SUCCESSFUL,
  BarcodeScanResult.JSON_PROPERTY_BARCODE_TYPE,
  BarcodeScanResult.JSON_PROPERTY_RAW_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:09.245123100Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BarcodeScanResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_BARCODE_TYPE = "BarcodeType";
  private String barcodeType;

  public static final String JSON_PROPERTY_RAW_TEXT = "RawText";
  private String rawText;

  public BarcodeScanResult() {
  }

  public BarcodeScanResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if the operation was successful, false otherwise
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

  public BarcodeScanResult barcodeType(String barcodeType) {
    
    this.barcodeType = barcodeType;
    return this;
  }

  /**
   * The type of the barcode; possible values are AZTEC, CODABAR, CODE_39, CODE_93, CODE_128, DATA_MATRIX, EAN_8, EAN_13, ITF, MAXICODE, PDF_417, QR_CODE, RSS_14, RSS_EXPANDED, UPC_A, UPC_E, All_1D, UPC_EAN_EXTENSION, MSI, PLESSEY, IMB
   * @return barcodeType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BARCODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBarcodeType() {
    return barcodeType;
  }


  @JsonProperty(JSON_PROPERTY_BARCODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBarcodeType(String barcodeType) {
    this.barcodeType = barcodeType;
  }

  public BarcodeScanResult rawText(String rawText) {
    
    this.rawText = rawText;
    return this;
  }

  /**
   * The barcode text
   * @return rawText
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RAW_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRawText() {
    return rawText;
  }


  @JsonProperty(JSON_PROPERTY_RAW_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRawText(String rawText) {
    this.rawText = rawText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarcodeScanResult barcodeScanResult = (BarcodeScanResult) o;
    return Objects.equals(this.successful, barcodeScanResult.successful) &&
        Objects.equals(this.barcodeType, barcodeScanResult.barcodeType) &&
        Objects.equals(this.rawText, barcodeScanResult.rawText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, barcodeType, rawText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarcodeScanResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    barcodeType: ").append(toIndentedString(barcodeType)).append("\n");
    sb.append("    rawText: ").append(toIndentedString(rawText)).append("\n");
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

