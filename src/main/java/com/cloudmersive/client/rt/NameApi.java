package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import com.cloudmersive.client.rt.model.FirstNameValidationRequest;
import com.cloudmersive.client.rt.model.FirstNameValidationResponse;
import com.cloudmersive.client.rt.model.FullNameValidationRequest;
import com.cloudmersive.client.rt.model.FullNameValidationResponse;
import com.cloudmersive.client.rt.model.GetGenderRequest;
import com.cloudmersive.client.rt.model.GetGenderResponse;
import com.cloudmersive.client.rt.model.LastNameValidationRequest;
import com.cloudmersive.client.rt.model.LastNameValidationResponse;
import com.cloudmersive.client.rt.model.ValidateIdentifierRequest;
import com.cloudmersive.client.rt.model.ValidateIdentifierResponse;

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
public class NameApi extends BaseApi {

    public NameApi() {
        super(new ApiClient());
    }

    public NameApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Get the gender of a first name
     * Determines the gender of a first name (given name)
     * <p><b>200</b> - OK
     * @param input Gender request information (required)
     * @return GetGenderResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetGenderResponse nameGetGender(GetGenderRequest input) throws RestClientException {
        return nameGetGenderWithHttpInfo(input).getBody();
    }

    /**
     * Get the gender of a first name
     * Determines the gender of a first name (given name)
     * <p><b>200</b> - OK
     * @param input Gender request information (required)
     * @return ResponseEntity&lt;GetGenderResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetGenderResponse> nameGetGenderWithHttpInfo(GetGenderRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling nameGetGender");
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

        ParameterizedTypeReference<GetGenderResponse> localReturnType = new ParameterizedTypeReference<GetGenderResponse>() {};
        return apiClient.invokeAPI("/validate/name/get-gender", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a code identifier
     * Determines if the input name is a valid technical / code identifier.  Configure input rules such as whether whitespace, hyphens, underscores, etc. are allowed.  For example, a valid identifier might be \&quot;helloWorld\&quot; but not \&quot;hello*World\&quot;.
     * <p><b>200</b> - OK
     * @param input Identifier validation request information (required)
     * @return ValidateIdentifierResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ValidateIdentifierResponse nameIdentifier(ValidateIdentifierRequest input) throws RestClientException {
        return nameIdentifierWithHttpInfo(input).getBody();
    }

    /**
     * Validate a code identifier
     * Determines if the input name is a valid technical / code identifier.  Configure input rules such as whether whitespace, hyphens, underscores, etc. are allowed.  For example, a valid identifier might be \&quot;helloWorld\&quot; but not \&quot;hello*World\&quot;.
     * <p><b>200</b> - OK
     * @param input Identifier validation request information (required)
     * @return ResponseEntity&lt;ValidateIdentifierResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ValidateIdentifierResponse> nameIdentifierWithHttpInfo(ValidateIdentifierRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling nameIdentifier");
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

        ParameterizedTypeReference<ValidateIdentifierResponse> localReturnType = new ParameterizedTypeReference<ValidateIdentifierResponse>() {};
        return apiClient.invokeAPI("/validate/name/identifier", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a first name
     * Determines if a string is a valid first name (given name)
     * <p><b>200</b> - OK
     * @param input Validation request information (required)
     * @return FirstNameValidationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FirstNameValidationResponse nameValidateFirstName(FirstNameValidationRequest input) throws RestClientException {
        return nameValidateFirstNameWithHttpInfo(input).getBody();
    }

    /**
     * Validate a first name
     * Determines if a string is a valid first name (given name)
     * <p><b>200</b> - OK
     * @param input Validation request information (required)
     * @return ResponseEntity&lt;FirstNameValidationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FirstNameValidationResponse> nameValidateFirstNameWithHttpInfo(FirstNameValidationRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling nameValidateFirstName");
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

        ParameterizedTypeReference<FirstNameValidationResponse> localReturnType = new ParameterizedTypeReference<FirstNameValidationResponse>() {};
        return apiClient.invokeAPI("/validate/name/first", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Parse and validate a full name
     * Parses a full name string (e.g. \&quot;Mr. Jon van der Waal Jr.\&quot;) into its component parts (and returns these component parts), and then validates whether it is a valid name string or not
     * <p><b>200</b> - OK
     * @param input Validation request information (required)
     * @return FullNameValidationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FullNameValidationResponse nameValidateFullName(FullNameValidationRequest input) throws RestClientException {
        return nameValidateFullNameWithHttpInfo(input).getBody();
    }

    /**
     * Parse and validate a full name
     * Parses a full name string (e.g. \&quot;Mr. Jon van der Waal Jr.\&quot;) into its component parts (and returns these component parts), and then validates whether it is a valid name string or not
     * <p><b>200</b> - OK
     * @param input Validation request information (required)
     * @return ResponseEntity&lt;FullNameValidationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FullNameValidationResponse> nameValidateFullNameWithHttpInfo(FullNameValidationRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling nameValidateFullName");
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

        ParameterizedTypeReference<FullNameValidationResponse> localReturnType = new ParameterizedTypeReference<FullNameValidationResponse>() {};
        return apiClient.invokeAPI("/validate/name/full-name", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a last name
     * Determines if a string is a valid last name (surname)
     * <p><b>200</b> - OK
     * @param input Validation request information (required)
     * @return LastNameValidationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LastNameValidationResponse nameValidateLastName(LastNameValidationRequest input) throws RestClientException {
        return nameValidateLastNameWithHttpInfo(input).getBody();
    }

    /**
     * Validate a last name
     * Determines if a string is a valid last name (surname)
     * <p><b>200</b> - OK
     * @param input Validation request information (required)
     * @return ResponseEntity&lt;LastNameValidationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LastNameValidationResponse> nameValidateLastNameWithHttpInfo(LastNameValidationRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling nameValidateLastName");
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

        ParameterizedTypeReference<LastNameValidationResponse> localReturnType = new ParameterizedTypeReference<LastNameValidationResponse>() {};
        return apiClient.invokeAPI("/validate/name/last", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
