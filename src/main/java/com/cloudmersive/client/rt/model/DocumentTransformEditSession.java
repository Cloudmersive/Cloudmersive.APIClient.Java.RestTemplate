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
 * Active document editing session result.  To retrieve the document, use the Finish Editing API.
 */
@JsonPropertyOrder({
  DocumentTransformEditSession.JSON_PROPERTY_SUCCESSFUL,
  DocumentTransformEditSession.JSON_PROPERTY_EDIT_SESSION_U_R_L
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DocumentTransformEditSession {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_EDIT_SESSION_U_R_L = "EditSessionURL";
  private String editSessionURL;

  public DocumentTransformEditSession() {
  }

  public DocumentTransformEditSession successful(Boolean successful) {
    
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

  public DocumentTransformEditSession editSessionURL(String editSessionURL) {
    
    this.editSessionURL = editSessionURL;
    return this;
  }

  /**
   * Document editing session URL; in-memory temporary cache link with TTL (Time-to-Live expiration) of 30 minutes.  To retrieve the document, use the Finish Editing API.
   * @return editSessionURL
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDIT_SESSION_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEditSessionURL() {
    return editSessionURL;
  }


  @JsonProperty(JSON_PROPERTY_EDIT_SESSION_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditSessionURL(String editSessionURL) {
    this.editSessionURL = editSessionURL;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTransformEditSession documentTransformEditSession = (DocumentTransformEditSession) o;
    return Objects.equals(this.successful, documentTransformEditSession.successful) &&
        Objects.equals(this.editSessionURL, documentTransformEditSession.editSessionURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, editSessionURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTransformEditSession {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    editSessionURL: ").append(toIndentedString(editSessionURL)).append("\n");
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

