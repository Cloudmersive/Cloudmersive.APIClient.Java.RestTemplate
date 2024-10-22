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
import com.cloudmersive.client.rt.model.DocxSection;
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
 * Result of running a Get-Sections command
 */
@JsonPropertyOrder({
  GetDocxSectionsResponse.JSON_PROPERTY_SUCCESSFUL,
  GetDocxSectionsResponse.JSON_PROPERTY_SECTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetDocxSectionsResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_SECTIONS = "Sections";
  private List<DocxSection> sections = new ArrayList<>();

  public GetDocxSectionsResponse() {
  }

  public GetDocxSectionsResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if successful, false otherwise
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

  public GetDocxSectionsResponse sections(List<DocxSection> sections) {
    
    this.sections = sections;
    return this;
  }

  public GetDocxSectionsResponse addSectionsItem(DocxSection sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

  /**
   * Sections in the DOCX document
   * @return sections
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxSection> getSections() {
    return sections;
  }


  @JsonProperty(JSON_PROPERTY_SECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSections(List<DocxSection> sections) {
    this.sections = sections;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxSectionsResponse getDocxSectionsResponse = (GetDocxSectionsResponse) o;
    return Objects.equals(this.successful, getDocxSectionsResponse.successful) &&
        Objects.equals(this.sections, getDocxSectionsResponse.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxSectionsResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

