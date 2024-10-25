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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of validating a state
 */
@JsonPropertyOrder({
  ValidateStateResponse.JSON_PROPERTY_VALID_STATE,
  ValidateStateResponse.JSON_PROPERTY_STATE_OR_PROVINCE,
  ValidateStateResponse.JSON_PROPERTY_LATITUDE,
  ValidateStateResponse.JSON_PROPERTY_LONGITUDE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:42.486016Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ValidateStateResponse {
  public static final String JSON_PROPERTY_VALID_STATE = "ValidState";
  private Boolean validState;

  public static final String JSON_PROPERTY_STATE_OR_PROVINCE = "StateOrProvince";
  private String stateOrProvince;

  public static final String JSON_PROPERTY_LATITUDE = "Latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "Longitude";
  private Double longitude;

  public ValidateStateResponse() {
  }

  public ValidateStateResponse validState(Boolean validState) {
    
    this.validState = validState;
    return this;
  }

  /**
   * True if the address is valid, false otherwise
   * @return validState
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValidState() {
    return validState;
  }


  @JsonProperty(JSON_PROPERTY_VALID_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidState(Boolean validState) {
    this.validState = validState;
  }

  public ValidateStateResponse stateOrProvince(String stateOrProvince) {
    
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * If valid; State or province corresponding to the input state name, such as &#39;CA&#39; or &#39;California&#39;
   * @return stateOrProvince
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStateOrProvince() {
    return stateOrProvince;
  }


  @JsonProperty(JSON_PROPERTY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public ValidateStateResponse latitude(Double latitude) {
    
    this.latitude = latitude;
    return this;
  }

  /**
   * If the postal code is valid, the degrees latitude of the centroid of the state, null otherwise
   * @return latitude
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public ValidateStateResponse longitude(Double longitude) {
    
    this.longitude = longitude;
    return this;
  }

  /**
   * If the postal code is valid, the degrees longitude of the centroid of the state, null otherwise
   * @return longitude
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    ValidateStateResponse validateStateResponse = (ValidateStateResponse) o;
    return Objects.equals(this.validState, validateStateResponse.validState) &&
        Objects.equals(this.stateOrProvince, validateStateResponse.stateOrProvince) &&
        Objects.equals(this.latitude, validateStateResponse.latitude) &&
        Objects.equals(this.longitude, validateStateResponse.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validState, stateOrProvince, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateStateResponse {\n");
    sb.append("    validState: ").append(toIndentedString(validState)).append("\n");
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

