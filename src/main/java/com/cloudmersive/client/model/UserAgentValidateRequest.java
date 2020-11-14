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
 * User-Agent parse and validation request
 */
@ApiModel(description = "User-Agent parse and validation request")
@JsonPropertyOrder({
  UserAgentValidateRequest.JSON_PROPERTY_USER_AGENT_STRING
})
@JsonTypeName("UserAgentValidateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:16.115-08:00[America/Los_Angeles]")
public class UserAgentValidateRequest {
  public static final String JSON_PROPERTY_USER_AGENT_STRING = "UserAgentString";
  private String userAgentString;


  public UserAgentValidateRequest userAgentString(String userAgentString) {
    
    this.userAgentString = userAgentString;
    return this;
  }

   /**
   * The user agent string you wish to parse and validate
   * @return userAgentString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user agent string you wish to parse and validate")
  @JsonProperty(JSON_PROPERTY_USER_AGENT_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserAgentString() {
    return userAgentString;
  }


  public void setUserAgentString(String userAgentString) {
    this.userAgentString = userAgentString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAgentValidateRequest userAgentValidateRequest = (UserAgentValidateRequest) o;
    return Objects.equals(this.userAgentString, userAgentValidateRequest.userAgentString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAgentString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAgentValidateRequest {\n");
    sb.append("    userAgentString: ").append(toIndentedString(userAgentString)).append("\n");
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

