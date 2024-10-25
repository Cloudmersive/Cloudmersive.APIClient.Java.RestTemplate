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
 * Result of performing an XQuery operation on multiple XML documents.
 */
@JsonPropertyOrder({
  XmlQueryWithXQueryMultiResult.JSON_PROPERTY_SUCCESSFUL,
  XmlQueryWithXQueryMultiResult.JSON_PROPERTY_RESULTING_XML,
  XmlQueryWithXQueryMultiResult.JSON_PROPERTY_ERROR_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class XmlQueryWithXQueryMultiResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_RESULTING_XML = "ResultingXml";
  private String resultingXml;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "ErrorMessage";
  private String errorMessage;

  public XmlQueryWithXQueryMultiResult() {
  }

  public XmlQueryWithXQueryMultiResult successful(Boolean successful) {
    
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

  public XmlQueryWithXQueryMultiResult resultingXml(String resultingXml) {
    
    this.resultingXml = resultingXml;
    return this;
  }

  /**
   * Resulting XML result output
   * @return resultingXml
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTING_XML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResultingXml() {
    return resultingXml;
  }


  @JsonProperty(JSON_PROPERTY_RESULTING_XML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultingXml(String resultingXml) {
    this.resultingXml = resultingXml;
  }

  public XmlQueryWithXQueryMultiResult errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * If an error occurs, additional details on the error
   * @return errorMessage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlQueryWithXQueryMultiResult xmlQueryWithXQueryMultiResult = (XmlQueryWithXQueryMultiResult) o;
    return Objects.equals(this.successful, xmlQueryWithXQueryMultiResult.successful) &&
        Objects.equals(this.resultingXml, xmlQueryWithXQueryMultiResult.resultingXml) &&
        Objects.equals(this.errorMessage, xmlQueryWithXQueryMultiResult.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, resultingXml, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlQueryWithXQueryMultiResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    resultingXml: ").append(toIndentedString(resultingXml)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

