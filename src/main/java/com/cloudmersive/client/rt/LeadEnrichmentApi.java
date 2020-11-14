package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.LeadEnrichmentRequest;
import com.cloudmersive.client.rt.model.LeadEnrichmentResponse;

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
@Component("com.cloudmersive.client.rt.LeadEnrichmentApi")
public class LeadEnrichmentApi {
    private ApiClient apiClient;

    public LeadEnrichmentApi() {
        this(new ApiClient());
    }

    @Autowired
    public LeadEnrichmentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Enrich an input lead with additional fields of data
     * 
     * <p><b>200</b> - OK
     * @param request Input lead with known fields set, and unknown fields left blank (null) (required)
     * @return LeadEnrichmentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LeadEnrichmentResponse leadEnrichmentEnrichLead(LeadEnrichmentRequest request) throws RestClientException {
        return leadEnrichmentEnrichLeadWithHttpInfo(request).getBody();
    }

    /**
     * Enrich an input lead with additional fields of data
     * 
     * <p><b>200</b> - OK
     * @param request Input lead with known fields set, and unknown fields left blank (null) (required)
     * @return ResponseEntity&lt;LeadEnrichmentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LeadEnrichmentResponse> leadEnrichmentEnrichLeadWithHttpInfo(LeadEnrichmentRequest request) throws RestClientException {
        Object postBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling leadEnrichmentEnrichLead");
        }
        
        String path = apiClient.expandPath("/validate/lead-enrichment/lead/enrich", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<LeadEnrichmentResponse> returnType = new ParameterizedTypeReference<LeadEnrichmentResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
