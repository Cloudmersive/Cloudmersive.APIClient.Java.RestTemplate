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
import com.cloudmersive.client.rt.model.XlsxSpreadsheetCell;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of running a Get-Cell command
 */
@JsonPropertyOrder({
  GetXlsxCellByIdentifierResponse.JSON_PROPERTY_SUCCESSFUL,
  GetXlsxCellByIdentifierResponse.JSON_PROPERTY_CELL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetXlsxCellByIdentifierResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_CELL = "Cell";
  private XlsxSpreadsheetCell cell;

  public GetXlsxCellByIdentifierResponse() {
  }

  public GetXlsxCellByIdentifierResponse successful(Boolean successful) {
    
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

  public GetXlsxCellByIdentifierResponse cell(XlsxSpreadsheetCell cell) {
    
    this.cell = cell;
    return this;
  }

  /**
   * Get cell
   * @return cell
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XlsxSpreadsheetCell getCell() {
    return cell;
  }


  @JsonProperty(JSON_PROPERTY_CELL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCell(XlsxSpreadsheetCell cell) {
    this.cell = cell;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxCellByIdentifierResponse getXlsxCellByIdentifierResponse = (GetXlsxCellByIdentifierResponse) o;
    return Objects.equals(this.successful, getXlsxCellByIdentifierResponse.successful) &&
        Objects.equals(this.cell, getXlsxCellByIdentifierResponse.cell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, cell);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxCellByIdentifierResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    cell: ").append(toIndentedString(cell)).append("\n");
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

