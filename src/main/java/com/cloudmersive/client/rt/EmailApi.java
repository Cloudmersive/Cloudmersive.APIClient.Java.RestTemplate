package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.AddressGetServersResponse;
import com.cloudmersive.client.rt.model.AddressVerifySyntaxOnlyResponse;
import com.cloudmersive.client.rt.model.FullEmailValidationResponse;

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
@Component("com.cloudmersive.client.rt.EmailApi")
public class EmailApi {
    private ApiClient apiClient;

    public EmailApi() {
        this(new ApiClient());
    }

    @Autowired
    public EmailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Partially check whether an email address is valid
     * Validate an email address by identifying whether its parent domain has email servers defined.  This call is less limited than syntaxOnly but not as comprehensive as address/full.
     * <p><b>200</b> - OK
     * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. (required)
     * @return AddressGetServersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AddressGetServersResponse emailAddressGetServers(String email) throws RestClientException {
        return emailAddressGetServersWithHttpInfo(email).getBody();
    }

    /**
     * Partially check whether an email address is valid
     * Validate an email address by identifying whether its parent domain has email servers defined.  This call is less limited than syntaxOnly but not as comprehensive as address/full.
     * <p><b>200</b> - OK
     * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. (required)
     * @return ResponseEntity&lt;AddressGetServersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AddressGetServersResponse> emailAddressGetServersWithHttpInfo(String email) throws RestClientException {
        Object postBody = email;
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'email' when calling emailAddressGetServers");
        }
        
        String path = apiClient.expandPath("/validate/email/address/servers", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<AddressGetServersResponse> returnType = new ParameterizedTypeReference<AddressGetServersResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Fully validate an email address
     * Performs a full validation of the email address.  Checks for syntactic correctness, identifies the mail server in question if any, and then contacts the email server to validate the existence of the account - without sending any emails.
     * <p><b>200</b> - OK
     * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. (required)
     * @return FullEmailValidationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FullEmailValidationResponse emailFullValidation(String email) throws RestClientException {
        return emailFullValidationWithHttpInfo(email).getBody();
    }

    /**
     * Fully validate an email address
     * Performs a full validation of the email address.  Checks for syntactic correctness, identifies the mail server in question if any, and then contacts the email server to validate the existence of the account - without sending any emails.
     * <p><b>200</b> - OK
     * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. (required)
     * @return ResponseEntity&lt;FullEmailValidationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FullEmailValidationResponse> emailFullValidationWithHttpInfo(String email) throws RestClientException {
        Object postBody = email;
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'email' when calling emailFullValidation");
        }
        
        String path = apiClient.expandPath("/validate/email/address/full", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<FullEmailValidationResponse> returnType = new ParameterizedTypeReference<FullEmailValidationResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate email adddress for syntactic correctness only
     * Validate whether a given email address is syntactically correct via a limited local-only check.  Use the address/full API to do a full validation.
     * <p><b>200</b> - OK
     * @param value Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. (required)
     * @return AddressVerifySyntaxOnlyResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AddressVerifySyntaxOnlyResponse emailPost(String value) throws RestClientException {
        return emailPostWithHttpInfo(value).getBody();
    }

    /**
     * Validate email adddress for syntactic correctness only
     * Validate whether a given email address is syntactically correct via a limited local-only check.  Use the address/full API to do a full validation.
     * <p><b>200</b> - OK
     * @param value Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. (required)
     * @return ResponseEntity&lt;AddressVerifySyntaxOnlyResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AddressVerifySyntaxOnlyResponse> emailPostWithHttpInfo(String value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling emailPost");
        }
        
        String path = apiClient.expandPath("/validate/email/address/syntaxOnly", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<AddressVerifySyntaxOnlyResponse> returnType = new ParameterizedTypeReference<AddressVerifySyntaxOnlyResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
