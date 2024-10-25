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
import com.cloudmersive.client.rt.model.HtmlTemplateOperation;
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
 * HTML template application request
 */
@JsonPropertyOrder({
  HtmlTemplateApplicationRequest.JSON_PROPERTY_HTML_TEMPLATE,
  HtmlTemplateApplicationRequest.JSON_PROPERTY_HTML_TEMPLATE_URL,
  HtmlTemplateApplicationRequest.JSON_PROPERTY_OPERATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class HtmlTemplateApplicationRequest {
  public static final String JSON_PROPERTY_HTML_TEMPLATE = "HtmlTemplate";
  private String htmlTemplate;

  public static final String JSON_PROPERTY_HTML_TEMPLATE_URL = "HtmlTemplateUrl";
  private String htmlTemplateUrl;

  public static final String JSON_PROPERTY_OPERATIONS = "Operations";
  private List<HtmlTemplateOperation> operations = new ArrayList<>();

  public HtmlTemplateApplicationRequest() {
  }

  public HtmlTemplateApplicationRequest htmlTemplate(String htmlTemplate) {
    
    this.htmlTemplate = htmlTemplate;
    return this;
  }

  /**
   * HTML template input as a string
   * @return htmlTemplate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtmlTemplate() {
    return htmlTemplate;
  }


  @JsonProperty(JSON_PROPERTY_HTML_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlTemplate(String htmlTemplate) {
    this.htmlTemplate = htmlTemplate;
  }

  public HtmlTemplateApplicationRequest htmlTemplateUrl(String htmlTemplateUrl) {
    
    this.htmlTemplateUrl = htmlTemplateUrl;
    return this;
  }

  /**
   * URL to HTML template input
   * @return htmlTemplateUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_TEMPLATE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtmlTemplateUrl() {
    return htmlTemplateUrl;
  }


  @JsonProperty(JSON_PROPERTY_HTML_TEMPLATE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlTemplateUrl(String htmlTemplateUrl) {
    this.htmlTemplateUrl = htmlTemplateUrl;
  }

  public HtmlTemplateApplicationRequest operations(List<HtmlTemplateOperation> operations) {
    
    this.operations = operations;
    return this;
  }

  public HtmlTemplateApplicationRequest addOperationsItem(HtmlTemplateOperation operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Operations to apply to this template
   * @return operations
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<HtmlTemplateOperation> getOperations() {
    return operations;
  }


  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperations(List<HtmlTemplateOperation> operations) {
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
    HtmlTemplateApplicationRequest htmlTemplateApplicationRequest = (HtmlTemplateApplicationRequest) o;
    return Objects.equals(this.htmlTemplate, htmlTemplateApplicationRequest.htmlTemplate) &&
        Objects.equals(this.htmlTemplateUrl, htmlTemplateApplicationRequest.htmlTemplateUrl) &&
        Objects.equals(this.operations, htmlTemplateApplicationRequest.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlTemplate, htmlTemplateUrl, operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlTemplateApplicationRequest {\n");
    sb.append("    htmlTemplate: ").append(toIndentedString(htmlTemplate)).append("\n");
    sb.append("    htmlTemplateUrl: ").append(toIndentedString(htmlTemplateUrl)).append("\n");
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

