package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import com.cloudmersive.client.model.CountryListResult;
import com.cloudmersive.client.model.GetTimezonesRequest;
import com.cloudmersive.client.model.GetTimezonesResponse;
import com.cloudmersive.client.model.ParseAddressRequest;
import com.cloudmersive.client.model.ParseAddressResponse;
import com.cloudmersive.client.model.ReverseGeocodeAddressRequest;
import com.cloudmersive.client.model.ReverseGeocodeAddressResponse;
import com.cloudmersive.client.model.ValidateAddressRequest;
import com.cloudmersive.client.model.ValidateAddressResponse;
import com.cloudmersive.client.model.ValidateCityRequest;
import com.cloudmersive.client.model.ValidateCityResponse;
import com.cloudmersive.client.model.ValidateCountryRequest;
import com.cloudmersive.client.model.ValidateCountryResponse;
import com.cloudmersive.client.model.ValidatePostalCodeRequest;
import com.cloudmersive.client.model.ValidatePostalCodeResponse;
import com.cloudmersive.client.model.ValidateStateRequest;
import com.cloudmersive.client.model.ValidateStateResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:16.115-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.AddressApi")
public class AddressApi {
    private ApiClient apiClient;

    public AddressApi() {
        this(new ApiClient());
    }

    @Autowired
    public AddressApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Check if a country is a member of the European Union (EU)
     * Checks if the input country is a member of the European Union or not.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return ValidateCountryResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ValidateCountryResponse addressCheckEUMembership(ValidateCountryRequest input) throws RestClientException {
        return addressCheckEUMembershipWithHttpInfo(input).getBody();
    }

