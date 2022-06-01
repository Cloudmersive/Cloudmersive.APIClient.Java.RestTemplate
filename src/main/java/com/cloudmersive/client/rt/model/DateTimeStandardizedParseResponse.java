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
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Result of performing a date time parsing
 */
@ApiModel(description = "Result of performing a date time parsing")
@JsonPropertyOrder({
  DateTimeStandardizedParseResponse.JSON_PROPERTY_SUCCESSFUL,
  DateTimeStandardizedParseResponse.JSON_PROPERTY_PARSED_DATE_RESULT,
  DateTimeStandardizedParseResponse.JSON_PROPERTY_YEAR,
  DateTimeStandardizedParseResponse.JSON_PROPERTY_MONTH,
  DateTimeStandardizedParseResponse.JSON_PROPERTY_DAY,
  DateTimeStandardizedParseResponse.JSON_PROPERTY_HOUR,
  DateTimeStandardizedParseResponse.JSON_PROPERTY_MINUTE,
  DateTimeStandardizedParseResponse.JSON_PROPERTY_SECOND,
  DateTimeStandardizedParseResponse.JSON_PROPERTY_DAY_OF_WEEK
})
@JsonTypeName("DateTimeStandardizedParseResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:52:45.902-07:00[America/Los_Angeles]")
public class DateTimeStandardizedParseResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_PARSED_DATE_RESULT = "ParsedDateResult";
  private OffsetDateTime parsedDateResult;

  public static final String JSON_PROPERTY_YEAR = "Year";
  private Integer year;

  public static final String JSON_PROPERTY_MONTH = "Month";
  private Integer month;

  public static final String JSON_PROPERTY_DAY = "Day";
  private Integer day;

  public static final String JSON_PROPERTY_HOUR = "Hour";
  private Integer hour;

  public static final String JSON_PROPERTY_MINUTE = "Minute";
  private Integer minute;

  public static final String JSON_PROPERTY_SECOND = "Second";
  private Integer second;

  public static final String JSON_PROPERTY_DAY_OF_WEEK = "DayOfWeek";
  private String dayOfWeek;


  public DateTimeStandardizedParseResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public DateTimeStandardizedParseResponse parsedDateResult(OffsetDateTime parsedDateResult) {
    
    this.parsedDateResult = parsedDateResult;
    return this;
  }

   /**
   * Result of performing a date time parsing
   * @return parsedDateResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Result of performing a date time parsing")
  @JsonProperty(JSON_PROPERTY_PARSED_DATE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getParsedDateResult() {
    return parsedDateResult;
  }


  public void setParsedDateResult(OffsetDateTime parsedDateResult) {
    this.parsedDateResult = parsedDateResult;
  }


  public DateTimeStandardizedParseResponse year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * Year of the parsed date time result
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Year of the parsed date time result")
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }


  public DateTimeStandardizedParseResponse month(Integer month) {
    
    this.month = month;
    return this;
  }

   /**
   * Month of the parsed date time result
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Month of the parsed date time result")
  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMonth() {
    return month;
  }


  public void setMonth(Integer month) {
    this.month = month;
  }


  public DateTimeStandardizedParseResponse day(Integer day) {
    
    this.day = day;
    return this;
  }

   /**
   * Day of the parsed date time result
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Day of the parsed date time result")
  @JsonProperty(JSON_PROPERTY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDay() {
    return day;
  }


  public void setDay(Integer day) {
    this.day = day;
  }


  public DateTimeStandardizedParseResponse hour(Integer hour) {
    
    this.hour = hour;
    return this;
  }

   /**
   * Hour of the parsed date time result (24-hour)
   * @return hour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hour of the parsed date time result (24-hour)")
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHour() {
    return hour;
  }


  public void setHour(Integer hour) {
    this.hour = hour;
  }


  public DateTimeStandardizedParseResponse minute(Integer minute) {
    
    this.minute = minute;
    return this;
  }

   /**
   * Minute of the parsed date time result
   * @return minute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minute of the parsed date time result")
  @JsonProperty(JSON_PROPERTY_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinute() {
    return minute;
  }


  public void setMinute(Integer minute) {
    this.minute = minute;
  }


  public DateTimeStandardizedParseResponse second(Integer second) {
    
    this.second = second;
    return this;
  }

   /**
   * Second of the parsed date time result
   * @return second
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Second of the parsed date time result")
  @JsonProperty(JSON_PROPERTY_SECOND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSecond() {
    return second;
  }


  public void setSecond(Integer second) {
    this.second = second;
  }


  public DateTimeStandardizedParseResponse dayOfWeek(String dayOfWeek) {
    
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Day of week
   * @return dayOfWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Day of week")
  @JsonProperty(JSON_PROPERTY_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDayOfWeek() {
    return dayOfWeek;
  }


  public void setDayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeStandardizedParseResponse dateTimeStandardizedParseResponse = (DateTimeStandardizedParseResponse) o;
    return Objects.equals(this.successful, dateTimeStandardizedParseResponse.successful) &&
        Objects.equals(this.parsedDateResult, dateTimeStandardizedParseResponse.parsedDateResult) &&
        Objects.equals(this.year, dateTimeStandardizedParseResponse.year) &&
        Objects.equals(this.month, dateTimeStandardizedParseResponse.month) &&
        Objects.equals(this.day, dateTimeStandardizedParseResponse.day) &&
        Objects.equals(this.hour, dateTimeStandardizedParseResponse.hour) &&
        Objects.equals(this.minute, dateTimeStandardizedParseResponse.minute) &&
        Objects.equals(this.second, dateTimeStandardizedParseResponse.second) &&
        Objects.equals(this.dayOfWeek, dateTimeStandardizedParseResponse.dayOfWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, parsedDateResult, year, month, day, hour, minute, second, dayOfWeek);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeStandardizedParseResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    parsedDateResult: ").append(toIndentedString(parsedDateResult)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
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

