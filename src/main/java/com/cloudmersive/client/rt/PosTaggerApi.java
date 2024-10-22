package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import com.cloudmersive.client.rt.model.PosRequest;
import com.cloudmersive.client.rt.model.PosResponse;

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
public class PosTaggerApi extends BaseApi {

    public PosTaggerApi() {
        super(new ApiClient());
    }

    public PosTaggerApi(ApiClient apiClient) {
        super(apiClient);
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
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling posTaggerTagAdjectives");
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

        ParameterizedTypeReference<PosResponse> localReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/pos/tag/adjectives", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling posTaggerTagAdverbs");
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

        ParameterizedTypeReference<PosResponse> localReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/pos/tag/adverbs", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling posTaggerTagNouns");
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

        ParameterizedTypeReference<PosResponse> localReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/pos/tag/nouns", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling posTaggerTagPronouns");
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

        ParameterizedTypeReference<PosResponse> localReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/pos/tag/pronouns", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling posTaggerTagSentence");
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

        ParameterizedTypeReference<PosResponse> localReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/pos/tag/sentence", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling posTaggerTagVerbs");
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

        ParameterizedTypeReference<PosResponse> localReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/pos/tag/verbs", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
