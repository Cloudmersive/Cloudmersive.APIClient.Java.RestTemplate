package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import com.cloudmersive.client.rt.model.GetWordsRequest;
import com.cloudmersive.client.rt.model.GetWordsResponse;
import com.cloudmersive.client.rt.model.SentenceSegmentationRequest;
import com.cloudmersive.client.rt.model.SentenceSegmentationResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:15:58.214933200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SegmentationApi extends BaseApi {

    public SegmentationApi() {
        super(new ApiClient());
    }

    public SegmentationApi(ApiClient apiClient) {
        super(apiClient);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling segmentationGetSentences");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SentenceSegmentationResponse> localReturnType = new ParameterizedTypeReference<SentenceSegmentationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/segmentation/sentences", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling segmentationGetWords");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<GetWordsResponse> localReturnType = new ParameterizedTypeReference<GetWordsResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/segmentation/words", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
