/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
 * Result of performing an Admin Path operation
 */
@JsonPropertyOrder({
  IsAdminPathResponse.JSON_PROPERTY_IS_ADMIN_PATH_NODE,
  IsAdminPathResponse.JSON_PROPERTY_SUCCESSFUL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:15:48.283468600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IsAdminPathResponse {
  public static final String JSON_PROPERTY_IS_ADMIN_PATH_NODE = "IsAdminPathNode";
  private Boolean isAdminPathNode;

  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public IsAdminPathResponse() {
  }

  public IsAdminPathResponse isAdminPathNode(Boolean isAdminPathNode) {
    
    this.isAdminPathNode = isAdminPathNode;
    return this;
  }

  /**
   * True if the input IP address is an Admin Path, and false otherwise
   * @return isAdminPathNode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ADMIN_PATH_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAdminPathNode() {
    return isAdminPathNode;
  }


  @JsonProperty(JSON_PROPERTY_IS_ADMIN_PATH_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAdminPathNode(Boolean isAdminPathNode) {
    this.isAdminPathNode = isAdminPathNode;
  }

  public IsAdminPathResponse successful(Boolean successful) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsAdminPathResponse isAdminPathResponse = (IsAdminPathResponse) o;
    return Objects.equals(this.isAdminPathNode, isAdminPathResponse.isAdminPathNode) &&
        Objects.equals(this.successful, isAdminPathResponse.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAdminPathNode, successful);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsAdminPathResponse {\n");
    sb.append("    isAdminPathNode: ").append(toIndentedString(isAdminPathNode)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

