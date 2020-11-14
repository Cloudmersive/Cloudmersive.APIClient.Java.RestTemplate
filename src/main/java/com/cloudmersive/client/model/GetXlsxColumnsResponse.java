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


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.model.XlsxSpreadsheetColumn;
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
 * Result of running a Get-Columns command
 */
@ApiModel(description = "Result of running a Get-Columns command")
@JsonPropertyOrder({
  GetXlsxColumnsResponse.JSON_PROPERTY_SUCCESSFUL,
  GetXlsxColumnsResponse.JSON_PROPERTY_COLUMNS
})
@JsonTypeName("GetXlsxColumnsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:29.247-08:00[America/Los_Angeles]")
public class GetXlsxColumnsResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_COLUMNS = "Columns";
  private List<XlsxSpreadsheetColumn> columns = null;


  public GetXlsxColumnsResponse successful(Boolean successful) {
    
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


  public GetXlsxColumnsResponse columns(List<XlsxSpreadsheetColumn> columns) {
    
    this.columns = columns;
    return this;
  }

  public GetXlsxColumnsResponse addColumnsItem(XlsxSpreadsheetColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<XlsxSpreadsheetColumn>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Spreadsheet Columns in the XLSX document
   * @return columns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Spreadsheet Columns in the XLSX document")
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<XlsxSpreadsheetColumn> getColumns() {
    return columns;
  }


  public void setColumns(List<XlsxSpreadsheetColumn> columns) {
    this.columns = columns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxColumnsResponse getXlsxColumnsResponse = (GetXlsxColumnsResponse) o;
    return Objects.equals(this.successful, getXlsxColumnsResponse.successful) &&
        Objects.equals(this.columns, getXlsxColumnsResponse.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, columns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxColumnsResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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

