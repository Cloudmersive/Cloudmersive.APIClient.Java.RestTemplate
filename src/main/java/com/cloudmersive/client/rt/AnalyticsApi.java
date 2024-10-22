package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:15:58.214933200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AnalyticsApi extends BaseApi {

    public AnalyticsApi() {
        super(new ApiClient());
    }

    public AnalyticsApi(ApiClient apiClient) {
        super(apiClient);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling analyticsHateSpeech");
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

        ParameterizedTypeReference<HateSpeechAnalysisResponse> localReturnType = new ParameterizedTypeReference<HateSpeechAnalysisResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/analytics/hate-speech", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling analyticsProfanity");
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

        ParameterizedTypeReference<ProfanityAnalysisResponse> localReturnType = new ParameterizedTypeReference<ProfanityAnalysisResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/analytics/profanity", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling analyticsSentiment");
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

        ParameterizedTypeReference<SentimentAnalysisResponse> localReturnType = new ParameterizedTypeReference<SentimentAnalysisResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/analytics/sentiment", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling analyticsSimilarity");
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

        ParameterizedTypeReference<SimilarityAnalysisResponse> localReturnType = new ParameterizedTypeReference<SimilarityAnalysisResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/analytics/similarity", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling analyticsSubjectivity");
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

        ParameterizedTypeReference<SubjectivityAnalysisResponse> localReturnType = new ParameterizedTypeReference<SubjectivityAnalysisResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/analytics/subjectivity", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
