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


package com.cloudmersive.client.model;

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
 * Result of validating a postal code
 */
@ApiModel(description = "Result of validating a postal code")
@JsonPropertyOrder({
  ValidatePostalCodeResponse.JSON_PROPERTY_VALID_POSTAL_CODE,
  ValidatePostalCodeResponse.JSON_PROPERTY_CITY,
  ValidatePostalCodeResponse.JSON_PROPERTY_STATE_OR_PROVINCE,
  ValidatePostalCodeResponse.JSON_PROPERTY_LATITUDE,
  ValidatePostalCodeResponse.JSON_PROPERTY_LONGITUDE
})
@JsonTypeName("ValidatePostalCodeResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:16.115-08:00[America/Los_Angeles]")
public class ValidatePostalCodeResponse {
  public static final String JSON_PROPERTY_VALID_POSTAL_CODE = "ValidPostalCode";
  private Boolean validPostalCode;

  public static final String JSON_PROPERTY_CITY = "City";
  private String city;

  public static final String JSON_PROPERTY_STATE_OR_PROVINCE = "StateOrProvince";
  private String stateOrProvince;

  public static final String JSON_PROPERTY_LATITUDE = "Latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "Longitude";
  private Double longitude;


  public ValidatePostalCodeResponse validPostalCode(Boolean validPostalCode) {
    
    this.validPostalCode = validPostalCode;
    return this;
  }

   /**
   * True if the Postal Code is valid, false otherwise
   * @return validPostalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the Postal Code is valid, false otherwise")
  @JsonProperty(JSON_PROPERTY_VALID_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValidPostalCode() {
    return validPostalCode;
  }


  public void setValidPostalCode(Boolean validPostalCode) {
    this.validPostalCode = validPostalCode;
  }


  public ValidatePostalCodeResponse city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * If valid, City corresponding to the input postal code, such as &#39;Walnut Creek&#39;
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If valid, City corresponding to the input postal code, such as 'Walnut Creek'")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public ValidatePostalCodeResponse stateOrProvince(String stateOrProvince) {
    
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * If valid; State or province corresponding to the input postal code, such as &#39;CA&#39; or &#39;California&#39;
   * @return stateOrProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If valid; State or province corresponding to the input postal code, such as 'CA' or 'California'")
  @JsonProperty(JSON_PROPERTY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStateOrProvince() {
    return stateOrProvince;
  }


  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  public ValidatePostalCodeResponse latitude(Double latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * If the postal code is valid, the degrees latitude of the centroid of the postal code, null otherwise
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the postal code is valid, the degrees latitude of the centroid of the postal code, null otherwise")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLatitude() {
    return latitude;
  }


  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public ValidatePostalCodeResponse longitude(Double longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * If the postal code is valid, the degrees longitude of the centroid of the postal code, null otherwise
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the postal code is valid, the degrees longitude of the centroid of the postal code, null otherwise")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLongitude() {
    return longitude;
  }


  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatePostalCodeResponse validatePostalCodeResponse = (ValidatePostalCodeResponse) o;
    return Objects.equals(this.validPostalCode, validatePostalCodeResponse.validPostalCode) &&
        Objects.equals(this.city, validatePostalCodeResponse.city) &&
        Objects.equals(this.stateOrProvince, validatePostalCodeResponse.stateOrProvince) &&
        Objects.equals(this.latitude, validatePostalCodeResponse.latitude) &&
        Objects.equals(this.longitude, validatePostalCodeResponse.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validPostalCode, city, stateOrProvince, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatePostalCodeResponse {\n");
    sb.append("    validPostalCode: ").append(toIndentedString(validPostalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

