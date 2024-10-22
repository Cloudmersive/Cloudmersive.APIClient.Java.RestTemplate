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
 * BarcodeQRResultItem
 */
@JsonPropertyOrder({
  BarcodeQRResultItem.JSON_PROPERTY_RAW_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:12.746969900Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BarcodeQRResultItem {
  public static final String JSON_PROPERTY_RAW_TEXT = "RawText";
  private String rawText;

  public BarcodeQRResultItem() {
  }

  public BarcodeQRResultItem rawText(String rawText) {
    
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
    BarcodeQRResultItem barcodeQRResultItem = (BarcodeQRResultItem) o;
    return Objects.equals(this.rawText, barcodeQRResultItem.rawText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarcodeQRResultItem {\n");
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
