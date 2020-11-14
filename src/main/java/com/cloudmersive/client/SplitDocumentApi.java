package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.model.SplitDocxDocumentResult;
import com.cloudmersive.client.model.SplitPdfResult;
import com.cloudmersive.client.model.SplitPptxPresentationResult;
import com.cloudmersive.client.model.SplitTextDocumentByLinesResult;
import com.cloudmersive.client.model.SplitTextDocumentByStringResult;
import com.cloudmersive.client.model.SplitXlsxWorksheetResult;

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
@Component("com.cloudmersive.client.SplitDocumentApi")
public class SplitDocumentApi {
    private ApiClient apiClient;

    public SplitDocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public SplitDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Split a single Word Document DOCX into Separate Documents by Page
     * Split a Word DOCX Document, comprised of multiple pages into separate Word DOCX document files, with each containing exactly one page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting document.  Default is true. (optional)
     * @return SplitDocxDocumentResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SplitDocxDocumentResult splitDocumentDocx(org.springframework.core.io.Resource inputFile, Boolean returnDocumentContents) throws RestClientException {
        return splitDocumentDocxWithHttpInfo(inputFile, returnDocumentContents).getBody();
    }

    /**
     * Split a single Word Document DOCX into Separate Documents by Page
     * Split a Word DOCX Document, comprised of multiple pages into separate Word DOCX document files, with each containing exactly one page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting document.  Default is true. (optional)
     * @return ResponseEntity&lt;SplitDocxDocumentResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SplitDocxDocumentResult> splitDocumentDocxWithHttpInfo(org.springframework.core.io.Resource inputFile, Boolean returnDocumentContents) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling splitDocumentDocx");
        }
        
        String path = apiClient.expandPath("/convert/split/docx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (returnDocumentContents != null)
        headerParams.add("returnDocumentContents", apiClient.parameterToString(returnDocumentContents));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitDocxDocumentResult> returnType = new ParameterizedTypeReference<SplitDocxDocumentResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Split a PDF file into separate PDF files, one per page
     * Split an input PDF file into separate pages, comprised of one PDF file per page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param returnDocumentContents Set to true to directly return all of the document contents in the DocumentContents field; set to false to return contents as temporary URLs (more efficient for large operations).  Default is false. (optional)
     * @return SplitPdfResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SplitPdfResult splitDocumentPdfByPage(org.springframework.core.io.Resource inputFile, Boolean returnDocumentContents) throws RestClientException {
        return splitDocumentPdfByPageWithHttpInfo(inputFile, returnDocumentContents).getBody();
    }

    /**
     * Split a PDF file into separate PDF files, one per page
     * Split an input PDF file into separate pages, comprised of one PDF file per page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param returnDocumentContents Set to true to directly return all of the document contents in the DocumentContents field; set to false to return contents as temporary URLs (more efficient for large operations).  Default is false. (optional)
     * @return ResponseEntity&lt;SplitPdfResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SplitPdfResult> splitDocumentPdfByPageWithHttpInfo(org.springframework.core.io.Resource inputFile, Boolean returnDocumentContents) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling splitDocumentPdfByPage");
        }
        
        String path = apiClient.expandPath("/convert/split/pdf", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (returnDocumentContents != null)
        headerParams.add("returnDocumentContents", apiClient.parameterToString(returnDocumentContents));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitPdfResult> returnType = new ParameterizedTypeReference<SplitPdfResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Split a single PowerPoint Presentation PPTX into Separate Slides
     * Split an PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentation files, with each containing exactly one slide.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param returnDocumentContents Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true. (optional)
     * @return SplitPptxPresentationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SplitPptxPresentationResult splitDocumentPptx(org.springframework.core.io.Resource inputFile, Boolean returnDocumentContents) throws RestClientException {
        return splitDocumentPptxWithHttpInfo(inputFile, returnDocumentContents).getBody();
    }

    /**
     * Split a single PowerPoint Presentation PPTX into Separate Slides
     * Split an PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentation files, with each containing exactly one slide.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param returnDocumentContents Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true. (optional)
     * @return ResponseEntity&lt;SplitPptxPresentationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SplitPptxPresentationResult> splitDocumentPptxWithHttpInfo(org.springframework.core.io.Resource inputFile, Boolean returnDocumentContents) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling splitDocumentPptx");
        }
        
        String path = apiClient.expandPath("/convert/split/pptx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (returnDocumentContents != null)
        headerParams.add("returnDocumentContents", apiClient.parameterToString(returnDocumentContents));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitPptxPresentationResult> returnType = new ParameterizedTypeReference<SplitPptxPresentationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Split a single Text file (txt) into lines
     * Split a Text (txt) Document by line, returning each line separately in order.  Supports multiple types of newlines.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return SplitTextDocumentByLinesResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SplitTextDocumentByLinesResult splitDocumentTxtByLine(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return splitDocumentTxtByLineWithHttpInfo(inputFile).getBody();
    }

    /**
     * Split a single Text file (txt) into lines
     * Split a Text (txt) Document by line, returning each line separately in order.  Supports multiple types of newlines.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;SplitTextDocumentByLinesResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SplitTextDocumentByLinesResult> splitDocumentTxtByLineWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling splitDocumentTxtByLine");
        }
        
        String path = apiClient.expandPath("/convert/split/txt/by-line", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitTextDocumentByLinesResult> returnType = new ParameterizedTypeReference<SplitTextDocumentByLinesResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Split a single Text file (txt) by a string delimiter
     * Split a Text (txt) Document by a string delimiter, returning each component of the string as an array of strings.
     * <p><b>200</b> - OK
     * @param splitDelimiter Required; String to split up the input file on (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param skipEmptyElements Optional; If true, empty elements will be skipped in the output (optional)
     * @return SplitTextDocumentByStringResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SplitTextDocumentByStringResult splitDocumentTxtByString(String splitDelimiter, org.springframework.core.io.Resource inputFile, Boolean skipEmptyElements) throws RestClientException {
        return splitDocumentTxtByStringWithHttpInfo(splitDelimiter, inputFile, skipEmptyElements).getBody();
    }

    /**
     * Split a single Text file (txt) by a string delimiter
     * Split a Text (txt) Document by a string delimiter, returning each component of the string as an array of strings.
     * <p><b>200</b> - OK
     * @param splitDelimiter Required; String to split up the input file on (required)
     * @param inputFile Input file to perform the operation on. (required)
     * @param skipEmptyElements Optional; If true, empty elements will be skipped in the output (optional)
     * @return ResponseEntity&lt;SplitTextDocumentByStringResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SplitTextDocumentByStringResult> splitDocumentTxtByStringWithHttpInfo(String splitDelimiter, org.springframework.core.io.Resource inputFile, Boolean skipEmptyElements) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'splitDelimiter' is set
        if (splitDelimiter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'splitDelimiter' when calling splitDocumentTxtByString");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling splitDocumentTxtByString");
        }
        
        String path = apiClient.expandPath("/convert/split/txt/by-string", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (splitDelimiter != null)
        headerParams.add("splitDelimiter", apiClient.parameterToString(splitDelimiter));
        if (skipEmptyElements != null)
        headerParams.add("skipEmptyElements", apiClient.parameterToString(skipEmptyElements));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitTextDocumentByStringResult> returnType = new ParameterizedTypeReference<SplitTextDocumentByStringResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Split a single Excel XLSX into Separate Worksheets
     * Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting worksheet.  Default is true. (optional)
     * @return SplitXlsxWorksheetResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SplitXlsxWorksheetResult splitDocumentXlsx(org.springframework.core.io.Resource inputFile, Boolean returnDocumentContents) throws RestClientException {
        return splitDocumentXlsxWithHttpInfo(inputFile, returnDocumentContents).getBody();
    }

    /**
     * Split a single Excel XLSX into Separate Worksheets
     * Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting worksheet.  Default is true. (optional)
     * @return ResponseEntity&lt;SplitXlsxWorksheetResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SplitXlsxWorksheetResult> splitDocumentXlsxWithHttpInfo(org.springframework.core.io.Resource inputFile, Boolean returnDocumentContents) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling splitDocumentXlsx");
        }
        
        String path = apiClient.expandPath("/convert/split/xlsx", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (returnDocumentContents != null)
        headerParams.add("returnDocumentContents", apiClient.parameterToString(returnDocumentContents));

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitXlsxWorksheetResult> returnType = new ParameterizedTypeReference<SplitXlsxWorksheetResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
