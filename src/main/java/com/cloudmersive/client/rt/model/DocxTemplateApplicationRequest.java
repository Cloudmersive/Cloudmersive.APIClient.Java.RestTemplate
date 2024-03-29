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
import com.cloudmersive.client.rt.model.DocxTemplateOperation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Word DOCX template application request
 */
@ApiModel(description = "Word DOCX template application request")
@JsonPropertyOrder({
  DocxTemplateApplicationRequest.JSON_PROPERTY_OPERATIONS
})
@JsonTypeName("DocxTemplateApplicationRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class DocxTemplateApplicationRequest {
  public static final String JSON_PROPERTY_OPERATIONS = "Operations";
  private List<DocxTemplateOperation> operations = null;


  public DocxTemplateApplicationRequest operations(List<DocxTemplateOperation> operations) {
    
    this.operations = operations;
    return this;
  }

  public DocxTemplateApplicationRequest addOperationsItem(DocxTemplateOperation operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<DocxTemplateOperation>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Operations to apply to this template
   * @return operations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operations to apply to this template")
  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxTemplateOperation> getOperations() {
    return operations;
  }


  public void setOperations(List<DocxTemplateOperation> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTemplateApplicationRequest docxTemplateApplicationRequest = (DocxTemplateApplicationRequest) o;
    return Objects.equals(this.operations, docxTemplateApplicationRequest.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTemplateApplicationRequest {\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

