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
import com.cloudmersive.client.rt.model.UrlSsrfRequestFull;
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
 * Batch operation to perform SSRF threat checks on multiple URLs
 */
@JsonPropertyOrder({
  UrlSsrfRequestBatch.JSON_PROPERTY_INPUT_ITEMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:15:48.283468600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UrlSsrfRequestBatch {
  public static final String JSON_PROPERTY_INPUT_ITEMS = "InputItems";
  private List<UrlSsrfRequestFull> inputItems = new ArrayList<>();

  public UrlSsrfRequestBatch() {
  }

  public UrlSsrfRequestBatch inputItems(List<UrlSsrfRequestFull> inputItems) {
    
    this.inputItems = inputItems;
    return this;
  }

  public UrlSsrfRequestBatch addInputItemsItem(UrlSsrfRequestFull inputItemsItem) {
    if (this.inputItems == null) {
      this.inputItems = new ArrayList<>();
    }
    this.inputItems.add(inputItemsItem);
    return this;
  }

  /**
   * Input URLs to check for SSRF threats
   * @return inputItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UrlSsrfRequestFull> getInputItems() {
    return inputItems;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputItems(List<UrlSsrfRequestFull> inputItems) {
    this.inputItems = inputItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlSsrfRequestBatch urlSsrfRequestBatch = (UrlSsrfRequestBatch) o;
    return Objects.equals(this.inputItems, urlSsrfRequestBatch.inputItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlSsrfRequestBatch {\n");
    sb.append("    inputItems: ").append(toIndentedString(inputItems)).append("\n");
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

