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
import com.cloudmersive.client.rt.model.XlsxWorksheet;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Input to a Set Cell by identifier in XLSX Worksheets request
 */
@JsonPropertyOrder({
  SetXlsxCellByIdentifierRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  SetXlsxCellByIdentifierRequest.JSON_PROPERTY_INPUT_FILE_URL,
  SetXlsxCellByIdentifierRequest.JSON_PROPERTY_WORKSHEET_TO_UPDATE,
  SetXlsxCellByIdentifierRequest.JSON_PROPERTY_CELL_IDENTIFIER,
  SetXlsxCellByIdentifierRequest.JSON_PROPERTY_CELL_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SetXlsxCellByIdentifierRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_WORKSHEET_TO_UPDATE = "WorksheetToUpdate";
  private XlsxWorksheet worksheetToUpdate;

  public static final String JSON_PROPERTY_CELL_IDENTIFIER = "CellIdentifier";
  private String cellIdentifier;

  public static final String JSON_PROPERTY_CELL_VALUE = "CellValue";
  private XlsxSpreadsheetCell cellValue;

  public SetXlsxCellByIdentifierRequest() {
  }

  public SetXlsxCellByIdentifierRequest inputFileBytes(byte[] inputFileBytes) {
    
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

  public SetXlsxCellByIdentifierRequest inputFileUrl(String inputFileUrl) {
    
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

  public SetXlsxCellByIdentifierRequest worksheetToUpdate(XlsxWorksheet worksheetToUpdate) {
    
    this.worksheetToUpdate = worksheetToUpdate;
    return this;
  }

  /**
   * Get worksheetToUpdate
   * @return worksheetToUpdate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XlsxWorksheet getWorksheetToUpdate() {
    return worksheetToUpdate;
  }


  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorksheetToUpdate(XlsxWorksheet worksheetToUpdate) {
    this.worksheetToUpdate = worksheetToUpdate;
  }

  public SetXlsxCellByIdentifierRequest cellIdentifier(String cellIdentifier) {
    
    this.cellIdentifier = cellIdentifier;
    return this;
  }

  /**
   * The Excel cell identifier (e.g. A1, B2, C33, etc.) of the cell to update
   * @return cellIdentifier
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELL_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCellIdentifier() {
    return cellIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_CELL_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellIdentifier(String cellIdentifier) {
    this.cellIdentifier = cellIdentifier;
  }

  public SetXlsxCellByIdentifierRequest cellValue(XlsxSpreadsheetCell cellValue) {
    
    this.cellValue = cellValue;
    return this;
  }

  /**
   * Get cellValue
   * @return cellValue
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XlsxSpreadsheetCell getCellValue() {
    return cellValue;
  }


  @JsonProperty(JSON_PROPERTY_CELL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellValue(XlsxSpreadsheetCell cellValue) {
    this.cellValue = cellValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetXlsxCellByIdentifierRequest setXlsxCellByIdentifierRequest = (SetXlsxCellByIdentifierRequest) o;
    return Arrays.equals(this.inputFileBytes, setXlsxCellByIdentifierRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, setXlsxCellByIdentifierRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToUpdate, setXlsxCellByIdentifierRequest.worksheetToUpdate) &&
        Objects.equals(this.cellIdentifier, setXlsxCellByIdentifierRequest.cellIdentifier) &&
        Objects.equals(this.cellValue, setXlsxCellByIdentifierRequest.cellValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToUpdate, cellIdentifier, cellValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetXlsxCellByIdentifierRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToUpdate: ").append(toIndentedString(worksheetToUpdate)).append("\n");
    sb.append("    cellIdentifier: ").append(toIndentedString(cellIdentifier)).append("\n");
    sb.append("    cellValue: ").append(toIndentedString(cellValue)).append("\n");
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

