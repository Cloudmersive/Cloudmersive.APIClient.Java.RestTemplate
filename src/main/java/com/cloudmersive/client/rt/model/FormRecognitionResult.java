/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.rt.model.FieldResult;
import com.cloudmersive.client.rt.model.TableResult;
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
 * The result of extracting form field values
 */
@JsonPropertyOrder({
  FormRecognitionResult.JSON_PROPERTY_SUCCESSFUL,
  FormRecognitionResult.JSON_PROPERTY_FIELD_VALUE_EXTRACTION_RESULT,
  FormRecognitionResult.JSON_PROPERTY_TABLE_VALUE_EXTRACTION_RESULTS,
  FormRecognitionResult.JSON_PROPERTY_DIAGNOSTICS,
  FormRecognitionResult.JSON_PROPERTY_BEST_MATCH_FORM_SETTING_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:02.095460100Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FormRecognitionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_FIELD_VALUE_EXTRACTION_RESULT = "FieldValueExtractionResult";
  private List<FieldResult> fieldValueExtractionResult = new ArrayList<>();

  public static final String JSON_PROPERTY_TABLE_VALUE_EXTRACTION_RESULTS = "TableValueExtractionResults";
  private List<TableResult> tableValueExtractionResults = new ArrayList<>();

  public static final String JSON_PROPERTY_DIAGNOSTICS = "Diagnostics";
  private List<String> diagnostics = new ArrayList<>();

  public static final String JSON_PROPERTY_BEST_MATCH_FORM_SETTING_NAME = "BestMatchFormSettingName";
  private String bestMatchFormSettingName;

  public FormRecognitionResult() {
  }

  public FormRecognitionResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if the operation was successful, false otherwise
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

  public FormRecognitionResult fieldValueExtractionResult(List<FieldResult> fieldValueExtractionResult) {
    
    this.fieldValueExtractionResult = fieldValueExtractionResult;
    return this;
  }

  public FormRecognitionResult addFieldValueExtractionResultItem(FieldResult fieldValueExtractionResultItem) {
    if (this.fieldValueExtractionResult == null) {
      this.fieldValueExtractionResult = new ArrayList<>();
    }
    this.fieldValueExtractionResult.add(fieldValueExtractionResultItem);
    return this;
  }

  /**
   * Result of form field OCR data extraction
   * @return fieldValueExtractionResult
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_VALUE_EXTRACTION_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FieldResult> getFieldValueExtractionResult() {
    return fieldValueExtractionResult;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_VALUE_EXTRACTION_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldValueExtractionResult(List<FieldResult> fieldValueExtractionResult) {
    this.fieldValueExtractionResult = fieldValueExtractionResult;
  }

  public FormRecognitionResult tableValueExtractionResults(List<TableResult> tableValueExtractionResults) {
    
    this.tableValueExtractionResults = tableValueExtractionResults;
    return this;
  }

  public FormRecognitionResult addTableValueExtractionResultsItem(TableResult tableValueExtractionResultsItem) {
    if (this.tableValueExtractionResults == null) {
      this.tableValueExtractionResults = new ArrayList<>();
    }
    this.tableValueExtractionResults.add(tableValueExtractionResultsItem);
    return this;
  }

  /**
   * Result of form table OCR data extraction
   * @return tableValueExtractionResults
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TABLE_VALUE_EXTRACTION_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TableResult> getTableValueExtractionResults() {
    return tableValueExtractionResults;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_VALUE_EXTRACTION_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTableValueExtractionResults(List<TableResult> tableValueExtractionResults) {
    this.tableValueExtractionResults = tableValueExtractionResults;
  }

  public FormRecognitionResult diagnostics(List<String> diagnostics) {
    
    this.diagnostics = diagnostics;
    return this;
  }

  public FormRecognitionResult addDiagnosticsItem(String diagnosticsItem) {
    if (this.diagnostics == null) {
      this.diagnostics = new ArrayList<>();
    }
    this.diagnostics.add(diagnosticsItem);
    return this;
  }

  /**
   * Diagnostic images - default is null, enable diagnostics&#x3D;true to populate this parameter with one image per field
   * @return diagnostics
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIAGNOSTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDiagnostics() {
    return diagnostics;
  }


  @JsonProperty(JSON_PROPERTY_DIAGNOSTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiagnostics(List<String> diagnostics) {
    this.diagnostics = diagnostics;
  }

  public FormRecognitionResult bestMatchFormSettingName(String bestMatchFormSettingName) {
    
    this.bestMatchFormSettingName = bestMatchFormSettingName;
    return this;
  }

  /**
   * Optional; populated when using photo/recognize/form/advanced with the Setting Name of the best-matching highest-relevance form
   * @return bestMatchFormSettingName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEST_MATCH_FORM_SETTING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBestMatchFormSettingName() {
    return bestMatchFormSettingName;
  }


  @JsonProperty(JSON_PROPERTY_BEST_MATCH_FORM_SETTING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBestMatchFormSettingName(String bestMatchFormSettingName) {
    this.bestMatchFormSettingName = bestMatchFormSettingName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormRecognitionResult formRecognitionResult = (FormRecognitionResult) o;
    return Objects.equals(this.successful, formRecognitionResult.successful) &&
        Objects.equals(this.fieldValueExtractionResult, formRecognitionResult.fieldValueExtractionResult) &&
        Objects.equals(this.tableValueExtractionResults, formRecognitionResult.tableValueExtractionResults) &&
        Objects.equals(this.diagnostics, formRecognitionResult.diagnostics) &&
        Objects.equals(this.bestMatchFormSettingName, formRecognitionResult.bestMatchFormSettingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, fieldValueExtractionResult, tableValueExtractionResults, diagnostics, bestMatchFormSettingName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormRecognitionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    fieldValueExtractionResult: ").append(toIndentedString(fieldValueExtractionResult)).append("\n");
    sb.append("    tableValueExtractionResults: ").append(toIndentedString(tableValueExtractionResults)).append("\n");
    sb.append("    diagnostics: ").append(toIndentedString(diagnostics)).append("\n");
    sb.append("    bestMatchFormSettingName: ").append(toIndentedString(bestMatchFormSettingName)).append("\n");
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

