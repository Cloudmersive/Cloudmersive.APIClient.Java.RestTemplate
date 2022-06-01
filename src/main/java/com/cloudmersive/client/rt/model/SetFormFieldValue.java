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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Individual field value to set in a PDF form
 */
@ApiModel(description = "Individual field value to set in a PDF form")
@JsonPropertyOrder({
  SetFormFieldValue.JSON_PROPERTY_FIELD_NAME,
  SetFormFieldValue.JSON_PROPERTY_TEXT_VALUE,
  SetFormFieldValue.JSON_PROPERTY_CHECKBOX_VALUE,
  SetFormFieldValue.JSON_PROPERTY_COMBO_BOX_SELECTED_INDEX
})
@JsonTypeName("SetFormFieldValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
public class SetFormFieldValue {
  public static final String JSON_PROPERTY_FIELD_NAME = "FieldName";
  private String fieldName;

  public static final String JSON_PROPERTY_TEXT_VALUE = "TextValue";
  private String textValue;

  public static final String JSON_PROPERTY_CHECKBOX_VALUE = "CheckboxValue";
  private Boolean checkboxValue;

  public static final String JSON_PROPERTY_COMBO_BOX_SELECTED_INDEX = "ComboBoxSelectedIndex";
  private Integer comboBoxSelectedIndex;


  public SetFormFieldValue fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Name of the field to set; you can call /convert/edit/pdf/form/get-fields to enumerate field names in a form
   * @return fieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the field to set; you can call /convert/edit/pdf/form/get-fields to enumerate field names in a form")
  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public SetFormFieldValue textValue(String textValue) {
    
    this.textValue = textValue;
    return this;
  }

   /**
   * For fields of type Text, the text value to put into the field
   * @return textValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For fields of type Text, the text value to put into the field")
  @JsonProperty(JSON_PROPERTY_TEXT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextValue() {
    return textValue;
  }


  public void setTextValue(String textValue) {
    this.textValue = textValue;
  }


  public SetFormFieldValue checkboxValue(Boolean checkboxValue) {
    
    this.checkboxValue = checkboxValue;
    return this;
  }

   /**
   * For fields of type Checkbox, the value to put into the field
   * @return checkboxValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For fields of type Checkbox, the value to put into the field")
  @JsonProperty(JSON_PROPERTY_CHECKBOX_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCheckboxValue() {
    return checkboxValue;
  }


  public void setCheckboxValue(Boolean checkboxValue) {
    this.checkboxValue = checkboxValue;
  }


  public SetFormFieldValue comboBoxSelectedIndex(Integer comboBoxSelectedIndex) {
    
    this.comboBoxSelectedIndex = comboBoxSelectedIndex;
    return this;
  }

   /**
   * For fields of type ComboBox; specifies the selected index of the combo box selection
   * @return comboBoxSelectedIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For fields of type ComboBox; specifies the selected index of the combo box selection")
  @JsonProperty(JSON_PROPERTY_COMBO_BOX_SELECTED_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getComboBoxSelectedIndex() {
    return comboBoxSelectedIndex;
  }


  public void setComboBoxSelectedIndex(Integer comboBoxSelectedIndex) {
    this.comboBoxSelectedIndex = comboBoxSelectedIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetFormFieldValue setFormFieldValue = (SetFormFieldValue) o;
    return Objects.equals(this.fieldName, setFormFieldValue.fieldName) &&
        Objects.equals(this.textValue, setFormFieldValue.textValue) &&
        Objects.equals(this.checkboxValue, setFormFieldValue.checkboxValue) &&
        Objects.equals(this.comboBoxSelectedIndex, setFormFieldValue.comboBoxSelectedIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, textValue, checkboxValue, comboBoxSelectedIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetFormFieldValue {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    textValue: ").append(toIndentedString(textValue)).append("\n");
    sb.append("    checkboxValue: ").append(toIndentedString(checkboxValue)).append("\n");
    sb.append("    comboBoxSelectedIndex: ").append(toIndentedString(comboBoxSelectedIndex)).append("\n");
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

