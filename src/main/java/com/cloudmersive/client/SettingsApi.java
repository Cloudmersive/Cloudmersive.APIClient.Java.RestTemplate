package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import com.cloudmersive.client.model.CreateSettingRequest;
import com.cloudmersive.client.model.CreateSettingResponse;
import com.cloudmersive.client.model.ListSettingsRequest;
import com.cloudmersive.client.model.ListSettingsResponse;
import com.cloudmersive.client.model.UpdateSettingRequest;
import com.cloudmersive.client.model.UpdateSettingResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:35.485-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.SettingsApi")
public class SettingsApi {
    private ApiClient apiClient;

    public SettingsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SettingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a setting in the specified bucket
     * 
     * <p><b>200</b> - OK
     * @param request Request to perform the operation on (required)
     * @return CreateSettingResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateSettingResponse settingsCreateSetting(CreateSettingRequest request) throws RestClientException {
        return settingsCreateSettingWithHttpInfo(request).getBody();
    }

    /**
     * Create a setting in the specified bucket
     * 
     * <p><b>200</b> - OK
     * @param request Request to perform the operation on (required)
     * @return ResponseEntity&lt;CreateSettingResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateSettingResponse> settingsCreateSettingWithHttpInfo(CreateSettingRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling settingsCreateSetting");
        }
        
        String path = apiClient.expandPath("/config/settings/create", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CreateSettingResponse> returnType = new ParameterizedTypeReference<CreateSettingResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Enumerate the settings in a bucket
     * 
     * <p><b>200</b> - OK
     * @param request Request to perform the operation on (required)
     * @return ListSettingsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListSettingsResponse settingsListSettings(ListSettingsRequest request) throws RestClientException {
        return settingsListSettingsWithHttpInfo(request).getBody();
    }

    /**
     * Enumerate the settings in a bucket
     * 
     * <p><b>200</b> - OK
     * @param request Request to perform the operation on (required)
     * @return ResponseEntity&lt;ListSettingsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListSettingsResponse> settingsListSettingsWithHttpInfo(ListSettingsRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling settingsListSettings");
        }
        
        String path = apiClient.expandPath("/config/settings/list", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ListSettingsResponse> returnType = new ParameterizedTypeReference<ListSettingsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Update a setting
     * 
     * <p><b>200</b> - OK
     * @param request Request to perform the operation on (required)
     * @return UpdateSettingResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateSettingResponse settingsUpdateSetting(UpdateSettingRequest request) throws RestClientException {
        return settingsUpdateSettingWithHttpInfo(request).getBody();
    }

    /**
     * Update a setting
     * 
     * <p><b>200</b> - OK
     * @param request Request to perform the operation on (required)
     * @return ResponseEntity&lt;UpdateSettingResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateSettingResponse> settingsUpdateSettingWithHttpInfo(UpdateSettingRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling settingsUpdateSetting");
        }
        
        String path = apiClient.expandPath("/config/settings/update", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<UpdateSettingResponse> returnType = new ParameterizedTypeReference<UpdateSettingResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
