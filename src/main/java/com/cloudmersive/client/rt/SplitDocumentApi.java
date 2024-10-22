package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import java.io.File;
import com.cloudmersive.client.rt.model.JobStatusResult;
import com.cloudmersive.client.rt.model.PptxSplitAdvancedRequest;
import com.cloudmersive.client.rt.model.PptxSplitAdvancedResponse;
import com.cloudmersive.client.rt.model.SplitBatchJobCreateResult;
import com.cloudmersive.client.rt.model.SplitDocxDocumentResult;
import com.cloudmersive.client.rt.model.SplitPdfResult;
import com.cloudmersive.client.rt.model.SplitPptxPresentationResult;
import com.cloudmersive.client.rt.model.SplitTextDocumentByLinesResult;
import com.cloudmersive.client.rt.model.SplitTextDocumentByStringResult;
import com.cloudmersive.client.rt.model.SplitXlsxWorksheetResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:16:28.653440600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SplitDocumentApi extends BaseApi {

    public SplitDocumentApi() {
        super(new ApiClient());
    }

    public SplitDocumentApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Split a single Document into Separate Documents by Page as a Batch Job
     * Split a Document (PPTX supported), comprised of multiple pages into separate files, with each containing exactly one page.  This API is designed for large jobs that could take a long time to create and so runs as a batch job that returns a Job ID that you can use with the GetAsyncJobStatus API to check on the status of the Job and ultimately get the output result.  This API automatically detects the document type and then performs the split by using the document type-specific API needed to perform the split.  This API is only available for Cloudmersive Managed Instance and Private Cloud deployments.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param returnDocumentContents Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true. (optional)
     * @return SplitBatchJobCreateResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SplitBatchJobCreateResult splitDocumentBatchJobCreate(org.springframework.core.io.Resource inputFile, Boolean returnDocumentContents) throws RestClientException {
        return splitDocumentBatchJobCreateWithHttpInfo(inputFile, returnDocumentContents).getBody();
    }

    /**
     * Split a single Document into Separate Documents by Page as a Batch Job
     * Split a Document (PPTX supported), comprised of multiple pages into separate files, with each containing exactly one page.  This API is designed for large jobs that could take a long time to create and so runs as a batch job that returns a Job ID that you can use with the GetAsyncJobStatus API to check on the status of the Job and ultimately get the output result.  This API automatically detects the document type and then performs the split by using the document type-specific API needed to perform the split.  This API is only available for Cloudmersive Managed Instance and Private Cloud deployments.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param returnDocumentContents Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true. (optional)
     * @return ResponseEntity&lt;SplitBatchJobCreateResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SplitBatchJobCreateResult> splitDocumentBatchJobCreateWithHttpInfo(org.springframework.core.io.Resource inputFile, Boolean returnDocumentContents) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling splitDocumentBatchJobCreate");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (returnDocumentContents != null)
        localVarHeaderParams.add("returnDocumentContents", apiClient.parameterToString(returnDocumentContents));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitBatchJobCreateResult> localReturnType = new ParameterizedTypeReference<SplitBatchJobCreateResult>() {};
        return apiClient.invokeAPI("/convert/split/batch-job/create", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling splitDocumentDocx");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (returnDocumentContents != null)
        localVarHeaderParams.add("returnDocumentContents", apiClient.parameterToString(returnDocumentContents));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitDocxDocumentResult> localReturnType = new ParameterizedTypeReference<SplitDocxDocumentResult>() {};
        return apiClient.invokeAPI("/convert/split/docx", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the status and result of a Split Document Batch Job
     * Returns the result of the Async Job - possible states can be STARTED or COMPLETED.  This API is only available for Cloudmersive Managed Instance and Private Cloud deployments.
     * <p><b>200</b> - OK
     * @param asyncJobID  (required)
     * @return JobStatusResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public JobStatusResult splitDocumentGetAsyncJobStatus(String asyncJobID) throws RestClientException {
        return splitDocumentGetAsyncJobStatusWithHttpInfo(asyncJobID).getBody();
    }

    /**
     * Get the status and result of a Split Document Batch Job
     * Returns the result of the Async Job - possible states can be STARTED or COMPLETED.  This API is only available for Cloudmersive Managed Instance and Private Cloud deployments.
     * <p><b>200</b> - OK
     * @param asyncJobID  (required)
     * @return ResponseEntity&lt;JobStatusResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<JobStatusResult> splitDocumentGetAsyncJobStatusWithHttpInfo(String asyncJobID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'asyncJobID' is set
        if (asyncJobID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'asyncJobID' when calling splitDocumentGetAsyncJobStatus");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "AsyncJobID", asyncJobID));
        

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<JobStatusResult> localReturnType = new ParameterizedTypeReference<JobStatusResult>() {};
        return apiClient.invokeAPI("/convert/split/batch-job/status", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling splitDocumentPdfByPage");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (returnDocumentContents != null)
        localVarHeaderParams.add("returnDocumentContents", apiClient.parameterToString(returnDocumentContents));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitPdfResult> localReturnType = new ParameterizedTypeReference<SplitPdfResult>() {};
        return apiClient.invokeAPI("/convert/split/pdf", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling splitDocumentPptx");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (returnDocumentContents != null)
        localVarHeaderParams.add("returnDocumentContents", apiClient.parameterToString(returnDocumentContents));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitPptxPresentationResult> localReturnType = new ParameterizedTypeReference<SplitPptxPresentationResult>() {};
        return apiClient.invokeAPI("/convert/split/pptx", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Split a single PowerPoint Presentation PPTX into Separate Presentations
     * Split a PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentations of customizeable size.
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return PptxSplitAdvancedResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PptxSplitAdvancedResponse splitDocumentPptxAdvanced(PptxSplitAdvancedRequest request) throws RestClientException {
        return splitDocumentPptxAdvancedWithHttpInfo(request).getBody();
    }

    /**
     * Split a single PowerPoint Presentation PPTX into Separate Presentations
     * Split a PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentations of customizeable size.
     * <p><b>200</b> - OK
     * @param request  (required)
     * @return ResponseEntity&lt;PptxSplitAdvancedResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PptxSplitAdvancedResponse> splitDocumentPptxAdvancedWithHttpInfo(PptxSplitAdvancedRequest request) throws RestClientException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'request' when calling splitDocumentPptxAdvanced");
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
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<PptxSplitAdvancedResponse> localReturnType = new ParameterizedTypeReference<PptxSplitAdvancedResponse>() {};
        return apiClient.invokeAPI("/convert/split/pptx/advanced", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling splitDocumentTxtByLine");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitTextDocumentByLinesResult> localReturnType = new ParameterizedTypeReference<SplitTextDocumentByLinesResult>() {};
        return apiClient.invokeAPI("/convert/split/txt/by-line", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'splitDelimiter' is set
        if (splitDelimiter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'splitDelimiter' when calling splitDocumentTxtByString");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling splitDocumentTxtByString");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (splitDelimiter != null)
        localVarHeaderParams.add("splitDelimiter", apiClient.parameterToString(splitDelimiter));
        if (skipEmptyElements != null)
        localVarHeaderParams.add("skipEmptyElements", apiClient.parameterToString(skipEmptyElements));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitTextDocumentByStringResult> localReturnType = new ParameterizedTypeReference<SplitTextDocumentByStringResult>() {};
        return apiClient.invokeAPI("/convert/split/txt/by-string", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling splitDocumentXlsx");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (returnDocumentContents != null)
        localVarHeaderParams.add("returnDocumentContents", apiClient.parameterToString(returnDocumentContents));

        if (inputFile != null)
            localVarFormParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SplitXlsxWorksheetResult> localReturnType = new ParameterizedTypeReference<SplitXlsxWorksheetResult>() {};
        return apiClient.invokeAPI("/convert/split/xlsx", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
