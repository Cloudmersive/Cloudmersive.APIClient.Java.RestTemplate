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


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.model.DocxParagraph;
import com.cloudmersive.client.model.DocxSection;
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
 * Footer in a Word Document (DOCX)
 */
@ApiModel(description = "Footer in a Word Document (DOCX)")
@JsonPropertyOrder({
  DocxFooter.JSON_PROPERTY_PATH,
  DocxFooter.JSON_PROPERTY_PARAGRAPHS,
  DocxFooter.JSON_PROPERTY_SECTIONS_WITH_FOOTER
})
@JsonTypeName("DocxFooter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:29.247-08:00[America/Los_Angeles]")
public class DocxFooter {
  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_PARAGRAPHS = "Paragraphs";
  private List<DocxParagraph> paragraphs = null;

  public static final String JSON_PROPERTY_SECTIONS_WITH_FOOTER = "SectionsWithFooter";
  private List<DocxSection> sectionsWithFooter = null;


  public DocxFooter path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new tables
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new tables")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public DocxFooter paragraphs(List<DocxParagraph> paragraphs) {
    
    this.paragraphs = paragraphs;
    return this;
  }

  public DocxFooter addParagraphsItem(DocxParagraph paragraphsItem) {
    if (this.paragraphs == null) {
      this.paragraphs = new ArrayList<DocxParagraph>();
    }
    this.paragraphs.add(paragraphsItem);
    return this;
  }

   /**
   * Paragraphs in this footer
   * @return paragraphs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Paragraphs in this footer")
  @JsonProperty(JSON_PROPERTY_PARAGRAPHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxParagraph> getParagraphs() {
    return paragraphs;
  }


  public void setParagraphs(List<DocxParagraph> paragraphs) {
    this.paragraphs = paragraphs;
  }


  public DocxFooter sectionsWithFooter(List<DocxSection> sectionsWithFooter) {
    
    this.sectionsWithFooter = sectionsWithFooter;
    return this;
  }

  public DocxFooter addSectionsWithFooterItem(DocxSection sectionsWithFooterItem) {
    if (this.sectionsWithFooter == null) {
      this.sectionsWithFooter = new ArrayList<DocxSection>();
    }
    this.sectionsWithFooter.add(sectionsWithFooterItem);
    return this;
  }

   /**
   * Sections that the footer is applied to
   * @return sectionsWithFooter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sections that the footer is applied to")
  @JsonProperty(JSON_PROPERTY_SECTIONS_WITH_FOOTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxSection> getSectionsWithFooter() {
    return sectionsWithFooter;
  }


  public void setSectionsWithFooter(List<DocxSection> sectionsWithFooter) {
    this.sectionsWithFooter = sectionsWithFooter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxFooter docxFooter = (DocxFooter) o;
    return Objects.equals(this.path, docxFooter.path) &&
        Objects.equals(this.paragraphs, docxFooter.paragraphs) &&
        Objects.equals(this.sectionsWithFooter, docxFooter.sectionsWithFooter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, paragraphs, sectionsWithFooter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxFooter {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
    sb.append("    sectionsWithFooter: ").append(toIndentedString(sectionsWithFooter)).append("\n");
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

