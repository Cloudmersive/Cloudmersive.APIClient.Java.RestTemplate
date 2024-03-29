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
 * Request to get time zones for a country
 */
@ApiModel(description = "Request to get time zones for a country")
@JsonPropertyOrder({
  GetTimezonesRequest.JSON_PROPERTY_COUNTRY_CODE_OR_NAME
})
@JsonTypeName("GetTimezonesRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:52:45.902-07:00[America/Los_Angeles]")
public class GetTimezonesRequest {
  public static final String JSON_PROPERTY_COUNTRY_CODE_OR_NAME = "CountryCodeOrName";
  private String countryCodeOrName;


  public GetTimezonesRequest countryCodeOrName(String countryCodeOrName) {
    
    this.countryCodeOrName = countryCodeOrName;
    return this;
  }

   /**
   * Can be the two-letter, three-letter country codes or country name
   * @return countryCodeOrName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can be the two-letter, three-letter country codes or country name")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE_OR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCodeOrName() {
    return countryCodeOrName;
  }


  public void setCountryCodeOrName(String countryCodeOrName) {
    this.countryCodeOrName = countryCodeOrName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimezonesRequest getTimezonesRequest = (GetTimezonesRequest) o;
    return Objects.equals(this.countryCodeOrName, getTimezonesRequest.countryCodeOrName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCodeOrName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimezonesRequest {\n");
    sb.append("    countryCodeOrName: ").append(toIndentedString(countryCodeOrName)).append("\n");
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

