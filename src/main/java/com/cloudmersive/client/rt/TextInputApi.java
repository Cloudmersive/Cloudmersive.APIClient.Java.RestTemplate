package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.HtmlSsrfDetectionResult;
import com.cloudmersive.client.rt.model.SqlInjectionCheckBatchRequest;
import com.cloudmersive.client.rt.model.SqlInjectionCheckBatchResponse;
import com.cloudmersive.client.rt.model.SqlInjectionDetectionResult;
import com.cloudmersive.client.rt.model.XssProtectionBatchRequest;
import com.cloudmersive.client.rt.model.XssProtectionBatchResponse;
import com.cloudmersive.client.rt.model.XssProtectionResult;
import com.cloudmersive.client.rt.model.XxeDetectionBatchRequest;
import com.cloudmersive.client.rt.model.XxeDetectionBatchResponse;
import com.cloudmersive.client.rt.model.XxeDetectionResult;

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
     * Protect html input from Server-side Request Forgery (SSRF) attacks
     * Detects SSRF (Server-side request forgery) attacks and unsafe URL attacks from HTML text input, where attackers can attempt to access unsafe local or network paths in the server environment by injecting them into HTML.
     * <p><b>200</b> - OK
     * @param value User-facing HTML input. (required)
     * @return HtmlSsrfDetectionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public HtmlSsrfDetectionResult textInputCheckHtmlSsrf(String value) throws RestClientException {
        return textInputCheckHtmlSsrfWithHttpInfo(value).getBody();
    }

    /**
     * Protect html input from Server-side Request Forgery (SSRF) attacks
     * Detects SSRF (Server-side request forgery) attacks and unsafe URL attacks from HTML text input, where attackers can attempt to access unsafe local or network paths in the server environment by injecting them into HTML.
     * <p><b>200</b> - OK
     * @param value User-facing HTML input. (required)
     * @return ResponseEntity&lt;HtmlSsrfDetectionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<HtmlSsrfDetectionResult> textInputCheckHtmlSsrfWithHttpInfo(String value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputCheckHtmlSsrf");
        }
        
        String path = apiClient.expandPath("/validate/text-input/html/check/ssrf", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<HtmlSsrfDetectionResult> returnType = new ParameterizedTypeReference<HtmlSsrfDetectionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Check text input for SQL Injection (SQLI) attacks
     * Detects SQL Injection (SQLI) attacks from text input.
     * <p><b>200</b> - OK
     * @param value User-facing text input. (required)
     * @param detectionLevel Set to Normal to target a high-security SQL Injection detection level with a very low false positive rate; select High to target a very-high security SQL Injection detection level with higher false positives.  Default is Normal (recommended). (optional)
     * @return SqlInjectionDetectionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SqlInjectionDetectionResult textInputCheckSqlInjection(String value, String detectionLevel) throws RestClientException {
        return textInputCheckSqlInjectionWithHttpInfo(value, detectionLevel).getBody();
    }

    /**
     * Check text input for SQL Injection (SQLI) attacks
     * Detects SQL Injection (SQLI) attacks from text input.
     * <p><b>200</b> - OK
     * @param value User-facing text input. (required)
     * @param detectionLevel Set to Normal to target a high-security SQL Injection detection level with a very low false positive rate; select High to target a very-high security SQL Injection detection level with higher false positives.  Default is Normal (recommended). (optional)
     * @return ResponseEntity&lt;SqlInjectionDetectionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SqlInjectionDetectionResult> textInputCheckSqlInjectionWithHttpInfo(String value, String detectionLevel) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputCheckSqlInjection");
        }
        
        String path = apiClient.expandPath("/validate/text-input/check/sql-injection", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (detectionLevel != null)
        headerParams.add("detectionLevel", apiClient.parameterToString(detectionLevel));

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SqlInjectionDetectionResult> returnType = new ParameterizedTypeReference<SqlInjectionDetectionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Check and protect multiple text inputs for SQL Injection (SQLI) attacks in batch
     * Detects SQL Injection (SQLI) attacks from multiple text inputs.  Output preverses order of input items.
     * <p><b>200</b> - OK
     * @param value User-facing text input. (required)
     * @return SqlInjectionCheckBatchResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SqlInjectionCheckBatchResponse textInputCheckSqlInjectionBatch(SqlInjectionCheckBatchRequest value) throws RestClientException {
        return textInputCheckSqlInjectionBatchWithHttpInfo(value).getBody();
    }

    /**
     * Check and protect multiple text inputs for SQL Injection (SQLI) attacks in batch
     * Detects SQL Injection (SQLI) attacks from multiple text inputs.  Output preverses order of input items.
     * <p><b>200</b> - OK
     * @param value User-facing text input. (required)
     * @return ResponseEntity&lt;SqlInjectionCheckBatchResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SqlInjectionCheckBatchResponse> textInputCheckSqlInjectionBatchWithHttpInfo(SqlInjectionCheckBatchRequest value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputCheckSqlInjectionBatch");
        }
        
        String path = apiClient.expandPath("/validate/text-input/check/sql-injection/batch", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<SqlInjectionCheckBatchResponse> returnType = new ParameterizedTypeReference<SqlInjectionCheckBatchResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
     * Check and protect multiple text inputs for Cross-Site-Scripting (XSS) attacks in batch
     * Detects XSS (Cross-Site-Scripting) attacks from multiple text inputs.  Output preverses order of input items.
     * <p><b>200</b> - OK
     * @param value User-facing text input. (required)
     * @return XssProtectionBatchResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XssProtectionBatchResponse textInputCheckXssBatch(XssProtectionBatchRequest value) throws RestClientException {
        return textInputCheckXssBatchWithHttpInfo(value).getBody();
    }

    /**
     * Check and protect multiple text inputs for Cross-Site-Scripting (XSS) attacks in batch
     * Detects XSS (Cross-Site-Scripting) attacks from multiple text inputs.  Output preverses order of input items.
     * <p><b>200</b> - OK
     * @param value User-facing text input. (required)
     * @return ResponseEntity&lt;XssProtectionBatchResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XssProtectionBatchResponse> textInputCheckXssBatchWithHttpInfo(XssProtectionBatchRequest value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputCheckXssBatch");
        }
        
        String path = apiClient.expandPath("/validate/text-input/check-and-protect/xss/batch", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<XssProtectionBatchResponse> returnType = new ParameterizedTypeReference<XssProtectionBatchResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Protect text input from XML External Entity (XXE) attacks
     * Detects XXE (XML External Entity) attacks from text input.
     * <p><b>200</b> - OK
     * @param value User-facing text input. (required)
     * @param allowInternetUrls Optional: Set to true to allow Internet-based dependency URLs for DTDs and other XML External Entitites, set to false to block.  Default is false. (optional)
     * @param knownSafeUrls Optional: Comma separated list of fully-qualified URLs that will automatically be considered safe. (optional)
     * @param knownUnsafeUrls Optional: Comma separated list of fully-qualified URLs that will automatically be considered unsafe. (optional)
     * @return XxeDetectionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XxeDetectionResult textInputCheckXxe(String value, Boolean allowInternetUrls, String knownSafeUrls, String knownUnsafeUrls) throws RestClientException {
        return textInputCheckXxeWithHttpInfo(value, allowInternetUrls, knownSafeUrls, knownUnsafeUrls).getBody();
    }

    /**
     * Protect text input from XML External Entity (XXE) attacks
     * Detects XXE (XML External Entity) attacks from text input.
     * <p><b>200</b> - OK
     * @param value User-facing text input. (required)
     * @param allowInternetUrls Optional: Set to true to allow Internet-based dependency URLs for DTDs and other XML External Entitites, set to false to block.  Default is false. (optional)
     * @param knownSafeUrls Optional: Comma separated list of fully-qualified URLs that will automatically be considered safe. (optional)
     * @param knownUnsafeUrls Optional: Comma separated list of fully-qualified URLs that will automatically be considered unsafe. (optional)
     * @return ResponseEntity&lt;XxeDetectionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XxeDetectionResult> textInputCheckXxeWithHttpInfo(String value, Boolean allowInternetUrls, String knownSafeUrls, String knownUnsafeUrls) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputCheckXxe");
        }
        
        String path = apiClient.expandPath("/validate/text-input/check/xxe", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (allowInternetUrls != null)
        headerParams.add("allowInternetUrls", apiClient.parameterToString(allowInternetUrls));
        if (knownSafeUrls != null)
        headerParams.add("knownSafeUrls", apiClient.parameterToString(knownSafeUrls));
        if (knownUnsafeUrls != null)
        headerParams.add("knownUnsafeUrls", apiClient.parameterToString(knownUnsafeUrls));

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XxeDetectionResult> returnType = new ParameterizedTypeReference<XxeDetectionResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Protect text input from XML External Entity (XXE) attacks
     * Detects XXE (XML External Entity) attacks from text input.
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return XxeDetectionBatchResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public XxeDetectionBatchResponse textInputCheckXxeBatch(XxeDetectionBatchRequest request) throws RestClientException {
        return textInputCheckXxeBatchWithHttpInfo(request).getBody();
    }

    /**
     * Protect text input from XML External Entity (XXE) attacks
     * Detects XXE (XML External Entity) attacks from text input.
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return ResponseEntity&lt;XxeDetectionBatchResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XxeDetectionBatchResponse> textInputCheckXxeBatchWithHttpInfo(XxeDetectionBatchRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling textInputCheckXxeBatch");
        }
        
        String path = apiClient.expandPath("/validate/text-input/check/xxe/batch", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<XxeDetectionBatchResponse> returnType = new ParameterizedTypeReference<XxeDetectionBatchResponse>() {};
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
