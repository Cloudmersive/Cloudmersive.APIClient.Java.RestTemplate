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
 * Details of a specific currency
 */
@JsonPropertyOrder({
  AvailableCurrency.JSON_PROPERTY_IS_O_CURRENCY_CODE,
  AvailableCurrency.JSON_PROPERTY_CURRENCY_SYMBOL,
  AvailableCurrency.JSON_PROPERTY_CURRENCY_ENGLISH_NAME,
  AvailableCurrency.JSON_PROPERTY_COUNTRY_NAME,
  AvailableCurrency.JSON_PROPERTY_COUNTRY_THREE_LETTER_CODE,
  AvailableCurrency.JSON_PROPERTY_COUNTRY_I_S_O_TWO_LETTER_CODE,
  AvailableCurrency.JSON_PROPERTY_IS_EUROPEAN_UNION_MEMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:17:08.451112300Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AvailableCurrency {
  public static final String JSON_PROPERTY_IS_O_CURRENCY_CODE = "ISOCurrencyCode";
  private String isOCurrencyCode;

  public static final String JSON_PROPERTY_CURRENCY_SYMBOL = "CurrencySymbol";
  private String currencySymbol;

  public static final String JSON_PROPERTY_CURRENCY_ENGLISH_NAME = "CurrencyEnglishName";
  private String currencyEnglishName;

  public static final String JSON_PROPERTY_COUNTRY_NAME = "CountryName";
  private String countryName;

  public static final String JSON_PROPERTY_COUNTRY_THREE_LETTER_CODE = "CountryThreeLetterCode";
  private String countryThreeLetterCode;

  public static final String JSON_PROPERTY_COUNTRY_I_S_O_TWO_LETTER_CODE = "CountryISOTwoLetterCode";
  private String countryISOTwoLetterCode;

  public static final String JSON_PROPERTY_IS_EUROPEAN_UNION_MEMBER = "IsEuropeanUnionMember";
  private Boolean isEuropeanUnionMember;

  public AvailableCurrency() {
  }

  public AvailableCurrency isOCurrencyCode(String isOCurrencyCode) {
    
    this.isOCurrencyCode = isOCurrencyCode;
    return this;
  }

  /**
   * ISO 4217 currency three-letter code associated with the country
   * @return isOCurrencyCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_O_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsOCurrencyCode() {
    return isOCurrencyCode;
  }


  @JsonProperty(JSON_PROPERTY_IS_O_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOCurrencyCode(String isOCurrencyCode) {
    this.isOCurrencyCode = isOCurrencyCode;
  }

  public AvailableCurrency currencySymbol(String currencySymbol) {
    
    this.currencySymbol = currencySymbol;
    return this;
  }

  /**
   * Symbol associated with the currency
   * @return currencySymbol
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencySymbol() {
    return currencySymbol;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public AvailableCurrency currencyEnglishName(String currencyEnglishName) {
    
    this.currencyEnglishName = currencyEnglishName;
    return this;
  }

  /**
   * Full name of the currency
   * @return currencyEnglishName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_ENGLISH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyEnglishName() {
    return currencyEnglishName;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_ENGLISH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyEnglishName(String currencyEnglishName) {
    this.currencyEnglishName = currencyEnglishName;
  }

  public AvailableCurrency countryName(String countryName) {
    
    this.countryName = countryName;
    return this;
  }

  /**
   * Name of the country
   * @return countryName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryName() {
    return countryName;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public AvailableCurrency countryThreeLetterCode(String countryThreeLetterCode) {
    
    this.countryThreeLetterCode = countryThreeLetterCode;
    return this;
  }

  /**
   * Three-letter ISO 3166-1 country code
   * @return countryThreeLetterCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_THREE_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryThreeLetterCode() {
    return countryThreeLetterCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_THREE_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryThreeLetterCode(String countryThreeLetterCode) {
    this.countryThreeLetterCode = countryThreeLetterCode;
  }

  public AvailableCurrency countryISOTwoLetterCode(String countryISOTwoLetterCode) {
    
    this.countryISOTwoLetterCode = countryISOTwoLetterCode;
    return this;
  }

  /**
   * Two-letter ISO 3166-1 country code
   * @return countryISOTwoLetterCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_I_S_O_TWO_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryISOTwoLetterCode() {
    return countryISOTwoLetterCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_I_S_O_TWO_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryISOTwoLetterCode(String countryISOTwoLetterCode) {
    this.countryISOTwoLetterCode = countryISOTwoLetterCode;
  }

  public AvailableCurrency isEuropeanUnionMember(Boolean isEuropeanUnionMember) {
    
    this.isEuropeanUnionMember = isEuropeanUnionMember;
    return this;
  }

  /**
   * True if this country is currently a member of the European Union (EU), false otherwise
   * @return isEuropeanUnionMember
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_EUROPEAN_UNION_MEMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEuropeanUnionMember() {
    return isEuropeanUnionMember;
  }


  @JsonProperty(JSON_PROPERTY_IS_EUROPEAN_UNION_MEMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEuropeanUnionMember(Boolean isEuropeanUnionMember) {
    this.isEuropeanUnionMember = isEuropeanUnionMember;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableCurrency availableCurrency = (AvailableCurrency) o;
    return Objects.equals(this.isOCurrencyCode, availableCurrency.isOCurrencyCode) &&
        Objects.equals(this.currencySymbol, availableCurrency.currencySymbol) &&
        Objects.equals(this.currencyEnglishName, availableCurrency.currencyEnglishName) &&
        Objects.equals(this.countryName, availableCurrency.countryName) &&
        Objects.equals(this.countryThreeLetterCode, availableCurrency.countryThreeLetterCode) &&
        Objects.equals(this.countryISOTwoLetterCode, availableCurrency.countryISOTwoLetterCode) &&
        Objects.equals(this.isEuropeanUnionMember, availableCurrency.isEuropeanUnionMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOCurrencyCode, currencySymbol, currencyEnglishName, countryName, countryThreeLetterCode, countryISOTwoLetterCode, isEuropeanUnionMember);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableCurrency {\n");
    sb.append("    isOCurrencyCode: ").append(toIndentedString(isOCurrencyCode)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    currencyEnglishName: ").append(toIndentedString(currencyEnglishName)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    countryThreeLetterCode: ").append(toIndentedString(countryThreeLetterCode)).append("\n");
    sb.append("    countryISOTwoLetterCode: ").append(toIndentedString(countryISOTwoLetterCode)).append("\n");
    sb.append("    isEuropeanUnionMember: ").append(toIndentedString(isEuropeanUnionMember)).append("\n");
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

