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
import com.cloudmersive.client.rt.model.GeolocateResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * IP address intelligence result
 */
@JsonPropertyOrder({
  IPIntelligenceResponse.JSON_PROPERTY_IS_BOT,
  IPIntelligenceResponse.JSON_PROPERTY_IS_TOR_NODE,
  IPIntelligenceResponse.JSON_PROPERTY_IS_THREAT,
  IPIntelligenceResponse.JSON_PROPERTY_IS_E_U,
  IPIntelligenceResponse.JSON_PROPERTY_LOCATION,
  IPIntelligenceResponse.JSON_PROPERTY_CURRENCY_CODE,
  IPIntelligenceResponse.JSON_PROPERTY_CURRENCY_NAME,
  IPIntelligenceResponse.JSON_PROPERTY_REGION_AREA,
  IPIntelligenceResponse.JSON_PROPERTY_SUBREGION_AREA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:42.486016Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IPIntelligenceResponse {
  public static final String JSON_PROPERTY_IS_BOT = "IsBot";
  private Boolean isBot;

  public static final String JSON_PROPERTY_IS_TOR_NODE = "IsTorNode";
  private Boolean isTorNode;

  public static final String JSON_PROPERTY_IS_THREAT = "IsThreat";
  private Boolean isThreat;

  public static final String JSON_PROPERTY_IS_E_U = "IsEU";
  private Boolean isEU;

  public static final String JSON_PROPERTY_LOCATION = "Location";
  private GeolocateResponse location;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "CurrencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_CURRENCY_NAME = "CurrencyName";
  private String currencyName;

  public static final String JSON_PROPERTY_REGION_AREA = "RegionArea";
  private String regionArea;

  public static final String JSON_PROPERTY_SUBREGION_AREA = "SubregionArea";
  private String subregionArea;

  public IPIntelligenceResponse() {
  }

  public IPIntelligenceResponse isBot(Boolean isBot) {
    
    this.isBot = isBot;
    return this;
  }

  /**
   * True if the IP address is a known bot, otherwise false
   * @return isBot
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_BOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBot() {
    return isBot;
  }


  @JsonProperty(JSON_PROPERTY_IS_BOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsBot(Boolean isBot) {
    this.isBot = isBot;
  }

  public IPIntelligenceResponse isTorNode(Boolean isTorNode) {
    
    this.isTorNode = isTorNode;
    return this;
  }

  /**
   * True if the IP address is a known Tor exit node, otherwise false
   * @return isTorNode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_TOR_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsTorNode() {
    return isTorNode;
  }


  @JsonProperty(JSON_PROPERTY_IS_TOR_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsTorNode(Boolean isTorNode) {
    this.isTorNode = isTorNode;
  }

  public IPIntelligenceResponse isThreat(Boolean isThreat) {
    
    this.isThreat = isThreat;
    return this;
  }

  /**
   * True if the IP address is a known threat IP, otherwise false
   * @return isThreat
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsThreat() {
    return isThreat;
  }


  @JsonProperty(JSON_PROPERTY_IS_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsThreat(Boolean isThreat) {
    this.isThreat = isThreat;
  }

  public IPIntelligenceResponse isEU(Boolean isEU) {
    
    this.isEU = isEU;
    return this;
  }

  /**
   * True if the IP address is in the European Union, otherwise false
   * @return isEU
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_E_U)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEU() {
    return isEU;
  }


  @JsonProperty(JSON_PROPERTY_IS_E_U)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEU(Boolean isEU) {
    this.isEU = isEU;
  }

  public IPIntelligenceResponse location(GeolocateResponse location) {
    
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GeolocateResponse getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(GeolocateResponse location) {
    this.location = location;
  }

  public IPIntelligenceResponse currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * ISO 4217 currency code for the IP address location
   * @return currencyCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public IPIntelligenceResponse currencyName(String currencyName) {
    
    this.currencyName = currencyName;
    return this;
  }

  /**
   * Name of the currency in English
   * @return currencyName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyName() {
    return currencyName;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  public IPIntelligenceResponse regionArea(String regionArea) {
    
    this.regionArea = regionArea;
    return this;
  }

  /**
   * Region (continent) in which the country is located; possible values are None, Europe, Americas, Asia, Africa, Oceania
   * @return regionArea
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegionArea() {
    return regionArea;
  }


  @JsonProperty(JSON_PROPERTY_REGION_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionArea(String regionArea) {
    this.regionArea = regionArea;
  }

  public IPIntelligenceResponse subregionArea(String subregionArea) {
    
    this.subregionArea = subregionArea;
    return this;
  }

  /**
   * Subregion in which the country is located; possible values are None, NorthernEurope, WesternEurope, SouthernEurope, EasternEurope, CentralAmerica, NorthernAmerica, SouthAmerica, EasternAfrica, MiddleAfrica, NorthernAfrica , SouthernAfrica , WesternAfrica , CentralAsia , EasternAsia , SouthernAsia , SouthEasternAsia , WesternAsia , Southern , Middle , AustraliaandNewZealand , Melanesia , Polynesia , Micronesia , Caribbean,
   * @return subregionArea
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBREGION_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubregionArea() {
    return subregionArea;
  }


  @JsonProperty(JSON_PROPERTY_SUBREGION_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubregionArea(String subregionArea) {
    this.subregionArea = subregionArea;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPIntelligenceResponse ipIntelligenceResponse = (IPIntelligenceResponse) o;
    return Objects.equals(this.isBot, ipIntelligenceResponse.isBot) &&
        Objects.equals(this.isTorNode, ipIntelligenceResponse.isTorNode) &&
        Objects.equals(this.isThreat, ipIntelligenceResponse.isThreat) &&
        Objects.equals(this.isEU, ipIntelligenceResponse.isEU) &&
        Objects.equals(this.location, ipIntelligenceResponse.location) &&
        Objects.equals(this.currencyCode, ipIntelligenceResponse.currencyCode) &&
        Objects.equals(this.currencyName, ipIntelligenceResponse.currencyName) &&
        Objects.equals(this.regionArea, ipIntelligenceResponse.regionArea) &&
        Objects.equals(this.subregionArea, ipIntelligenceResponse.subregionArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBot, isTorNode, isThreat, isEU, location, currencyCode, currencyName, regionArea, subregionArea);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPIntelligenceResponse {\n");
    sb.append("    isBot: ").append(toIndentedString(isBot)).append("\n");
    sb.append("    isTorNode: ").append(toIndentedString(isTorNode)).append("\n");
    sb.append("    isThreat: ").append(toIndentedString(isThreat)).append("\n");
    sb.append("    isEU: ").append(toIndentedString(isEU)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyName: ").append(toIndentedString(currencyName)).append("\n");
    sb.append("    regionArea: ").append(toIndentedString(regionArea)).append("\n");
    sb.append("    subregionArea: ").append(toIndentedString(subregionArea)).append("\n");
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

