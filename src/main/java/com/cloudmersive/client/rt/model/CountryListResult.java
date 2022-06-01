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
import com.cloudmersive.client.rt.model.CountryDetails;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Result of enumerating available countries
 */
@ApiModel(description = "Result of enumerating available countries")
@JsonPropertyOrder({
  CountryListResult.JSON_PROPERTY_SUCCESSFUL,
  CountryListResult.JSON_PROPERTY_COUNTRIES
})
@JsonTypeName("CountryListResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:52:45.902-07:00[America/Los_Angeles]")
public class CountryListResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_COUNTRIES = "Countries";
  private List<CountryDetails> countries = null;


  public CountryListResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public CountryListResult countries(List<CountryDetails> countries) {
    
    this.countries = countries;
    return this;
  }

  public CountryListResult addCountriesItem(CountryDetails countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<CountryDetails>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * List of current ISO 3166-1 countries in the world
   * @return countries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of current ISO 3166-1 countries in the world")
  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CountryDetails> getCountries() {
    return countries;
  }


  public void setCountries(List<CountryDetails> countries) {
    this.countries = countries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryListResult countryListResult = (CountryListResult) o;
    return Objects.equals(this.successful, countryListResult.successful) &&
        Objects.equals(this.countries, countryListResult.countries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, countries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryListResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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

