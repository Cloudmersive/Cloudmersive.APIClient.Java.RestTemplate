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
import com.cloudmersive.client.rt.model.SqlInjectionCheckRequestItem;
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
 * Input to a batch SQL Injection detection operation
 */
@JsonPropertyOrder({
  SqlInjectionCheckBatchRequest.JSON_PROPERTY_REQUEST_ITEMS,
  SqlInjectionCheckBatchRequest.JSON_PROPERTY_DETECTION_LEVEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:42.486016Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SqlInjectionCheckBatchRequest {
  public static final String JSON_PROPERTY_REQUEST_ITEMS = "RequestItems";
  private List<SqlInjectionCheckRequestItem> requestItems = new ArrayList<>();

  public static final String JSON_PROPERTY_DETECTION_LEVEL = "DetectionLevel";
  private String detectionLevel;

  public SqlInjectionCheckBatchRequest() {
  }

  public SqlInjectionCheckBatchRequest requestItems(List<SqlInjectionCheckRequestItem> requestItems) {
    
    this.requestItems = requestItems;
    return this;
  }

  public SqlInjectionCheckBatchRequest addRequestItemsItem(SqlInjectionCheckRequestItem requestItemsItem) {
    if (this.requestItems == null) {
      this.requestItems = new ArrayList<>();
    }
    this.requestItems.add(requestItemsItem);
    return this;
  }

  /**
   * Multiple items to detect for SQL Injection
   * @return requestItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SqlInjectionCheckRequestItem> getRequestItems() {
    return requestItems;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestItems(List<SqlInjectionCheckRequestItem> requestItems) {
    this.requestItems = requestItems;
  }

  public SqlInjectionCheckBatchRequest detectionLevel(String detectionLevel) {
    
    this.detectionLevel = detectionLevel;
    return this;
  }

  /**
   * Set to Normal to target a high-security SQL Injection detection level with a very low false positive rate; select High to target a very-high security SQL Injection detection level with higher false positives.  Default is Normal (recommended).
   * @return detectionLevel
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETECTION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetectionLevel() {
    return detectionLevel;
  }


  @JsonProperty(JSON_PROPERTY_DETECTION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetectionLevel(String detectionLevel) {
    this.detectionLevel = detectionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SqlInjectionCheckBatchRequest sqlInjectionCheckBatchRequest = (SqlInjectionCheckBatchRequest) o;
    return Objects.equals(this.requestItems, sqlInjectionCheckBatchRequest.requestItems) &&
        Objects.equals(this.detectionLevel, sqlInjectionCheckBatchRequest.detectionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestItems, detectionLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlInjectionCheckBatchRequest {\n");
    sb.append("    requestItems: ").append(toIndentedString(requestItems)).append("\n");
    sb.append("    detectionLevel: ").append(toIndentedString(detectionLevel)).append("\n");
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

