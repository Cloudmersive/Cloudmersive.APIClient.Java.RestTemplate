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
import com.cloudmersive.client.rt.model.DocxTableTableFillTableRow;
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
 * Single table fill request in a multi-table fill operation
 */
@ApiModel(description = "Single table fill request in a multi-table fill operation")
@JsonPropertyOrder({
  DocxTableSingleTableFill.JSON_PROPERTY_TABLE_START_TAG,
  DocxTableSingleTableFill.JSON_PROPERTY_TABLE_END_TAG,
  DocxTableSingleTableFill.JSON_PROPERTY_DATA_TO_FILL_IN
})
@JsonTypeName("DocxTableSingleTableFill")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class DocxTableSingleTableFill {
  public static final String JSON_PROPERTY_TABLE_START_TAG = "TableStartTag";
  private String tableStartTag;

  public static final String JSON_PROPERTY_TABLE_END_TAG = "TableEndTag";
  private String tableEndTag;

  public static final String JSON_PROPERTY_DATA_TO_FILL_IN = "DataToFillIn";
  private List<DocxTableTableFillTableRow> dataToFillIn = null;


  public DocxTableSingleTableFill tableStartTag(String tableStartTag) {
    
    this.tableStartTag = tableStartTag;
    return this;
  }

   /**
   * Start tag that delineates the beginning of the table
   * @return tableStartTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start tag that delineates the beginning of the table")
  @JsonProperty(JSON_PROPERTY_TABLE_START_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTableStartTag() {
    return tableStartTag;
  }


  public void setTableStartTag(String tableStartTag) {
    this.tableStartTag = tableStartTag;
  }


  public DocxTableSingleTableFill tableEndTag(String tableEndTag) {
    
    this.tableEndTag = tableEndTag;
    return this;
  }

   /**
   * End tag that delineates the end of the table
   * @return tableEndTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End tag that delineates the end of the table")
  @JsonProperty(JSON_PROPERTY_TABLE_END_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTableEndTag() {
    return tableEndTag;
  }


  public void setTableEndTag(String tableEndTag) {
    this.tableEndTag = tableEndTag;
  }


  public DocxTableSingleTableFill dataToFillIn(List<DocxTableTableFillTableRow> dataToFillIn) {
    
    this.dataToFillIn = dataToFillIn;
    return this;
  }

  public DocxTableSingleTableFill addDataToFillInItem(DocxTableTableFillTableRow dataToFillInItem) {
    if (this.dataToFillIn == null) {
      this.dataToFillIn = new ArrayList<DocxTableTableFillTableRow>();
    }
    this.dataToFillIn.add(dataToFillInItem);
    return this;
  }

   /**
   * Data set to populate the table with
   * @return dataToFillIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data set to populate the table with")
  @JsonProperty(JSON_PROPERTY_DATA_TO_FILL_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxTableTableFillTableRow> getDataToFillIn() {
    return dataToFillIn;
  }


  public void setDataToFillIn(List<DocxTableTableFillTableRow> dataToFillIn) {
    this.dataToFillIn = dataToFillIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTableSingleTableFill docxTableSingleTableFill = (DocxTableSingleTableFill) o;
    return Objects.equals(this.tableStartTag, docxTableSingleTableFill.tableStartTag) &&
        Objects.equals(this.tableEndTag, docxTableSingleTableFill.tableEndTag) &&
        Objects.equals(this.dataToFillIn, docxTableSingleTableFill.dataToFillIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableStartTag, tableEndTag, dataToFillIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTableSingleTableFill {\n");
    sb.append("    tableStartTag: ").append(toIndentedString(tableStartTag)).append("\n");
    sb.append("    tableEndTag: ").append(toIndentedString(tableEndTag)).append("\n");
    sb.append("    dataToFillIn: ").append(toIndentedString(dataToFillIn)).append("\n");
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

