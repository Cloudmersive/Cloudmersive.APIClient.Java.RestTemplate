package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import com.cloudmersive.client.model.PosRequest;
import com.cloudmersive.client.model.PosResponse;

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
@Component("com.cloudmersive.client.PosTaggerApi")
public class PosTaggerApi {
    private ApiClient apiClient;

    public PosTaggerApi() {
        this(new ApiClient());
    }

    @Autowired
    public PosTaggerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Part-of-speech tag a string, filter to adjectives
     * Part-of-speech (POS) tag a string, find the adjectives, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string (required)
     * @return PosResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PosResponse posTaggerTagAdjectives(PosRequest request) throws RestClientException {
        return posTaggerTagAdjectivesWithHttpInfo(request).getBody();
    }

    /**
     * Part-of-speech tag a string, filter to adjectives
     * Part-of-speech (POS) tag a string, find the adjectives, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string (required)
     * @return ResponseEntity&lt;PosResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PosResponse> posTaggerTagAdjectivesWithHttpInfo(PosRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling posTaggerTagAdjectives");
        }
        
        String path = apiClient.expandPath("/nlp-v2/pos/tag/adjectives", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PosResponse> returnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Part-of-speech tag a string, filter to adverbs
     * Part-of-speech (POS) tag a string, find the adverbs, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string (required)
     * @return PosResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PosResponse posTaggerTagAdverbs(PosRequest request) throws RestClientException {
        return posTaggerTagAdverbsWithHttpInfo(request).getBody();
    }

    /**
     * Part-of-speech tag a string, filter to adverbs
     * Part-of-speech (POS) tag a string, find the adverbs, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string (required)
     * @return ResponseEntity&lt;PosResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PosResponse> posTaggerTagAdverbsWithHttpInfo(PosRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling posTaggerTagAdverbs");
        }
        
        String path = apiClient.expandPath("/nlp-v2/pos/tag/adverbs", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PosResponse> returnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Part-of-speech tag a string, filter to nouns
     * Part-of-speech (POS) tag a string, find the nouns, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string (required)
     * @return PosResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PosResponse posTaggerTagNouns(PosRequest request) throws RestClientException {
        return posTaggerTagNounsWithHttpInfo(request).getBody();
    }

    /**
     * Part-of-speech tag a string, filter to nouns
     * Part-of-speech (POS) tag a string, find the nouns, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string (required)
     * @return ResponseEntity&lt;PosResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PosResponse> posTaggerTagNounsWithHttpInfo(PosRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling posTaggerTagNouns");
        }
        
        String path = apiClient.expandPath("/nlp-v2/pos/tag/nouns", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PosResponse> returnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Part-of-speech tag a string, filter to pronouns
     * Part-of-speech (POS) tag a string, find the pronouns, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string (required)
     * @return PosResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PosResponse posTaggerTagPronouns(PosRequest request) throws RestClientException {
        return posTaggerTagPronounsWithHttpInfo(request).getBody();
    }

    /**
     * Part-of-speech tag a string, filter to pronouns
     * Part-of-speech (POS) tag a string, find the pronouns, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string (required)
     * @return ResponseEntity&lt;PosResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PosResponse> posTaggerTagPronounsWithHttpInfo(PosRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling posTaggerTagPronouns");
        }
        
        String path = apiClient.expandPath("/nlp-v2/pos/tag/pronouns", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PosResponse> returnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Part-of-speech tag a string
     * Part-of-speech (POS) tag a string and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string (required)
     * @return PosResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PosResponse posTaggerTagSentence(PosRequest request) throws RestClientException {
        return posTaggerTagSentenceWithHttpInfo(request).getBody();
    }

    /**
     * Part-of-speech tag a string
     * Part-of-speech (POS) tag a string and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string (required)
     * @return ResponseEntity&lt;PosResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PosResponse> posTaggerTagSentenceWithHttpInfo(PosRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling posTaggerTagSentence");
        }
        
        String path = apiClient.expandPath("/nlp-v2/pos/tag/sentence", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PosResponse> returnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Part-of-speech tag a string, filter to verbs
     * Part-of-speech (POS) tag a string, find the verbs, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string (required)
     * @return PosResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PosResponse posTaggerTagVerbs(PosRequest request) throws RestClientException {
        return posTaggerTagVerbsWithHttpInfo(request).getBody();
    }

    /**
     * Part-of-speech tag a string, filter to verbs
     * Part-of-speech (POS) tag a string, find the verbs, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string (required)
     * @return ResponseEntity&lt;PosResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PosResponse> posTaggerTagVerbsWithHttpInfo(PosRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling posTaggerTagVerbs");
        }
        
        String path = apiClient.expandPath("/nlp-v2/pos/tag/verbs", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<PosResponse> returnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
