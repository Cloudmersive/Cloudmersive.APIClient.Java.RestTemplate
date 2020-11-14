package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.model.HtmlMdResult;
import com.cloudmersive.client.model.HtmlToOfficeRequest;
import com.cloudmersive.client.model.HtmlToPdfRequest;
import com.cloudmersive.client.model.HtmlToPngRequest;
import com.cloudmersive.client.model.HtmlToTextRequest;
import com.cloudmersive.client.model.HtmlToTextResponse;
import com.cloudmersive.client.model.ScreenshotRequest;
import com.cloudmersive.client.model.UrlToPdfRequest;
import com.cloudmersive.client.model.UrlToTextRequest;
import com.cloudmersive.client.model.UrlToTextResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:23:29.247-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.ConvertWebApi")
public class ConvertWebApi {
    private ApiClient apiClient;

    public ConvertWebApi() {
        this(new ApiClient());
    }

    @Autowired
    public ConvertWebApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Convert HTML to Word DOCX Document
     * Convert HTML to Office Word Document (DOCX) format
     * <p><b>200</b> - OK
     * @param inputRequest HTML input to convert to DOCX (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertWebHtmlToDocx(HtmlToOfficeRequest inputRequest) throws RestClientException {
        return convertWebHtmlToDocxWithHttpInfo(inputRequest).getBody();
    }

    /**
     * Convert HTML to Word DOCX Document
     * Convert HTML to Office Word Document (DOCX) format
     * <p><b>200</b> - OK
     * @param inputRequest HTML input to convert to DOCX (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertWebHtmlToDocxWithHttpInfo(HtmlToOfficeRequest inputRequest) throws RestClientException {
        Object postBody = inputRequest;
        
        // verify the required parameter 'inputRequest' is set
        if (inputRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputRequest' when calling convertWebHtmlToDocx");
        }
        
        String path = apiClient.expandPath("/convert/html/to/docx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert HTML string to PDF
     * Fully renders a website and returns a PDF of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input HTML to PDF request parameters (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertWebHtmlToPdf(HtmlToPdfRequest input) throws RestClientException {
        return convertWebHtmlToPdfWithHttpInfo(input).getBody();
    }

    /**
     * Convert HTML string to PDF
     * Fully renders a website and returns a PDF of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input HTML to PDF request parameters (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertWebHtmlToPdfWithHttpInfo(HtmlToPdfRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling convertWebHtmlToPdf");
        }
        
        String path = apiClient.expandPath("/convert/web/html/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert HTML string to PNG screenshot
     * Fully renders a website and returns a PNG (screenshot) of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input HTML to PNG request parameters (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertWebHtmlToPng(HtmlToPngRequest input) throws RestClientException {
        return convertWebHtmlToPngWithHttpInfo(input).getBody();
    }

    /**
     * Convert HTML string to PNG screenshot
     * Fully renders a website and returns a PNG (screenshot) of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input HTML to PNG request parameters (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertWebHtmlToPngWithHttpInfo(HtmlToPngRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling convertWebHtmlToPng");
        }
        
        String path = apiClient.expandPath("/convert/web/html/to/png", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert HTML string to text (txt)
     * Converts an HTML string input into text (txt); extracts text from HTML
     * <p><b>200</b> - OK
     * @param input HTML to Text request parameters (required)
     * @return HtmlToTextResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public HtmlToTextResponse convertWebHtmlToTxt(HtmlToTextRequest input) throws RestClientException {
        return convertWebHtmlToTxtWithHttpInfo(input).getBody();
    }

    /**
     * Convert HTML string to text (txt)
     * Converts an HTML string input into text (txt); extracts text from HTML
     * <p><b>200</b> - OK
     * @param input HTML to Text request parameters (required)
     * @return ResponseEntity&lt;HtmlToTextResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<HtmlToTextResponse> convertWebHtmlToTxtWithHttpInfo(HtmlToTextRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling convertWebHtmlToTxt");
        }
        
        String path = apiClient.expandPath("/convert/web/html/to/txt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<HtmlToTextResponse> returnType = new ParameterizedTypeReference<HtmlToTextResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert Markdown to HTML
     * Convert a markdown file (.md) to HTML
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return HtmlMdResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public HtmlMdResult convertWebMdToHtml(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return convertWebMdToHtmlWithHttpInfo(inputFile).getBody();
    }

    /**
     * Convert Markdown to HTML
     * Convert a markdown file (.md) to HTML
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;HtmlMdResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<HtmlMdResult> convertWebMdToHtmlWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertWebMdToHtml");
        }
        
        String path = apiClient.expandPath("/convert/web/md/to/html", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<HtmlMdResult> returnType = new ParameterizedTypeReference<HtmlMdResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert a URL to PDF
     * Fully renders a website and returns a PDF of the full page.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input URL to PDF request parameters (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertWebUrlToPdf(UrlToPdfRequest input) throws RestClientException {
        return convertWebUrlToPdfWithHttpInfo(input).getBody();
    }

    /**
     * Convert a URL to PDF
     * Fully renders a website and returns a PDF of the full page.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input URL to PDF request parameters (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertWebUrlToPdfWithHttpInfo(UrlToPdfRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling convertWebUrlToPdf");
        }
        
        String path = apiClient.expandPath("/convert/web/url/to/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Take screenshot of URL
     * Fully renders a website and returns a PNG screenshot of the full page image.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input Screenshot request parameters (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] convertWebUrlToScreenshot(ScreenshotRequest input) throws RestClientException {
        return convertWebUrlToScreenshotWithHttpInfo(input).getBody();
    }

    /**
     * Take screenshot of URL
     * Fully renders a website and returns a PNG screenshot of the full page image.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input Screenshot request parameters (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> convertWebUrlToScreenshotWithHttpInfo(ScreenshotRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling convertWebUrlToScreenshot");
        }
        
        String path = apiClient.expandPath("/convert/web/url/to/screenshot", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Convert website URL page to text (txt)
     * Converts a website URL page into text (txt); extracts text from HTML
     * <p><b>200</b> - OK
     * @param input HTML to Text request parameters (required)
     * @return UrlToTextResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UrlToTextResponse convertWebUrlToTxt(UrlToTextRequest input) throws RestClientException {
        return convertWebUrlToTxtWithHttpInfo(input).getBody();
    }

    /**
     * Convert website URL page to text (txt)
     * Converts a website URL page into text (txt); extracts text from HTML
     * <p><b>200</b> - OK
     * @param input HTML to Text request parameters (required)
     * @return ResponseEntity&lt;UrlToTextResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UrlToTextResponse> convertWebUrlToTxtWithHttpInfo(UrlToTextRequest input) throws RestClientException {
        Object postBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling convertWebUrlToTxt");
        }
        
        String path = apiClient.expandPath("/convert/web/url/to/txt", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<UrlToTextResponse> returnType = new ParameterizedTypeReference<UrlToTextResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
