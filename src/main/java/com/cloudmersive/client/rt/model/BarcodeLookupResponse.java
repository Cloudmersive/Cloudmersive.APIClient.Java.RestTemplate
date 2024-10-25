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
import com.cloudmersive.client.rt.model.ProductMatch;
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
 * Result of performing a barcode lookup
 */
@JsonPropertyOrder({
  BarcodeLookupResponse.JSON_PROPERTY_SUCCESSFUL,
  BarcodeLookupResponse.JSON_PROPERTY_MATCHES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:09.245123100Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BarcodeLookupResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_MATCHES = "Matches";
  private List<ProductMatch> matches = new ArrayList<>();

  public BarcodeLookupResponse() {
  }

  public BarcodeLookupResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if operation was successful, false otherwise
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

  public BarcodeLookupResponse matches(List<ProductMatch> matches) {
    
    this.matches = matches;
    return this;
  }

  public BarcodeLookupResponse addMatchesItem(ProductMatch matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<>();
    }
    this.matches.add(matchesItem);
    return this;
  }

  /**
   * Resulting product matches for the input barcode
   * @return matches
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductMatch> getMatches() {
    return matches;
  }


  @JsonProperty(JSON_PROPERTY_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatches(List<ProductMatch> matches) {
    this.matches = matches;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarcodeLookupResponse barcodeLookupResponse = (BarcodeLookupResponse) o;
    return Objects.equals(this.successful, barcodeLookupResponse.successful) &&
        Objects.equals(this.matches, barcodeLookupResponse.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, matches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarcodeLookupResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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

