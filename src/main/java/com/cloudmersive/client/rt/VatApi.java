package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.VatLookupRequest;
import com.cloudmersive.client.rt.model.VatLookupResponse;

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
@Component("com.cloudmersive.client.rt.VatApi")
public class VatApi {
    private ApiClient apiClient;

    public VatApi() {
        this(new ApiClient());
    }

    @Autowired
    public VatApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Validate a VAT number
     * Checks if a VAT code is valid, and if it is, returns more information about it.  The first two letters of the VAT number must be letters that indicate the country, such as LU20260743.  Possible country codes include Austria (AT), Belgium (BE), Bulgaria (BG), Cyprus (CY), Czech Republic (CZ), Germany (DE), Denmark (DK), Estonia (EE), Greece (EL), Spain (ES), Finland (FI), France (FR), United Kingdom (GB), Croatia (HR), Hungary (HU), Ireland (IE), Italy (IT), Lithuania (LT), Luxembourg (LU), Latvia (LV), Malta (MT), The Netherlands (NL), Poland (PL), Portugal (PT), Romania (RO), Sweden (SE), Slovenia (SI), Slovakia (SK).
     * <p><b>200</b> - OK
     * @param input Input VAT code (required)
     * @return VatLookupResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VatLookupResponse vatVatLookup(VatLookupRequest input) throws RestClientException {
        return vatVatLookupWithHttpInfo(input).getBody();
    }

    /**
     * Validate a VAT number
     * Checks if a VAT code is valid, and if it is, returns more information about it.  The first two letters of the VAT number must be letters that indicate the country, such as LU20260743.  Possible country codes include Austria (AT), Belgium (BE), Bulgaria (BG), Cyprus (CY), Czech Republic (CZ), Germany (DE), Denmark (DK), Estonia (EE), Greece (EL), Spain (ES), Finland (FI), France (FR), United Kingdom (GB), Croatia (HR), Hungary (HU), Ireland (IE), Italy (IT), Lithuania (LT), Luxembourg (LU), Latvia (LV), Malta (MT), The Netherlands (NL), Poland (PL), Portugal (PT), Romania (RO), Sweden (SE), Slovenia (SI), Slovakia (SK).
     * <p><b>200</b> - OK
     * @param input Input VAT code (required)
     * @return ResponseEntity&lt;VatLookupResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VatLookupResponse> vatVatLookupWithHttpInfo(VatLookupRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling vatVatLookup");
        }
        
        String path = apiClient.expandPath("/validate/vat/lookup", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<VatLookupResponse> returnType = new ParameterizedTypeReference<VatLookupResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
