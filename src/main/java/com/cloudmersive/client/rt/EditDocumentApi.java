package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import com.cloudmersive.client.rt.model.AppendXlsxRowRequest;
import com.cloudmersive.client.rt.model.AppendXlsxRowResponse;
import com.cloudmersive.client.rt.model.ClearXlsxCellRequest;
import com.cloudmersive.client.rt.model.ClearXlsxCellResponse;
import com.cloudmersive.client.rt.model.ClearXlsxRowRequest;
import com.cloudmersive.client.rt.model.ClearXlsxRowResponse;
import com.cloudmersive.client.rt.model.CreateBlankDocxRequest;
import com.cloudmersive.client.rt.model.CreateBlankDocxResponse;
import com.cloudmersive.client.rt.model.CreateBlankSpreadsheetRequest;
import com.cloudmersive.client.rt.model.CreateBlankSpreadsheetResponse;
import com.cloudmersive.client.rt.model.CreateSpreadsheetFromDataRequest;
import com.cloudmersive.client.rt.model.CreateSpreadsheetFromDataResponse;
import com.cloudmersive.client.rt.model.DeleteDocxTableRowRangeRequest;
import com.cloudmersive.client.rt.model.DeleteDocxTableRowRangeResponse;
import com.cloudmersive.client.rt.model.DeleteDocxTableRowRequest;
import com.cloudmersive.client.rt.model.DeleteDocxTableRowResponse;
import com.cloudmersive.client.rt.model.DisableSharedWorkbookRequest;
import com.cloudmersive.client.rt.model.DisableSharedWorkbookResponse;
import com.cloudmersive.client.rt.model.DocumentEditingEditSession;
import com.cloudmersive.client.rt.model.DocxInsertCommentOnParagraphRequest;
import com.cloudmersive.client.rt.model.DocxInsertImageRequest;
import com.cloudmersive.client.rt.model.DocxInsertImageResponse;
import com.cloudmersive.client.rt.model.DocxRemoveObjectRequest;
import com.cloudmersive.client.rt.model.DocxRemoveObjectResponse;
import com.cloudmersive.client.rt.model.DocxSetCustomMetadataPropertiesRequest;
import com.cloudmersive.client.rt.model.DocxSetFooterAddPageNumberRequest;
import com.cloudmersive.client.rt.model.DocxSetFooterRequest;
import com.cloudmersive.client.rt.model.DocxSetFooterResponse;
import com.cloudmersive.client.rt.model.DocxSetFormFieldsRequest;
import com.cloudmersive.client.rt.model.DocxSetHeaderRequest;
import com.cloudmersive.client.rt.model.DocxSetHeaderResponse;
import com.cloudmersive.client.rt.model.EnableSharedWorkbookRequest;
import com.cloudmersive.client.rt.model.EnableSharedWorkbookResponse;
import java.io.File;
import com.cloudmersive.client.rt.model.FindDocxParagraphRequest;
import com.cloudmersive.client.rt.model.FindDocxParagraphResponse;
import com.cloudmersive.client.rt.model.FinishEditingRequest;
import com.cloudmersive.client.rt.model.GetDocxBodyRequest;
import com.cloudmersive.client.rt.model.GetDocxBodyResponse;
import com.cloudmersive.client.rt.model.GetDocxCommentsHierarchicalResponse;
import com.cloudmersive.client.rt.model.GetDocxCommentsResponse;
import com.cloudmersive.client.rt.model.GetDocxContentControlsResponse;
import com.cloudmersive.client.rt.model.GetDocxGetCommentsHierarchicalRequest;
import com.cloudmersive.client.rt.model.GetDocxGetCommentsRequest;
import com.cloudmersive.client.rt.model.GetDocxGetFormFieldsResponse;
import com.cloudmersive.client.rt.model.GetDocxHeadersAndFootersRequest;
import com.cloudmersive.client.rt.model.GetDocxHeadersAndFootersResponse;
import com.cloudmersive.client.rt.model.GetDocxImagesRequest;
import com.cloudmersive.client.rt.model.GetDocxImagesResponse;
import com.cloudmersive.client.rt.model.GetDocxMetadataPropertiesResponse;
import com.cloudmersive.client.rt.model.GetDocxPagesRequest;
import com.cloudmersive.client.rt.model.GetDocxPagesResponse;
import com.cloudmersive.client.rt.model.GetDocxSectionsRequest;
import com.cloudmersive.client.rt.model.GetDocxSectionsResponse;
import com.cloudmersive.client.rt.model.GetDocxStylesRequest;
import com.cloudmersive.client.rt.model.GetDocxStylesResponse;
import com.cloudmersive.client.rt.model.GetDocxTableByIndexRequest;
import com.cloudmersive.client.rt.model.GetDocxTableByIndexResponse;
import com.cloudmersive.client.rt.model.GetDocxTableRowRequest;
import com.cloudmersive.client.rt.model.GetDocxTableRowResponse;
import com.cloudmersive.client.rt.model.GetDocxTablesRequest;
import com.cloudmersive.client.rt.model.GetDocxTablesResponse;
import com.cloudmersive.client.rt.model.GetMacrosResponse;
import com.cloudmersive.client.rt.model.GetXlsxCellByIdentifierRequest;
import com.cloudmersive.client.rt.model.GetXlsxCellByIdentifierResponse;
import com.cloudmersive.client.rt.model.GetXlsxCellRequest;
import com.cloudmersive.client.rt.model.GetXlsxCellResponse;
import com.cloudmersive.client.rt.model.GetXlsxColumnsRequest;
import com.cloudmersive.client.rt.model.GetXlsxColumnsResponse;
import com.cloudmersive.client.rt.model.GetXlsxImagesRequest;
import com.cloudmersive.client.rt.model.GetXlsxImagesResponse;
import com.cloudmersive.client.rt.model.GetXlsxRowsAndCellsRequest;
import com.cloudmersive.client.rt.model.GetXlsxRowsAndCellsResponse;
import com.cloudmersive.client.rt.model.GetXlsxSpecificRowRequest;
import com.cloudmersive.client.rt.model.GetXlsxSpecificRowResponse;
import com.cloudmersive.client.rt.model.GetXlsxStylesRequest;
import com.cloudmersive.client.rt.model.GetXlsxStylesResponse;
import com.cloudmersive.client.rt.model.GetXlsxWorksheetsRequest;
import com.cloudmersive.client.rt.model.GetXlsxWorksheetsResponse;
import com.cloudmersive.client.rt.model.InsertDocxCommentOnParagraphResponse;
import com.cloudmersive.client.rt.model.InsertDocxInsertParagraphRequest;
import com.cloudmersive.client.rt.model.InsertDocxInsertParagraphResponse;
import com.cloudmersive.client.rt.model.InsertDocxTableRowRequest;
import com.cloudmersive.client.rt.model.InsertDocxTableRowResponse;
import com.cloudmersive.client.rt.model.InsertDocxTablesRequest;
import com.cloudmersive.client.rt.model.InsertDocxTablesResponse;
import com.cloudmersive.client.rt.model.InsertXlsxWorksheetRequest;
import com.cloudmersive.client.rt.model.InsertXlsxWorksheetResponse;
import com.cloudmersive.client.rt.model.MultiReplaceStringRequest;
import com.cloudmersive.client.rt.model.RemoveDocxHeadersAndFootersRequest;
import com.cloudmersive.client.rt.model.RemoveDocxHeadersAndFootersResponse;
import com.cloudmersive.client.rt.model.RemoveDocxPagesRequest;
import com.cloudmersive.client.rt.model.RemovePptxSlidesRequest;
import com.cloudmersive.client.rt.model.RemoveXlsxWorksheetRequest;
import com.cloudmersive.client.rt.model.RenameXlsxWorksheetRequest;
import com.cloudmersive.client.rt.model.RenameXlsxWorksheetResponse;
import com.cloudmersive.client.rt.model.ReplaceDocxParagraphRequest;
import com.cloudmersive.client.rt.model.ReplaceDocxParagraphResponse;
import com.cloudmersive.client.rt.model.ReplaceStringRequest;
import com.cloudmersive.client.rt.model.SetXlsxCellByIdentifierRequest;
import com.cloudmersive.client.rt.model.SetXlsxCellByIdentifierResponse;
import com.cloudmersive.client.rt.model.SetXlsxCellRequest;
import com.cloudmersive.client.rt.model.SetXlsxCellResponse;
import com.cloudmersive.client.rt.model.UpdateDocxTableCellRequest;
import com.cloudmersive.client.rt.model.UpdateDocxTableCellResponse;
import com.cloudmersive.client.rt.model.UpdateDocxTableRowRequest;
import com.cloudmersive.client.rt.model.UpdateDocxTableRowResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:51:24.468928200Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class EditDocumentApi extends BaseApi {

    public EditDocumentApi() {
        super(new ApiClient());
    }

    public EditDocumentApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Begin editing a document
     * Uploads a document to Cloudmersive to begin a series of one or more editing operations.  To edit a document, first call Begin Editing on the document.  Then perform operations on the document using the secure URL returned from BeginEditing, such as Word DOCX Delete Pages and Insert Table.  Finally, perform finish editing on the URL to return the resulting edited document.  The editing URL is temporary and only stored in-memory cache, and will automatically expire from the cache after 30 minutes, and cannot be directly accessed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String editDocumentBeginEditing(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editDocumentBeginEditingWithHttpInfo(inputFile).getBody();
    }

    /**
     * Begin editing a document
     * Uploads a document to Cloudmersive to begin a series of one or more editing operations.  To edit a document, first call Begin Editing on the document.  Then perform operations on the document using the secure URL returned from BeginEditing, such as Word DOCX Delete Pages and Insert Table.  Finally, perform finish editing on the URL to return the resulting edited document.  The editing URL is temporary and only stored in-memory cache, and will automatically expire from the cache after 30 minutes, and cannot be directly accessed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> editDocumentBeginEditingWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editDocumentBeginEditing");
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

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/convert/edit/begin-editing", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Accept all tracked changes, revisions in a Word DOCX document
     * Accepts all tracked changes and revisions in a Word DOCX document.  This will accept all pending changes in the document when tracked changes is turned on.  Track changes will remain on (if it is on) after this oepration is completed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param autorepair Optional; automatically repair input documents that have errors (default is true) (optional)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editDocumentDocxAcceptAllTrackChanges(org.springframework.core.io.Resource inputFile, Boolean autorepair) throws RestClientException {
        return editDocumentDocxAcceptAllTrackChangesWithHttpInfo(inputFile, autorepair).getBody();
    }

    /**
     * Accept all tracked changes, revisions in a Word DOCX document
     * Accepts all tracked changes and revisions in a Word DOCX document.  This will accept all pending changes in the document when tracked changes is turned on.  Track changes will remain on (if it is on) after this oepration is completed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @param autorepair Optional; automatically repair input documents that have errors (default is true) (optional)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editDocumentDocxAcceptAllTrackChangesWithHttpInfo(org.springframework.core.io.Resource inputFile, Boolean autorepair) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editDocumentDocxAcceptAllTrackChanges");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (autorepair != null)
        localVarHeaderParams.add("autorepair", apiClient.parameterToString(autorepair));

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

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/docx/track-changes/accept-all", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get body from a Word DOCX document
     * Returns the body defined in the Word Document (DOCX) format file; this is the main content part of a DOCX document
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return GetDocxBodyResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxBodyResponse editDocumentDocxBody(GetDocxBodyRequest reqConfig) throws RestClientException {
        return editDocumentDocxBodyWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Get body from a Word DOCX document
     * Returns the body defined in the Word Document (DOCX) format file; this is the main content part of a DOCX document
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;GetDocxBodyResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxBodyResponse> editDocumentDocxBodyWithHttpInfo(GetDocxBodyRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxBody");
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

        ParameterizedTypeReference<GetDocxBodyResponse> localReturnType = new ParameterizedTypeReference<GetDocxBodyResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-body", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a blank Word DOCX document
     * Returns a blank Word DOCX Document format file.  The file is blank, with no contents.  Use additional editing commands such as Insert Paragraph or Insert Table or Insert Image to populate the document.
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return CreateBlankDocxResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateBlankDocxResponse editDocumentDocxCreateBlankDocument(CreateBlankDocxRequest input) throws RestClientException {
        return editDocumentDocxCreateBlankDocumentWithHttpInfo(input).getBody();
    }

    /**
     * Create a blank Word DOCX document
     * Returns a blank Word DOCX Document format file.  The file is blank, with no contents.  Use additional editing commands such as Insert Paragraph or Insert Table or Insert Image to populate the document.
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;CreateBlankDocxResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateBlankDocxResponse> editDocumentDocxCreateBlankDocumentWithHttpInfo(CreateBlankDocxRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentDocxCreateBlankDocument");
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

        ParameterizedTypeReference<CreateBlankDocxResponse> localReturnType = new ParameterizedTypeReference<CreateBlankDocxResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/create/blank", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete, remove pages from a Word DOCX document
     * Returns the edited Word Document in the Word Document (DOCX) format file with the specified pages removed
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editDocumentDocxDeletePages(RemoveDocxPagesRequest reqConfig) throws RestClientException {
        return editDocumentDocxDeletePagesWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Delete, remove pages from a Word DOCX document
     * Returns the edited Word Document in the Word Document (DOCX) format file with the specified pages removed
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editDocumentDocxDeletePagesWithHttpInfo(RemoveDocxPagesRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxDeletePages");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/docx/delete-pages", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Deletes a table row in an existing table in a Word DOCX document
     * Deletes an existing table row in a Word DOCX Document and returns the result.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return DeleteDocxTableRowResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeleteDocxTableRowResponse editDocumentDocxDeleteTableRow(DeleteDocxTableRowRequest reqConfig) throws RestClientException {
        return editDocumentDocxDeleteTableRowWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Deletes a table row in an existing table in a Word DOCX document
     * Deletes an existing table row in a Word DOCX Document and returns the result.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;DeleteDocxTableRowResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeleteDocxTableRowResponse> editDocumentDocxDeleteTableRowWithHttpInfo(DeleteDocxTableRowRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxDeleteTableRow");
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

        ParameterizedTypeReference<DeleteDocxTableRowResponse> localReturnType = new ParameterizedTypeReference<DeleteDocxTableRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/delete-table-row", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Deletes a range of multiple table rows in an existing table in a Word DOCX document
     * Deletes a range of 1 or more existing table rows in a Word DOCX Document and returns the result.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return DeleteDocxTableRowRangeResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeleteDocxTableRowRangeResponse editDocumentDocxDeleteTableRowRange(DeleteDocxTableRowRangeRequest reqConfig) throws RestClientException {
        return editDocumentDocxDeleteTableRowRangeWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Deletes a range of multiple table rows in an existing table in a Word DOCX document
     * Deletes a range of 1 or more existing table rows in a Word DOCX Document and returns the result.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;DeleteDocxTableRowRangeResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeleteDocxTableRowRangeResponse> editDocumentDocxDeleteTableRowRangeWithHttpInfo(DeleteDocxTableRowRangeRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxDeleteTableRowRange");
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

        ParameterizedTypeReference<DeleteDocxTableRowRangeResponse> localReturnType = new ParameterizedTypeReference<DeleteDocxTableRowRangeResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/delete-table-row/range", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Disable track changes, revisions in a Word DOCX document
     * Diables tracking of changes and revisions in a Word DOCX document, and accepts any pending changes.  Users editing the document will no longer see changes tracked automatically.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editDocumentDocxDisableTrackChanges(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editDocumentDocxDisableTrackChangesWithHttpInfo(inputFile).getBody();
    }

    /**
     * Disable track changes, revisions in a Word DOCX document
     * Diables tracking of changes and revisions in a Word DOCX document, and accepts any pending changes.  Users editing the document will no longer see changes tracked automatically.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editDocumentDocxDisableTrackChangesWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editDocumentDocxDisableTrackChanges");
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

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/docx/track-changes/disable", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Enable track changes, revisions in a Word DOCX document
     * Enables tracking of changes and revisions in a Word DOCX document.  Users editing the document will see changes tracked automatically, with edits highlighted, and the ability to accept or reject changes made to the document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editDocumentDocxEnableTrackChanges(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editDocumentDocxEnableTrackChangesWithHttpInfo(inputFile).getBody();
    }

    /**
     * Enable track changes, revisions in a Word DOCX document
     * Enables tracking of changes and revisions in a Word DOCX document.  Users editing the document will see changes tracked automatically, with edits highlighted, and the ability to accept or reject changes made to the document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editDocumentDocxEnableTrackChangesWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editDocumentDocxEnableTrackChanges");
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

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/docx/track-changes/enable", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Find matching paragraphs in a Word DOCX document
     * Returns the paragraphs defined in the Word Document (DOCX) format file that match the input criteria
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return FindDocxParagraphResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FindDocxParagraphResponse editDocumentDocxFindParagraph(FindDocxParagraphRequest reqConfig) throws RestClientException {
        return editDocumentDocxFindParagraphWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Find matching paragraphs in a Word DOCX document
     * Returns the paragraphs defined in the Word Document (DOCX) format file that match the input criteria
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;FindDocxParagraphResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FindDocxParagraphResponse> editDocumentDocxFindParagraphWithHttpInfo(FindDocxParagraphRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxFindParagraph");
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

        ParameterizedTypeReference<FindDocxParagraphResponse> localReturnType = new ParameterizedTypeReference<FindDocxParagraphResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/find/paragraph", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get comments from a Word DOCX document as a flat list
     * Returns the comments and review annotations stored in the Word Document (DOCX) format file as a flattened list (not as a hierarchy of comments and replies).
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return GetDocxCommentsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxCommentsResponse editDocumentDocxGetComments(GetDocxGetCommentsRequest reqConfig) throws RestClientException {
        return editDocumentDocxGetCommentsWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Get comments from a Word DOCX document as a flat list
     * Returns the comments and review annotations stored in the Word Document (DOCX) format file as a flattened list (not as a hierarchy of comments and replies).
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;GetDocxCommentsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxCommentsResponse> editDocumentDocxGetCommentsWithHttpInfo(GetDocxGetCommentsRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxGetComments");
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

        ParameterizedTypeReference<GetDocxCommentsResponse> localReturnType = new ParameterizedTypeReference<GetDocxCommentsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-comments/flat-list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get comments from a Word DOCX document hierarchically
     * Returns the comments and review annotations stored in the Word Document (DOCX) format file hierarchically, where reply comments are nested as children under top-level comments in the results returned.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return GetDocxCommentsHierarchicalResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxCommentsHierarchicalResponse editDocumentDocxGetCommentsHierarchical(GetDocxGetCommentsHierarchicalRequest reqConfig) throws RestClientException {
        return editDocumentDocxGetCommentsHierarchicalWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Get comments from a Word DOCX document hierarchically
     * Returns the comments and review annotations stored in the Word Document (DOCX) format file hierarchically, where reply comments are nested as children under top-level comments in the results returned.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;GetDocxCommentsHierarchicalResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxCommentsHierarchicalResponse> editDocumentDocxGetCommentsHierarchicalWithHttpInfo(GetDocxGetCommentsHierarchicalRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxGetCommentsHierarchical");
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

        ParameterizedTypeReference<GetDocxCommentsHierarchicalResponse> localReturnType = new ParameterizedTypeReference<GetDocxCommentsHierarchicalResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-comments/hierarchical", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all content controls (form fields) and values in a Word DOCX document
     * Returns all the content controls, used for creating form fields, in a Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return GetDocxContentControlsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxContentControlsResponse editDocumentDocxGetContentControls(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editDocumentDocxGetContentControlsWithHttpInfo(inputFile).getBody();
    }

    /**
     * Get all content controls (form fields) and values in a Word DOCX document
     * Returns all the content controls, used for creating form fields, in a Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;GetDocxContentControlsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxContentControlsResponse> editDocumentDocxGetContentControlsWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editDocumentDocxGetContentControls");
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

        ParameterizedTypeReference<GetDocxContentControlsResponse> localReturnType = new ParameterizedTypeReference<GetDocxContentControlsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-content-controls", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all form fields in a Word DOCX document
     * Returns all the content controls, used for creating form fields, as well as handlebar style text-based form fields such as \&quot;{{FieldName}}\&quot;, in a Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return GetDocxGetFormFieldsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxGetFormFieldsResponse editDocumentDocxGetFormFields(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editDocumentDocxGetFormFieldsWithHttpInfo(inputFile).getBody();
    }

    /**
     * Get all form fields in a Word DOCX document
     * Returns all the content controls, used for creating form fields, as well as handlebar style text-based form fields such as \&quot;{{FieldName}}\&quot;, in a Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;GetDocxGetFormFieldsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxGetFormFieldsResponse> editDocumentDocxGetFormFieldsWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editDocumentDocxGetFormFields");
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

        ParameterizedTypeReference<GetDocxGetFormFieldsResponse> localReturnType = new ParameterizedTypeReference<GetDocxGetFormFieldsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-form-fields", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get content of a footer from a Word DOCX document
     * Returns the footer content from a Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return GetDocxHeadersAndFootersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxHeadersAndFootersResponse editDocumentDocxGetHeadersAndFooters(GetDocxHeadersAndFootersRequest reqConfig) throws RestClientException {
        return editDocumentDocxGetHeadersAndFootersWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Get content of a footer from a Word DOCX document
     * Returns the footer content from a Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;GetDocxHeadersAndFootersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxHeadersAndFootersResponse> editDocumentDocxGetHeadersAndFootersWithHttpInfo(GetDocxHeadersAndFootersRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxGetHeadersAndFooters");
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

        ParameterizedTypeReference<GetDocxHeadersAndFootersResponse> localReturnType = new ParameterizedTypeReference<GetDocxHeadersAndFootersResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-headers-and-footers", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get images from a Word DOCX document
     * Returns the images defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return GetDocxImagesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxImagesResponse editDocumentDocxGetImages(GetDocxImagesRequest reqConfig) throws RestClientException {
        return editDocumentDocxGetImagesWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Get images from a Word DOCX document
     * Returns the images defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;GetDocxImagesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxImagesResponse> editDocumentDocxGetImagesWithHttpInfo(GetDocxImagesRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxGetImages");
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

        ParameterizedTypeReference<GetDocxImagesResponse> localReturnType = new ParameterizedTypeReference<GetDocxImagesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-images", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get macro information from a Word DOCX/DOCM document
     * Returns information about the Macros (e.g. VBA) defined in the Word Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return GetMacrosResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetMacrosResponse editDocumentDocxGetMacroInformation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editDocumentDocxGetMacroInformationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Get macro information from a Word DOCX/DOCM document
     * Returns information about the Macros (e.g. VBA) defined in the Word Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;GetMacrosResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetMacrosResponse> editDocumentDocxGetMacroInformationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editDocumentDocxGetMacroInformation");
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

        ParameterizedTypeReference<GetMacrosResponse> localReturnType = new ParameterizedTypeReference<GetMacrosResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-macros", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all metadata properties in Word DOCX document
     * Returns all the metadata properties in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return GetDocxMetadataPropertiesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxMetadataPropertiesResponse editDocumentDocxGetMetadataProperties(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editDocumentDocxGetMetadataPropertiesWithHttpInfo(inputFile).getBody();
    }

    /**
     * Get all metadata properties in Word DOCX document
     * Returns all the metadata properties in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;GetDocxMetadataPropertiesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxMetadataPropertiesResponse> editDocumentDocxGetMetadataPropertiesWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editDocumentDocxGetMetadataProperties");
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

        ParameterizedTypeReference<GetDocxMetadataPropertiesResponse> localReturnType = new ParameterizedTypeReference<GetDocxMetadataPropertiesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-metadata", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get sections from a Word DOCX document
     * Returns the sections defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return GetDocxSectionsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxSectionsResponse editDocumentDocxGetSections(GetDocxSectionsRequest reqConfig) throws RestClientException {
        return editDocumentDocxGetSectionsWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Get sections from a Word DOCX document
     * Returns the sections defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;GetDocxSectionsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxSectionsResponse> editDocumentDocxGetSectionsWithHttpInfo(GetDocxSectionsRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxGetSections");
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

        ParameterizedTypeReference<GetDocxSectionsResponse> localReturnType = new ParameterizedTypeReference<GetDocxSectionsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-sections", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get styles from a Word DOCX document
     * Returns the styles defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return GetDocxStylesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxStylesResponse editDocumentDocxGetStyles(GetDocxStylesRequest reqConfig) throws RestClientException {
        return editDocumentDocxGetStylesWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Get styles from a Word DOCX document
     * Returns the styles defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;GetDocxStylesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxStylesResponse> editDocumentDocxGetStylesWithHttpInfo(GetDocxStylesRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxGetStyles");
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

        ParameterizedTypeReference<GetDocxStylesResponse> localReturnType = new ParameterizedTypeReference<GetDocxStylesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-styles", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a specific table by index in a Word DOCX document
     * Returns the specific table object by its 0-based index in an Office Word Document (DOCX)
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return GetDocxTableByIndexResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxTableByIndexResponse editDocumentDocxGetTableByIndex(GetDocxTableByIndexRequest reqConfig) throws RestClientException {
        return editDocumentDocxGetTableByIndexWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Get a specific table by index in a Word DOCX document
     * Returns the specific table object by its 0-based index in an Office Word Document (DOCX)
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;GetDocxTableByIndexResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxTableByIndexResponse> editDocumentDocxGetTableByIndexWithHttpInfo(GetDocxTableByIndexRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTableByIndex");
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

        ParameterizedTypeReference<GetDocxTableByIndexResponse> localReturnType = new ParameterizedTypeReference<GetDocxTableByIndexResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-table/by-index", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Gets the contents of an existing table row in an existing table in a Word DOCX document
     * Gets the contents of an existing table row in a Word DOCX Document and returns the result.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return GetDocxTableRowResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxTableRowResponse editDocumentDocxGetTableRow(GetDocxTableRowRequest reqConfig) throws RestClientException {
        return editDocumentDocxGetTableRowWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Gets the contents of an existing table row in an existing table in a Word DOCX document
     * Gets the contents of an existing table row in a Word DOCX Document and returns the result.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;GetDocxTableRowResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxTableRowResponse> editDocumentDocxGetTableRowWithHttpInfo(GetDocxTableRowRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTableRow");
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

        ParameterizedTypeReference<GetDocxTableRowResponse> localReturnType = new ParameterizedTypeReference<GetDocxTableRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-table-row", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all tables in Word DOCX document
     * Returns all the table objects in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return GetDocxTablesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxTablesResponse editDocumentDocxGetTables(GetDocxTablesRequest reqConfig) throws RestClientException {
        return editDocumentDocxGetTablesWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Get all tables in Word DOCX document
     * Returns all the table objects in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;GetDocxTablesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxTablesResponse> editDocumentDocxGetTablesWithHttpInfo(GetDocxTablesRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTables");
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

        ParameterizedTypeReference<GetDocxTablesResponse> localReturnType = new ParameterizedTypeReference<GetDocxTablesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-tables", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Insert a new comment into a Word DOCX document attached to a paragraph
     * Adds a new comment into a Word DOCX document attached to a paragraph and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return InsertDocxCommentOnParagraphResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InsertDocxCommentOnParagraphResponse editDocumentDocxInsertCommentOnParagraph(DocxInsertCommentOnParagraphRequest reqConfig) throws RestClientException {
        return editDocumentDocxInsertCommentOnParagraphWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Insert a new comment into a Word DOCX document attached to a paragraph
     * Adds a new comment into a Word DOCX document attached to a paragraph and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;InsertDocxCommentOnParagraphResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InsertDocxCommentOnParagraphResponse> editDocumentDocxInsertCommentOnParagraphWithHttpInfo(DocxInsertCommentOnParagraphRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertCommentOnParagraph");
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

        ParameterizedTypeReference<InsertDocxCommentOnParagraphResponse> localReturnType = new ParameterizedTypeReference<InsertDocxCommentOnParagraphResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/insert-comment/on/paragraph", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Insert image into a Word DOCX document
     * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return DocxInsertImageResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocxInsertImageResponse editDocumentDocxInsertImage(DocxInsertImageRequest reqConfig) throws RestClientException {
        return editDocumentDocxInsertImageWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Insert image into a Word DOCX document
     * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;DocxInsertImageResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocxInsertImageResponse> editDocumentDocxInsertImageWithHttpInfo(DocxInsertImageRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertImage");
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

        ParameterizedTypeReference<DocxInsertImageResponse> localReturnType = new ParameterizedTypeReference<DocxInsertImageResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/insert-image", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Insert a new paragraph into a Word DOCX document
     * Adds a new paragraph into a DOCX and returns the result.  You can insert at the beginning/end of a document, or before/after an existing object using its Path (location within the document).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return InsertDocxInsertParagraphResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InsertDocxInsertParagraphResponse editDocumentDocxInsertParagraph(InsertDocxInsertParagraphRequest reqConfig) throws RestClientException {
        return editDocumentDocxInsertParagraphWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Insert a new paragraph into a Word DOCX document
     * Adds a new paragraph into a DOCX and returns the result.  You can insert at the beginning/end of a document, or before/after an existing object using its Path (location within the document).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;InsertDocxInsertParagraphResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InsertDocxInsertParagraphResponse> editDocumentDocxInsertParagraphWithHttpInfo(InsertDocxInsertParagraphRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertParagraph");
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

        ParameterizedTypeReference<InsertDocxInsertParagraphResponse> localReturnType = new ParameterizedTypeReference<InsertDocxInsertParagraphResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/insert-paragraph", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Insert a new table into a Word DOCX document
     * Adds a new table into a DOCX and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return InsertDocxTablesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InsertDocxTablesResponse editDocumentDocxInsertTable(InsertDocxTablesRequest reqConfig) throws RestClientException {
        return editDocumentDocxInsertTableWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Insert a new table into a Word DOCX document
     * Adds a new table into a DOCX and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;InsertDocxTablesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InsertDocxTablesResponse> editDocumentDocxInsertTableWithHttpInfo(InsertDocxTablesRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertTable");
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

        ParameterizedTypeReference<InsertDocxTablesResponse> localReturnType = new ParameterizedTypeReference<InsertDocxTablesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/insert-table", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Insert a new row into an existing table in a Word DOCX document
     * Adds a new table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return InsertDocxTableRowResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InsertDocxTableRowResponse editDocumentDocxInsertTableRow(InsertDocxTableRowRequest reqConfig) throws RestClientException {
        return editDocumentDocxInsertTableRowWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Insert a new row into an existing table in a Word DOCX document
     * Adds a new table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;InsertDocxTableRowResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InsertDocxTableRowResponse> editDocumentDocxInsertTableRowWithHttpInfo(InsertDocxTableRowRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertTableRow");
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

        ParameterizedTypeReference<InsertDocxTableRowResponse> localReturnType = new ParameterizedTypeReference<InsertDocxTableRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/insert-table-row", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get pages and content from a Word DOCX document
     * Returns the pages and contents of each page defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return GetDocxPagesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDocxPagesResponse editDocumentDocxPages(GetDocxPagesRequest reqConfig) throws RestClientException {
        return editDocumentDocxPagesWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Get pages and content from a Word DOCX document
     * Returns the pages and contents of each page defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;GetDocxPagesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDocxPagesResponse> editDocumentDocxPagesWithHttpInfo(GetDocxPagesRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxPages");
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

        ParameterizedTypeReference<GetDocxPagesResponse> localReturnType = new ParameterizedTypeReference<GetDocxPagesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-pages", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Remove all comments from a Word DOCX document
     * Removes all of the comments from a Word Document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editDocumentDocxRemoveAllComments(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editDocumentDocxRemoveAllCommentsWithHttpInfo(inputFile).getBody();
    }

    /**
     * Remove all comments from a Word DOCX document
     * Removes all of the comments from a Word Document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editDocumentDocxRemoveAllCommentsWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editDocumentDocxRemoveAllComments");
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

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/docx/comments/remove-all", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Remove headers and footers from Word DOCX document
     * Remove all headers, or footers, or both from a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return RemoveDocxHeadersAndFootersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RemoveDocxHeadersAndFootersResponse editDocumentDocxRemoveHeadersAndFooters(RemoveDocxHeadersAndFootersRequest reqConfig) throws RestClientException {
        return editDocumentDocxRemoveHeadersAndFootersWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Remove headers and footers from Word DOCX document
     * Remove all headers, or footers, or both from a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;RemoveDocxHeadersAndFootersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RemoveDocxHeadersAndFootersResponse> editDocumentDocxRemoveHeadersAndFootersWithHttpInfo(RemoveDocxHeadersAndFootersRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxRemoveHeadersAndFooters");
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

        ParameterizedTypeReference<RemoveDocxHeadersAndFootersResponse> localReturnType = new ParameterizedTypeReference<RemoveDocxHeadersAndFootersResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/remove-headers-and-footers", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete any object in a Word DOCX document
     * Delete any object, such as a paragraph, table, image, etc. from a Word Document (DOCX).  Pass in the Path of the object you would like to delete.  You can call other functions such as Get-Tables, Get-Images, Get-Body, etc. to get the paths of the objects in the document.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return DocxRemoveObjectResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocxRemoveObjectResponse editDocumentDocxRemoveObject(DocxRemoveObjectRequest reqConfig) throws RestClientException {
        return editDocumentDocxRemoveObjectWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Delete any object in a Word DOCX document
     * Delete any object, such as a paragraph, table, image, etc. from a Word Document (DOCX).  Pass in the Path of the object you would like to delete.  You can call other functions such as Get-Tables, Get-Images, Get-Body, etc. to get the paths of the objects in the document.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;DocxRemoveObjectResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocxRemoveObjectResponse> editDocumentDocxRemoveObjectWithHttpInfo(DocxRemoveObjectRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxRemoveObject");
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

        ParameterizedTypeReference<DocxRemoveObjectResponse> localReturnType = new ParameterizedTypeReference<DocxRemoveObjectResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/remove-object", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Replace string in Word DOCX document
     * Replace all instances of a string in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param reqConfig Document string replacement configuration input (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editDocumentDocxReplace(ReplaceStringRequest reqConfig) throws RestClientException {
        return editDocumentDocxReplaceWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Replace string in Word DOCX document
     * Replace all instances of a string in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param reqConfig Document string replacement configuration input (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editDocumentDocxReplaceWithHttpInfo(ReplaceStringRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxReplace");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/docx/replace-all", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Replace multiple strings in Word DOCX document, return result
     * Replace all instances of multiple strings in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param reqConfig Document string replacement configuration input (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editDocumentDocxReplaceMulti(MultiReplaceStringRequest reqConfig) throws RestClientException {
        return editDocumentDocxReplaceMultiWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Replace multiple strings in Word DOCX document, return result
     * Replace all instances of multiple strings in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param reqConfig Document string replacement configuration input (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editDocumentDocxReplaceMultiWithHttpInfo(MultiReplaceStringRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceMulti");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/docx/replace-all/multi", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Replace multiple strings in Word DOCX document, return edit session
     * Replace all instances of multiple strings in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
     * <p><b>200</b> - OK
     * @param reqConfig Document string replacement configuration input (required)
     * @return DocumentEditingEditSession
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocumentEditingEditSession editDocumentDocxReplaceMultiEditSession(MultiReplaceStringRequest reqConfig) throws RestClientException {
        return editDocumentDocxReplaceMultiEditSessionWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Replace multiple strings in Word DOCX document, return edit session
     * Replace all instances of multiple strings in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
     * <p><b>200</b> - OK
     * @param reqConfig Document string replacement configuration input (required)
     * @return ResponseEntity&lt;DocumentEditingEditSession&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentEditingEditSession> editDocumentDocxReplaceMultiEditSessionWithHttpInfo(MultiReplaceStringRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceMultiEditSession");
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

        ParameterizedTypeReference<DocumentEditingEditSession> localReturnType = new ParameterizedTypeReference<DocumentEditingEditSession>() {};
        return apiClient.invokeAPI("/convert/edit/docx/replace-all/multi/edit-session", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Replace matching paragraphs in a Word DOCX document
     * Returns the edited Word Document (DOCX) format file with the matching paragraphs replaced as requested.  Replace a paragraph with another object such as an image.  Useful for performing templating operations.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ReplaceDocxParagraphResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReplaceDocxParagraphResponse editDocumentDocxReplaceParagraph(ReplaceDocxParagraphRequest reqConfig) throws RestClientException {
        return editDocumentDocxReplaceParagraphWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Replace matching paragraphs in a Word DOCX document
     * Returns the edited Word Document (DOCX) format file with the matching paragraphs replaced as requested.  Replace a paragraph with another object such as an image.  Useful for performing templating operations.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;ReplaceDocxParagraphResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReplaceDocxParagraphResponse> editDocumentDocxReplaceParagraphWithHttpInfo(ReplaceDocxParagraphRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceParagraph");
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

        ParameterizedTypeReference<ReplaceDocxParagraphResponse> localReturnType = new ParameterizedTypeReference<ReplaceDocxParagraphResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/replace/paragraph", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set custom property metadata properties in Word DOCX document
     * Sets the custom property metadata for the metadata properties in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param input  (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editDocumentDocxSetCustomMetadataProperties(DocxSetCustomMetadataPropertiesRequest input) throws RestClientException {
        return editDocumentDocxSetCustomMetadataPropertiesWithHttpInfo(input).getBody();
    }

    /**
     * Set custom property metadata properties in Word DOCX document
     * Sets the custom property metadata for the metadata properties in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param input  (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editDocumentDocxSetCustomMetadataPropertiesWithHttpInfo(DocxSetCustomMetadataPropertiesRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentDocxSetCustomMetadataProperties");
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

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/docx/set-metadata/custom-property", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set the footer in a Word DOCX document
     * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return DocxSetFooterResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocxSetFooterResponse editDocumentDocxSetFooter(DocxSetFooterRequest reqConfig) throws RestClientException {
        return editDocumentDocxSetFooterWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Set the footer in a Word DOCX document
     * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;DocxSetFooterResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocxSetFooterResponse> editDocumentDocxSetFooterWithHttpInfo(DocxSetFooterRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFooter");
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

        ParameterizedTypeReference<DocxSetFooterResponse> localReturnType = new ParameterizedTypeReference<DocxSetFooterResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/set-footer", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add page number to footer in a Word DOCX document
     * Set the footer in a Word Document (DOCX) to contain a page number.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return DocxSetFooterResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocxSetFooterResponse editDocumentDocxSetFooterAddPageNumber(DocxSetFooterAddPageNumberRequest reqConfig) throws RestClientException {
        return editDocumentDocxSetFooterAddPageNumberWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Add page number to footer in a Word DOCX document
     * Set the footer in a Word Document (DOCX) to contain a page number.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;DocxSetFooterResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocxSetFooterResponse> editDocumentDocxSetFooterAddPageNumberWithHttpInfo(DocxSetFooterAddPageNumberRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFooterAddPageNumber");
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

        ParameterizedTypeReference<DocxSetFooterResponse> localReturnType = new ParameterizedTypeReference<DocxSetFooterResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/set-footer/add-page-number", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set and fill values for form fields in a Word DOCX document
     * Modifies a Office Word Document (docx) by filling in form fields using the provided values.
     * <p><b>200</b> - OK
     * @param reqConfig  (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editDocumentDocxSetFormFields(DocxSetFormFieldsRequest reqConfig) throws RestClientException {
        return editDocumentDocxSetFormFieldsWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Set and fill values for form fields in a Word DOCX document
     * Modifies a Office Word Document (docx) by filling in form fields using the provided values.
     * <p><b>200</b> - OK
     * @param reqConfig  (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editDocumentDocxSetFormFieldsWithHttpInfo(DocxSetFormFieldsRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFormFields");
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

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/docx/set-form-fields", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set the header in a Word DOCX document
     * Set the header in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return DocxSetHeaderResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DocxSetHeaderResponse editDocumentDocxSetHeader(DocxSetHeaderRequest reqConfig) throws RestClientException {
        return editDocumentDocxSetHeaderWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Set the header in a Word DOCX document
     * Set the header in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;DocxSetHeaderResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocxSetHeaderResponse> editDocumentDocxSetHeaderWithHttpInfo(DocxSetHeaderRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxSetHeader");
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

        ParameterizedTypeReference<DocxSetHeaderResponse> localReturnType = new ParameterizedTypeReference<DocxSetHeaderResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/set-header", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update, set contents of a table cell in an existing table in a Word DOCX document
     * Sets the contents of a table cell into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return UpdateDocxTableCellResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateDocxTableCellResponse editDocumentDocxUpdateTableCell(UpdateDocxTableCellRequest reqConfig) throws RestClientException {
        return editDocumentDocxUpdateTableCellWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Update, set contents of a table cell in an existing table in a Word DOCX document
     * Sets the contents of a table cell into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;UpdateDocxTableCellResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateDocxTableCellResponse> editDocumentDocxUpdateTableCellWithHttpInfo(UpdateDocxTableCellRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxUpdateTableCell");
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

        ParameterizedTypeReference<UpdateDocxTableCellResponse> localReturnType = new ParameterizedTypeReference<UpdateDocxTableCellResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/update-table-cell", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update, set contents of a table row in an existing table in a Word DOCX document
     * Sets the contents of a table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return UpdateDocxTableRowResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateDocxTableRowResponse editDocumentDocxUpdateTableRow(UpdateDocxTableRowRequest reqConfig) throws RestClientException {
        return editDocumentDocxUpdateTableRowWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Update, set contents of a table row in an existing table in a Word DOCX document
     * Sets the contents of a table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request (required)
     * @return ResponseEntity&lt;UpdateDocxTableRowResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateDocxTableRowResponse> editDocumentDocxUpdateTableRowWithHttpInfo(UpdateDocxTableRowRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentDocxUpdateTableRow");
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

        ParameterizedTypeReference<UpdateDocxTableRowResponse> localReturnType = new ParameterizedTypeReference<UpdateDocxTableRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/update-table-row", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Finish editing document, and download result from document editing
     * Once done editing a document, download the result.  Begin editing a document by calling begin-editing, then perform operations, then call finish-editing to get the result.
     * <p><b>200</b> - OK
     * @param reqConfig Cloudmersive Document URL to complete editing on (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editDocumentFinishEditing(FinishEditingRequest reqConfig) throws RestClientException {
        return editDocumentFinishEditingWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Finish editing document, and download result from document editing
     * Once done editing a document, download the result.  Begin editing a document by calling begin-editing, then perform operations, then call finish-editing to get the result.
     * <p><b>200</b> - OK
     * @param reqConfig Cloudmersive Document URL to complete editing on (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editDocumentFinishEditingWithHttpInfo(FinishEditingRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentFinishEditing");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/finish-editing", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete, remove slides from a PowerPoint PPTX presentation document
     * Edits the input PowerPoint PPTX presentation document to remove the specified slides
     * <p><b>200</b> - OK
     * @param reqConfig Presentation input request (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editDocumentPptxDeleteSlides(RemovePptxSlidesRequest reqConfig) throws RestClientException {
        return editDocumentPptxDeleteSlidesWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Delete, remove slides from a PowerPoint PPTX presentation document
     * Edits the input PowerPoint PPTX presentation document to remove the specified slides
     * <p><b>200</b> - OK
     * @param reqConfig Presentation input request (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editDocumentPptxDeleteSlidesWithHttpInfo(RemovePptxSlidesRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentPptxDeleteSlides");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/pptx/delete-slides", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get macro information from a PowerPoint PPTX/PPTM presentation document
     * Returns information about the Macros (e.g. VBA) defined in the PowerPoint Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return GetMacrosResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetMacrosResponse editDocumentPptxGetMacroInformation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editDocumentPptxGetMacroInformationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Get macro information from a PowerPoint PPTX/PPTM presentation document
     * Returns information about the Macros (e.g. VBA) defined in the PowerPoint Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;GetMacrosResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetMacrosResponse> editDocumentPptxGetMacroInformationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editDocumentPptxGetMacroInformation");
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

        ParameterizedTypeReference<GetMacrosResponse> localReturnType = new ParameterizedTypeReference<GetMacrosResponse>() {};
        return apiClient.invokeAPI("/convert/edit/pptx/get-macros", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Replace string in PowerPoint PPTX presentation
     * Replace all instances of a string in an Office PowerPoint Document (pptx)
     * <p><b>200</b> - OK
     * @param reqConfig Replacement document configuration input (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editDocumentPptxReplace(ReplaceStringRequest reqConfig) throws RestClientException {
        return editDocumentPptxReplaceWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Replace string in PowerPoint PPTX presentation
     * Replace all instances of a string in an Office PowerPoint Document (pptx)
     * <p><b>200</b> - OK
     * @param reqConfig Replacement document configuration input (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editDocumentPptxReplaceWithHttpInfo(ReplaceStringRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentPptxReplace");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/pptx/replace-all", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Append row to a Excel XLSX spreadsheet, worksheet
     * Appends a row to the end of an Excel Spreadsheet worksheet.
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return AppendXlsxRowResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AppendXlsxRowResponse editDocumentXlsxAppendRow(AppendXlsxRowRequest input) throws RestClientException {
        return editDocumentXlsxAppendRowWithHttpInfo(input).getBody();
    }

    /**
     * Append row to a Excel XLSX spreadsheet, worksheet
     * Appends a row to the end of an Excel Spreadsheet worksheet.
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;AppendXlsxRowResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AppendXlsxRowResponse> editDocumentXlsxAppendRowWithHttpInfo(AppendXlsxRowRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxAppendRow");
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

        ParameterizedTypeReference<AppendXlsxRowResponse> localReturnType = new ParameterizedTypeReference<AppendXlsxRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/append-row", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Clear cell contents in an Excel XLSX spreadsheet, worksheet by index
     * Clears, sets to blank, the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ClearXlsxCellResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClearXlsxCellResponse editDocumentXlsxClearCellByIndex(ClearXlsxCellRequest input) throws RestClientException {
        return editDocumentXlsxClearCellByIndexWithHttpInfo(input).getBody();
    }

    /**
     * Clear cell contents in an Excel XLSX spreadsheet, worksheet by index
     * Clears, sets to blank, the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;ClearXlsxCellResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClearXlsxCellResponse> editDocumentXlsxClearCellByIndexWithHttpInfo(ClearXlsxCellRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxClearCellByIndex");
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

        ParameterizedTypeReference<ClearXlsxCellResponse> localReturnType = new ParameterizedTypeReference<ClearXlsxCellResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/clear-cell/by-index", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Clear row from a Excel XLSX spreadsheet, worksheet
     * Clears data from a specific row in the Excel Spreadsheet worksheet, leaving a blank row. Use the Get Rows And Cells API to enumerate available rows in a spreadsheet.
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ClearXlsxRowResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClearXlsxRowResponse editDocumentXlsxClearRow(ClearXlsxRowRequest input) throws RestClientException {
        return editDocumentXlsxClearRowWithHttpInfo(input).getBody();
    }

    /**
     * Clear row from a Excel XLSX spreadsheet, worksheet
     * Clears data from a specific row in the Excel Spreadsheet worksheet, leaving a blank row. Use the Get Rows And Cells API to enumerate available rows in a spreadsheet.
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;ClearXlsxRowResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClearXlsxRowResponse> editDocumentXlsxClearRowWithHttpInfo(ClearXlsxRowRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxClearRow");
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

        ParameterizedTypeReference<ClearXlsxRowResponse> localReturnType = new ParameterizedTypeReference<ClearXlsxRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/clear-row", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a blank Excel XLSX spreadsheet
     * Returns a blank Excel XLSX Spreadsheet (XLSX) format file
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return CreateBlankSpreadsheetResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateBlankSpreadsheetResponse editDocumentXlsxCreateBlankSpreadsheet(CreateBlankSpreadsheetRequest input) throws RestClientException {
        return editDocumentXlsxCreateBlankSpreadsheetWithHttpInfo(input).getBody();
    }

    /**
     * Create a blank Excel XLSX spreadsheet
     * Returns a blank Excel XLSX Spreadsheet (XLSX) format file
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;CreateBlankSpreadsheetResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateBlankSpreadsheetResponse> editDocumentXlsxCreateBlankSpreadsheetWithHttpInfo(CreateBlankSpreadsheetRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxCreateBlankSpreadsheet");
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

        ParameterizedTypeReference<CreateBlankSpreadsheetResponse> localReturnType = new ParameterizedTypeReference<CreateBlankSpreadsheetResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/create/blank", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a new Excel XLSX spreadsheet from column and row data
     * Returns a new Excel XLSX Spreadsheet (XLSX) format file populated with column and row data specified as input
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return CreateSpreadsheetFromDataResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateSpreadsheetFromDataResponse editDocumentXlsxCreateSpreadsheetFromData(CreateSpreadsheetFromDataRequest input) throws RestClientException {
        return editDocumentXlsxCreateSpreadsheetFromDataWithHttpInfo(input).getBody();
    }

    /**
     * Create a new Excel XLSX spreadsheet from column and row data
     * Returns a new Excel XLSX Spreadsheet (XLSX) format file populated with column and row data specified as input
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;CreateSpreadsheetFromDataResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateSpreadsheetFromDataResponse> editDocumentXlsxCreateSpreadsheetFromDataWithHttpInfo(CreateSpreadsheetFromDataRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxCreateSpreadsheetFromData");
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

        ParameterizedTypeReference<CreateSpreadsheetFromDataResponse> localReturnType = new ParameterizedTypeReference<CreateSpreadsheetFromDataResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/create/from/data", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete, remove worksheet from an Excel XLSX spreadsheet document
     * Edits the input Excel XLSX spreadsheet document to remove the specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
     * <p><b>200</b> - OK
     * @param reqConfig Spreadsheet input request (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] editDocumentXlsxDeleteWorksheet(RemoveXlsxWorksheetRequest reqConfig) throws RestClientException {
        return editDocumentXlsxDeleteWorksheetWithHttpInfo(reqConfig).getBody();
    }

    /**
     * Delete, remove worksheet from an Excel XLSX spreadsheet document
     * Edits the input Excel XLSX spreadsheet document to remove the specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
     * <p><b>200</b> - OK
     * @param reqConfig Spreadsheet input request (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> editDocumentXlsxDeleteWorksheetWithHttpInfo(RemoveXlsxWorksheetRequest reqConfig) throws RestClientException {
        Object localVarPostBody = reqConfig;
        
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reqConfig' when calling editDocumentXlsxDeleteWorksheet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/delete-worksheet", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Disable Shared Workbook (legacy) in Excel XLSX spreadsheet
     * Disable the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return DisableSharedWorkbookResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DisableSharedWorkbookResponse editDocumentXlsxDisableSharedWorkbook(DisableSharedWorkbookRequest input) throws RestClientException {
        return editDocumentXlsxDisableSharedWorkbookWithHttpInfo(input).getBody();
    }

    /**
     * Disable Shared Workbook (legacy) in Excel XLSX spreadsheet
     * Disable the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;DisableSharedWorkbookResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DisableSharedWorkbookResponse> editDocumentXlsxDisableSharedWorkbookWithHttpInfo(DisableSharedWorkbookRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxDisableSharedWorkbook");
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

        ParameterizedTypeReference<DisableSharedWorkbookResponse> localReturnType = new ParameterizedTypeReference<DisableSharedWorkbookResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/configuration/disable-shared-workbook", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Enable Shared Workbook (legacy) in Excel XLSX spreadsheet
     * Enables the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return EnableSharedWorkbookResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EnableSharedWorkbookResponse editDocumentXlsxEnableSharedWorkbook(EnableSharedWorkbookRequest input) throws RestClientException {
        return editDocumentXlsxEnableSharedWorkbookWithHttpInfo(input).getBody();
    }

    /**
     * Enable Shared Workbook (legacy) in Excel XLSX spreadsheet
     * Enables the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;EnableSharedWorkbookResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EnableSharedWorkbookResponse> editDocumentXlsxEnableSharedWorkbookWithHttpInfo(EnableSharedWorkbookRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxEnableSharedWorkbook");
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

        ParameterizedTypeReference<EnableSharedWorkbookResponse> localReturnType = new ParameterizedTypeReference<EnableSharedWorkbookResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/configuration/enable-shared-workbook", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get cell from an Excel XLSX spreadsheet, worksheet by cell identifier
     * Returns the value of a specific cell based on its identifier (e.g. A1, B22, C33, etc.) in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return GetXlsxCellByIdentifierResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetXlsxCellByIdentifierResponse editDocumentXlsxGetCellByIdentifier(GetXlsxCellByIdentifierRequest input) throws RestClientException {
        return editDocumentXlsxGetCellByIdentifierWithHttpInfo(input).getBody();
    }

    /**
     * Get cell from an Excel XLSX spreadsheet, worksheet by cell identifier
     * Returns the value of a specific cell based on its identifier (e.g. A1, B22, C33, etc.) in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;GetXlsxCellByIdentifierResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetXlsxCellByIdentifierResponse> editDocumentXlsxGetCellByIdentifierWithHttpInfo(GetXlsxCellByIdentifierRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxGetCellByIdentifier");
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

        ParameterizedTypeReference<GetXlsxCellByIdentifierResponse> localReturnType = new ParameterizedTypeReference<GetXlsxCellByIdentifierResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-cell/by-identifier", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get cell from an Excel XLSX spreadsheet, worksheet by index
     * Returns the value and definition of a specific cell in a specific row in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return GetXlsxCellResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetXlsxCellResponse editDocumentXlsxGetCellByIndex(GetXlsxCellRequest input) throws RestClientException {
        return editDocumentXlsxGetCellByIndexWithHttpInfo(input).getBody();
    }

    /**
     * Get cell from an Excel XLSX spreadsheet, worksheet by index
     * Returns the value and definition of a specific cell in a specific row in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;GetXlsxCellResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetXlsxCellResponse> editDocumentXlsxGetCellByIndexWithHttpInfo(GetXlsxCellRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxGetCellByIndex");
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

        ParameterizedTypeReference<GetXlsxCellResponse> localReturnType = new ParameterizedTypeReference<GetXlsxCellResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-cell/by-index", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get columns from a Excel XLSX spreadsheet, worksheet
     * Returns the columns defined in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return GetXlsxColumnsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetXlsxColumnsResponse editDocumentXlsxGetColumns(GetXlsxColumnsRequest input) throws RestClientException {
        return editDocumentXlsxGetColumnsWithHttpInfo(input).getBody();
    }

    /**
     * Get columns from a Excel XLSX spreadsheet, worksheet
     * Returns the columns defined in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;GetXlsxColumnsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetXlsxColumnsResponse> editDocumentXlsxGetColumnsWithHttpInfo(GetXlsxColumnsRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxGetColumns");
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

        ParameterizedTypeReference<GetXlsxColumnsResponse> localReturnType = new ParameterizedTypeReference<GetXlsxColumnsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-columns", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get images from a Excel XLSX spreadsheet, worksheet
     * Returns the images defined in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return GetXlsxImagesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetXlsxImagesResponse editDocumentXlsxGetImages(GetXlsxImagesRequest input) throws RestClientException {
        return editDocumentXlsxGetImagesWithHttpInfo(input).getBody();
    }

    /**
     * Get images from a Excel XLSX spreadsheet, worksheet
     * Returns the images defined in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;GetXlsxImagesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetXlsxImagesResponse> editDocumentXlsxGetImagesWithHttpInfo(GetXlsxImagesRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxGetImages");
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

        ParameterizedTypeReference<GetXlsxImagesResponse> localReturnType = new ParameterizedTypeReference<GetXlsxImagesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-images", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get macro information from a Excel XLSX/XLSM spreadsheet, worksheet
     * Returns information about the Macros (e.g. VBA) defined in the Excel Spreadsheet
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return GetMacrosResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetMacrosResponse editDocumentXlsxGetMacroInformation(org.springframework.core.io.Resource inputFile) throws RestClientException {
        return editDocumentXlsxGetMacroInformationWithHttpInfo(inputFile).getBody();
    }

    /**
     * Get macro information from a Excel XLSX/XLSM spreadsheet, worksheet
     * Returns information about the Macros (e.g. VBA) defined in the Excel Spreadsheet
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on. (required)
     * @return ResponseEntity&lt;GetMacrosResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetMacrosResponse> editDocumentXlsxGetMacroInformationWithHttpInfo(org.springframework.core.io.Resource inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling editDocumentXlsxGetMacroInformation");
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

        ParameterizedTypeReference<GetMacrosResponse> localReturnType = new ParameterizedTypeReference<GetMacrosResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-macros", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get rows and cells from a Excel XLSX spreadsheet, worksheet
     * Returns the rows and cells defined in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return GetXlsxRowsAndCellsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetXlsxRowsAndCellsResponse editDocumentXlsxGetRowsAndCells(GetXlsxRowsAndCellsRequest input) throws RestClientException {
        return editDocumentXlsxGetRowsAndCellsWithHttpInfo(input).getBody();
    }

    /**
     * Get rows and cells from a Excel XLSX spreadsheet, worksheet
     * Returns the rows and cells defined in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;GetXlsxRowsAndCellsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetXlsxRowsAndCellsResponse> editDocumentXlsxGetRowsAndCellsWithHttpInfo(GetXlsxRowsAndCellsRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxGetRowsAndCells");
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

        ParameterizedTypeReference<GetXlsxRowsAndCellsResponse> localReturnType = new ParameterizedTypeReference<GetXlsxRowsAndCellsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-rows-and-cells", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a specific row from a Excel XLSX spreadsheet, worksheet by path
     * Returns the specific row and its cells defined in the Excel Spreadsheet worksheet based on the specified path.
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return GetXlsxSpecificRowResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetXlsxSpecificRowResponse editDocumentXlsxGetSpecificRow(GetXlsxSpecificRowRequest input) throws RestClientException {
        return editDocumentXlsxGetSpecificRowWithHttpInfo(input).getBody();
    }

    /**
     * Get a specific row from a Excel XLSX spreadsheet, worksheet by path
     * Returns the specific row and its cells defined in the Excel Spreadsheet worksheet based on the specified path.
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;GetXlsxSpecificRowResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetXlsxSpecificRowResponse> editDocumentXlsxGetSpecificRowWithHttpInfo(GetXlsxSpecificRowRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxGetSpecificRow");
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

        ParameterizedTypeReference<GetXlsxSpecificRowResponse> localReturnType = new ParameterizedTypeReference<GetXlsxSpecificRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-specific-row", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get styles from a Excel XLSX spreadsheet, worksheet
     * Returns the style defined in the Excel Spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return GetXlsxStylesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetXlsxStylesResponse editDocumentXlsxGetStyles(GetXlsxStylesRequest input) throws RestClientException {
        return editDocumentXlsxGetStylesWithHttpInfo(input).getBody();
    }

    /**
     * Get styles from a Excel XLSX spreadsheet, worksheet
     * Returns the style defined in the Excel Spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;GetXlsxStylesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetXlsxStylesResponse> editDocumentXlsxGetStylesWithHttpInfo(GetXlsxStylesRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxGetStyles");
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

        ParameterizedTypeReference<GetXlsxStylesResponse> localReturnType = new ParameterizedTypeReference<GetXlsxStylesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-styles", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get worksheets from a Excel XLSX spreadsheet
     * Returns the worksheets (tabs) defined in the Excel Spreadsheet (XLSX) format file
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return GetXlsxWorksheetsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetXlsxWorksheetsResponse editDocumentXlsxGetWorksheets(GetXlsxWorksheetsRequest input) throws RestClientException {
        return editDocumentXlsxGetWorksheetsWithHttpInfo(input).getBody();
    }

    /**
     * Get worksheets from a Excel XLSX spreadsheet
     * Returns the worksheets (tabs) defined in the Excel Spreadsheet (XLSX) format file
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;GetXlsxWorksheetsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetXlsxWorksheetsResponse> editDocumentXlsxGetWorksheetsWithHttpInfo(GetXlsxWorksheetsRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxGetWorksheets");
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

        ParameterizedTypeReference<GetXlsxWorksheetsResponse> localReturnType = new ParameterizedTypeReference<GetXlsxWorksheetsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-worksheets", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Insert a new worksheet into an Excel XLSX spreadsheet
     * Inserts a new worksheet into an Excel Spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return InsertXlsxWorksheetResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InsertXlsxWorksheetResponse editDocumentXlsxInsertWorksheet(InsertXlsxWorksheetRequest input) throws RestClientException {
        return editDocumentXlsxInsertWorksheetWithHttpInfo(input).getBody();
    }

    /**
     * Insert a new worksheet into an Excel XLSX spreadsheet
     * Inserts a new worksheet into an Excel Spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;InsertXlsxWorksheetResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InsertXlsxWorksheetResponse> editDocumentXlsxInsertWorksheetWithHttpInfo(InsertXlsxWorksheetRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxInsertWorksheet");
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

        ParameterizedTypeReference<InsertXlsxWorksheetResponse> localReturnType = new ParameterizedTypeReference<InsertXlsxWorksheetResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/insert-worksheet", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Rename a specific worksheet in a Excel XLSX spreadsheet
     * Edits the input Excel XLSX spreadsheet document to rename a specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return RenameXlsxWorksheetResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RenameXlsxWorksheetResponse editDocumentXlsxRenameWorksheet(RenameXlsxWorksheetRequest input) throws RestClientException {
        return editDocumentXlsxRenameWorksheetWithHttpInfo(input).getBody();
    }

    /**
     * Rename a specific worksheet in a Excel XLSX spreadsheet
     * Edits the input Excel XLSX spreadsheet document to rename a specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;RenameXlsxWorksheetResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RenameXlsxWorksheetResponse> editDocumentXlsxRenameWorksheetWithHttpInfo(RenameXlsxWorksheetRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxRenameWorksheet");
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

        ParameterizedTypeReference<RenameXlsxWorksheetResponse> localReturnType = new ParameterizedTypeReference<RenameXlsxWorksheetResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/rename-worksheet", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by cell identifier
     * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet using its cell identifier (e.g. A1, B22, C33) in the worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return SetXlsxCellByIdentifierResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SetXlsxCellByIdentifierResponse editDocumentXlsxSetCellByIdentifier(SetXlsxCellByIdentifierRequest input) throws RestClientException {
        return editDocumentXlsxSetCellByIdentifierWithHttpInfo(input).getBody();
    }

    /**
     * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by cell identifier
     * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet using its cell identifier (e.g. A1, B22, C33) in the worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;SetXlsxCellByIdentifierResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SetXlsxCellByIdentifierResponse> editDocumentXlsxSetCellByIdentifierWithHttpInfo(SetXlsxCellByIdentifierRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxSetCellByIdentifier");
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

        ParameterizedTypeReference<SetXlsxCellByIdentifierResponse> localReturnType = new ParameterizedTypeReference<SetXlsxCellByIdentifierResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/set-cell/by-identifier", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by index
     * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return SetXlsxCellResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SetXlsxCellResponse editDocumentXlsxSetCellByIndex(SetXlsxCellRequest input) throws RestClientException {
        return editDocumentXlsxSetCellByIndexWithHttpInfo(input).getBody();
    }

    /**
     * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by index
     * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
     * <p><b>200</b> - OK
     * @param input Document input request (required)
     * @return ResponseEntity&lt;SetXlsxCellResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SetXlsxCellResponse> editDocumentXlsxSetCellByIndexWithHttpInfo(SetXlsxCellRequest input) throws RestClientException {
        Object localVarPostBody = input;
        
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'input' when calling editDocumentXlsxSetCellByIndex");
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

        ParameterizedTypeReference<SetXlsxCellResponse> localReturnType = new ParameterizedTypeReference<SetXlsxCellResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/set-cell/by-index", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
