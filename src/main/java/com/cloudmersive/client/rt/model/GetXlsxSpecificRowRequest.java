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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Input to a Get-Specific-Row request
 */
@JsonPropertyOrder({
  GetXlsxSpecificRowRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  GetXlsxSpecificRowRequest.JSON_PROPERTY_INPUT_FILE_URL,
  GetXlsxSpecificRowRequest.JSON_PROPERTY_WORKSHEET_TO_QUERY,
  GetXlsxSpecificRowRequest.JSON_PROPERTY_PATH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetXlsxSpecificRowRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_WORKSHEET_TO_QUERY = "WorksheetToQuery";
  private XlsxWorksheet worksheetToQuery;

  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public GetXlsxSpecificRowRequest() {
  }

  public GetXlsxSpecificRowRequest inputFileBytes(byte[] inputFileBytes) {
    
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

  public GetXlsxSpecificRowRequest inputFileUrl(String inputFileUrl) {
    
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

  public GetXlsxSpecificRowRequest worksheetToQuery(XlsxWorksheet worksheetToQuery) {
    
    this.worksheetToQuery = worksheetToQuery;
    return this;
  }

  /**
   * Get worksheetToQuery
   * @return worksheetToQuery
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XlsxWorksheet getWorksheetToQuery() {
    return worksheetToQuery;
  }


  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorksheetToQuery(XlsxWorksheet worksheetToQuery) {
    this.worksheetToQuery = worksheetToQuery;
  }

  public GetXlsxSpecificRowRequest path(String path) {
    
    this.path = path;
    return this;
  }

  /**
   * Required; Full path for the desired row
   * @return path
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxSpecificRowRequest getXlsxSpecificRowRequest = (GetXlsxSpecificRowRequest) o;
    return Arrays.equals(this.inputFileBytes, getXlsxSpecificRowRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, getXlsxSpecificRowRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToQuery, getXlsxSpecificRowRequest.worksheetToQuery) &&
        Objects.equals(this.path, getXlsxSpecificRowRequest.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToQuery, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxSpecificRowRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToQuery: ").append(toIndentedString(worksheetToQuery)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

