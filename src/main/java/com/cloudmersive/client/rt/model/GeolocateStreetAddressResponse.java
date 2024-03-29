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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Geolocation street address result
 */
@ApiModel(description = "Geolocation street address result")
@JsonPropertyOrder({
  GeolocateStreetAddressResponse.JSON_PROPERTY_COUNTRY_CODE,
  GeolocateStreetAddressResponse.JSON_PROPERTY_COUNTRY_NAME,
  GeolocateStreetAddressResponse.JSON_PROPERTY_STREET_ADDRESS,
  GeolocateStreetAddressResponse.JSON_PROPERTY_CITY,
  GeolocateStreetAddressResponse.JSON_PROPERTY_REGION_NAME,
  GeolocateStreetAddressResponse.JSON_PROPERTY_ZIP_CODE
})
@JsonTypeName("GeolocateStreetAddressResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:52:45.902-07:00[America/Los_Angeles]")
public class GeolocateStreetAddressResponse {
  public static final String JSON_PROPERTY_COUNTRY_CODE = "CountryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_COUNTRY_NAME = "CountryName";
  private String countryName;

  public static final String JSON_PROPERTY_STREET_ADDRESS = "StreetAddress";
  private String streetAddress;

  public static final String JSON_PROPERTY_CITY = "City";
  private String city;

  public static final String JSON_PROPERTY_REGION_NAME = "RegionName";
  private String regionName;

  public static final String JSON_PROPERTY_ZIP_CODE = "ZipCode";
  private String zipCode;


  public GeolocateStreetAddressResponse countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Two-letter country code of IP address
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Two-letter country code of IP address")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public GeolocateStreetAddressResponse countryName(String countryName) {
    
    this.countryName = countryName;
    return this;
  }

   /**
   * Country name of IP address
   * @return countryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country name of IP address")
  @JsonProperty(JSON_PROPERTY_COUNTRY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryName() {
    return countryName;
  }


  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  public GeolocateStreetAddressResponse streetAddress(String streetAddress) {
    
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Street address of IP address
   * @return streetAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Street address of IP address")
  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetAddress() {
    return streetAddress;
  }


  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }


  public GeolocateStreetAddressResponse city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City of IP address
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City of IP address")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public GeolocateStreetAddressResponse regionName(String regionName) {
    
    this.regionName = regionName;
    return this;
  }

   /**
   * State/region of IP address
   * @return regionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State/region of IP address")
  @JsonProperty(JSON_PROPERTY_REGION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegionName() {
    return regionName;
  }


  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }


  public GeolocateStreetAddressResponse zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Zip or postal code of IP address
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Zip or postal code of IP address")
  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeolocateStreetAddressResponse geolocateStreetAddressResponse = (GeolocateStreetAddressResponse) o;
    return Objects.equals(this.countryCode, geolocateStreetAddressResponse.countryCode) &&
        Objects.equals(this.countryName, geolocateStreetAddressResponse.countryName) &&
        Objects.equals(this.streetAddress, geolocateStreetAddressResponse.streetAddress) &&
        Objects.equals(this.city, geolocateStreetAddressResponse.city) &&
        Objects.equals(this.regionName, geolocateStreetAddressResponse.regionName) &&
        Objects.equals(this.zipCode, geolocateStreetAddressResponse.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, countryName, streetAddress, city, regionName, zipCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeolocateStreetAddressResponse {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

