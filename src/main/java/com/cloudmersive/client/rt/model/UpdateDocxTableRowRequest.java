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
import com.cloudmersive.client.rt.model.DocxTableRow;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Input to a Update Table Row request
 */
@JsonPropertyOrder({
  UpdateDocxTableRowRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  UpdateDocxTableRowRequest.JSON_PROPERTY_INPUT_FILE_URL,
  UpdateDocxTableRowRequest.JSON_PROPERTY_ROW_TO_UPDATE,
  UpdateDocxTableRowRequest.JSON_PROPERTY_TABLE_ROW_INDEX,
  UpdateDocxTableRowRequest.JSON_PROPERTY_EXISTING_TABLE_PATH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateDocxTableRowRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_ROW_TO_UPDATE = "RowToUpdate";
  private DocxTableRow rowToUpdate;

  public static final String JSON_PROPERTY_TABLE_ROW_INDEX = "TableRowIndex";
  private Integer tableRowIndex;

  public static final String JSON_PROPERTY_EXISTING_TABLE_PATH = "ExistingTablePath";
  private String existingTablePath;

  public UpdateDocxTableRowRequest() {
  }

  public UpdateDocxTableRowRequest inputFileBytes(byte[] inputFileBytes) {
    
    this.inputFileBytes = inputFileBytes;
    return this;
  }

  /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }

  public UpdateDocxTableRowRequest inputFileUrl(String inputFileUrl) {
    
    this.inputFileUrl = inputFileUrl;
    return this;
  }

  /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputFileUrl() {
    return inputFileUrl;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }

  public UpdateDocxTableRowRequest rowToUpdate(DocxTableRow rowToUpdate) {
    
    this.rowToUpdate = rowToUpdate;
    return this;
  }

  /**
   * Get rowToUpdate
   * @return rowToUpdate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROW_TO_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocxTableRow getRowToUpdate() {
    return rowToUpdate;
  }


  @JsonProperty(JSON_PROPERTY_ROW_TO_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRowToUpdate(DocxTableRow rowToUpdate) {
    this.rowToUpdate = rowToUpdate;
  }

  public UpdateDocxTableRowRequest tableRowIndex(Integer tableRowIndex) {
    
    this.tableRowIndex = tableRowIndex;
    return this;
  }

  /**
   * 0-based index of the Table Row to update
   * @return tableRowIndex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TABLE_ROW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTableRowIndex() {
    return tableRowIndex;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_ROW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTableRowIndex(Integer tableRowIndex) {
    this.tableRowIndex = tableRowIndex;
  }

  public UpdateDocxTableRowRequest existingTablePath(String existingTablePath) {
    
    this.existingTablePath = existingTablePath;
    return this;
  }

  /**
   * Required; the path to the existing table to modify
   * @return existingTablePath
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXISTING_TABLE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExistingTablePath() {
    return existingTablePath;
  }


  @JsonProperty(JSON_PROPERTY_EXISTING_TABLE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExistingTablePath(String existingTablePath) {
    this.existingTablePath = existingTablePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDocxTableRowRequest updateDocxTableRowRequest = (UpdateDocxTableRowRequest) o;
    return Arrays.equals(this.inputFileBytes, updateDocxTableRowRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, updateDocxTableRowRequest.inputFileUrl) &&
        Objects.equals(this.rowToUpdate, updateDocxTableRowRequest.rowToUpdate) &&
        Objects.equals(this.tableRowIndex, updateDocxTableRowRequest.tableRowIndex) &&
        Objects.equals(this.existingTablePath, updateDocxTableRowRequest.existingTablePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, rowToUpdate, tableRowIndex, existingTablePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDocxTableRowRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    rowToUpdate: ").append(toIndentedString(rowToUpdate)).append("\n");
    sb.append("    tableRowIndex: ").append(toIndentedString(tableRowIndex)).append("\n");
    sb.append("    existingTablePath: ").append(toIndentedString(existingTablePath)).append("\n");
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

