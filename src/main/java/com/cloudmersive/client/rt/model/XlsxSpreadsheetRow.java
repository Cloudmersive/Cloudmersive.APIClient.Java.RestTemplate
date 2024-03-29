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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Row in an Excel spreadsheet worksheet
 */
@ApiModel(description = "Row in an Excel spreadsheet worksheet")
@JsonPropertyOrder({
  XlsxSpreadsheetRow.JSON_PROPERTY_PATH,
  XlsxSpreadsheetRow.JSON_PROPERTY_CELLS
})
@JsonTypeName("XlsxSpreadsheetRow")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class XlsxSpreadsheetRow {
  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_CELLS = "Cells";
  private List<XlsxSpreadsheetCell> cells = null;


  public XlsxSpreadsheetRow path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new rows
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new rows")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public XlsxSpreadsheetRow cells(List<XlsxSpreadsheetCell> cells) {
    
    this.cells = cells;
    return this;
  }

  public XlsxSpreadsheetRow addCellsItem(XlsxSpreadsheetCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<XlsxSpreadsheetCell>();
    }
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * Spreadsheet Cells in the spreadsheet row
   * @return cells
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Spreadsheet Cells in the spreadsheet row")
  @JsonProperty(JSON_PROPERTY_CELLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<XlsxSpreadsheetCell> getCells() {
    return cells;
  }


  public void setCells(List<XlsxSpreadsheetCell> cells) {
    this.cells = cells;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XlsxSpreadsheetRow xlsxSpreadsheetRow = (XlsxSpreadsheetRow) o;
    return Objects.equals(this.path, xlsxSpreadsheetRow.path) &&
        Objects.equals(this.cells, xlsxSpreadsheetRow.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, cells);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XlsxSpreadsheetRow {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
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

