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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Cell in an Excel Spreadsheet worksheet
 */
@ApiModel(description = "Cell in an Excel Spreadsheet worksheet")
@JsonPropertyOrder({
  XlsxSpreadsheetCell.JSON_PROPERTY_PATH,
  XlsxSpreadsheetCell.JSON_PROPERTY_TEXT_VALUE,
  XlsxSpreadsheetCell.JSON_PROPERTY_CELL_IDENTIFIER,
  XlsxSpreadsheetCell.JSON_PROPERTY_STYLE_INDEX,
  XlsxSpreadsheetCell.JSON_PROPERTY_FORMULA
})
@JsonTypeName("XlsxSpreadsheetCell")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class XlsxSpreadsheetCell {
  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_TEXT_VALUE = "TextValue";
  private String textValue;

  public static final String JSON_PROPERTY_CELL_IDENTIFIER = "CellIdentifier";
  private String cellIdentifier;

  public static final String JSON_PROPERTY_STYLE_INDEX = "StyleIndex";
  private Integer styleIndex;

  public static final String JSON_PROPERTY_FORMULA = "Formula";
  private String formula;


  public XlsxSpreadsheetCell path(String path) {
    
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


  public XlsxSpreadsheetCell textValue(String textValue) {
    
    this.textValue = textValue;
    return this;
  }

   /**
   * Text value of the cell
   * @return textValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text value of the cell")
  @JsonProperty(JSON_PROPERTY_TEXT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextValue() {
    return textValue;
  }


  public void setTextValue(String textValue) {
    this.textValue = textValue;
  }


  public XlsxSpreadsheetCell cellIdentifier(String cellIdentifier) {
    
    this.cellIdentifier = cellIdentifier;
    return this;
  }

   /**
   * Cell reference of the cell, e.g. A1, Z22, etc.
   * @return cellIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cell reference of the cell, e.g. A1, Z22, etc.")
  @JsonProperty(JSON_PROPERTY_CELL_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCellIdentifier() {
    return cellIdentifier;
  }


  public void setCellIdentifier(String cellIdentifier) {
    this.cellIdentifier = cellIdentifier;
  }


  public XlsxSpreadsheetCell styleIndex(Integer styleIndex) {
    
    this.styleIndex = styleIndex;
    return this;
  }

   /**
   * Identifier for the style to apply to this style
   * @return styleIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier for the style to apply to this style")
  @JsonProperty(JSON_PROPERTY_STYLE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStyleIndex() {
    return styleIndex;
  }


  public void setStyleIndex(Integer styleIndex) {
    this.styleIndex = styleIndex;
  }


  public XlsxSpreadsheetCell formula(String formula) {
    
    this.formula = formula;
    return this;
  }

   /**
   * Get formula
   * @return formula
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORMULA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormula() {
    return formula;
  }


  public void setFormula(String formula) {
    this.formula = formula;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XlsxSpreadsheetCell xlsxSpreadsheetCell = (XlsxSpreadsheetCell) o;
    return Objects.equals(this.path, xlsxSpreadsheetCell.path) &&
        Objects.equals(this.textValue, xlsxSpreadsheetCell.textValue) &&
        Objects.equals(this.cellIdentifier, xlsxSpreadsheetCell.cellIdentifier) &&
        Objects.equals(this.styleIndex, xlsxSpreadsheetCell.styleIndex) &&
        Objects.equals(this.formula, xlsxSpreadsheetCell.formula);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, textValue, cellIdentifier, styleIndex, formula);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XlsxSpreadsheetCell {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    textValue: ").append(toIndentedString(textValue)).append("\n");
    sb.append("    cellIdentifier: ").append(toIndentedString(cellIdentifier)).append("\n");
    sb.append("    styleIndex: ").append(toIndentedString(styleIndex)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
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

