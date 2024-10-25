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
import com.cloudmersive.client.rt.model.DocxTable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of running a Get-Tables command
 */
@JsonPropertyOrder({
  GetDocxTablesResponse.JSON_PROPERTY_SUCCESSFUL,
  GetDocxTablesResponse.JSON_PROPERTY_TABLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetDocxTablesResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TABLES = "Tables";
  private List<DocxTable> tables = new ArrayList<>();

  public GetDocxTablesResponse() {
  }

  public GetDocxTablesResponse successful(Boolean successful) {
    
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

  public GetDocxTablesResponse tables(List<DocxTable> tables) {
    
    this.tables = tables;
    return this;
  }

  public GetDocxTablesResponse addTablesItem(DocxTable tablesItem) {
    if (this.tables == null) {
      this.tables = new ArrayList<>();
    }
    this.tables.add(tablesItem);
    return this;
  }

  /**
   * Tables in the DOCX file
   * @return tables
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxTable> getTables() {
    return tables;
  }


  @JsonProperty(JSON_PROPERTY_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTables(List<DocxTable> tables) {
    this.tables = tables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxTablesResponse getDocxTablesResponse = (GetDocxTablesResponse) o;
    return Objects.equals(this.successful, getDocxTablesResponse.successful) &&
        Objects.equals(this.tables, getDocxTablesResponse.tables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, tables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxTablesResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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

