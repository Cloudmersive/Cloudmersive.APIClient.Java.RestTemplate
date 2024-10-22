/*
 * dataintegrationapi
 * Easily and directly query database backup files, convert into other file formats.
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
import com.cloudmersive.client.rt.model.MssqlTable;
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
 * Result of enumeerating Tables in a SQL Server Backup (.BAK) file
 */
@JsonPropertyOrder({
  MssqlBakEnumerateTablesResult.JSON_PROPERTY_SUCCESSFUL,
  MssqlBakEnumerateTablesResult.JSON_PROPERTY_TABLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:17:03.513337300Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MssqlBakEnumerateTablesResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TABLES = "tables";
  private List<MssqlTable> tables = new ArrayList<>();

  public MssqlBakEnumerateTablesResult() {
  }

  public MssqlBakEnumerateTablesResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if successful, False otherwise
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

  public MssqlBakEnumerateTablesResult tables(List<MssqlTable> tables) {
    
    this.tables = tables;
    return this;
  }

  public MssqlBakEnumerateTablesResult addTablesItem(MssqlTable tablesItem) {
    if (this.tables == null) {
      this.tables = new ArrayList<>();
    }
    this.tables.add(tablesItem);
    return this;
  }

  /**
   * SQL Server Tables in the backup file
   * @return tables
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MssqlTable> getTables() {
    return tables;
  }


  @JsonProperty(JSON_PROPERTY_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTables(List<MssqlTable> tables) {
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
    MssqlBakEnumerateTablesResult mssqlBakEnumerateTablesResult = (MssqlBakEnumerateTablesResult) o;
    return Objects.equals(this.successful, mssqlBakEnumerateTablesResult.successful) &&
        Objects.equals(this.tables, mssqlBakEnumerateTablesResult.tables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, tables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MssqlBakEnumerateTablesResult {\n");
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

