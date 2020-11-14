package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.XssProtectionResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:47:06.593-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.TextInputApi")
public class TextInputApi {
    private ApiClient apiClient;

    public TextInputApi() {
        this(new ApiClient());
    }

    @Autowired
    public TextInputApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Check text input for Cross-Site-Scripting (XSS) attacks
     * Detects XSS (Cross-Site-Scripting) attacks from text input.
     * <p><b>200</b> - OK
     * @param value User-facing text input. (required)
     * @return XssProtectionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XssProtectionResult textInputCheckXss(String value) throws RestClientException {
        return textInputCheckXssWithHttpInfo(value).getBody();
    }

    /**
     * Check text input for Cross-Site-Scripting (XSS) attacks
     * Detects XSS (Cross-Site-Scripting) attacks from text input.
     * <p><b>200</b> - OK
     * @param value User-facing text input. (required)
     * @return ResponseEntity&lt;XssProtectionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XssProtectionResult> textInputCheckXssWithHttpInfo(String value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputCheckXss");
        }
        
        String path = apiClient.expandPath("/validate/text-input/check/xss", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<XssProtectionResult> returnType = new ParameterizedTypeReference<XssProtectionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Protect text input from Cross-Site-Scripting (XSS) attacks through normalization
     * Detects and removes XSS (Cross-Site-Scripting) attacks from text input through normalization.  Returns the normalized result, as well as information on whether the original input contained an XSS risk.
     * <p><b>200</b> - OK
     * @param value User-facing text input. (required)
     * @return XssProtectionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XssProtectionResult textInputProtectXss(String value) throws RestClientException {
        return textInputProtectXssWithHttpInfo(value).getBody();
    }

    /**
     * Protect text input from Cross-Site-Scripting (XSS) attacks through normalization
     * Detects and removes XSS (Cross-Site-Scripting) attacks from text input through normalization.  Returns the normalized result, as well as information on whether the original input contained an XSS risk.
     * <p><b>200</b> - OK
     * @param value User-facing text input. (required)
     * @return ResponseEntity&lt;XssProtectionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XssProtectionResult> textInputProtectXssWithHttpInfo(String value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputProtectXss");
        }
        
        String path = apiClient.expandPath("/validate/text-input/protect/xss", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<XssProtectionResult> returnType = new ParameterizedTypeReference<XssProtectionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
