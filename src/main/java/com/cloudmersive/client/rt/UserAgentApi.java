package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.UserAgentValidateRequest;
import com.cloudmersive.client.rt.model.UserAgentValidateResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:47:06.593-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.UserAgentApi")
public class UserAgentApi {
    private ApiClient apiClient;

    public UserAgentApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserAgentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Parse an HTTP User-Agent string, identify robots
     * Uses a parsing system and database to parse the User-Agent into its structured component parts, such as Browser, Browser Version, Browser Engine, Operating System, and importantly, Robot identification.
     * <p><b>200</b> - OK
     * @param request Input parse request (required)
     * @return UserAgentValidateResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserAgentValidateResponse userAgentParse(UserAgentValidateRequest request) throws RestClientException {
        return userAgentParseWithHttpInfo(request).getBody();
    }

    /**
     * Parse an HTTP User-Agent string, identify robots
     * Uses a parsing system and database to parse the User-Agent into its structured component parts, such as Browser, Browser Version, Browser Engine, Operating System, and importantly, Robot identification.
     * <p><b>200</b> - OK
     * @param request Input parse request (required)
     * @return ResponseEntity&lt;UserAgentValidateResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserAgentValidateResponse> userAgentParseWithHttpInfo(UserAgentValidateRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling userAgentParse");
        }
        
        String path = apiClient.expandPath("/validate/useragent/parse", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<UserAgentValidateResponse> returnType = new ParameterizedTypeReference<UserAgentValidateResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
