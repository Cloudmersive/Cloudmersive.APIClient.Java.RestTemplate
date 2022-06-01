/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Receipt line item, comprised of a product or item and a price (if available)
 */
@ApiModel(description = "Receipt line item, comprised of a product or item and a price (if available)")
@JsonPropertyOrder({
  ReceiptLineItem.JSON_PROPERTY_ITEM_DESCRIPTION,
  ReceiptLineItem.JSON_PROPERTY_ITEM_PRICE
})
@JsonTypeName("ReceiptLineItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:53:17.009-07:00[America/Los_Angeles]")
public class ReceiptLineItem {
  public static final String JSON_PROPERTY_ITEM_DESCRIPTION = "ItemDescription";
  private String itemDescription;

  public static final String JSON_PROPERTY_ITEM_PRICE = "ItemPrice";
  private Double itemPrice;


  public ReceiptLineItem itemDescription(String itemDescription) {
    
    this.itemDescription = itemDescription;
    return this;
  }

   /**
   * Description of the item
   * @return itemDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the item")
  @JsonProperty(JSON_PROPERTY_ITEM_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getItemDescription() {
    return itemDescription;
  }


  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }


  public ReceiptLineItem itemPrice(Double itemPrice) {
    
    this.itemPrice = itemPrice;
    return this;
  }

   /**
   * Price of the item if available
   * @return itemPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price of the item if available")
  @JsonProperty(JSON_PROPERTY_ITEM_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getItemPrice() {
    return itemPrice;
  }


  public void setItemPrice(Double itemPrice) {
    this.itemPrice = itemPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptLineItem receiptLineItem = (ReceiptLineItem) o;
    return Objects.equals(this.itemDescription, receiptLineItem.itemDescription) &&
        Objects.equals(this.itemPrice, receiptLineItem.itemPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemDescription, itemPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptLineItem {\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
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

