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
  XmlRemoveWithXPathResult.JSON_PROPERTY_SUCCESSFUL,
  XmlRemoveWithXPathResult.JSON_PROPERTY_RESULTING_XML_DOCUMENT,
  XmlRemoveWithXPathResult.JSON_PROPERTY_XML_NODES_REMOVED,
  XmlRemoveWithXPathResult.JSON_PROPERTY_NODES_REMOVED_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class XmlRemoveWithXPathResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_RESULTING_XML_DOCUMENT = "ResultingXmlDocument";
  private String resultingXmlDocument;

  public static final String JSON_PROPERTY_XML_NODES_REMOVED = "XmlNodesRemoved";
  private List<String> xmlNodesRemoved = new ArrayList<>();

  public static final String JSON_PROPERTY_NODES_REMOVED_COUNT = "NodesRemovedCount";
  private Integer nodesRemovedCount;

  public XmlRemoveWithXPathResult() {
  }

  public XmlRemoveWithXPathResult successful(Boolean successful) {
    
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

  public XmlRemoveWithXPathResult resultingXmlDocument(String resultingXmlDocument) {
    
    this.resultingXmlDocument = resultingXmlDocument;
    return this;
  }

  /**
   * Resulting, modified XML document with matching nodes removed as a string
   * @return resultingXmlDocument
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTING_XML_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResultingXmlDocument() {
    return resultingXmlDocument;
  }


  @JsonProperty(JSON_PROPERTY_RESULTING_XML_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultingXmlDocument(String resultingXmlDocument) {
    this.resultingXmlDocument = resultingXmlDocument;
  }

  public XmlRemoveWithXPathResult xmlNodesRemoved(List<String> xmlNodesRemoved) {
    
    this.xmlNodesRemoved = xmlNodesRemoved;
    return this;
  }

  public XmlRemoveWithXPathResult addXmlNodesRemovedItem(String xmlNodesRemovedItem) {
    if (this.xmlNodesRemoved == null) {
      this.xmlNodesRemoved = new ArrayList<>();
    }
    this.xmlNodesRemoved.add(xmlNodesRemovedItem);
    return this;
  }

  /**
   * Matching selected XML nodes as strings
   * @return xmlNodesRemoved
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_XML_NODES_REMOVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getXmlNodesRemoved() {
    return xmlNodesRemoved;
  }


  @JsonProperty(JSON_PROPERTY_XML_NODES_REMOVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setXmlNodesRemoved(List<String> xmlNodesRemoved) {
    this.xmlNodesRemoved = xmlNodesRemoved;
  }

  public XmlRemoveWithXPathResult nodesRemovedCount(Integer nodesRemovedCount) {
    
    this.nodesRemovedCount = nodesRemovedCount;
    return this;
  }

  /**
   * Count of the matching results
   * @return nodesRemovedCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODES_REMOVED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNodesRemovedCount() {
    return nodesRemovedCount;
  }


  @JsonProperty(JSON_PROPERTY_NODES_REMOVED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodesRemovedCount(Integer nodesRemovedCount) {
    this.nodesRemovedCount = nodesRemovedCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlRemoveWithXPathResult xmlRemoveWithXPathResult = (XmlRemoveWithXPathResult) o;
    return Objects.equals(this.successful, xmlRemoveWithXPathResult.successful) &&
        Objects.equals(this.resultingXmlDocument, xmlRemoveWithXPathResult.resultingXmlDocument) &&
        Objects.equals(this.xmlNodesRemoved, xmlRemoveWithXPathResult.xmlNodesRemoved) &&
        Objects.equals(this.nodesRemovedCount, xmlRemoveWithXPathResult.nodesRemovedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, resultingXmlDocument, xmlNodesRemoved, nodesRemovedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlRemoveWithXPathResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    resultingXmlDocument: ").append(toIndentedString(resultingXmlDocument)).append("\n");
    sb.append("    xmlNodesRemoved: ").append(toIndentedString(xmlNodesRemoved)).append("\n");
    sb.append("    nodesRemovedCount: ").append(toIndentedString(nodesRemovedCount)).append("\n");
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