    /**
     * Check if a country is a member of the European Union (EU)
     * Checks if the input country is a member of the European Union or not.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return ResponseEntity&lt;ValidateCountryResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ValidateCountryResponse> addressCheckEUMembershipWithHttpInfo(ValidateCountryRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressCheckEUMembership");
        }
        
        String path = apiClient.expandPath("/validate/address/country/check-eu-membership", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ValidateCountryResponse> returnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate and normalize country information, return ISO 3166-1 country codes and country name
     * Validates and normalizes country information, and returns key information about a country, as well as whether it is a member of the European Union.  Also returns distinct time zones in the country.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return ValidateCountryResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ValidateCountryResponse addressCountry(ValidateCountryRequest input) throws RestClientException {
        return addressCountryWithHttpInfo(input).getBody();
    }

    /**
     * Validate and normalize country information, return ISO 3166-1 country codes and country name
     * Validates and normalizes country information, and returns key information about a country, as well as whether it is a member of the European Union.  Also returns distinct time zones in the country.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return ResponseEntity&lt;ValidateCountryResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ValidateCountryResponse> addressCountryWithHttpInfo(ValidateCountryRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressCountry");
        }
        
        String path = apiClient.expandPath("/validate/address/country", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ValidateCountryResponse> returnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get a list of ISO 3166-1 countries
     * Enumerates the list of ISO 3166-1 countries, including name, country codes, and more.
     * <p><b>200</b> - OK
     * @return CountryListResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CountryListResult addressCountryList() throws RestClientException {
        return addressCountryListWithHttpInfo().getBody();
    }

    /**
     * Get a list of ISO 3166-1 countries
     * Enumerates the list of ISO 3166-1 countries, including name, country codes, and more.
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;CountryListResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CountryListResult> addressCountryListWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/validate/address/country/list", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CountryListResult> returnType = new ParameterizedTypeReference<CountryListResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Geocode a street address into latitude and longitude
     * Geocodes a street address into latitude and longitude.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return ValidateAddressResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ValidateAddressResponse addressGeocode(ValidateAddressRequest input) throws RestClientException {
        return addressGeocodeWithHttpInfo(input).getBody();
    }

    /**
     * Geocode a street address into latitude and longitude
     * Geocodes a street address into latitude and longitude.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return ResponseEntity&lt;ValidateAddressResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ValidateAddressResponse> addressGeocodeWithHttpInfo(ValidateAddressRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressGeocode");
        }
        
        String path = apiClient.expandPath("/validate/address/geocode", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ValidateAddressResponse> returnType = new ParameterizedTypeReference<ValidateAddressResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get the currency of the input country
     * Gets the currency information for the input country, including the ISO three-letter country code, currency symbol, and English currency name.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return ValidateCountryResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ValidateCountryResponse addressGetCountryCurrency(ValidateCountryRequest input) throws RestClientException {
        return addressGetCountryCurrencyWithHttpInfo(input).getBody();
    }

    /**
     * Get the currency of the input country
     * Gets the currency information for the input country, including the ISO three-letter country code, currency symbol, and English currency name.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return ResponseEntity&lt;ValidateCountryResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ValidateCountryResponse> addressGetCountryCurrencyWithHttpInfo(ValidateCountryRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressGetCountryCurrency");
        }
        
        String path = apiClient.expandPath("/validate/address/country/get-currency", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ValidateCountryResponse> returnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get the region, subregion and continent of the country
     * Gets the continent information including region and subregion for the input country.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return ValidateCountryResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ValidateCountryResponse addressGetCountryRegion(ValidateCountryRequest input) throws RestClientException {
        return addressGetCountryRegionWithHttpInfo(input).getBody();
    }

    /**
     * Get the region, subregion and continent of the country
     * Gets the continent information including region and subregion for the input country.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return ResponseEntity&lt;ValidateCountryResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ValidateCountryResponse> addressGetCountryRegionWithHttpInfo(ValidateCountryRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressGetCountryRegion");
        }
        
        String path = apiClient.expandPath("/validate/address/country/get-region", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ValidateCountryResponse> returnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Gets IANA/Olsen time zones for a country
     * Gets the IANA/Olsen time zones for a country.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return GetTimezonesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetTimezonesResponse addressGetTimezone(GetTimezonesRequest input) throws RestClientException {
        return addressGetTimezoneWithHttpInfo(input).getBody();
    }

    /**
     * Gets IANA/Olsen time zones for a country
     * Gets the IANA/Olsen time zones for a country.
     * <p><b>200</b> - OK
     * @param input Input request (required)
     * @return ResponseEntity&lt;GetTimezonesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetTimezonesResponse> addressGetTimezoneWithHttpInfo(GetTimezonesRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressGetTimezone");
        }
        
        String path = apiClient.expandPath("/validate/address/country/get-timezones", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<GetTimezonesResponse> returnType = new ParameterizedTypeReference<GetTimezonesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Parse an unstructured input text string into an international, formatted address
     * Uses machine learning and Natural Language Processing (NLP) to handle a wide array of cases, including non-standard and unstructured address strings across a wide array of countries and address formatting norms.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return ParseAddressResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ParseAddressResponse addressParseString(ParseAddressRequest input) throws RestClientException {
        return addressParseStringWithHttpInfo(input).getBody();
    }

    /**
     * Parse an unstructured input text string into an international, formatted address
     * Uses machine learning and Natural Language Processing (NLP) to handle a wide array of cases, including non-standard and unstructured address strings across a wide array of countries and address formatting norms.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return ResponseEntity&lt;ParseAddressResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ParseAddressResponse> addressParseStringWithHttpInfo(ParseAddressRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressParseString");
        }
        
        String path = apiClient.expandPath("/validate/address/parse", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ParseAddressResponse> returnType = new ParameterizedTypeReference<ParseAddressResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Reverse geocode a lattitude and longitude into an address
     * Converts lattitude and longitude coordinates into an address through reverse-geocoding.
     * <p><b>200</b> - OK
     * @param input Input reverse geocoding request (required)
     * @return ReverseGeocodeAddressResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReverseGeocodeAddressResponse addressReverseGeocodeAddress(ReverseGeocodeAddressRequest input) throws RestClientException {
        return addressReverseGeocodeAddressWithHttpInfo(input).getBody();
    }

    /**
     * Reverse geocode a lattitude and longitude into an address
     * Converts lattitude and longitude coordinates into an address through reverse-geocoding.
     * <p><b>200</b> - OK
     * @param input Input reverse geocoding request (required)
     * @return ResponseEntity&lt;ReverseGeocodeAddressResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReverseGeocodeAddressResponse> addressReverseGeocodeAddressWithHttpInfo(ReverseGeocodeAddressRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressReverseGeocodeAddress");
        }
        
        String path = apiClient.expandPath("/validate/address/geocode/reverse", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ReverseGeocodeAddressResponse> returnType = new ParameterizedTypeReference<ReverseGeocodeAddressResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a street address
     * Determines if an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.  Supports all major international addresses.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return ValidateAddressResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ValidateAddressResponse addressValidateAddress(ValidateAddressRequest input) throws RestClientException {
        return addressValidateAddressWithHttpInfo(input).getBody();
    }

    /**
     * Validate a street address
     * Determines if an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.  Supports all major international addresses.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return ResponseEntity&lt;ValidateAddressResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ValidateAddressResponse> addressValidateAddressWithHttpInfo(ValidateAddressRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressValidateAddress");
        }
        
        String path = apiClient.expandPath("/validate/address/street-address", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ValidateAddressResponse> returnType = new ParameterizedTypeReference<ValidateAddressResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a City and State/Province combination, get location information about it
     * Checks if the input city and state name or code is valid, and returns information about it such as normalized City name, State name and more.  Supports all major international addresses.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return ValidateCityResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ValidateCityResponse addressValidateCity(ValidateCityRequest input) throws RestClientException {
        return addressValidateCityWithHttpInfo(input).getBody();
    }

    /**
     * Validate a City and State/Province combination, get location information about it
     * Checks if the input city and state name or code is valid, and returns information about it such as normalized City name, State name and more.  Supports all major international addresses.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return ResponseEntity&lt;ValidateCityResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ValidateCityResponse> addressValidateCityWithHttpInfo(ValidateCityRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressValidateCity");
        }
        
        String path = apiClient.expandPath("/validate/address/city", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ValidateCityResponse> returnType = new ParameterizedTypeReference<ValidateCityResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a postal code, get location information about it
     * Checks if the input postal code is valid, and returns information about it such as City, State and more.  Supports all major countries.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return ValidatePostalCodeResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ValidatePostalCodeResponse addressValidatePostalCode(ValidatePostalCodeRequest input) throws RestClientException {
        return addressValidatePostalCodeWithHttpInfo(input).getBody();
    }

    /**
     * Validate a postal code, get location information about it
     * Checks if the input postal code is valid, and returns information about it such as City, State and more.  Supports all major countries.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return ResponseEntity&lt;ValidatePostalCodeResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ValidatePostalCodeResponse> addressValidatePostalCodeWithHttpInfo(ValidatePostalCodeRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressValidatePostalCode");
        }
        
        String path = apiClient.expandPath("/validate/address/postal-code", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ValidatePostalCodeResponse> returnType = new ParameterizedTypeReference<ValidatePostalCodeResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a state or province, name or abbreviation, get location information about it
     * Checks if the input state name or code is valid, and returns information about it such as normalized State name and more.  Supports all major countries.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return ValidateStateResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ValidateStateResponse addressValidateState(ValidateStateRequest input) throws RestClientException {
        return addressValidateStateWithHttpInfo(input).getBody();
    }

    /**
     * Validate a state or province, name or abbreviation, get location information about it
     * Checks if the input state name or code is valid, and returns information about it such as normalized State name and more.  Supports all major countries.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return ResponseEntity&lt;ValidateStateResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ValidateStateResponse> addressValidateStateWithHttpInfo(ValidateStateRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressValidateState");
        }
        
        String path = apiClient.expandPath("/validate/address/state", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ValidateStateResponse> returnType = new ParameterizedTypeReference<ValidateStateResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
