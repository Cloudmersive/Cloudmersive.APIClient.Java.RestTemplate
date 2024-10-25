package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import com.cloudmersive.client.rt.model.CheckResponse;
import com.cloudmersive.client.rt.model.DomainQualityResponse;
import com.cloudmersive.client.rt.model.IsAdminPathResponse;
import com.cloudmersive.client.rt.model.PhishingCheckRequest;
import com.cloudmersive.client.rt.model.PhishingCheckResponse;
import com.cloudmersive.client.rt.model.UrlHtmlSsrfRequestFull;
import com.cloudmersive.client.rt.model.UrlHtmlSsrfResponseFull;
import com.cloudmersive.client.rt.model.UrlSafetyCheckRequestFull;
import com.cloudmersive.client.rt.model.UrlSafetyCheckResponseFull;
import com.cloudmersive.client.rt.model.UrlSsrfRequestBatch;
import com.cloudmersive.client.rt.model.UrlSsrfRequestFull;
import com.cloudmersive.client.rt.model.UrlSsrfResponseBatch;
import com.cloudmersive.client.rt.model.UrlSsrfResponseFull;
import com.cloudmersive.client.rt.model.ValidateUrlRequestFull;
import com.cloudmersive.client.rt.model.ValidateUrlRequestSyntaxOnly;
import com.cloudmersive.client.rt.model.ValidateUrlResponseFull;
import com.cloudmersive.client.rt.model.ValidateUrlResponseSyntaxOnly;
import com.cloudmersive.client.rt.model.WhoisResponse;

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
public class DomainApi extends BaseApi {

    public DomainApi() {
        super(new ApiClient());
    }

