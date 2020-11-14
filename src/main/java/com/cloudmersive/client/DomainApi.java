package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import com.cloudmersive.client.model.CheckResponse;
import com.cloudmersive.client.model.DomainQualityResponse;
import com.cloudmersive.client.model.ValidateUrlRequestFull;
import com.cloudmersive.client.model.ValidateUrlRequestSyntaxOnly;
import com.cloudmersive.client.model.ValidateUrlResponseFull;
import com.cloudmersive.client.model.ValidateUrlResponseSyntaxOnly;
import com.cloudmersive.client.model.WhoisResponse;

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
@Component("com.cloudmersive.client.DomainApi")
public class DomainApi {
    private ApiClient apiClient;

    public DomainApi() {
        this(new ApiClient());
    }

    @Autowired
    public DomainApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Validate a domain name
     * Check whether a domain name is valid or not.  API performs a live validation by contacting DNS services to validate the existence of the domain name.
     * <p><b>200</b> - OK
     * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return CheckResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CheckResponse domainCheck(String domain) throws RestClientException {
        return domainCheckWithHttpInfo(domain).getBody();
    }

    /**
     * Validate a domain name
     * Check whether a domain name is valid or not.  API performs a live validation by contacting DNS services to validate the existence of the domain name.
     * <p><b>200</b> - OK
     * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return ResponseEntity&lt;CheckResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CheckResponse> domainCheckWithHttpInfo(String domain) throws RestClientException {
        Object postBody = domain;
        
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domain' when calling domainCheck");
        }
        
        String path = apiClient.expandPath("/validate/domain/check", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<CheckResponse> returnType = new ParameterizedTypeReference<CheckResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get WHOIS information for a domain
     * Validate whether a domain name exists, and also return the full WHOIS record for that domain name.  WHOIS records include all the registration details of the domain name, such as information about the domain&#39;s owners.
     * <p><b>200</b> - OK
     * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.   The input is a string so be sure to enclose it in double-quotes. (required)
     * @return WhoisResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WhoisResponse domainPost(String domain) throws RestClientException {
        return domainPostWithHttpInfo(domain).getBody();
    }

    /**
     * Get WHOIS information for a domain
     * Validate whether a domain name exists, and also return the full WHOIS record for that domain name.  WHOIS records include all the registration details of the domain name, such as information about the domain&#39;s owners.
     * <p><b>200</b> - OK
     * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.   The input is a string so be sure to enclose it in double-quotes. (required)
     * @return ResponseEntity&lt;WhoisResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<WhoisResponse> domainPostWithHttpInfo(String domain) throws RestClientException {
        Object postBody = domain;
        
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domain' when calling domainPost");
        }
        
        String path = apiClient.expandPath("/validate/domain/whois", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<WhoisResponse> returnType = new ParameterizedTypeReference<WhoisResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a domain name&#39;s quality score
     * Check the quality of a domain name.  Supports over 9 million domain names.  Higher quality scores indicate more trust and authority in the domain name, with values ranging from 0.0 (low quality) to 10.0 (maximum quality).
     * <p><b>200</b> - OK
     * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;. (required)
     * @return DomainQualityResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DomainQualityResponse domainQualityScore(String domain) throws RestClientException {
        return domainQualityScoreWithHttpInfo(domain).getBody();
    }

    /**
     * Validate a domain name&#39;s quality score
     * Check the quality of a domain name.  Supports over 9 million domain names.  Higher quality scores indicate more trust and authority in the domain name, with values ranging from 0.0 (low quality) to 10.0 (maximum quality).
     * <p><b>200</b> - OK
     * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;. (required)
     * @return ResponseEntity&lt;DomainQualityResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DomainQualityResponse> domainQualityScoreWithHttpInfo(String domain) throws RestClientException {
        Object postBody = domain;
        
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domain' when calling domainQualityScore");
        }
        
        String path = apiClient.expandPath("/validate/domain/quality-score", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<DomainQualityResponse> returnType = new ParameterizedTypeReference<DomainQualityResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a URL fully
     * Validate whether a URL is syntactically valid (does not check endpoint for validity), whether it exists, and whether the endpoint is up and passes virus scan checks.  Accepts various types of input and produces a well-formed URL as output.
     * <p><b>200</b> - OK
     * @param request Input URL request (required)
     * @return ValidateUrlResponseFull
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ValidateUrlResponseFull domainUrlFull(ValidateUrlRequestFull request) throws RestClientException {
        return domainUrlFullWithHttpInfo(request).getBody();
    }

    /**
     * Validate a URL fully
     * Validate whether a URL is syntactically valid (does not check endpoint for validity), whether it exists, and whether the endpoint is up and passes virus scan checks.  Accepts various types of input and produces a well-formed URL as output.
     * <p><b>200</b> - OK
     * @param request Input URL request (required)
     * @return ResponseEntity&lt;ValidateUrlResponseFull&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ValidateUrlResponseFull> domainUrlFullWithHttpInfo(ValidateUrlRequestFull request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling domainUrlFull");
        }
        
        String path = apiClient.expandPath("/validate/domain/url/full", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ValidateUrlResponseFull> returnType = new ParameterizedTypeReference<ValidateUrlResponseFull>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Validate a URL syntactically
     * Validate whether a URL is syntactically valid (does not check endpoint for validity).  Accepts various types of input and produces a well-formed URL as output.
     * <p><b>200</b> - OK
     * @param request Input URL information (required)
     * @return ValidateUrlResponseSyntaxOnly
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ValidateUrlResponseSyntaxOnly domainUrlSyntaxOnly(ValidateUrlRequestSyntaxOnly request) throws RestClientException {
        return domainUrlSyntaxOnlyWithHttpInfo(request).getBody();
    }

    /**
     * Validate a URL syntactically
     * Validate whether a URL is syntactically valid (does not check endpoint for validity).  Accepts various types of input and produces a well-formed URL as output.
     * <p><b>200</b> - OK
     * @param request Input URL information (required)
     * @return ResponseEntity&lt;ValidateUrlResponseSyntaxOnly&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ValidateUrlResponseSyntaxOnly> domainUrlSyntaxOnlyWithHttpInfo(ValidateUrlRequestSyntaxOnly request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling domainUrlSyntaxOnly");
        }
        
        String path = apiClient.expandPath("/validate/domain/url/syntax-only", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly> returnType = new ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
