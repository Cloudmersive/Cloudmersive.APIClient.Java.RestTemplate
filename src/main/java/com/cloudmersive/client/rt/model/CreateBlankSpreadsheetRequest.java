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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Input to a Create Blank Spreadsheet request
 */
@JsonPropertyOrder({
  CreateBlankSpreadsheetRequest.JSON_PROPERTY_WORKSHEET_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateBlankSpreadsheetRequest {
  public static final String JSON_PROPERTY_WORKSHEET_NAME = "WorksheetName";
  private String worksheetName;

  public CreateBlankSpreadsheetRequest() {
  }

  public CreateBlankSpreadsheetRequest worksheetName(String worksheetName) {
    
    this.worksheetName = worksheetName;
    return this;
  }

  /**
   * The blank Spreadsheet will have a default Worksheet in it; supply a name, or if left empty, will default to Worksheet1
   * @return worksheetName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSHEET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWorksheetName() {
    return worksheetName;
  }


  @JsonProperty(JSON_PROPERTY_WORKSHEET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBlankSpreadsheetRequest createBlankSpreadsheetRequest = (CreateBlankSpreadsheetRequest) o;
    return Objects.equals(this.worksheetName, createBlankSpreadsheetRequest.worksheetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worksheetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBlankSpreadsheetRequest {\n");
    sb.append("    worksheetName: ").append(toIndentedString(worksheetName)).append("\n");
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

