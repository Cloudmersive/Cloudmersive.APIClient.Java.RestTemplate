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
 * Request to reverse geocode a Street Address
 */
@ApiModel(description = "Request to reverse geocode a Street Address")
@JsonPropertyOrder({
  ReverseGeocodeAddressRequest.JSON_PROPERTY_LATITUDE,
  ReverseGeocodeAddressRequest.JSON_PROPERTY_LONGITUDE
})
@JsonTypeName("ReverseGeocodeAddressRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:16.115-08:00[America/Los_Angeles]")
public class ReverseGeocodeAddressRequest {
  public static final String JSON_PROPERTY_LATITUDE = "Latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "Longitude";
  private Double longitude;


  public ReverseGeocodeAddressRequest latitude(Double latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude coordinate in WGS84 format
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Latitude coordinate in WGS84 format")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLatitude() {
    return latitude;
  }


  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public ReverseGeocodeAddressRequest longitude(Double longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude coordinate in WGS84 format
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Longitude coordinate in WGS84 format")
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
    ReverseGeocodeAddressRequest reverseGeocodeAddressRequest = (ReverseGeocodeAddressRequest) o;
    return Objects.equals(this.latitude, reverseGeocodeAddressRequest.latitude) &&
        Objects.equals(this.longitude, reverseGeocodeAddressRequest.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReverseGeocodeAddressRequest {\n");
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

