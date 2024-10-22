package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:15:48.283468600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TextInputApi extends BaseApi {

    public TextInputApi() {
        super(new ApiClient());
    }

    public TextInputApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Protect html input from Server-side Request Forgery (SSRF) attacks
     * Detects SSRF (Server-side request forgery) attacks and unsafe URL attacks from HTML text input, where attackers can attempt to access unsafe local or network paths in the server environment by injecting them into HTML.
     * <p><b>200</b> - OK
     * @param value User-facing HTML input. (required)
     * @param allowCidScheme Optional: Set to true to allow cid: scheme URLs for email message attachments.  Default is false. (optional)
     * @return HtmlSsrfDetectionResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public HtmlSsrfDetectionResult textInputCheckHtmlSsrf(String value, Boolean allowCidScheme) throws RestClientException {
        return textInputCheckHtmlSsrfWithHttpInfo(value, allowCidScheme).getBody();
    }

    /**
     * Protect html input from Server-side Request Forgery (SSRF) attacks
     * Detects SSRF (Server-side request forgery) attacks and unsafe URL attacks from HTML text input, where attackers can attempt to access unsafe local or network paths in the server environment by injecting them into HTML.
     * <p><b>200</b> - OK
     * @param value User-facing HTML input. (required)
     * @param allowCidScheme Optional: Set to true to allow cid: scheme URLs for email message attachments.  Default is false. (optional)
     * @return ResponseEntity&lt;HtmlSsrfDetectionResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<HtmlSsrfDetectionResult> textInputCheckHtmlSsrfWithHttpInfo(String value, Boolean allowCidScheme) throws RestClientException {
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputCheckHtmlSsrf");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (allowCidScheme != null)
        localVarHeaderParams.add("allowCidScheme", apiClient.parameterToString(allowCidScheme));

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<HtmlSsrfDetectionResult> localReturnType = new ParameterizedTypeReference<HtmlSsrfDetectionResult>() {};
        return apiClient.invokeAPI("/validate/text-input/html/check/ssrf", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputCheckSqlInjection");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (detectionLevel != null)
        localVarHeaderParams.add("detectionLevel", apiClient.parameterToString(detectionLevel));

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SqlInjectionDetectionResult> localReturnType = new ParameterizedTypeReference<SqlInjectionDetectionResult>() {};
        return apiClient.invokeAPI("/validate/text-input/check/sql-injection", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputCheckSqlInjectionBatch");
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

        ParameterizedTypeReference<SqlInjectionCheckBatchResponse> localReturnType = new ParameterizedTypeReference<SqlInjectionCheckBatchResponse>() {};
        return apiClient.invokeAPI("/validate/text-input/check/sql-injection/batch", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputCheckXss");
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

        ParameterizedTypeReference<XssProtectionResult> localReturnType = new ParameterizedTypeReference<XssProtectionResult>() {};
        return apiClient.invokeAPI("/validate/text-input/check/xss", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputCheckXssBatch");
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

        ParameterizedTypeReference<XssProtectionBatchResponse> localReturnType = new ParameterizedTypeReference<XssProtectionBatchResponse>() {};
        return apiClient.invokeAPI("/validate/text-input/check-and-protect/xss/batch", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputCheckXxe");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (allowInternetUrls != null)
        localVarHeaderParams.add("allowInternetUrls", apiClient.parameterToString(allowInternetUrls));
        if (knownSafeUrls != null)
        localVarHeaderParams.add("knownSafeUrls", apiClient.parameterToString(knownSafeUrls));
        if (knownUnsafeUrls != null)
        localVarHeaderParams.add("knownUnsafeUrls", apiClient.parameterToString(knownUnsafeUrls));

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XxeDetectionResult> localReturnType = new ParameterizedTypeReference<XxeDetectionResult>() {};
        return apiClient.invokeAPI("/validate/text-input/check/xxe", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling textInputCheckXxeBatch");
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

        ParameterizedTypeReference<XxeDetectionBatchResponse> localReturnType = new ParameterizedTypeReference<XxeDetectionBatchResponse>() {};
        return apiClient.invokeAPI("/validate/text-input/check/xxe/batch", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling textInputProtectXss");
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

        ParameterizedTypeReference<XssProtectionResult> localReturnType = new ParameterizedTypeReference<XssProtectionResult>() {};
        return apiClient.invokeAPI("/validate/text-input/protect/xss", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
