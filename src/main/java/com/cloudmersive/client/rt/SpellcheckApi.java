package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.CheckSentenceRequest;
import com.cloudmersive.client.rt.model.CheckSentenceResponse;
import com.cloudmersive.client.rt.model.CheckWordRequest;
import com.cloudmersive.client.rt.model.CheckWordResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:53:00.734-07:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.SpellcheckApi")
public class SpellcheckApi {
    private ApiClient apiClient;

    public SpellcheckApi() {
        this(new ApiClient());
    }

    @Autowired
    public SpellcheckApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Check if sentence is spelled correctly
     * Checks whether the sentence is spelled correctly and returns the result as JSON
     * <p><b>200</b> - OK
     * @param value Input sentence (required)
     * @return CheckSentenceResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CheckSentenceResponse spellcheckCheckSentence(CheckSentenceRequest value) throws RestClientException {
        return spellcheckCheckSentenceWithHttpInfo(value).getBody();
    }

    /**
     * Check if sentence is spelled correctly
     * Checks whether the sentence is spelled correctly and returns the result as JSON
     * <p><b>200</b> - OK
     * @param value Input sentence (required)
     * @return ResponseEntity&lt;CheckSentenceResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CheckSentenceResponse> spellcheckCheckSentenceWithHttpInfo(CheckSentenceRequest value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling spellcheckCheckSentence");
        }
        
        String path = apiClient.expandPath("/nlp-v2/spellcheck/check/sentence", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CheckSentenceResponse> returnType = new ParameterizedTypeReference<CheckSentenceResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Find spelling corrections
     * Find spelling correction suggestions and return result as JSON
     * <p><b>200</b> - OK
     * @param value Input string (required)
     * @return CheckWordResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CheckWordResponse spellcheckCorrectJson(CheckWordRequest value) throws RestClientException {
        return spellcheckCorrectJsonWithHttpInfo(value).getBody();
    }

    /**
     * Find spelling corrections
     * Find spelling correction suggestions and return result as JSON
     * <p><b>200</b> - OK
     * @param value Input string (required)
     * @return ResponseEntity&lt;CheckWordResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CheckWordResponse> spellcheckCorrectJsonWithHttpInfo(CheckWordRequest value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling spellcheckCorrectJson");
        }
        
        String path = apiClient.expandPath("/nlp-v2/spellcheck/check/word", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CheckWordResponse> returnType = new ParameterizedTypeReference<CheckWordResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
