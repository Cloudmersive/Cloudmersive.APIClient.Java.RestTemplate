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
import com.cloudmersive.client.rt.model.XlsxSpreadsheetRow;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of running a Get-Specific-Row command
 */
@JsonPropertyOrder({
  GetXlsxSpecificRowResponse.JSON_PROPERTY_SUCCESSFUL,
  GetXlsxSpecificRowResponse.JSON_PROPERTY_ROW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetXlsxSpecificRowResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_ROW = "Row";
  private XlsxSpreadsheetRow row;

  public GetXlsxSpecificRowResponse() {
  }

  public GetXlsxSpecificRowResponse successful(Boolean successful) {
    
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

  public GetXlsxSpecificRowResponse row(XlsxSpreadsheetRow row) {
    
    this.row = row;
    return this;
  }

  /**
   * Get row
   * @return row
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XlsxSpreadsheetRow getRow() {
    return row;
  }


  @JsonProperty(JSON_PROPERTY_ROW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRow(XlsxSpreadsheetRow row) {
    this.row = row;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxSpecificRowResponse getXlsxSpecificRowResponse = (GetXlsxSpecificRowResponse) o;
    return Objects.equals(this.successful, getXlsxSpecificRowResponse.successful) &&
        Objects.equals(this.row, getXlsxSpecificRowResponse.row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, row);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxSpecificRowResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
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

