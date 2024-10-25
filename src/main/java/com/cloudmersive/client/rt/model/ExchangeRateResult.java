/*
 * currencyapi
 * The currency APIs help you retrieve exchange rates and convert prices between currencies easily.
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
 * Result of performing a get exchange rate operation
 */
@JsonPropertyOrder({
  ExchangeRateResult.JSON_PROPERTY_EXCHANGE_RATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:52:10.524357Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ExchangeRateResult {
  public static final String JSON_PROPERTY_EXCHANGE_RATE = "ExchangeRate";
  private Double exchangeRate;

  public ExchangeRateResult() {
  }

  public ExchangeRateResult exchangeRate(Double exchangeRate) {
    
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * The exchange rate from the source to the destination currency
   * @return exchangeRate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getExchangeRate() {
    return exchangeRate;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExchangeRate(Double exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeRateResult exchangeRateResult = (ExchangeRateResult) o;
    return Objects.equals(this.exchangeRate, exchangeRateResult.exchangeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeRateResult {\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
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

