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
import com.cloudmersive.client.rt.model.UrlSsrfResponseFull;
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
 * Result of performing SSRF threat checks on multiple URLs
 */
@JsonPropertyOrder({
  UrlSsrfResponseBatch.JSON_PROPERTY_OUTPUT_ITEMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:15:48.283468600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UrlSsrfResponseBatch {
  public static final String JSON_PROPERTY_OUTPUT_ITEMS = "OutputItems";
  private List<UrlSsrfResponseFull> outputItems = new ArrayList<>();

  public UrlSsrfResponseBatch() {
  }

  public UrlSsrfResponseBatch outputItems(List<UrlSsrfResponseFull> outputItems) {
    
    this.outputItems = outputItems;
    return this;
  }

  public UrlSsrfResponseBatch addOutputItemsItem(UrlSsrfResponseFull outputItemsItem) {
    if (this.outputItems == null) {
      this.outputItems = new ArrayList<>();
    }
    this.outputItems.add(outputItemsItem);
    return this;
  }

  /**
   * Results of the operation, with indexes matched to input values
   * @return outputItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UrlSsrfResponseFull> getOutputItems() {
    return outputItems;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutputItems(List<UrlSsrfResponseFull> outputItems) {
    this.outputItems = outputItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlSsrfResponseBatch urlSsrfResponseBatch = (UrlSsrfResponseBatch) o;
    return Objects.equals(this.outputItems, urlSsrfResponseBatch.outputItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlSsrfResponseBatch {\n");
    sb.append("    outputItems: ").append(toIndentedString(outputItems)).append("\n");
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

