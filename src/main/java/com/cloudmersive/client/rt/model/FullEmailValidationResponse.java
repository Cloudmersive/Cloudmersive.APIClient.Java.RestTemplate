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
 * Full email addresss validation result
 */
@JsonPropertyOrder({
  FullEmailValidationResponse.JSON_PROPERTY_VALID_ADDRESS,
  FullEmailValidationResponse.JSON_PROPERTY_MAIL_SERVER_USED_FOR_VALIDATION,
  FullEmailValidationResponse.JSON_PROPERTY_VALID_SYNTAX,
  FullEmailValidationResponse.JSON_PROPERTY_VALID_DOMAIN,
  FullEmailValidationResponse.JSON_PROPERTY_VALID_S_M_T_P,
  FullEmailValidationResponse.JSON_PROPERTY_IS_CATCHALL_DOMAIN,
  FullEmailValidationResponse.JSON_PROPERTY_DOMAIN,
  FullEmailValidationResponse.JSON_PROPERTY_IS_FREE_EMAIL_PROVIDER,
  FullEmailValidationResponse.JSON_PROPERTY_IS_DISPOSABLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:42.486016Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FullEmailValidationResponse {
  public static final String JSON_PROPERTY_VALID_ADDRESS = "ValidAddress";
  private Boolean validAddress;

  public static final String JSON_PROPERTY_MAIL_SERVER_USED_FOR_VALIDATION = "MailServerUsedForValidation";
  private String mailServerUsedForValidation;

  public static final String JSON_PROPERTY_VALID_SYNTAX = "Valid_Syntax";
  private Boolean validSyntax;

  public static final String JSON_PROPERTY_VALID_DOMAIN = "Valid_Domain";
  private Boolean validDomain;

  public static final String JSON_PROPERTY_VALID_S_M_T_P = "Valid_SMTP";
  private Boolean validSMTP;

  public static final String JSON_PROPERTY_IS_CATCHALL_DOMAIN = "IsCatchallDomain";
  private Boolean isCatchallDomain;

  public static final String JSON_PROPERTY_DOMAIN = "Domain";
  private String domain;

  public static final String JSON_PROPERTY_IS_FREE_EMAIL_PROVIDER = "IsFreeEmailProvider";
  private Boolean isFreeEmailProvider;

  public static final String JSON_PROPERTY_IS_DISPOSABLE = "IsDisposable";
  private Boolean isDisposable;

  public FullEmailValidationResponse() {
  }

  public FullEmailValidationResponse validAddress(Boolean validAddress) {
    
    this.validAddress = validAddress;
    return this;
  }

  /**
   * True if the email address is valid overall, false otherwise
   * @return validAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValidAddress() {
    return validAddress;
  }


  @JsonProperty(JSON_PROPERTY_VALID_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidAddress(Boolean validAddress) {
    this.validAddress = validAddress;
  }

  public FullEmailValidationResponse mailServerUsedForValidation(String mailServerUsedForValidation) {
    
    this.mailServerUsedForValidation = mailServerUsedForValidation;
    return this;
  }

  /**
   * Email server connected to for verification
   * @return mailServerUsedForValidation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIL_SERVER_USED_FOR_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMailServerUsedForValidation() {
    return mailServerUsedForValidation;
  }


  @JsonProperty(JSON_PROPERTY_MAIL_SERVER_USED_FOR_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMailServerUsedForValidation(String mailServerUsedForValidation) {
    this.mailServerUsedForValidation = mailServerUsedForValidation;
  }

  public FullEmailValidationResponse validSyntax(Boolean validSyntax) {
    
    this.validSyntax = validSyntax;
    return this;
  }

  /**
   * True if the syntax of the email address is valid, false otherwise.  This is one component of ValidAddress, but not the only one.
   * @return validSyntax
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_SYNTAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValidSyntax() {
    return validSyntax;
  }


  @JsonProperty(JSON_PROPERTY_VALID_SYNTAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidSyntax(Boolean validSyntax) {
    this.validSyntax = validSyntax;
  }

  public FullEmailValidationResponse validDomain(Boolean validDomain) {
    
    this.validDomain = validDomain;
    return this;
  }

  /**
   * True if the domain name of the email address is valid, false otherwise.  This is one component of ValidAddress, but not the only one.
   * @return validDomain
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValidDomain() {
    return validDomain;
  }


  @JsonProperty(JSON_PROPERTY_VALID_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidDomain(Boolean validDomain) {
    this.validDomain = validDomain;
  }

  public FullEmailValidationResponse validSMTP(Boolean validSMTP) {
    
    this.validSMTP = validSMTP;
    return this;
  }

  /**
   * True if the email address was verified by the remote server, false otherwise.  This is one component of ValidAddress, but not the only one.
   * @return validSMTP
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID_S_M_T_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValidSMTP() {
    return validSMTP;
  }


  @JsonProperty(JSON_PROPERTY_VALID_S_M_T_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidSMTP(Boolean validSMTP) {
    this.validSMTP = validSMTP;
  }

  public FullEmailValidationResponse isCatchallDomain(Boolean isCatchallDomain) {
    
    this.isCatchallDomain = isCatchallDomain;
    return this;
  }

  /**
   * True if the domain is a catch-all domain name, false otherwise.  Catch-all domain names, while rare, always accept inbound email to ensure they do not lose any potentially useful emails.  Catch-all domain names can occassionally be configured to first accept and store all inbound email, but then later send a bounce email back to the sender after a delayed period of time.
   * @return isCatchallDomain
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CATCHALL_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCatchallDomain() {
    return isCatchallDomain;
  }


  @JsonProperty(JSON_PROPERTY_IS_CATCHALL_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCatchallDomain(Boolean isCatchallDomain) {
    this.isCatchallDomain = isCatchallDomain;
  }

  public FullEmailValidationResponse domain(String domain) {
    
    this.domain = domain;
    return this;
  }

  /**
   * Domain name of the email address
   * @return domain
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomain(String domain) {
    this.domain = domain;
  }

  public FullEmailValidationResponse isFreeEmailProvider(Boolean isFreeEmailProvider) {
    
    this.isFreeEmailProvider = isFreeEmailProvider;
    return this;
  }

  /**
   * True if the email domain name is a free provider (typically a free to sign up web email provider for consumers / personal use), false otherwise.
   * @return isFreeEmailProvider
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_FREE_EMAIL_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFreeEmailProvider() {
    return isFreeEmailProvider;
  }


  @JsonProperty(JSON_PROPERTY_IS_FREE_EMAIL_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsFreeEmailProvider(Boolean isFreeEmailProvider) {
    this.isFreeEmailProvider = isFreeEmailProvider;
  }

  public FullEmailValidationResponse isDisposable(Boolean isDisposable) {
    
    this.isDisposable = isDisposable;
    return this;
  }

  /**
   * True if the email address is a disposable email address, false otherwise; these disposable providers are not typically used to receive email and so will have a low likelihood of opening mail sent there.
   * @return isDisposable
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DISPOSABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDisposable() {
    return isDisposable;
  }


  @JsonProperty(JSON_PROPERTY_IS_DISPOSABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDisposable(Boolean isDisposable) {
    this.isDisposable = isDisposable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullEmailValidationResponse fullEmailValidationResponse = (FullEmailValidationResponse) o;
    return Objects.equals(this.validAddress, fullEmailValidationResponse.validAddress) &&
        Objects.equals(this.mailServerUsedForValidation, fullEmailValidationResponse.mailServerUsedForValidation) &&
        Objects.equals(this.validSyntax, fullEmailValidationResponse.validSyntax) &&
        Objects.equals(this.validDomain, fullEmailValidationResponse.validDomain) &&
        Objects.equals(this.validSMTP, fullEmailValidationResponse.validSMTP) &&
        Objects.equals(this.isCatchallDomain, fullEmailValidationResponse.isCatchallDomain) &&
        Objects.equals(this.domain, fullEmailValidationResponse.domain) &&
        Objects.equals(this.isFreeEmailProvider, fullEmailValidationResponse.isFreeEmailProvider) &&
        Objects.equals(this.isDisposable, fullEmailValidationResponse.isDisposable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validAddress, mailServerUsedForValidation, validSyntax, validDomain, validSMTP, isCatchallDomain, domain, isFreeEmailProvider, isDisposable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullEmailValidationResponse {\n");
    sb.append("    validAddress: ").append(toIndentedString(validAddress)).append("\n");
    sb.append("    mailServerUsedForValidation: ").append(toIndentedString(mailServerUsedForValidation)).append("\n");
    sb.append("    validSyntax: ").append(toIndentedString(validSyntax)).append("\n");
    sb.append("    validDomain: ").append(toIndentedString(validDomain)).append("\n");
    sb.append("    validSMTP: ").append(toIndentedString(validSMTP)).append("\n");
    sb.append("    isCatchallDomain: ").append(toIndentedString(isCatchallDomain)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    isFreeEmailProvider: ").append(toIndentedString(isFreeEmailProvider)).append("\n");
    sb.append("    isDisposable: ").append(toIndentedString(isDisposable)).append("\n");
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

