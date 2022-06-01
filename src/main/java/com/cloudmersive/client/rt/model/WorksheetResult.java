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
 * A single Excel XLSX file corresponding to one worksheet (tab) in the original spreadsheet
 */
@ApiModel(description = "A single Excel XLSX file corresponding to one worksheet (tab) in the original spreadsheet")
@JsonPropertyOrder({
  WorksheetResult.JSON_PROPERTY_WORKSHEET_NUMBER,
  WorksheetResult.JSON_PROPERTY_WORKSHEET_NAME,
  WorksheetResult.JSON_PROPERTY_U_R_L,
  WorksheetResult.JSON_PROPERTY_WORKSHEET_CONTENTS
})
@JsonTypeName("WorksheetResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class WorksheetResult {
  public static final String JSON_PROPERTY_WORKSHEET_NUMBER = "WorksheetNumber";
  private Integer worksheetNumber;

  public static final String JSON_PROPERTY_WORKSHEET_NAME = "WorksheetName";
  private String worksheetName;

  public static final String JSON_PROPERTY_U_R_L = "URL";
  private String URL;

  public static final String JSON_PROPERTY_WORKSHEET_CONTENTS = "WorksheetContents";
  private byte[] worksheetContents;


  public WorksheetResult worksheetNumber(Integer worksheetNumber) {
    
    this.worksheetNumber = worksheetNumber;
    return this;
  }

   /**
   * Worksheet number of the converted page, starting with 1 for the left-most worksheet
   * @return worksheetNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Worksheet number of the converted page, starting with 1 for the left-most worksheet")
  @JsonProperty(JSON_PROPERTY_WORKSHEET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWorksheetNumber() {
    return worksheetNumber;
  }


  public void setWorksheetNumber(Integer worksheetNumber) {
    this.worksheetNumber = worksheetNumber;
  }


  public WorksheetResult worksheetName(String worksheetName) {
    
    this.worksheetName = worksheetName;
    return this;
  }

   /**
   * The name of the worksheet
   * @return worksheetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the worksheet")
  @JsonProperty(JSON_PROPERTY_WORKSHEET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWorksheetName() {
    return worksheetName;
  }


  public void setWorksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
  }


  public WorksheetResult URL(String URL) {
    
    this.URL = URL;
    return this;
  }

   /**
   * URL to the XLSX file of this worksheet; file is stored in an in-memory cache and will be deleted
   * @return URL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to the XLSX file of this worksheet; file is stored in an in-memory cache and will be deleted")
  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getURL() {
    return URL;
  }


  public void setURL(String URL) {
    this.URL = URL;
  }


  public WorksheetResult worksheetContents(byte[] worksheetContents) {
    
    this.worksheetContents = worksheetContents;
    return this;
  }

   /**
   * Contents of the worksheet in bytes
   * @return worksheetContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contents of the worksheet in bytes")
  @JsonProperty(JSON_PROPERTY_WORKSHEET_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getWorksheetContents() {
    return worksheetContents;
  }


  public void setWorksheetContents(byte[] worksheetContents) {
    this.worksheetContents = worksheetContents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorksheetResult worksheetResult = (WorksheetResult) o;
    return Objects.equals(this.worksheetNumber, worksheetResult.worksheetNumber) &&
        Objects.equals(this.worksheetName, worksheetResult.worksheetName) &&
        Objects.equals(this.URL, worksheetResult.URL) &&
        Arrays.equals(this.worksheetContents, worksheetResult.worksheetContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worksheetNumber, worksheetName, URL, Arrays.hashCode(worksheetContents));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorksheetResult {\n");
    sb.append("    worksheetNumber: ").append(toIndentedString(worksheetNumber)).append("\n");
    sb.append("    worksheetName: ").append(toIndentedString(worksheetName)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    worksheetContents: ").append(toIndentedString(worksheetContents)).append("\n");
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

