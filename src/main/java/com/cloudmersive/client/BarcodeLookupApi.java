package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import com.cloudmersive.client.model.BarcodeLookupResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:24.067-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.BarcodeLookupApi")
public class BarcodeLookupApi {
    private ApiClient apiClient;

    public BarcodeLookupApi() {
        this(new ApiClient());
    }

    @Autowired
    public BarcodeLookupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Lookup EAN barcode value, return product data
     * Lookup an input EAN barcode and return key details about the product
     * <p><b>200</b> - OK
     * @param value Barcode value (required)
     * @return BarcodeLookupResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BarcodeLookupResponse barcodeLookupEanLookup(String value) throws RestClientException {
        return barcodeLookupEanLookupWithHttpInfo(value).getBody();
    }

    /**
     * Lookup EAN barcode value, return product data
     * Lookup an input EAN barcode and return key details about the product
     * <p><b>200</b> - OK
     * @param value Barcode value (required)
     * @return ResponseEntity&lt;BarcodeLookupResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BarcodeLookupResponse> barcodeLookupEanLookupWithHttpInfo(String value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling barcodeLookupEanLookup");
        }
        
        String path = apiClient.expandPath("/barcode/lookup/ean", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<BarcodeLookupResponse> returnType = new ParameterizedTypeReference<BarcodeLookupResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