    public DomainApi(ApiClient apiClient) {
        super(apiClient);
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
        Object localVarPostBody = domain;
        
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domain' when calling domainCheck");
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

        ParameterizedTypeReference<CheckResponse> localReturnType = new ParameterizedTypeReference<CheckResponse>() {};
        return apiClient.invokeAPI("/validate/domain/check", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get top-level domain name from URL
     * Gets the top-level domain name from a URL, such as mydomain.com.
     * <p><b>200</b> - OK
     * @param request Input URL information (required)
     * @return ValidateUrlResponseSyntaxOnly
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ValidateUrlResponseSyntaxOnly domainGetTopLevelDomainFromUrl(ValidateUrlRequestSyntaxOnly request) throws RestClientException {
        return domainGetTopLevelDomainFromUrlWithHttpInfo(request).getBody();
    }

    /**
     * Get top-level domain name from URL
     * Gets the top-level domain name from a URL, such as mydomain.com.
     * <p><b>200</b> - OK
     * @param request Input URL information (required)
     * @return ResponseEntity&lt;ValidateUrlResponseSyntaxOnly&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ValidateUrlResponseSyntaxOnly> domainGetTopLevelDomainFromUrlWithHttpInfo(ValidateUrlRequestSyntaxOnly request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling domainGetTopLevelDomainFromUrl");
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

        ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly> localReturnType = new ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly>() {};
        return apiClient.invokeAPI("/validate/domain/url/get-top-level-domain", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check if path is a high-risk or vulnerable server administration path
     * Check if the input URL or relative path is a server Administration Path, and therefore a risk or vulnerability for remote access.
     * <p><b>200</b> - OK
     * @param value URL or relative path to check, e.g. \&quot;/admin/login\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return IsAdminPathResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IsAdminPathResponse domainIsAdminPath(String value) throws RestClientException {
        return domainIsAdminPathWithHttpInfo(value).getBody();
    }

    /**
     * Check if path is a high-risk or vulnerable server administration path
     * Check if the input URL or relative path is a server Administration Path, and therefore a risk or vulnerability for remote access.
     * <p><b>200</b> - OK
     * @param value URL or relative path to check, e.g. \&quot;/admin/login\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return ResponseEntity&lt;IsAdminPathResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IsAdminPathResponse> domainIsAdminPathWithHttpInfo(String value) throws RestClientException {
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling domainIsAdminPath");
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

        ParameterizedTypeReference<IsAdminPathResponse> localReturnType = new ParameterizedTypeReference<IsAdminPathResponse>() {};
        return apiClient.invokeAPI("/validate/domain/url/is-admin-path", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check a URL for Phishing threats
     * Checks if an input URL is at risk of being an Phishing (fake login page, or other page designed to collect information via social engineering) threat or attack.
     * <p><b>200</b> - OK
     * @param request Input URL request (required)
     * @return PhishingCheckResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PhishingCheckResponse domainPhishingCheck(PhishingCheckRequest request) throws RestClientException {
        return domainPhishingCheckWithHttpInfo(request).getBody();
    }

    /**
     * Check a URL for Phishing threats
     * Checks if an input URL is at risk of being an Phishing (fake login page, or other page designed to collect information via social engineering) threat or attack.
     * <p><b>200</b> - OK
     * @param request Input URL request (required)
     * @return ResponseEntity&lt;PhishingCheckResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PhishingCheckResponse> domainPhishingCheckWithHttpInfo(PhishingCheckRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling domainPhishingCheck");
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

        ParameterizedTypeReference<PhishingCheckResponse> localReturnType = new ParameterizedTypeReference<PhishingCheckResponse>() {};
        return apiClient.invokeAPI("/validate/domain/url/phishing-threat-check", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = domain;
        
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domain' when calling domainPost");
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

        ParameterizedTypeReference<WhoisResponse> localReturnType = new ParameterizedTypeReference<WhoisResponse>() {};
        return apiClient.invokeAPI("/validate/domain/whois", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = domain;
        
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domain' when calling domainQualityScore");
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

        ParameterizedTypeReference<DomainQualityResponse> localReturnType = new ParameterizedTypeReference<DomainQualityResponse>() {};
        return apiClient.invokeAPI("/validate/domain/quality-score", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check a URL for safety threats
     * Checks if an input URL is at risk of being a safety threat through malware, unwanted software, or social engineering threats.
     * <p><b>200</b> - OK
     * @param request Input URL request (required)
     * @return UrlSafetyCheckResponseFull
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UrlSafetyCheckResponseFull domainSafetyCheck(UrlSafetyCheckRequestFull request) throws RestClientException {
        return domainSafetyCheckWithHttpInfo(request).getBody();
    }

    /**
     * Check a URL for safety threats
     * Checks if an input URL is at risk of being a safety threat through malware, unwanted software, or social engineering threats.
     * <p><b>200</b> - OK
     * @param request Input URL request (required)
     * @return ResponseEntity&lt;UrlSafetyCheckResponseFull&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UrlSafetyCheckResponseFull> domainSafetyCheckWithHttpInfo(UrlSafetyCheckRequestFull request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling domainSafetyCheck");
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

        ParameterizedTypeReference<UrlSafetyCheckResponseFull> localReturnType = new ParameterizedTypeReference<UrlSafetyCheckResponseFull>() {};
        return apiClient.invokeAPI("/validate/domain/url/safety-threat-check", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check a URL for SSRF threats
     * Checks if an input URL is at risk of being an SSRF (Server-side request forgery) threat or attack.
     * <p><b>200</b> - OK
     * @param request Input URL request (required)
     * @return UrlSsrfResponseFull
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UrlSsrfResponseFull domainSsrfCheck(UrlSsrfRequestFull request) throws RestClientException {
        return domainSsrfCheckWithHttpInfo(request).getBody();
    }

    /**
     * Check a URL for SSRF threats
     * Checks if an input URL is at risk of being an SSRF (Server-side request forgery) threat or attack.
     * <p><b>200</b> - OK
     * @param request Input URL request (required)
     * @return ResponseEntity&lt;UrlSsrfResponseFull&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UrlSsrfResponseFull> domainSsrfCheckWithHttpInfo(UrlSsrfRequestFull request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling domainSsrfCheck");
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

        ParameterizedTypeReference<UrlSsrfResponseFull> localReturnType = new ParameterizedTypeReference<UrlSsrfResponseFull>() {};
        return apiClient.invokeAPI("/validate/domain/url/ssrf-threat-check", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check a URL for SSRF threats in batches
     * Batch-checks if input URLs are at risk of being an SSRF (Server-side request forgery) threat or attack.
     * <p><b>200</b> - OK
     * @param request Input URL request as a batch of multiple URLs (required)
     * @return UrlSsrfResponseBatch
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UrlSsrfResponseBatch domainSsrfCheckBatch(UrlSsrfRequestBatch request) throws RestClientException {
        return domainSsrfCheckBatchWithHttpInfo(request).getBody();
    }

    /**
     * Check a URL for SSRF threats in batches
     * Batch-checks if input URLs are at risk of being an SSRF (Server-side request forgery) threat or attack.
     * <p><b>200</b> - OK
     * @param request Input URL request as a batch of multiple URLs (required)
     * @return ResponseEntity&lt;UrlSsrfResponseBatch&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UrlSsrfResponseBatch> domainSsrfCheckBatchWithHttpInfo(UrlSsrfRequestBatch request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling domainSsrfCheckBatch");
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

        ParameterizedTypeReference<UrlSsrfResponseBatch> localReturnType = new ParameterizedTypeReference<UrlSsrfResponseBatch>() {};
        return apiClient.invokeAPI("/validate/domain/url/ssrf-threat-check/batch", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling domainUrlFull");
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

        ParameterizedTypeReference<ValidateUrlResponseFull> localReturnType = new ParameterizedTypeReference<ValidateUrlResponseFull>() {};
        return apiClient.invokeAPI("/validate/domain/url/full", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check a URL for HTML embedded SSRF threats
     * Checks if an input URL HTML is at risk of containing one or more embedded SSRF (Server-side request forgery) threats or attacks.
     * <p><b>200</b> - OK
     * @param request Input URL request (required)
     * @return UrlHtmlSsrfResponseFull
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UrlHtmlSsrfResponseFull domainUrlHtmlSsrfCheck(UrlHtmlSsrfRequestFull request) throws RestClientException {
        return domainUrlHtmlSsrfCheckWithHttpInfo(request).getBody();
    }

    /**
     * Check a URL for HTML embedded SSRF threats
     * Checks if an input URL HTML is at risk of containing one or more embedded SSRF (Server-side request forgery) threats or attacks.
     * <p><b>200</b> - OK
     * @param request Input URL request (required)
     * @return ResponseEntity&lt;UrlHtmlSsrfResponseFull&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UrlHtmlSsrfResponseFull> domainUrlHtmlSsrfCheckWithHttpInfo(UrlHtmlSsrfRequestFull request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling domainUrlHtmlSsrfCheck");
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

        ParameterizedTypeReference<UrlHtmlSsrfResponseFull> localReturnType = new ParameterizedTypeReference<UrlHtmlSsrfResponseFull>() {};
        return apiClient.invokeAPI("/validate/domain/url/ssrf-threat-check/html-embedded", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling domainUrlSyntaxOnly");
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

        ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly> localReturnType = new ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly>() {};
        return apiClient.invokeAPI("/validate/domain/url/syntax-only", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
