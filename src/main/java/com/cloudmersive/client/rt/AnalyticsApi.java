package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.HateSpeechAnalysisRequest;
import com.cloudmersive.client.rt.model.HateSpeechAnalysisResponse;
import com.cloudmersive.client.rt.model.ProfanityAnalysisRequest;
import com.cloudmersive.client.rt.model.ProfanityAnalysisResponse;
import com.cloudmersive.client.rt.model.SentimentAnalysisRequest;
import com.cloudmersive.client.rt.model.SentimentAnalysisResponse;
import com.cloudmersive.client.rt.model.SimilarityAnalysisRequest;
import com.cloudmersive.client.rt.model.SimilarityAnalysisResponse;
import com.cloudmersive.client.rt.model.SubjectivityAnalysisRequest;
import com.cloudmersive.client.rt.model.SubjectivityAnalysisResponse;

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
@Component("com.cloudmersive.client.rt.AnalyticsApi")
public class AnalyticsApi {
    private ApiClient apiClient;

    public AnalyticsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AnalyticsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Perform Hate Speech Analysis and Detection on Text
     * Analyze input text using advanced Hate Speech Analysis to determine if the input contains hate speech language.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input hate speech analysis request (required)
     * @return HateSpeechAnalysisResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public HateSpeechAnalysisResponse analyticsHateSpeech(HateSpeechAnalysisRequest input) throws RestClientException {
        return analyticsHateSpeechWithHttpInfo(input).getBody();
    }

    /**
     * Perform Hate Speech Analysis and Detection on Text
     * Analyze input text using advanced Hate Speech Analysis to determine if the input contains hate speech language.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input hate speech analysis request (required)
     * @return ResponseEntity&lt;HateSpeechAnalysisResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<HateSpeechAnalysisResponse> analyticsHateSpeechWithHttpInfo(HateSpeechAnalysisRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling analyticsHateSpeech");
        }
        
        String path = apiClient.expandPath("/nlp-v2/analytics/hate-speech", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<HateSpeechAnalysisResponse> returnType = new ParameterizedTypeReference<HateSpeechAnalysisResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Perform Profanity and Obscene Language Analysis and Detection on Text
     * Analyze input text using advanced Profanity and Obscene Language Analysis to determine if the input contains profane language.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input profanity analysis request (required)
     * @return ProfanityAnalysisResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProfanityAnalysisResponse analyticsProfanity(ProfanityAnalysisRequest input) throws RestClientException {
        return analyticsProfanityWithHttpInfo(input).getBody();
    }

    /**
     * Perform Profanity and Obscene Language Analysis and Detection on Text
     * Analyze input text using advanced Profanity and Obscene Language Analysis to determine if the input contains profane language.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input profanity analysis request (required)
     * @return ResponseEntity&lt;ProfanityAnalysisResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProfanityAnalysisResponse> analyticsProfanityWithHttpInfo(ProfanityAnalysisRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling analyticsProfanity");
        }
        
        String path = apiClient.expandPath("/nlp-v2/analytics/profanity", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ProfanityAnalysisResponse> returnType = new ParameterizedTypeReference<ProfanityAnalysisResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Perform Sentiment Analysis and Classification on Text
     * Analyze input text using advanced Sentiment Analysis to determine if the input is positive, negative, or neutral.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input sentiment analysis request (required)
     * @return SentimentAnalysisResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SentimentAnalysisResponse analyticsSentiment(SentimentAnalysisRequest input) throws RestClientException {
        return analyticsSentimentWithHttpInfo(input).getBody();
    }

    /**
     * Perform Sentiment Analysis and Classification on Text
     * Analyze input text using advanced Sentiment Analysis to determine if the input is positive, negative, or neutral.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input sentiment analysis request (required)
     * @return ResponseEntity&lt;SentimentAnalysisResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SentimentAnalysisResponse> analyticsSentimentWithHttpInfo(SentimentAnalysisRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling analyticsSentiment");
        }
        
        String path = apiClient.expandPath("/nlp-v2/analytics/sentiment", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<SentimentAnalysisResponse> returnType = new ParameterizedTypeReference<SentimentAnalysisResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Perform Semantic Similarity Comparison of Two Strings
     * Analyze two input text strings, typically sentences, and determine the semantic similarity of each.  Semantic similarity refers to the degree to which two sentences mean the same thing semantically.  Uses advanced Deep Learning to perform the semantic similarity comparison.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input similarity analysis request (required)
     * @return SimilarityAnalysisResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SimilarityAnalysisResponse analyticsSimilarity(SimilarityAnalysisRequest input) throws RestClientException {
        return analyticsSimilarityWithHttpInfo(input).getBody();
    }

    /**
     * Perform Semantic Similarity Comparison of Two Strings
     * Analyze two input text strings, typically sentences, and determine the semantic similarity of each.  Semantic similarity refers to the degree to which two sentences mean the same thing semantically.  Uses advanced Deep Learning to perform the semantic similarity comparison.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input similarity analysis request (required)
     * @return ResponseEntity&lt;SimilarityAnalysisResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SimilarityAnalysisResponse> analyticsSimilarityWithHttpInfo(SimilarityAnalysisRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling analyticsSimilarity");
        }
        
        String path = apiClient.expandPath("/nlp-v2/analytics/similarity", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<SimilarityAnalysisResponse> returnType = new ParameterizedTypeReference<SimilarityAnalysisResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Perform Subjectivity and Objectivity Analysis on Text
     * Analyze input text using advanced Subjectivity and Objectivity Language Analysis to determine if the input text is objective or subjective, and how much.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input subjectivity analysis request (required)
     * @return SubjectivityAnalysisResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubjectivityAnalysisResponse analyticsSubjectivity(SubjectivityAnalysisRequest input) throws RestClientException {
        return analyticsSubjectivityWithHttpInfo(input).getBody();
    }

    /**
     * Perform Subjectivity and Objectivity Analysis on Text
     * Analyze input text using advanced Subjectivity and Objectivity Language Analysis to determine if the input text is objective or subjective, and how much.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input subjectivity analysis request (required)
     * @return ResponseEntity&lt;SubjectivityAnalysisResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubjectivityAnalysisResponse> analyticsSubjectivityWithHttpInfo(SubjectivityAnalysisRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling analyticsSubjectivity");
        }
        
        String path = apiClient.expandPath("/nlp-v2/analytics/subjectivity", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<SubjectivityAnalysisResponse> returnType = new ParameterizedTypeReference<SubjectivityAnalysisResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
