/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
 * Instance of a form field that is handlebar style, such as \&quot;{{FieldName}}\&quot;
 */
@JsonPropertyOrder({
  HandlebarFormField.JSON_PROPERTY_FORM_FIELD_TITLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class HandlebarFormField {
  public static final String JSON_PROPERTY_FORM_FIELD_TITLE = "FormFieldTitle";
  private String formFieldTitle;

  public HandlebarFormField() {
  }

  public HandlebarFormField formFieldTitle(String formFieldTitle) {
    
    this.formFieldTitle = formFieldTitle;
    return this;
  }

  /**
   * Title of the handlebar style form field, such as \&quot;FieldName\&quot; in the case of \&quot;{{FieldName}}\&quot;
   * @return formFieldTitle
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORM_FIELD_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormFieldTitle() {
    return formFieldTitle;
  }


  @JsonProperty(JSON_PROPERTY_FORM_FIELD_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormFieldTitle(String formFieldTitle) {
    this.formFieldTitle = formFieldTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HandlebarFormField handlebarFormField = (HandlebarFormField) o;
    return Objects.equals(this.formFieldTitle, handlebarFormField.formFieldTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formFieldTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HandlebarFormField {\n");
    sb.append("    formFieldTitle: ").append(toIndentedString(formFieldTitle)).append("\n");
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

