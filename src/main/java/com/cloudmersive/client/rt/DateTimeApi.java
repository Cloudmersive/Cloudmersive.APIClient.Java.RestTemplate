package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.DateTimeNaturalLanguageParseRequest;
import com.cloudmersive.client.rt.model.DateTimeNowResult;
import com.cloudmersive.client.rt.model.DateTimeStandardizedParseRequest;
import com.cloudmersive.client.rt.model.DateTimeStandardizedParseResponse;
import com.cloudmersive.client.rt.model.GetPublicHolidaysRequest;
import com.cloudmersive.client.rt.model.PublicHolidaysResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:52:45.902-07:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.DateTimeApi")
public class DateTimeApi {
    private ApiClient apiClient;

    public DateTimeApi() {
        this(new ApiClient());
    }

    @Autowired
    public DateTimeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get current date and time as of now
     * Gets the current date and time.  Response time is syncronized with atomic clocks, and represents a monotonic, centrally available, consistent clock.
     * <p><b>200</b> - OK
     * @return DateTimeNowResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DateTimeNowResult dateTimeGetNowSimple() throws RestClientException {
        return dateTimeGetNowSimpleWithHttpInfo().getBody();
    }

    /**
     * Get current date and time as of now
     * Gets the current date and time.  Response time is syncronized with atomic clocks, and represents a monotonic, centrally available, consistent clock.
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;DateTimeNowResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DateTimeNowResult> dateTimeGetNowSimpleWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/validate/date-time/get/now", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<DateTimeNowResult> returnType = new ParameterizedTypeReference<DateTimeNowResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get public holidays in the specified country and year
     * Enumerates all public holidays in a given country for a given year.  Supports over 100 countries.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return PublicHolidaysResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PublicHolidaysResponse dateTimeGetPublicHolidays(GetPublicHolidaysRequest input) throws RestClientException {
        return dateTimeGetPublicHolidaysWithHttpInfo(input).getBody();
    }

    /**
     * Get public holidays in the specified country and year
     * Enumerates all public holidays in a given country for a given year.  Supports over 100 countries.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return ResponseEntity&lt;PublicHolidaysResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PublicHolidaysResponse> dateTimeGetPublicHolidaysWithHttpInfo(GetPublicHolidaysRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling dateTimeGetPublicHolidays");
        }
        
        String path = apiClient.expandPath("/validate/date-time/get/holidays", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<PublicHolidaysResponse> returnType = new ParameterizedTypeReference<PublicHolidaysResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Parses a free-form natural language date and time string into a date and time
     * Parses an unstructured, free-form, natural language date and time string into a date time object.  This is intended for lightweight human-entered input, such as \&quot;tomorrow at 3pm\&quot; or \&quot;tuesday\&quot;.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return DateTimeStandardizedParseResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DateTimeStandardizedParseResponse dateTimeParseNaturalLanguageDateTime(DateTimeNaturalLanguageParseRequest input) throws RestClientException {
        return dateTimeParseNaturalLanguageDateTimeWithHttpInfo(input).getBody();
    }

    /**
     * Parses a free-form natural language date and time string into a date and time
     * Parses an unstructured, free-form, natural language date and time string into a date time object.  This is intended for lightweight human-entered input, such as \&quot;tomorrow at 3pm\&quot; or \&quot;tuesday\&quot;.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return ResponseEntity&lt;DateTimeStandardizedParseResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DateTimeStandardizedParseResponse> dateTimeParseNaturalLanguageDateTimeWithHttpInfo(DateTimeNaturalLanguageParseRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling dateTimeParseNaturalLanguageDateTime");
        }
        
        String path = apiClient.expandPath("/validate/date-time/parse/date-time/natural-language", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<DateTimeStandardizedParseResponse> returnType = new ParameterizedTypeReference<DateTimeStandardizedParseResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Parses a standardized date and time string into a date and time
     * Parses a structured date and time string into a date time object.  This is intended for standardized date strings that adhere to formatting conventions, rather than natural language input.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return DateTimeStandardizedParseResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DateTimeStandardizedParseResponse dateTimeParseStandardDateTime(DateTimeStandardizedParseRequest input) throws RestClientException {
        return dateTimeParseStandardDateTimeWithHttpInfo(input).getBody();
    }

    /**
     * Parses a standardized date and time string into a date and time
     * Parses a structured date and time string into a date time object.  This is intended for standardized date strings that adhere to formatting conventions, rather than natural language input.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return ResponseEntity&lt;DateTimeStandardizedParseResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DateTimeStandardizedParseResponse> dateTimeParseStandardDateTimeWithHttpInfo(DateTimeStandardizedParseRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling dateTimeParseStandardDateTime");
        }
        
        String path = apiClient.expandPath("/validate/date-time/parse/date-time/structured", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<DateTimeStandardizedParseResponse> returnType = new ParameterizedTypeReference<DateTimeStandardizedParseResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
