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
 * Input to a delete DOCX table row range request
 */
@ApiModel(description = "Input to a delete DOCX table row range request")
@JsonPropertyOrder({
  DeleteDocxTableRowRangeRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  DeleteDocxTableRowRangeRequest.JSON_PROPERTY_INPUT_FILE_URL,
  DeleteDocxTableRowRangeRequest.JSON_PROPERTY_TABLE_PATH,
  DeleteDocxTableRowRangeRequest.JSON_PROPERTY_TABLE_ROW_ROW_INDEX_START,
  DeleteDocxTableRowRangeRequest.JSON_PROPERTY_TABLE_ROW_ROW_INDEX_END
})
@JsonTypeName("DeleteDocxTableRowRangeRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class DeleteDocxTableRowRangeRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_TABLE_PATH = "TablePath";
  private String tablePath;

  public static final String JSON_PROPERTY_TABLE_ROW_ROW_INDEX_START = "TableRowRowIndexStart";
  private Integer tableRowRowIndexStart;

  public static final String JSON_PROPERTY_TABLE_ROW_ROW_INDEX_END = "TableRowRowIndexEnd";
  private Integer tableRowRowIndexEnd;


  public DeleteDocxTableRowRangeRequest inputFileBytes(byte[] inputFileBytes) {
    
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


  public DeleteDocxTableRowRangeRequest inputFileUrl(String inputFileUrl) {
    
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


  public DeleteDocxTableRowRangeRequest tablePath(String tablePath) {
    
    this.tablePath = tablePath;
    return this;
  }

   /**
   * Path to the table to delete the row from
   * @return tablePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the table to delete the row from")
  @JsonProperty(JSON_PROPERTY_TABLE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTablePath() {
    return tablePath;
  }


  public void setTablePath(String tablePath) {
    this.tablePath = tablePath;
  }


  public DeleteDocxTableRowRangeRequest tableRowRowIndexStart(Integer tableRowRowIndexStart) {
    
    this.tableRowRowIndexStart = tableRowRowIndexStart;
    return this;
  }

   /**
   * 0-based index of the row to begin deleting rows (e.g. 0, 1, 2, ...) in the table
   * @return tableRowRowIndexStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-based index of the row to begin deleting rows (e.g. 0, 1, 2, ...) in the table")
  @JsonProperty(JSON_PROPERTY_TABLE_ROW_ROW_INDEX_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTableRowRowIndexStart() {
    return tableRowRowIndexStart;
  }


  public void setTableRowRowIndexStart(Integer tableRowRowIndexStart) {
    this.tableRowRowIndexStart = tableRowRowIndexStart;
  }


  public DeleteDocxTableRowRangeRequest tableRowRowIndexEnd(Integer tableRowRowIndexEnd) {
    
    this.tableRowRowIndexEnd = tableRowRowIndexEnd;
    return this;
  }

   /**
   * 0-based index of the row to stop deleting rows (e.g. 0, 1, 2, ...) in the table
   * @return tableRowRowIndexEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-based index of the row to stop deleting rows (e.g. 0, 1, 2, ...) in the table")
  @JsonProperty(JSON_PROPERTY_TABLE_ROW_ROW_INDEX_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTableRowRowIndexEnd() {
    return tableRowRowIndexEnd;
  }


  public void setTableRowRowIndexEnd(Integer tableRowRowIndexEnd) {
    this.tableRowRowIndexEnd = tableRowRowIndexEnd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDocxTableRowRangeRequest deleteDocxTableRowRangeRequest = (DeleteDocxTableRowRangeRequest) o;
    return Arrays.equals(this.inputFileBytes, deleteDocxTableRowRangeRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, deleteDocxTableRowRangeRequest.inputFileUrl) &&
        Objects.equals(this.tablePath, deleteDocxTableRowRangeRequest.tablePath) &&
        Objects.equals(this.tableRowRowIndexStart, deleteDocxTableRowRangeRequest.tableRowRowIndexStart) &&
        Objects.equals(this.tableRowRowIndexEnd, deleteDocxTableRowRangeRequest.tableRowRowIndexEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, tablePath, tableRowRowIndexStart, tableRowRowIndexEnd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDocxTableRowRangeRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    tablePath: ").append(toIndentedString(tablePath)).append("\n");
    sb.append("    tableRowRowIndexStart: ").append(toIndentedString(tableRowRowIndexStart)).append("\n");
    sb.append("    tableRowRowIndexEnd: ").append(toIndentedString(tableRowRowIndexEnd)).append("\n");
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

