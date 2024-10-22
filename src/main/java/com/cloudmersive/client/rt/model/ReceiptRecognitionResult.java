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
import com.cloudmersive.client.rt.model.ReceiptLineItem;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of recognizing a receipt, to extract the key information from the receipt
 */
@JsonPropertyOrder({
  ReceiptRecognitionResult.JSON_PROPERTY_SUCCESSFUL,
  ReceiptRecognitionResult.JSON_PROPERTY_TIMESTAMP,
  ReceiptRecognitionResult.JSON_PROPERTY_BUSINESS_NAME,
  ReceiptRecognitionResult.JSON_PROPERTY_BUSINESS_WEBSITE,
  ReceiptRecognitionResult.JSON_PROPERTY_ADDRESS_STRING,
  ReceiptRecognitionResult.JSON_PROPERTY_PHONE_NUMBER,
  ReceiptRecognitionResult.JSON_PROPERTY_RECEIPT_ITEMS,
  ReceiptRecognitionResult.JSON_PROPERTY_RECEIPT_SUB_TOTAL,
  ReceiptRecognitionResult.JSON_PROPERTY_RECEIPT_TOTAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:05.887469400Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ReceiptRecognitionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TIMESTAMP = "Timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_BUSINESS_NAME = "BusinessName";
  private String businessName;

  public static final String JSON_PROPERTY_BUSINESS_WEBSITE = "BusinessWebsite";
  private String businessWebsite;

  public static final String JSON_PROPERTY_ADDRESS_STRING = "AddressString";
  private String addressString;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "PhoneNumber";
  private String phoneNumber;

  public static final String JSON_PROPERTY_RECEIPT_ITEMS = "ReceiptItems";
  private List<ReceiptLineItem> receiptItems = new ArrayList<>();

  public static final String JSON_PROPERTY_RECEIPT_SUB_TOTAL = "ReceiptSubTotal";
  private Double receiptSubTotal;

  public static final String JSON_PROPERTY_RECEIPT_TOTAL = "ReceiptTotal";
  private Double receiptTotal;

  public ReceiptRecognitionResult() {
  }

  public ReceiptRecognitionResult successful(Boolean successful) {
    
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

  public ReceiptRecognitionResult timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The date and time printed on the receipt (if included on the receipt)
   * @return timestamp
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ReceiptRecognitionResult businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

  /**
   * The name of the business printed on the receipt (if included on the receipt)
   * @return businessName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public ReceiptRecognitionResult businessWebsite(String businessWebsite) {
    
    this.businessWebsite = businessWebsite;
    return this;
  }

  /**
   * The website URL of the business printed on the receipt (if included on the receipt)
   * @return businessWebsite
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessWebsite() {
    return businessWebsite;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessWebsite(String businessWebsite) {
    this.businessWebsite = businessWebsite;
  }

  public ReceiptRecognitionResult addressString(String addressString) {
    
    this.addressString = addressString;
    return this;
  }

  /**
   * The address of the business printed on the receipt (if included on the receipt)
   * @return addressString
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressString() {
    return addressString;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressString(String addressString) {
    this.addressString = addressString;
  }

  public ReceiptRecognitionResult phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The phone number printed on the receipt (if included on the receipt)
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ReceiptRecognitionResult receiptItems(List<ReceiptLineItem> receiptItems) {
    
    this.receiptItems = receiptItems;
    return this;
  }

  public ReceiptRecognitionResult addReceiptItemsItem(ReceiptLineItem receiptItemsItem) {
    if (this.receiptItems == null) {
      this.receiptItems = new ArrayList<>();
    }
    this.receiptItems.add(receiptItemsItem);
    return this;
  }

  /**
   * The individual line items comprising the order; does not include total (see ReceiptTotal)
   * @return receiptItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReceiptLineItem> getReceiptItems() {
    return receiptItems;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptItems(List<ReceiptLineItem> receiptItems) {
    this.receiptItems = receiptItems;
  }

  public ReceiptRecognitionResult receiptSubTotal(Double receiptSubTotal) {
    
    this.receiptSubTotal = receiptSubTotal;
    return this;
  }

  /**
   * Optional; if available, the monetary value of the receipt subtotal - typically not including specialized line items such as Tax. If this value is not available, it will be 0.
   * @return receiptSubTotal
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_SUB_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getReceiptSubTotal() {
    return receiptSubTotal;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_SUB_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptSubTotal(Double receiptSubTotal) {
    this.receiptSubTotal = receiptSubTotal;
  }

  public ReceiptRecognitionResult receiptTotal(Double receiptTotal) {
    
    this.receiptTotal = receiptTotal;
    return this;
  }

  /**
   * The total monetary value of the receipt (if included on the receipt)
   * @return receiptTotal
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getReceiptTotal() {
    return receiptTotal;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptTotal(Double receiptTotal) {
    this.receiptTotal = receiptTotal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptRecognitionResult receiptRecognitionResult = (ReceiptRecognitionResult) o;
    return Objects.equals(this.successful, receiptRecognitionResult.successful) &&
        Objects.equals(this.timestamp, receiptRecognitionResult.timestamp) &&
        Objects.equals(this.businessName, receiptRecognitionResult.businessName) &&
        Objects.equals(this.businessWebsite, receiptRecognitionResult.businessWebsite) &&
        Objects.equals(this.addressString, receiptRecognitionResult.addressString) &&
        Objects.equals(this.phoneNumber, receiptRecognitionResult.phoneNumber) &&
        Objects.equals(this.receiptItems, receiptRecognitionResult.receiptItems) &&
        Objects.equals(this.receiptSubTotal, receiptRecognitionResult.receiptSubTotal) &&
        Objects.equals(this.receiptTotal, receiptRecognitionResult.receiptTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, timestamp, businessName, businessWebsite, addressString, phoneNumber, receiptItems, receiptSubTotal, receiptTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptRecognitionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessWebsite: ").append(toIndentedString(businessWebsite)).append("\n");
    sb.append("    addressString: ").append(toIndentedString(addressString)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    receiptItems: ").append(toIndentedString(receiptItems)).append("\n");
    sb.append("    receiptSubTotal: ").append(toIndentedString(receiptSubTotal)).append("\n");
    sb.append("    receiptTotal: ").append(toIndentedString(receiptTotal)).append("\n");
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

