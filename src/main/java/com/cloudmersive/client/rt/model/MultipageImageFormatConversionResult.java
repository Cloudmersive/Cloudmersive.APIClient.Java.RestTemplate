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
import com.cloudmersive.client.rt.model.PageConversionResult;
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
 * Result of converting a multi-page image into individual pages with a different format
 */
@ApiModel(description = "Result of converting a multi-page image into individual pages with a different format")
@JsonPropertyOrder({
  MultipageImageFormatConversionResult.JSON_PROPERTY_SUCCESSFUL,
  MultipageImageFormatConversionResult.JSON_PROPERTY_PAGE_COUNT,
  MultipageImageFormatConversionResult.JSON_PROPERTY_PAGES
})
@JsonTypeName("MultipageImageFormatConversionResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class MultipageImageFormatConversionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_PAGE_COUNT = "PageCount";
  private Integer pageCount;

  public static final String JSON_PROPERTY_PAGES = "Pages";
  private List<PageConversionResult> pages = null;


  public MultipageImageFormatConversionResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public MultipageImageFormatConversionResult pageCount(Integer pageCount) {
    
    this.pageCount = pageCount;
    return this;
  }

   /**
   * The number of pages in the converted output
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of pages in the converted output")
  @JsonProperty(JSON_PROPERTY_PAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageCount() {
    return pageCount;
  }


  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  public MultipageImageFormatConversionResult pages(List<PageConversionResult> pages) {
    
    this.pages = pages;
    return this;
  }

  public MultipageImageFormatConversionResult addPagesItem(PageConversionResult pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<PageConversionResult>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Converted page results
   * @return pages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Converted page results")
  @JsonProperty(JSON_PROPERTY_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PageConversionResult> getPages() {
    return pages;
  }


  public void setPages(List<PageConversionResult> pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipageImageFormatConversionResult multipageImageFormatConversionResult = (MultipageImageFormatConversionResult) o;
    return Objects.equals(this.successful, multipageImageFormatConversionResult.successful) &&
        Objects.equals(this.pageCount, multipageImageFormatConversionResult.pageCount) &&
        Objects.equals(this.pages, multipageImageFormatConversionResult.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, pageCount, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipageImageFormatConversionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

