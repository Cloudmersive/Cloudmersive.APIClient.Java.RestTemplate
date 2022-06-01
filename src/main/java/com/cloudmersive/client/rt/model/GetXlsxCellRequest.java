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
import com.cloudmersive.client.rt.model.XlsxWorksheet;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Input to a Get Cell request
 */
@ApiModel(description = "Input to a Get Cell request")
@JsonPropertyOrder({
  GetXlsxCellRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  GetXlsxCellRequest.JSON_PROPERTY_INPUT_FILE_URL,
  GetXlsxCellRequest.JSON_PROPERTY_WORKSHEET_TO_QUERY,
  GetXlsxCellRequest.JSON_PROPERTY_ROW_INDEX,
  GetXlsxCellRequest.JSON_PROPERTY_CELL_INDEX
})
@JsonTypeName("GetXlsxCellRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class GetXlsxCellRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_WORKSHEET_TO_QUERY = "WorksheetToQuery";
  private XlsxWorksheet worksheetToQuery;

  public static final String JSON_PROPERTY_ROW_INDEX = "RowIndex";
  private Integer rowIndex;

  public static final String JSON_PROPERTY_CELL_INDEX = "CellIndex";
  private Integer cellIndex;


  public GetXlsxCellRequest inputFileBytes(byte[] inputFileBytes) {
    
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }


  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }


  public GetXlsxCellRequest inputFileUrl(String inputFileUrl) {
    
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputFileUrl() {
    return inputFileUrl;
  }


  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }


  public GetXlsxCellRequest worksheetToQuery(XlsxWorksheet worksheetToQuery) {
    
    this.worksheetToQuery = worksheetToQuery;
    return this;
  }

   /**
   * Get worksheetToQuery
   * @return worksheetToQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XlsxWorksheet getWorksheetToQuery() {
    return worksheetToQuery;
  }


  public void setWorksheetToQuery(XlsxWorksheet worksheetToQuery) {
    this.worksheetToQuery = worksheetToQuery;
  }


  public GetXlsxCellRequest rowIndex(Integer rowIndex) {
    
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * 0-based index of the row, 0, 1, 2, ... to retrieve
   * @return rowIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-based index of the row, 0, 1, 2, ... to retrieve")
  @JsonProperty(JSON_PROPERTY_ROW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRowIndex() {
    return rowIndex;
  }


  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }


  public GetXlsxCellRequest cellIndex(Integer cellIndex) {
    
    this.cellIndex = cellIndex;
    return this;
  }

   /**
   * 0-based index of the cell, 0, 1, 2, ... in the row to retrieve
   * @return cellIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-based index of the cell, 0, 1, 2, ... in the row to retrieve")
  @JsonProperty(JSON_PROPERTY_CELL_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCellIndex() {
    return cellIndex;
  }


  public void setCellIndex(Integer cellIndex) {
    this.cellIndex = cellIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxCellRequest getXlsxCellRequest = (GetXlsxCellRequest) o;
    return Arrays.equals(this.inputFileBytes, getXlsxCellRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, getXlsxCellRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToQuery, getXlsxCellRequest.worksheetToQuery) &&
        Objects.equals(this.rowIndex, getXlsxCellRequest.rowIndex) &&
        Objects.equals(this.cellIndex, getXlsxCellRequest.cellIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToQuery, rowIndex, cellIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxCellRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToQuery: ").append(toIndentedString(worksheetToQuery)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
    sb.append("    cellIndex: ").append(toIndentedString(cellIndex)).append("\n");
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

