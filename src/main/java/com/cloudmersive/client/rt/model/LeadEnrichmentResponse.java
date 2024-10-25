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
 * Result of the lead enrichment process
 */
@JsonPropertyOrder({
  LeadEnrichmentResponse.JSON_PROPERTY_SUCCESSFUL,
  LeadEnrichmentResponse.JSON_PROPERTY_LEAD_TYPE,
  LeadEnrichmentResponse.JSON_PROPERTY_CONTACT_BUSINESS_EMAIL,
  LeadEnrichmentResponse.JSON_PROPERTY_CONTACT_FIRST_NAME,
  LeadEnrichmentResponse.JSON_PROPERTY_CONTACT_LAST_NAME,
  LeadEnrichmentResponse.JSON_PROPERTY_CONTACT_GENDER,
  LeadEnrichmentResponse.JSON_PROPERTY_COMPANY_NAME,
  LeadEnrichmentResponse.JSON_PROPERTY_COMPANY_DOMAIN_NAME,
  LeadEnrichmentResponse.JSON_PROPERTY_COMPANY_HOUSE_NUMBER,
  LeadEnrichmentResponse.JSON_PROPERTY_COMPANY_STREET,
  LeadEnrichmentResponse.JSON_PROPERTY_COMPANY_CITY,
  LeadEnrichmentResponse.JSON_PROPERTY_COMPANY_STATE_OR_PROVINCE,
  LeadEnrichmentResponse.JSON_PROPERTY_COMPANY_POSTAL_CODE,
  LeadEnrichmentResponse.JSON_PROPERTY_COMPANY_COUNTRY,
  LeadEnrichmentResponse.JSON_PROPERTY_COMPANY_COUNTRY_CODE,
  LeadEnrichmentResponse.JSON_PROPERTY_COMPANY_TELEPHONE,
  LeadEnrichmentResponse.JSON_PROPERTY_COMPANY_V_A_T_NUMBER,
  LeadEnrichmentResponse.JSON_PROPERTY_EMPLOYEE_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:42.486016Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadEnrichmentResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_LEAD_TYPE = "LeadType";
  private String leadType;

  public static final String JSON_PROPERTY_CONTACT_BUSINESS_EMAIL = "ContactBusinessEmail";
  private String contactBusinessEmail;

  public static final String JSON_PROPERTY_CONTACT_FIRST_NAME = "ContactFirstName";
  private String contactFirstName;

  public static final String JSON_PROPERTY_CONTACT_LAST_NAME = "ContactLastName";
  private String contactLastName;

  public static final String JSON_PROPERTY_CONTACT_GENDER = "ContactGender";
  private String contactGender;

  public static final String JSON_PROPERTY_COMPANY_NAME = "CompanyName";
  private String companyName;

  public static final String JSON_PROPERTY_COMPANY_DOMAIN_NAME = "CompanyDomainName";
  private String companyDomainName;

  public static final String JSON_PROPERTY_COMPANY_HOUSE_NUMBER = "CompanyHouseNumber";
  private String companyHouseNumber;

  public static final String JSON_PROPERTY_COMPANY_STREET = "CompanyStreet";
  private String companyStreet;

  public static final String JSON_PROPERTY_COMPANY_CITY = "CompanyCity";
  private String companyCity;

  public static final String JSON_PROPERTY_COMPANY_STATE_OR_PROVINCE = "CompanyStateOrProvince";
  private String companyStateOrProvince;

  public static final String JSON_PROPERTY_COMPANY_POSTAL_CODE = "CompanyPostalCode";
  private String companyPostalCode;

  public static final String JSON_PROPERTY_COMPANY_COUNTRY = "CompanyCountry";
  private String companyCountry;

  public static final String JSON_PROPERTY_COMPANY_COUNTRY_CODE = "CompanyCountryCode";
  private String companyCountryCode;

  public static final String JSON_PROPERTY_COMPANY_TELEPHONE = "CompanyTelephone";
  private String companyTelephone;

  public static final String JSON_PROPERTY_COMPANY_V_A_T_NUMBER = "CompanyVATNumber";
  private String companyVATNumber;

  public static final String JSON_PROPERTY_EMPLOYEE_COUNT = "EmployeeCount";
  private Integer employeeCount;

  public LeadEnrichmentResponse() {
  }

  public LeadEnrichmentResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

  /**
   * True if the operation was successful, false otherwise
   * @return successful
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public LeadEnrichmentResponse leadType(String leadType) {
    
    this.leadType = leadType;
    return this;
  }

  /**
   * The type of the lead; possible types are Junk (a single individual using a disposable/throwaway email address); Individual (a single individual, typically a consumer, not purchasing on behalf of a business); SmallBusiness (a small business, typically with fewer than 100 employees); MediumBusiness (a medium business, larger than 100 employees but fewer than 1000 employees); Enterprise (a large business with greater than 1000 employees); Business (a business customer of unknown size)
   * @return leadType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLeadType() {
    return leadType;
  }


  @JsonProperty(JSON_PROPERTY_LEAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeadType(String leadType) {
    this.leadType = leadType;
  }

  public LeadEnrichmentResponse contactBusinessEmail(String contactBusinessEmail) {
    
    this.contactBusinessEmail = contactBusinessEmail;
    return this;
  }

  /**
   * The person&#39;s business email address for the lead
   * @return contactBusinessEmail
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_BUSINESS_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactBusinessEmail() {
    return contactBusinessEmail;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_BUSINESS_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactBusinessEmail(String contactBusinessEmail) {
    this.contactBusinessEmail = contactBusinessEmail;
  }

  public LeadEnrichmentResponse contactFirstName(String contactFirstName) {
    
    this.contactFirstName = contactFirstName;
    return this;
  }

  /**
   * The person&#39;s first name for the lead
   * @return contactFirstName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactFirstName() {
    return contactFirstName;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
  }

  public LeadEnrichmentResponse contactLastName(String contactLastName) {
    
    this.contactLastName = contactLastName;
    return this;
  }

  /**
   * The person&#39;s last name for the lead
   * @return contactLastName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactLastName() {
    return contactLastName;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
  }

  public LeadEnrichmentResponse contactGender(String contactGender) {
    
    this.contactGender = contactGender;
    return this;
  }

  /**
   * Gender for contact name; possible values are Male, Female, and Neutral (can be applied to Male or Female).  Requires ContactFirstName.
   * @return contactGender
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactGender() {
    return contactGender;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactGender(String contactGender) {
    this.contactGender = contactGender;
  }

  public LeadEnrichmentResponse companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

  /**
   * Name of the company for the lead
   * @return companyName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public LeadEnrichmentResponse companyDomainName(String companyDomainName) {
    
    this.companyDomainName = companyDomainName;
    return this;
  }

  /**
   * Domain name / website for the lead
   * @return companyDomainName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyDomainName() {
    return companyDomainName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyDomainName(String companyDomainName) {
    this.companyDomainName = companyDomainName;
  }

  public LeadEnrichmentResponse companyHouseNumber(String companyHouseNumber) {
    
    this.companyHouseNumber = companyHouseNumber;
    return this;
  }

  /**
   * House number of the address of the company for the lead
   * @return companyHouseNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyHouseNumber() {
    return companyHouseNumber;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyHouseNumber(String companyHouseNumber) {
    this.companyHouseNumber = companyHouseNumber;
  }

  public LeadEnrichmentResponse companyStreet(String companyStreet) {
    
    this.companyStreet = companyStreet;
    return this;
  }

  /**
   * Street name of the address of the company for the lead
   * @return companyStreet
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyStreet() {
    return companyStreet;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyStreet(String companyStreet) {
    this.companyStreet = companyStreet;
  }

  public LeadEnrichmentResponse companyCity(String companyCity) {
    
    this.companyCity = companyCity;
    return this;
  }

  /**
   * City of the address of the company for the lead
   * @return companyCity
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyCity() {
    return companyCity;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyCity(String companyCity) {
    this.companyCity = companyCity;
  }

  public LeadEnrichmentResponse companyStateOrProvince(String companyStateOrProvince) {
    
    this.companyStateOrProvince = companyStateOrProvince;
    return this;
  }

  /**
   * State or Province of the address of the company for the lead
   * @return companyStateOrProvince
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyStateOrProvince() {
    return companyStateOrProvince;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyStateOrProvince(String companyStateOrProvince) {
    this.companyStateOrProvince = companyStateOrProvince;
  }

  public LeadEnrichmentResponse companyPostalCode(String companyPostalCode) {
    
    this.companyPostalCode = companyPostalCode;
    return this;
  }

  /**
   * Postal Code of the address of the company for the lead
   * @return companyPostalCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyPostalCode() {
    return companyPostalCode;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyPostalCode(String companyPostalCode) {
    this.companyPostalCode = companyPostalCode;
  }

  public LeadEnrichmentResponse companyCountry(String companyCountry) {
    
    this.companyCountry = companyCountry;
    return this;
  }

  /**
   * Country Name of the address of the company for the lead
   * @return companyCountry
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyCountry() {
    return companyCountry;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyCountry(String companyCountry) {
    this.companyCountry = companyCountry;
  }

  public LeadEnrichmentResponse companyCountryCode(String companyCountryCode) {
    
    this.companyCountryCode = companyCountryCode;
    return this;
  }

  /**
   * Country Code (2-letter ISO 3166-1) of the address of the company for the lead
   * @return companyCountryCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyCountryCode() {
    return companyCountryCode;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyCountryCode(String companyCountryCode) {
    this.companyCountryCode = companyCountryCode;
  }

  public LeadEnrichmentResponse companyTelephone(String companyTelephone) {
    
    this.companyTelephone = companyTelephone;
    return this;
  }

  /**
   * Telephone of the company office for the lead
   * @return companyTelephone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_TELEPHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyTelephone() {
    return companyTelephone;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_TELEPHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyTelephone(String companyTelephone) {
    this.companyTelephone = companyTelephone;
  }

  public LeadEnrichmentResponse companyVATNumber(String companyVATNumber) {
    
    this.companyVATNumber = companyVATNumber;
    return this;
  }

  /**
   * VAT number of the company for the lead
   * @return companyVATNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_V_A_T_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyVATNumber() {
    return companyVATNumber;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_V_A_T_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyVATNumber(String companyVATNumber) {
    this.companyVATNumber = companyVATNumber;
  }

  public LeadEnrichmentResponse employeeCount(Integer employeeCount) {
    
    this.employeeCount = employeeCount;
    return this;
  }

  /**
   * Count of employees at the company (estimated), if available
   * @return employeeCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMPLOYEE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEmployeeCount() {
    return employeeCount;
  }


  @JsonProperty(JSON_PROPERTY_EMPLOYEE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmployeeCount(Integer employeeCount) {
    this.employeeCount = employeeCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadEnrichmentResponse leadEnrichmentResponse = (LeadEnrichmentResponse) o;
    return Objects.equals(this.successful, leadEnrichmentResponse.successful) &&
        Objects.equals(this.leadType, leadEnrichmentResponse.leadType) &&
        Objects.equals(this.contactBusinessEmail, leadEnrichmentResponse.contactBusinessEmail) &&
        Objects.equals(this.contactFirstName, leadEnrichmentResponse.contactFirstName) &&
        Objects.equals(this.contactLastName, leadEnrichmentResponse.contactLastName) &&
        Objects.equals(this.contactGender, leadEnrichmentResponse.contactGender) &&
        Objects.equals(this.companyName, leadEnrichmentResponse.companyName) &&
        Objects.equals(this.companyDomainName, leadEnrichmentResponse.companyDomainName) &&
        Objects.equals(this.companyHouseNumber, leadEnrichmentResponse.companyHouseNumber) &&
        Objects.equals(this.companyStreet, leadEnrichmentResponse.companyStreet) &&
        Objects.equals(this.companyCity, leadEnrichmentResponse.companyCity) &&
        Objects.equals(this.companyStateOrProvince, leadEnrichmentResponse.companyStateOrProvince) &&
        Objects.equals(this.companyPostalCode, leadEnrichmentResponse.companyPostalCode) &&
        Objects.equals(this.companyCountry, leadEnrichmentResponse.companyCountry) &&
        Objects.equals(this.companyCountryCode, leadEnrichmentResponse.companyCountryCode) &&
        Objects.equals(this.companyTelephone, leadEnrichmentResponse.companyTelephone) &&
        Objects.equals(this.companyVATNumber, leadEnrichmentResponse.companyVATNumber) &&
        Objects.equals(this.employeeCount, leadEnrichmentResponse.employeeCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, leadType, contactBusinessEmail, contactFirstName, contactLastName, contactGender, companyName, companyDomainName, companyHouseNumber, companyStreet, companyCity, companyStateOrProvince, companyPostalCode, companyCountry, companyCountryCode, companyTelephone, companyVATNumber, employeeCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadEnrichmentResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    leadType: ").append(toIndentedString(leadType)).append("\n");
    sb.append("    contactBusinessEmail: ").append(toIndentedString(contactBusinessEmail)).append("\n");
    sb.append("    contactFirstName: ").append(toIndentedString(contactFirstName)).append("\n");
    sb.append("    contactLastName: ").append(toIndentedString(contactLastName)).append("\n");
    sb.append("    contactGender: ").append(toIndentedString(contactGender)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyDomainName: ").append(toIndentedString(companyDomainName)).append("\n");
    sb.append("    companyHouseNumber: ").append(toIndentedString(companyHouseNumber)).append("\n");
    sb.append("    companyStreet: ").append(toIndentedString(companyStreet)).append("\n");
    sb.append("    companyCity: ").append(toIndentedString(companyCity)).append("\n");
    sb.append("    companyStateOrProvince: ").append(toIndentedString(companyStateOrProvince)).append("\n");
    sb.append("    companyPostalCode: ").append(toIndentedString(companyPostalCode)).append("\n");
    sb.append("    companyCountry: ").append(toIndentedString(companyCountry)).append("\n");
    sb.append("    companyCountryCode: ").append(toIndentedString(companyCountryCode)).append("\n");
    sb.append("    companyTelephone: ").append(toIndentedString(companyTelephone)).append("\n");
    sb.append("    companyVATNumber: ").append(toIndentedString(companyVATNumber)).append("\n");
    sb.append("    employeeCount: ").append(toIndentedString(employeeCount)).append("\n");
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

