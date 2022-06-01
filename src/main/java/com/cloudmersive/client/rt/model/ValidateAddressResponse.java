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
 * Result of validating a street address
 */
@ApiModel(description = "Result of validating a street address")
@JsonPropertyOrder({
  ValidateAddressResponse.JSON_PROPERTY_VALID_ADDRESS,
  ValidateAddressResponse.JSON_PROPERTY_LATITUDE,
  ValidateAddressResponse.JSON_PROPERTY_LONGITUDE
})
@JsonTypeName("ValidateAddressResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:52:45.902-07:00[America/Los_Angeles]")
public class ValidateAddressResponse {
  public static final String JSON_PROPERTY_VALID_ADDRESS = "ValidAddress";
  private Boolean validAddress;

  public static final String JSON_PROPERTY_LATITUDE = "Latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "Longitude";
  private Double longitude;


  public ValidateAddressResponse validAddress(Boolean validAddress) {
    
    this.validAddress = validAddress;
    return this;
  }

   /**
   * True if the address is valid, false otherwise
   * @return validAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the address is valid, false otherwise")
  @JsonProperty(JSON_PROPERTY_VALID_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValidAddress() {
    return validAddress;
  }


  public void setValidAddress(Boolean validAddress) {
    this.validAddress = validAddress;
  }


  public ValidateAddressResponse latitude(Double latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * If the address is valid, the degrees latitude of the validated address, null otherwise
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the address is valid, the degrees latitude of the validated address, null otherwise")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLatitude() {
    return latitude;
  }


  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public ValidateAddressResponse longitude(Double longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * If the address is valid, the degrees longitude of the validated address, null otherwise
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the address is valid, the degrees longitude of the validated address, null otherwise")
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
    ValidateAddressResponse validateAddressResponse = (ValidateAddressResponse) o;
    return Objects.equals(this.validAddress, validateAddressResponse.validAddress) &&
        Objects.equals(this.latitude, validateAddressResponse.latitude) &&
        Objects.equals(this.longitude, validateAddressResponse.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validAddress, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAddressResponse {\n");
    sb.append("    validAddress: ").append(toIndentedString(validAddress)).append("\n");
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

