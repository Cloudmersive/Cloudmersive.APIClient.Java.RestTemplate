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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of performing a filter operation on XML input using XPath
 */
@JsonPropertyOrder({
  XmlFilterWithXPathResult.JSON_PROPERTY_SUCCESSFUL,
  XmlFilterWithXPathResult.JSON_PROPERTY_XML_NODES,
  XmlFilterWithXPathResult.JSON_PROPERTY_RESULT_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class XmlFilterWithXPathResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_XML_NODES = "XmlNodes";
  private List<String> xmlNodes = new ArrayList<>();

  public static final String JSON_PROPERTY_RESULT_COUNT = "ResultCount";
  private Integer resultCount;

  public XmlFilterWithXPathResult() {
  }

  public XmlFilterWithXPathResult successful(Boolean successful) {
    
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

  public XmlFilterWithXPathResult xmlNodes(List<String> xmlNodes) {
    
    this.xmlNodes = xmlNodes;
    return this;
  }

  public XmlFilterWithXPathResult addXmlNodesItem(String xmlNodesItem) {
    if (this.xmlNodes == null) {
      this.xmlNodes = new ArrayList<>();
    }
    this.xmlNodes.add(xmlNodesItem);
    return this;
  }

  /**
   * Matching selected XML nodes as strings
   * @return xmlNodes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_XML_NODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getXmlNodes() {
    return xmlNodes;
  }


  @JsonProperty(JSON_PROPERTY_XML_NODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setXmlNodes(List<String> xmlNodes) {
    this.xmlNodes = xmlNodes;
  }

  public XmlFilterWithXPathResult resultCount(Integer resultCount) {
    
    this.resultCount = resultCount;
    return this;
  }

  /**
   * Count of the matching results
   * @return resultCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResultCount() {
    return resultCount;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlFilterWithXPathResult xmlFilterWithXPathResult = (XmlFilterWithXPathResult) o;
    return Objects.equals(this.successful, xmlFilterWithXPathResult.successful) &&
        Objects.equals(this.xmlNodes, xmlFilterWithXPathResult.xmlNodes) &&
        Objects.equals(this.resultCount, xmlFilterWithXPathResult.resultCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, xmlNodes, resultCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlFilterWithXPathResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    xmlNodes: ").append(toIndentedString(xmlNodes)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
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

