package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import com.cloudmersive.client.rt.model.LanguageHtmlTranslationRequest;
import com.cloudmersive.client.rt.model.LanguageHtmlTranslationResponse;
import com.cloudmersive.client.rt.model.LanguageTranslationRequest;
import com.cloudmersive.client.rt.model.LanguageTranslationResponse;

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
public class LanguageTranslationApi extends BaseApi {

    public LanguageTranslationApi() {
        super(new ApiClient());
    }

    public LanguageTranslationApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Translate HTML with Deep Learning AI
     * Automatically translates input text in German to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return LanguageHtmlTranslationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LanguageHtmlTranslationResponse languageTranslationHtmlTranslate(LanguageHtmlTranslationRequest input) throws RestClientException {
        return languageTranslationHtmlTranslateWithHttpInfo(input).getBody();
    }

    /**
     * Translate HTML with Deep Learning AI
     * Automatically translates input text in German to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request (required)
     * @return ResponseEntity&lt;LanguageHtmlTranslationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LanguageHtmlTranslationResponse> languageTranslationHtmlTranslateWithHttpInfo(LanguageHtmlTranslationRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling languageTranslationHtmlTranslate");
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

        ParameterizedTypeReference<LanguageHtmlTranslationResponse> localReturnType = new ParameterizedTypeReference<LanguageHtmlTranslationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/translate/language/html", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling languageTranslationTranslateDeuToEng");
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

        ParameterizedTypeReference<LanguageTranslationResponse> localReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/translate/language/deu/to/eng", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling languageTranslationTranslateEngToDeu");
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

        ParameterizedTypeReference<LanguageTranslationResponse> localReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/translate/language/eng/to/deu", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling languageTranslationTranslateEngToFra");
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

        ParameterizedTypeReference<LanguageTranslationResponse> localReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/translate/language/eng/to/fra", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling languageTranslationTranslateEngToRus");
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

        ParameterizedTypeReference<LanguageTranslationResponse> localReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/translate/language/eng/to/rus", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling languageTranslationTranslateFraToEng");
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

        ParameterizedTypeReference<LanguageTranslationResponse> localReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/translate/language/fra/to/eng", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling languageTranslationTranslateRusToEng");
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

        ParameterizedTypeReference<LanguageTranslationResponse> localReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/translate/language/rus/to/eng", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
