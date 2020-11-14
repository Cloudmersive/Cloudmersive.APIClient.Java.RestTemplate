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
import com.cloudmersive.client.model.DocxStyle;
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
 * Result of running a Get-Tables command
 */
@ApiModel(description = "Result of running a Get-Tables command")
@JsonPropertyOrder({
  GetDocxStylesResponse.JSON_PROPERTY_SUCCESSFUL,
  GetDocxStylesResponse.JSON_PROPERTY_STYLES
})
@JsonTypeName("GetDocxStylesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:29.247-08:00[America/Los_Angeles]")
public class GetDocxStylesResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_STYLES = "Styles";
  private List<DocxStyle> styles = null;


  public GetDocxStylesResponse successful(Boolean successful) {
    
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


  public GetDocxStylesResponse styles(List<DocxStyle> styles) {
    
    this.styles = styles;
    return this;
  }

  public GetDocxStylesResponse addStylesItem(DocxStyle stylesItem) {
    if (this.styles == null) {
      this.styles = new ArrayList<DocxStyle>();
    }
    this.styles.add(stylesItem);
    return this;
  }

   /**
   * Styles in the DOCX document
   * @return styles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Styles in the DOCX document")
  @JsonProperty(JSON_PROPERTY_STYLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxStyle> getStyles() {
    return styles;
  }


  public void setStyles(List<DocxStyle> styles) {
    this.styles = styles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxStylesResponse getDocxStylesResponse = (GetDocxStylesResponse) o;
    return Objects.equals(this.successful, getDocxStylesResponse.successful) &&
        Objects.equals(this.styles, getDocxStylesResponse.styles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, styles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxStylesResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    styles: ").append(toIndentedString(styles)).append("\n");
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

