package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import com.cloudmersive.client.model.GetWordsRequest;
import com.cloudmersive.client.model.GetWordsResponse;
import com.cloudmersive.client.model.SentenceSegmentationRequest;
import com.cloudmersive.client.model.SentenceSegmentationResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:19.446-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.SegmentationApi")
public class SegmentationApi {
    private ApiClient apiClient;

    public SegmentationApi() {
        this(new ApiClient());
    }

    @Autowired
    public SegmentationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Extract sentences from string
     * Segment an input string into separate sentences, output result as a string.
     * <p><b>200</b> - OK
     * @param input Input string (required)
     * @return SentenceSegmentationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SentenceSegmentationResponse segmentationGetSentences(SentenceSegmentationRequest input) throws RestClientException {
        return segmentationGetSentencesWithHttpInfo(input).getBody();
    }

    /**
     * Extract sentences from string
     * Segment an input string into separate sentences, output result as a string.
     * <p><b>200</b> - OK
     * @param input Input string (required)
     * @return ResponseEntity&lt;SentenceSegmentationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SentenceSegmentationResponse> segmentationGetSentencesWithHttpInfo(SentenceSegmentationRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling segmentationGetSentences");
        }
        
        String path = apiClient.expandPath("/nlp-v2/segmentation/sentences", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<SentenceSegmentationResponse> returnType = new ParameterizedTypeReference<SentenceSegmentationResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get words in input string
     * Get the component words in an input string
     * <p><b>200</b> - OK
     * @param input String to process (required)
     * @return GetWordsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetWordsResponse segmentationGetWords(GetWordsRequest input) throws RestClientException {
        return segmentationGetWordsWithHttpInfo(input).getBody();
    }

    /**
     * Get words in input string
     * Get the component words in an input string
     * <p><b>200</b> - OK
     * @param input String to process (required)
     * @return ResponseEntity&lt;GetWordsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetWordsResponse> segmentationGetWordsWithHttpInfo(GetWordsRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling segmentationGetWords");
        }
        
        String path = apiClient.expandPath("/nlp-v2/segmentation/words", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<GetWordsResponse> returnType = new ParameterizedTypeReference<GetWordsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
