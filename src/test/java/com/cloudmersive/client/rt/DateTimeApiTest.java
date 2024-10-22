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


package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.model.DateTimeNaturalLanguageParseRequest;
import com.cloudmersive.client.rt.model.DateTimeNowResult;
import com.cloudmersive.client.rt.model.DateTimeStandardizedParseRequest;
import com.cloudmersive.client.rt.model.DateTimeStandardizedParseResponse;
import com.cloudmersive.client.rt.model.GetPublicHolidaysRequest;
import com.cloudmersive.client.rt.model.PublicHolidaysResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClientException;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DateTimeApi
 */
@Disabled
class DateTimeApiTest {

    private final DateTimeApi api = new DateTimeApi();

    
    /**
     * Get current date and time as of now
     *
     * Gets the current date and time.  Response time is syncronized with atomic clocks, and represents a monotonic, centrally available, consistent clock.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void dateTimeGetNowSimpleTest() {

        DateTimeNowResult response = api.dateTimeGetNowSimple();

        // TODO: test validations
    }
    
    /**
     * Get public holidays in the specified country and year
     *
     * Enumerates all public holidays in a given country for a given year.  Supports over 100 countries.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void dateTimeGetPublicHolidaysTest() {
        GetPublicHolidaysRequest input = null;

        PublicHolidaysResponse response = api.dateTimeGetPublicHolidays(input);

        // TODO: test validations
    }
    
    /**
     * Parses a free-form natural language date and time string into a date and time
     *
     * Parses an unstructured, free-form, natural language date and time string into a date time object.  This is intended for lightweight human-entered input, such as \&quot;tomorrow at 3pm\&quot; or \&quot;tuesday\&quot;.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void dateTimeParseNaturalLanguageDateTimeTest() {
        DateTimeNaturalLanguageParseRequest input = null;

        DateTimeStandardizedParseResponse response = api.dateTimeParseNaturalLanguageDateTime(input);

        // TODO: test validations
    }
    
    /**
     * Parses a standardized date and time string into a date and time
     *
     * Parses a structured date and time string into a date time object.  This is intended for standardized date strings that adhere to formatting conventions, rather than natural language input.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void dateTimeParseStandardDateTimeTest() {
        DateTimeStandardizedParseRequest input = null;

        DateTimeStandardizedParseResponse response = api.dateTimeParseStandardDateTime(input);

        // TODO: test validations
    }
    
}
