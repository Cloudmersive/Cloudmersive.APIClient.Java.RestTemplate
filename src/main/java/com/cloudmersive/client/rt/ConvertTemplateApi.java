package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.rt.model.HtmlTemplateApplicationRequest;
import com.cloudmersive.client.rt.model.HtmlTemplateApplicationResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:54:02.994-07:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.ConvertTemplateApi")
public class ConvertTemplateApi {
    private ApiClient apiClient;

    public ConvertTemplateApi() {
        this(new ApiClient());
    }

    @Autowired
    public ConvertTemplateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Apply Word DOCX template
     * Apply operations to fill in a Word DOCX template by replacing target template/placeholder strings in the DOCX with values, generating a final Word DOCX result.  For example, you could create a Word Document invoice containing strings such as \&quot;{FirstName}\&quot; and \&quot;{LastName}\&quot; and then replace these values with \&quot;John\&quot; and \&quot;Smith\&quot;.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param templateDefinition Template definition for the document, including what values to replace (optional, default to null)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertTemplateApplyDocxTemplate(org.springframework.core.io.Resource inputFile, Object templateDefinition) throws RestClientException {
        return convertTemplateApplyDocxTemplateWithHttpInfo(inputFile, templateDefinition).getBody();
    }

    /**
     * Apply Word DOCX template
     * Apply operations to fill in a Word DOCX template by replacing target template/placeholder strings in the DOCX with values, generating a final Word DOCX result.  For example, you could create a Word Document invoice containing strings such as \&quot;{FirstName}\&quot; and \&quot;{LastName}\&quot; and then replace these values with \&quot;John\&quot; and \&quot;Smith\&quot;.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param templateDefinition Template definition for the document, including what values to replace (optional, default to null)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertTemplateApplyDocxTemplateWithHttpInfo(org.springframework.core.io.Resource inputFile, Object templateDefinition) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertTemplateApplyDocxTemplate");
        }
        
        String path = apiClient.expandPath("/convert/template/docx/apply", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (templateDefinition != null)
        headerParams.add("templateDefinition", apiClient.parameterToString(templateDefinition));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Apply HTML template
     * Apply operations to fill in an HTML template, generating a final HTML result
     * <p><b>200</b> - OK
     * @param value Operations to apply to template (required)
     * @return HtmlTemplateApplicationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public HtmlTemplateApplicationResponse convertTemplateApplyHtmlTemplate(HtmlTemplateApplicationRequest value) throws RestClientException {
        return convertTemplateApplyHtmlTemplateWithHttpInfo(value).getBody();
    }

    /**
     * Apply HTML template
     * Apply operations to fill in an HTML template, generating a final HTML result
     * <p><b>200</b> - OK
     * @param value Operations to apply to template (required)
     * @return ResponseEntity&lt;HtmlTemplateApplicationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<HtmlTemplateApplicationResponse> convertTemplateApplyHtmlTemplateWithHttpInfo(HtmlTemplateApplicationRequest value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling convertTemplateApplyHtmlTemplate");
        }
        
        String path = apiClient.expandPath("/convert/template/html/apply", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<HtmlTemplateApplicationResponse> returnType = new ParameterizedTypeReference<HtmlTemplateApplicationResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
