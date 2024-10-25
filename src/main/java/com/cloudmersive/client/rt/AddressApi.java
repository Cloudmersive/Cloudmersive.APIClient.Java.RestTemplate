package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import com.cloudmersive.client.rt.model.CountryListResult;
import com.cloudmersive.client.rt.model.GetTimezonesRequest;
import com.cloudmersive.client.rt.model.GetTimezonesResponse;
import com.cloudmersive.client.rt.model.NormalizeAddressResponse;
import com.cloudmersive.client.rt.model.ParseAddressRequest;
import com.cloudmersive.client.rt.model.ParseAddressResponse;
import com.cloudmersive.client.rt.model.ReverseGeocodeAddressRequest;
import com.cloudmersive.client.rt.model.ReverseGeocodeAddressResponse;
import com.cloudmersive.client.rt.model.ValidateAddressRequest;
import com.cloudmersive.client.rt.model.ValidateAddressResponse;
import com.cloudmersive.client.rt.model.ValidateCityRequest;
import com.cloudmersive.client.rt.model.ValidateCityResponse;
import com.cloudmersive.client.rt.model.ValidateCountryRequest;
import com.cloudmersive.client.rt.model.ValidateCountryResponse;
import com.cloudmersive.client.rt.model.ValidatePostalCodeRequest;
import com.cloudmersive.client.rt.model.ValidatePostalCodeResponse;
import com.cloudmersive.client.rt.model.ValidateStateRequest;
import com.cloudmersive.client.rt.model.ValidateStateResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:50:42.486016Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AddressApi extends BaseApi {

    public AddressApi() {
        super(new ApiClient());
    }

    public AddressApi(ApiClient apiClient) {
        super(apiClient);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressCheckEUMembership");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ValidateCountryResponse> localReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return apiClient.invokeAPI("/validate/address/country/check-eu-membership", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressCountry");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ValidateCountryResponse> localReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return apiClient.invokeAPI("/validate/address/country", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CountryListResult> localReturnType = new ParameterizedTypeReference<CountryListResult>() {};
        return apiClient.invokeAPI("/validate/address/country/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressGeocode");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ValidateAddressResponse> localReturnType = new ParameterizedTypeReference<ValidateAddressResponse>() {};
        return apiClient.invokeAPI("/validate/address/geocode", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressGetCountryCurrency");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ValidateCountryResponse> localReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return apiClient.invokeAPI("/validate/address/country/get-currency", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressGetCountryRegion");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ValidateCountryResponse> localReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return apiClient.invokeAPI("/validate/address/country/get-region", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressGetTimezone");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<GetTimezonesResponse> localReturnType = new ParameterizedTypeReference<GetTimezonesResponse>() {};
        return apiClient.invokeAPI("/validate/address/country/get-timezones", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Normalize a street address
     * Normalizes an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.  Supports all major international addresses.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return NormalizeAddressResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NormalizeAddressResponse addressNormalizeAddress(ValidateAddressRequest input) throws RestClientException {
        return addressNormalizeAddressWithHttpInfo(input).getBody();
    }

    /**
     * Normalize a street address
     * Normalizes an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.  Supports all major international addresses.
     * <p><b>200</b> - OK
     * @param input Input parse request (required)
     * @return ResponseEntity&lt;NormalizeAddressResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NormalizeAddressResponse> addressNormalizeAddressWithHttpInfo(ValidateAddressRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressNormalizeAddress");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<NormalizeAddressResponse> localReturnType = new ParameterizedTypeReference<NormalizeAddressResponse>() {};
        return apiClient.invokeAPI("/validate/address/street-address/normalize", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressParseString");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ParseAddressResponse> localReturnType = new ParameterizedTypeReference<ParseAddressResponse>() {};
        return apiClient.invokeAPI("/validate/address/parse", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressReverseGeocodeAddress");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ReverseGeocodeAddressResponse> localReturnType = new ParameterizedTypeReference<ReverseGeocodeAddressResponse>() {};
        return apiClient.invokeAPI("/validate/address/geocode/reverse", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressValidateAddress");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ValidateAddressResponse> localReturnType = new ParameterizedTypeReference<ValidateAddressResponse>() {};
        return apiClient.invokeAPI("/validate/address/street-address", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressValidateCity");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ValidateCityResponse> localReturnType = new ParameterizedTypeReference<ValidateCityResponse>() {};
        return apiClient.invokeAPI("/validate/address/city", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressValidatePostalCode");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ValidatePostalCodeResponse> localReturnType = new ParameterizedTypeReference<ValidatePostalCodeResponse>() {};
        return apiClient.invokeAPI("/validate/address/postal-code", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling addressValidateState");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ValidateStateResponse> localReturnType = new ParameterizedTypeReference<ValidateStateResponse>() {};
        return apiClient.invokeAPI("/validate/address/state", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
