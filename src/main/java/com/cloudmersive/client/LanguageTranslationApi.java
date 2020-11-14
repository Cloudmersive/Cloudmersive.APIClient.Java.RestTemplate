package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import com.cloudmersive.client.model.LanguageTranslationRequest;
import com.cloudmersive.client.model.LanguageTranslationResponse;

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
@Component("com.cloudmersive.client.LanguageTranslationApi")
public class LanguageTranslationApi {
    private ApiClient apiClient;

    public LanguageTranslationApi() {
        this(new ApiClient());
    }

    @Autowired
    public LanguageTranslationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Translate German to English text with Deep Learning AI
     * Automatically translates input text in German to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return LanguageTranslationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LanguageTranslationResponse languageTranslationTranslateDeuToEng(LanguageTranslationRequest input) throws RestClientException {
        return languageTranslationTranslateDeuToEngWithHttpInfo(input).getBody();
    }

    /**
     * Translate German to English text with Deep Learning AI
     * Automatically translates input text in German to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return ResponseEntity&lt;LanguageTranslationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LanguageTranslationResponse> languageTranslationTranslateDeuToEngWithHttpInfo(LanguageTranslationRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling languageTranslationTranslateDeuToEng");
        }
        
        String path = apiClient.expandPath("/nlp-v2/translate/language/deu/to/eng", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<LanguageTranslationResponse> returnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Translate English to German text with Deep Learning AI
     * Automatically translates input text in English to output text in German using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return LanguageTranslationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LanguageTranslationResponse languageTranslationTranslateEngToDeu(LanguageTranslationRequest input) throws RestClientException {
        return languageTranslationTranslateEngToDeuWithHttpInfo(input).getBody();
    }

    /**
     * Translate English to German text with Deep Learning AI
     * Automatically translates input text in English to output text in German using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return ResponseEntity&lt;LanguageTranslationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LanguageTranslationResponse> languageTranslationTranslateEngToDeuWithHttpInfo(LanguageTranslationRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling languageTranslationTranslateEngToDeu");
        }
        
        String path = apiClient.expandPath("/nlp-v2/translate/language/eng/to/deu", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<LanguageTranslationResponse> returnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Translate English to French text with Deep Learning AI
     * Automatically translates input text in English to output text in French using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return LanguageTranslationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LanguageTranslationResponse languageTranslationTranslateEngToFra(LanguageTranslationRequest input) throws RestClientException {
        return languageTranslationTranslateEngToFraWithHttpInfo(input).getBody();
    }

    /**
     * Translate English to French text with Deep Learning AI
     * Automatically translates input text in English to output text in French using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return ResponseEntity&lt;LanguageTranslationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LanguageTranslationResponse> languageTranslationTranslateEngToFraWithHttpInfo(LanguageTranslationRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling languageTranslationTranslateEngToFra");
        }
        
        String path = apiClient.expandPath("/nlp-v2/translate/language/eng/to/fra", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<LanguageTranslationResponse> returnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Translate English to Russian text with Deep Learning AI
     * Automatically translates input text in English to output text in Russian using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return LanguageTranslationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LanguageTranslationResponse languageTranslationTranslateEngToRus(LanguageTranslationRequest input) throws RestClientException {
        return languageTranslationTranslateEngToRusWithHttpInfo(input).getBody();
    }

    /**
     * Translate English to Russian text with Deep Learning AI
     * Automatically translates input text in English to output text in Russian using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return ResponseEntity&lt;LanguageTranslationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LanguageTranslationResponse> languageTranslationTranslateEngToRusWithHttpInfo(LanguageTranslationRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling languageTranslationTranslateEngToRus");
        }
        
        String path = apiClient.expandPath("/nlp-v2/translate/language/eng/to/rus", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<LanguageTranslationResponse> returnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Translate French to English text with Deep Learning AI
     * Automatically translates input text in French to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return LanguageTranslationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LanguageTranslationResponse languageTranslationTranslateFraToEng(LanguageTranslationRequest input) throws RestClientException {
        return languageTranslationTranslateFraToEngWithHttpInfo(input).getBody();
    }

    /**
     * Translate French to English text with Deep Learning AI
     * Automatically translates input text in French to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return ResponseEntity&lt;LanguageTranslationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LanguageTranslationResponse> languageTranslationTranslateFraToEngWithHttpInfo(LanguageTranslationRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling languageTranslationTranslateFraToEng");
        }
        
        String path = apiClient.expandPath("/nlp-v2/translate/language/fra/to/eng", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<LanguageTranslationResponse> returnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Translate Russian to English text with Deep Learning AI
     * Automatically translates input text in Russian to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return LanguageTranslationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LanguageTranslationResponse languageTranslationTranslateRusToEng(LanguageTranslationRequest input) throws RestClientException {
        return languageTranslationTranslateRusToEngWithHttpInfo(input).getBody();
    }

    /**
     * Translate Russian to English text with Deep Learning AI
     * Automatically translates input text in Russian to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return ResponseEntity&lt;LanguageTranslationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LanguageTranslationResponse> languageTranslationTranslateRusToEngWithHttpInfo(LanguageTranslationRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling languageTranslationTranslateRusToEng");
        }
        
        String path = apiClient.expandPath("/nlp-v2/translate/language/rus/to/eng", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<LanguageTranslationResponse> returnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
