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
import com.cloudmersive.client.rt.model.Timezone;
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
 * Result of performing a country validation operation
 */
@JsonPropertyOrder({
  ValidateCountryResponse.JSON_PROPERTY_SUCCESSFUL,
  ValidateCountryResponse.JSON_PROPERTY_COUNTRY_FULL_NAME,
  ValidateCountryResponse.JSON_PROPERTY_IS_O_TWO_LETTER_CODE,
  ValidateCountryResponse.JSON_PROPERTY_FI_P_S_TWO_LETTER_CODE,
  ValidateCountryResponse.JSON_PROPERTY_THREE_LETTER_CODE,
  ValidateCountryResponse.JSON_PROPERTY_IS_EUROPEAN_UNION_MEMBER,
  ValidateCountryResponse.JSON_PROPERTY_TIMEZONES,
  ValidateCountryResponse.JSON_PROPERTY_IS_O_CURRENCY_CODE,
  ValidateCountryResponse.JSON_PROPERTY_CURRENCY_SYMBOL,
  ValidateCountryResponse.JSON_PROPERTY_CURRENCY_ENGLISH_NAME,
  ValidateCountryResponse.JSON_PROPERTY_REGION,
  ValidateCountryResponse.JSON_PROPERTY_SUBREGION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:42.486016Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ValidateCountryResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_COUNTRY_FULL_NAME = "CountryFullName";
  private String countryFullName;

  public static final String JSON_PROPERTY_IS_O_TWO_LETTER_CODE = "ISOTwoLetterCode";
  private String isOTwoLetterCode;

  public static final String JSON_PROPERTY_FI_P_S_TWO_LETTER_CODE = "FIPSTwoLetterCode";
  private String fiPSTwoLetterCode;

  public static final String JSON_PROPERTY_THREE_LETTER_CODE = "ThreeLetterCode";
  private String threeLetterCode;

  public static final String JSON_PROPERTY_IS_EUROPEAN_UNION_MEMBER = "IsEuropeanUnionMember";
  private Boolean isEuropeanUnionMember;

  public static final String JSON_PROPERTY_TIMEZONES = "Timezones";
  private List<Timezone> timezones = new ArrayList<>();

  public static final String JSON_PROPERTY_IS_O_CURRENCY_CODE = "ISOCurrencyCode";
  private String isOCurrencyCode;

  public static final String JSON_PROPERTY_CURRENCY_SYMBOL = "CurrencySymbol";
  private String currencySymbol;

  public static final String JSON_PROPERTY_CURRENCY_ENGLISH_NAME = "CurrencyEnglishName";
  private String currencyEnglishName;

  public static final String JSON_PROPERTY_REGION = "Region";
  private String region;

  public static final String JSON_PROPERTY_SUBREGION = "Subregion";
  private String subregion;

  public ValidateCountryResponse() {
  }

  public ValidateCountryResponse successful(Boolean successful) {
    
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

  public ValidateCountryResponse countryFullName(String countryFullName) {
    
    this.countryFullName = countryFullName;
    return this;
  }

  /**
   * Full name of the country
   * @return countryFullName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryFullName() {
    return countryFullName;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryFullName(String countryFullName) {
    this.countryFullName = countryFullName;
  }

  public ValidateCountryResponse isOTwoLetterCode(String isOTwoLetterCode) {
    
    this.isOTwoLetterCode = isOTwoLetterCode;
    return this;
  }

  /**
   * Two-letter ISO 3166-1 country code
   * @return isOTwoLetterCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_O_TWO_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsOTwoLetterCode() {
    return isOTwoLetterCode;
  }


  @JsonProperty(JSON_PROPERTY_IS_O_TWO_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOTwoLetterCode(String isOTwoLetterCode) {
    this.isOTwoLetterCode = isOTwoLetterCode;
  }

  public ValidateCountryResponse fiPSTwoLetterCode(String fiPSTwoLetterCode) {
    
    this.fiPSTwoLetterCode = fiPSTwoLetterCode;
    return this;
  }

  /**
   * Two-letter FIPS 10-4 country code
   * @return fiPSTwoLetterCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FI_P_S_TWO_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFiPSTwoLetterCode() {
    return fiPSTwoLetterCode;
  }


  @JsonProperty(JSON_PROPERTY_FI_P_S_TWO_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiPSTwoLetterCode(String fiPSTwoLetterCode) {
    this.fiPSTwoLetterCode = fiPSTwoLetterCode;
  }

  public ValidateCountryResponse threeLetterCode(String threeLetterCode) {
    
    this.threeLetterCode = threeLetterCode;
    return this;
  }

  /**
   * Three-letter ISO 3166-1 country code
   * @return threeLetterCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THREE_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeLetterCode() {
    return threeLetterCode;
  }


  @JsonProperty(JSON_PROPERTY_THREE_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeLetterCode(String threeLetterCode) {
    this.threeLetterCode = threeLetterCode;
  }

  public ValidateCountryResponse isEuropeanUnionMember(Boolean isEuropeanUnionMember) {
    
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

  public ValidateCountryResponse timezones(List<Timezone> timezones) {
    
    this.timezones = timezones;
    return this;
  }

  public ValidateCountryResponse addTimezonesItem(Timezone timezonesItem) {
    if (this.timezones == null) {
      this.timezones = new ArrayList<>();
    }
    this.timezones.add(timezonesItem);
    return this;
  }

  /**
   * Time zones (IANA/Olsen) in the country
   * @return timezones
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Timezone> getTimezones() {
    return timezones;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezones(List<Timezone> timezones) {
    this.timezones = timezones;
  }

  public ValidateCountryResponse isOCurrencyCode(String isOCurrencyCode) {
    
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

  public ValidateCountryResponse currencySymbol(String currencySymbol) {
    
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

  public ValidateCountryResponse currencyEnglishName(String currencyEnglishName) {
    
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

  public ValidateCountryResponse region(String region) {
    
    this.region = region;
    return this;
  }

  /**
   * Region (continent) in which the country is located; possible values are None, Europe, Americas, Asia, Africa, Oceania
   * @return region
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }

  public ValidateCountryResponse subregion(String subregion) {
    
    this.subregion = subregion;
    return this;
  }

  /**
   * Subregion in which the country is located; possible values are None, NorthernEurope, WesternEurope, SouthernEurope, EasternEurope, CentralAmerica, NorthernAmerica, SouthAmerica, EasternAfrica, MiddleAfrica, NorthernAfrica , SouthernAfrica , WesternAfrica , CentralAsia , EasternAsia , SouthernAsia , SouthEasternAsia , WesternAsia , Southern , Middle , AustraliaandNewZealand , Melanesia , Polynesia , Micronesia , Caribbean,
   * @return subregion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBREGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubregion() {
    return subregion;
  }


  @JsonProperty(JSON_PROPERTY_SUBREGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubregion(String subregion) {
    this.subregion = subregion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateCountryResponse validateCountryResponse = (ValidateCountryResponse) o;
    return Objects.equals(this.successful, validateCountryResponse.successful) &&
        Objects.equals(this.countryFullName, validateCountryResponse.countryFullName) &&
        Objects.equals(this.isOTwoLetterCode, validateCountryResponse.isOTwoLetterCode) &&
        Objects.equals(this.fiPSTwoLetterCode, validateCountryResponse.fiPSTwoLetterCode) &&
        Objects.equals(this.threeLetterCode, validateCountryResponse.threeLetterCode) &&
        Objects.equals(this.isEuropeanUnionMember, validateCountryResponse.isEuropeanUnionMember) &&
        Objects.equals(this.timezones, validateCountryResponse.timezones) &&
        Objects.equals(this.isOCurrencyCode, validateCountryResponse.isOCurrencyCode) &&
        Objects.equals(this.currencySymbol, validateCountryResponse.currencySymbol) &&
        Objects.equals(this.currencyEnglishName, validateCountryResponse.currencyEnglishName) &&
        Objects.equals(this.region, validateCountryResponse.region) &&
        Objects.equals(this.subregion, validateCountryResponse.subregion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, countryFullName, isOTwoLetterCode, fiPSTwoLetterCode, threeLetterCode, isEuropeanUnionMember, timezones, isOCurrencyCode, currencySymbol, currencyEnglishName, region, subregion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateCountryResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    countryFullName: ").append(toIndentedString(countryFullName)).append("\n");
    sb.append("    isOTwoLetterCode: ").append(toIndentedString(isOTwoLetterCode)).append("\n");
    sb.append("    fiPSTwoLetterCode: ").append(toIndentedString(fiPSTwoLetterCode)).append("\n");
    sb.append("    threeLetterCode: ").append(toIndentedString(threeLetterCode)).append("\n");
    sb.append("    isEuropeanUnionMember: ").append(toIndentedString(isEuropeanUnionMember)).append("\n");
    sb.append("    timezones: ").append(toIndentedString(timezones)).append("\n");
    sb.append("    isOCurrencyCode: ").append(toIndentedString(isOCurrencyCode)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    currencyEnglishName: ").append(toIndentedString(currencyEnglishName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    subregion: ").append(toIndentedString(subregion)).append("\n");
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

