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
 * Matching product for the input barcode
 */
@JsonPropertyOrder({
  ProductMatch.JSON_PROPERTY_E_A_N,
  ProductMatch.JSON_PROPERTY_TITLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:12.746969900Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductMatch {
  public static final String JSON_PROPERTY_E_A_N = "EAN";
  private String EAN;

  public static final String JSON_PROPERTY_TITLE = "Title";
  private String title;

  public ProductMatch() {
  }

  public ProductMatch EAN(String EAN) {
    
    this.EAN = EAN;
    return this;
  }

  /**
   * EAN code for the product
   * @return EAN
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_E_A_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEAN() {
    return EAN;
  }


  @JsonProperty(JSON_PROPERTY_E_A_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEAN(String EAN) {
    this.EAN = EAN;
  }

  public ProductMatch title(String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Title of the product
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductMatch productMatch = (ProductMatch) o;
    return Objects.equals(this.EAN, productMatch.EAN) &&
        Objects.equals(this.title, productMatch.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EAN, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMatch {\n");
    sb.append("    EAN: ").append(toIndentedString(EAN)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

