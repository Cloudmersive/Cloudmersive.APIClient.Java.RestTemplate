/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import com.cloudmersive.client.model.AppendXlsxRowRequest;
import com.cloudmersive.client.model.AppendXlsxRowResponse;
import com.cloudmersive.client.model.ClearXlsxCellRequest;
import com.cloudmersive.client.model.ClearXlsxCellResponse;
import com.cloudmersive.client.model.ClearXlsxRowRequest;
import com.cloudmersive.client.model.ClearXlsxRowResponse;
import com.cloudmersive.client.model.CreateBlankDocxRequest;
import com.cloudmersive.client.model.CreateBlankDocxResponse;
import com.cloudmersive.client.model.CreateBlankSpreadsheetRequest;
import com.cloudmersive.client.model.CreateBlankSpreadsheetResponse;
import com.cloudmersive.client.model.CreateSpreadsheetFromDataRequest;
import com.cloudmersive.client.model.CreateSpreadsheetFromDataResponse;
import com.cloudmersive.client.model.DeleteDocxTableRowRangeRequest;
import com.cloudmersive.client.model.DeleteDocxTableRowRangeResponse;
import com.cloudmersive.client.model.DeleteDocxTableRowRequest;
import com.cloudmersive.client.model.DeleteDocxTableRowResponse;
import com.cloudmersive.client.model.DisableSharedWorkbookRequest;
import com.cloudmersive.client.model.DisableSharedWorkbookResponse;
import com.cloudmersive.client.model.DocxInsertCommentOnParagraphRequest;
import com.cloudmersive.client.model.DocxInsertImageRequest;
import com.cloudmersive.client.model.DocxInsertImageResponse;
import com.cloudmersive.client.model.DocxRemoveObjectRequest;
import com.cloudmersive.client.model.DocxRemoveObjectResponse;
import com.cloudmersive.client.model.DocxSetFooterAddPageNumberRequest;
import com.cloudmersive.client.model.DocxSetFooterRequest;
import com.cloudmersive.client.model.DocxSetFooterResponse;
import com.cloudmersive.client.model.DocxSetHeaderRequest;
import com.cloudmersive.client.model.DocxSetHeaderResponse;
import com.cloudmersive.client.model.EnableSharedWorkbookRequest;
import com.cloudmersive.client.model.EnableSharedWorkbookResponse;
import java.io.File;
import com.cloudmersive.client.model.FindDocxParagraphRequest;
import com.cloudmersive.client.model.FindDocxParagraphResponse;
import com.cloudmersive.client.model.FinishEditingRequest;
import com.cloudmersive.client.model.GetDocxBodyRequest;
import com.cloudmersive.client.model.GetDocxBodyResponse;
import com.cloudmersive.client.model.GetDocxCommentsHierarchicalResponse;
import com.cloudmersive.client.model.GetDocxCommentsResponse;
import com.cloudmersive.client.model.GetDocxGetCommentsHierarchicalRequest;
import com.cloudmersive.client.model.GetDocxGetCommentsRequest;
import com.cloudmersive.client.model.GetDocxHeadersAndFootersRequest;
import com.cloudmersive.client.model.GetDocxHeadersAndFootersResponse;
import com.cloudmersive.client.model.GetDocxImagesRequest;
import com.cloudmersive.client.model.GetDocxImagesResponse;
import com.cloudmersive.client.model.GetDocxPagesRequest;
import com.cloudmersive.client.model.GetDocxPagesResponse;
import com.cloudmersive.client.model.GetDocxSectionsRequest;
import com.cloudmersive.client.model.GetDocxSectionsResponse;
import com.cloudmersive.client.model.GetDocxStylesRequest;
import com.cloudmersive.client.model.GetDocxStylesResponse;
import com.cloudmersive.client.model.GetDocxTableByIndexRequest;
import com.cloudmersive.client.model.GetDocxTableByIndexResponse;
import com.cloudmersive.client.model.GetDocxTableRowRequest;
import com.cloudmersive.client.model.GetDocxTableRowResponse;
import com.cloudmersive.client.model.GetDocxTablesRequest;
import com.cloudmersive.client.model.GetDocxTablesResponse;
import com.cloudmersive.client.model.GetXlsxCellByIdentifierRequest;
import com.cloudmersive.client.model.GetXlsxCellByIdentifierResponse;
import com.cloudmersive.client.model.GetXlsxCellRequest;
import com.cloudmersive.client.model.GetXlsxCellResponse;
import com.cloudmersive.client.model.GetXlsxColumnsRequest;
import com.cloudmersive.client.model.GetXlsxColumnsResponse;
import com.cloudmersive.client.model.GetXlsxImagesRequest;
import com.cloudmersive.client.model.GetXlsxImagesResponse;
import com.cloudmersive.client.model.GetXlsxRowsAndCellsRequest;
import com.cloudmersive.client.model.GetXlsxRowsAndCellsResponse;
import com.cloudmersive.client.model.GetXlsxSpecificRowRequest;
import com.cloudmersive.client.model.GetXlsxSpecificRowResponse;
import com.cloudmersive.client.model.GetXlsxStylesRequest;
import com.cloudmersive.client.model.GetXlsxStylesResponse;
import com.cloudmersive.client.model.GetXlsxWorksheetsRequest;
import com.cloudmersive.client.model.GetXlsxWorksheetsResponse;
import com.cloudmersive.client.model.InsertDocxCommentOnParagraphResponse;
import com.cloudmersive.client.model.InsertDocxInsertParagraphRequest;
import com.cloudmersive.client.model.InsertDocxInsertParagraphResponse;
import com.cloudmersive.client.model.InsertDocxTableRowRequest;
import com.cloudmersive.client.model.InsertDocxTableRowResponse;
import com.cloudmersive.client.model.InsertDocxTablesRequest;
import com.cloudmersive.client.model.InsertDocxTablesResponse;
import com.cloudmersive.client.model.InsertXlsxWorksheetRequest;
import com.cloudmersive.client.model.InsertXlsxWorksheetResponse;
import com.cloudmersive.client.model.MultiReplaceStringRequest;
import com.cloudmersive.client.model.RemoveDocxHeadersAndFootersRequest;
import com.cloudmersive.client.model.RemoveDocxHeadersAndFootersResponse;
import com.cloudmersive.client.model.RemoveDocxPagesRequest;
import com.cloudmersive.client.model.RemovePptxSlidesRequest;
import com.cloudmersive.client.model.RemoveXlsxWorksheetRequest;
import com.cloudmersive.client.model.RenameXlsxWorksheetRequest;
import com.cloudmersive.client.model.RenameXlsxWorksheetResponse;
import com.cloudmersive.client.model.ReplaceDocxParagraphRequest;
import com.cloudmersive.client.model.ReplaceDocxParagraphResponse;
import com.cloudmersive.client.model.ReplaceStringRequest;
import com.cloudmersive.client.model.SetXlsxCellByIdentifierRequest;
import com.cloudmersive.client.model.SetXlsxCellByIdentifierResponse;
import com.cloudmersive.client.model.SetXlsxCellRequest;
import com.cloudmersive.client.model.SetXlsxCellResponse;
import com.cloudmersive.client.model.UpdateDocxTableCellRequest;
import com.cloudmersive.client.model.UpdateDocxTableCellResponse;
import com.cloudmersive.client.model.UpdateDocxTableRowRequest;
import com.cloudmersive.client.model.UpdateDocxTableRowResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EditDocumentApi
 */
@Ignore
public class EditDocumentApiTest {

    private final EditDocumentApi api = new EditDocumentApi();

    
    /**
     * Begin editing a document
     *
     * Uploads a document to Cloudmersive to begin a series of one or more editing operations.  To edit a document, first call Begin Editing on the document.  Then perform operations on the document using the secure URL returned from BeginEditing, such as Word DOCX Delete Pages and Insert Table.  Finally, perform finish editing on the URL to return the resulting edited document.  The editing URL is temporary and only stored in-memory cache, and will automatically expire from the cache after 30 minutes, and cannot be directly accessed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentBeginEditingTest() {
        org.springframework.core.io.Resource inputFile = null;
        String response = api.editDocumentBeginEditing(inputFile);

        // TODO: test validations
    }
    
    /**
     * Accept all tracked changes, revisions in a Word DOCX document
     *
     * Accepts all tracked changes and revisions in a Word DOCX document.  This will accept all pending changes in the document when tracked changes is turned on.  Track changes will remain on (if it is on) after this oepration is completed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxAcceptAllTrackChangesTest() {
        org.springframework.core.io.Resource inputFile = null;
        byte[] response = api.editDocumentDocxAcceptAllTrackChanges(inputFile);

        // TODO: test validations
    }
    
    /**
     * Get body from a Word DOCX document
     *
     * Returns the body defined in the Word Document (DOCX) format file; this is the main content part of a DOCX document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxBodyTest() {
        GetDocxBodyRequest reqConfig = null;
        GetDocxBodyResponse response = api.editDocumentDocxBody(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Create a blank Word DOCX document
     *
     * Returns a blank Word DOCX Document format file.  The file is blank, with no contents.  Use additional editing commands such as Insert Paragraph or Insert Table or Insert Image to populate the document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxCreateBlankDocumentTest() {
        CreateBlankDocxRequest input = null;
        CreateBlankDocxResponse response = api.editDocumentDocxCreateBlankDocument(input);

        // TODO: test validations
    }
    
    /**
     * Delete, remove pages from a Word DOCX document
     *
     * Returns the edited Word Document in the Word Document (DOCX) format file with the specified pages removed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxDeletePagesTest() {
        RemoveDocxPagesRequest reqConfig = null;
        byte[] response = api.editDocumentDocxDeletePages(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Deletes a table row in an existing table in a Word DOCX document
     *
     * Deletes an existing table row in a Word DOCX Document and returns the result.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxDeleteTableRowTest() {
        DeleteDocxTableRowRequest reqConfig = null;
        DeleteDocxTableRowResponse response = api.editDocumentDocxDeleteTableRow(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Deletes a range of multiple table rows in an existing table in a Word DOCX document
     *
     * Deletes a range of 1 or more existing table rows in a Word DOCX Document and returns the result.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxDeleteTableRowRangeTest() {
        DeleteDocxTableRowRangeRequest reqConfig = null;
        DeleteDocxTableRowRangeResponse response = api.editDocumentDocxDeleteTableRowRange(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Disable track changes, revisions in a Word DOCX document
     *
     * Diables tracking of changes and revisions in a Word DOCX document, and accepts any pending changes.  Users editing the document will no longer see changes tracked automatically.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxDisableTrackChangesTest() {
        org.springframework.core.io.Resource inputFile = null;
        byte[] response = api.editDocumentDocxDisableTrackChanges(inputFile);

        // TODO: test validations
    }
    
    /**
     * Enable track changes, revisions in a Word DOCX document
     *
     * Enables tracking of changes and revisions in a Word DOCX document.  Users editing the document will see changes tracked automatically, with edits highlighted, and the ability to accept or reject changes made to the document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxEnableTrackChangesTest() {
        org.springframework.core.io.Resource inputFile = null;
        byte[] response = api.editDocumentDocxEnableTrackChanges(inputFile);

        // TODO: test validations
    }
    
    /**
     * Find matching paragraphs in a Word DOCX document
     *
     * Returns the paragraphs defined in the Word Document (DOCX) format file that match the input criteria
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxFindParagraphTest() {
        FindDocxParagraphRequest reqConfig = null;
        FindDocxParagraphResponse response = api.editDocumentDocxFindParagraph(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Get comments from a Word DOCX document as a flat list
     *
     * Returns the comments and review annotations stored in the Word Document (DOCX) format file as a flattened list (not as a hierarchy of comments and replies).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxGetCommentsTest() {
        GetDocxGetCommentsRequest reqConfig = null;
        GetDocxCommentsResponse response = api.editDocumentDocxGetComments(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Get comments from a Word DOCX document hierarchically
     *
     * Returns the comments and review annotations stored in the Word Document (DOCX) format file hierarchically, where reply comments are nested as children under top-level comments in the results returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxGetCommentsHierarchicalTest() {
        GetDocxGetCommentsHierarchicalRequest reqConfig = null;
        GetDocxCommentsHierarchicalResponse response = api.editDocumentDocxGetCommentsHierarchical(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Get content of a footer from a Word DOCX document
     *
     * Returns the footer content from a Word Document (DOCX) format file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxGetHeadersAndFootersTest() {
        GetDocxHeadersAndFootersRequest reqConfig = null;
        GetDocxHeadersAndFootersResponse response = api.editDocumentDocxGetHeadersAndFooters(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Get images from a Word DOCX document
     *
     * Returns the images defined in the Word Document (DOCX) format file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxGetImagesTest() {
        GetDocxImagesRequest reqConfig = null;
        GetDocxImagesResponse response = api.editDocumentDocxGetImages(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Get sections from a Word DOCX document
     *
     * Returns the sections defined in the Word Document (DOCX) format file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxGetSectionsTest() {
        GetDocxSectionsRequest reqConfig = null;
        GetDocxSectionsResponse response = api.editDocumentDocxGetSections(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Get styles from a Word DOCX document
     *
     * Returns the styles defined in the Word Document (DOCX) format file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxGetStylesTest() {
        GetDocxStylesRequest reqConfig = null;
        GetDocxStylesResponse response = api.editDocumentDocxGetStyles(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Get a specific table by index in a Word DOCX document
     *
     * Returns the specific table object by its 0-based index in an Office Word Document (DOCX)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxGetTableByIndexTest() {
        GetDocxTableByIndexRequest reqConfig = null;
        GetDocxTableByIndexResponse response = api.editDocumentDocxGetTableByIndex(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Gets the contents of an existing table row in an existing table in a Word DOCX document
     *
     * Gets the contents of an existing table row in a Word DOCX Document and returns the result.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxGetTableRowTest() {
        GetDocxTableRowRequest reqConfig = null;
        GetDocxTableRowResponse response = api.editDocumentDocxGetTableRow(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Get all tables in Word DOCX document
     *
     * Returns all the table objects in an Office Word Document (docx)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxGetTablesTest() {
        GetDocxTablesRequest reqConfig = null;
        GetDocxTablesResponse response = api.editDocumentDocxGetTables(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Insert a new comment into a Word DOCX document attached to a paragraph
     *
     * Adds a new comment into a Word DOCX document attached to a paragraph and returns the result.  Call Finish Editing on the output URL to complete the operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxInsertCommentOnParagraphTest() {
        DocxInsertCommentOnParagraphRequest reqConfig = null;
        InsertDocxCommentOnParagraphResponse response = api.editDocumentDocxInsertCommentOnParagraph(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Insert image into a Word DOCX document
     *
     * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxInsertImageTest() {
        DocxInsertImageRequest reqConfig = null;
        DocxInsertImageResponse response = api.editDocumentDocxInsertImage(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Insert a new paragraph into a Word DOCX document
     *
     * Adds a new paragraph into a DOCX and returns the result.  You can insert at the beginning/end of a document, or before/after an existing object using its Path (location within the document).  Call Finish Editing on the output URL to complete the operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxInsertParagraphTest() {
        InsertDocxInsertParagraphRequest reqConfig = null;
        InsertDocxInsertParagraphResponse response = api.editDocumentDocxInsertParagraph(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Insert a new table into a Word DOCX document
     *
     * Adds a new table into a DOCX and returns the result.  Call Finish Editing on the output URL to complete the operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxInsertTableTest() {
        InsertDocxTablesRequest reqConfig = null;
        InsertDocxTablesResponse response = api.editDocumentDocxInsertTable(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Insert a new row into an existing table in a Word DOCX document
     *
     * Adds a new table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxInsertTableRowTest() {
        InsertDocxTableRowRequest reqConfig = null;
        InsertDocxTableRowResponse response = api.editDocumentDocxInsertTableRow(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Get pages and content from a Word DOCX document
     *
     * Returns the pages and contents of each page defined in the Word Document (DOCX) format file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxPagesTest() {
        GetDocxPagesRequest reqConfig = null;
        GetDocxPagesResponse response = api.editDocumentDocxPages(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Remove all comments from a Word DOCX document
     *
     * Removes all of the comments from a Word Document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxRemoveAllCommentsTest() {
        org.springframework.core.io.Resource inputFile = null;
        byte[] response = api.editDocumentDocxRemoveAllComments(inputFile);

        // TODO: test validations
    }
    
    /**
     * Remove headers and footers from Word DOCX document
     *
     * Remove all headers, or footers, or both from a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxRemoveHeadersAndFootersTest() {
        RemoveDocxHeadersAndFootersRequest reqConfig = null;
        RemoveDocxHeadersAndFootersResponse response = api.editDocumentDocxRemoveHeadersAndFooters(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Delete any object in a Word DOCX document
     *
     * Delete any object, such as a paragraph, table, image, etc. from a Word Document (DOCX).  Pass in the Path of the object you would like to delete.  You can call other functions such as Get-Tables, Get-Images, Get-Body, etc. to get the paths of the objects in the document.  Call Finish Editing on the output URL to complete the operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxRemoveObjectTest() {
        DocxRemoveObjectRequest reqConfig = null;
        DocxRemoveObjectResponse response = api.editDocumentDocxRemoveObject(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Replace string in Word DOCX document
     *
     * Replace all instances of a string in an Office Word Document (docx)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxReplaceTest() {
        ReplaceStringRequest reqConfig = null;
        byte[] response = api.editDocumentDocxReplace(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Replace multiple strings in Word DOCX document
     *
     * Replace all instances of multiple strings in an Office Word Document (docx)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxReplaceMultiTest() {
        MultiReplaceStringRequest reqConfig = null;
        byte[] response = api.editDocumentDocxReplaceMulti(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Replace matching paragraphs in a Word DOCX document
     *
     * Returns the edited Word Document (DOCX) format file with the matching paragraphs replaced as requested.  Replace a paragraph with another object such as an image.  Useful for performing templating operations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxReplaceParagraphTest() {
        ReplaceDocxParagraphRequest reqConfig = null;
        ReplaceDocxParagraphResponse response = api.editDocumentDocxReplaceParagraph(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Set the footer in a Word DOCX document
     *
     * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxSetFooterTest() {
        DocxSetFooterRequest reqConfig = null;
        DocxSetFooterResponse response = api.editDocumentDocxSetFooter(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Add page number to footer in a Word DOCX document
     *
     * Set the footer in a Word Document (DOCX) to contain a page number.  Call Finish Editing on the output URL to complete the operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxSetFooterAddPageNumberTest() {
        DocxSetFooterAddPageNumberRequest reqConfig = null;
        DocxSetFooterResponse response = api.editDocumentDocxSetFooterAddPageNumber(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Set the header in a Word DOCX document
     *
     * Set the header in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxSetHeaderTest() {
        DocxSetHeaderRequest reqConfig = null;
        DocxSetHeaderResponse response = api.editDocumentDocxSetHeader(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Update, set contents of a table cell in an existing table in a Word DOCX document
     *
     * Sets the contents of a table cell into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxUpdateTableCellTest() {
        UpdateDocxTableCellRequest reqConfig = null;
        UpdateDocxTableCellResponse response = api.editDocumentDocxUpdateTableCell(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Update, set contents of a table row in an existing table in a Word DOCX document
     *
     * Sets the contents of a table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentDocxUpdateTableRowTest() {
        UpdateDocxTableRowRequest reqConfig = null;
        UpdateDocxTableRowResponse response = api.editDocumentDocxUpdateTableRow(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Finish editing document, and download result from document editing
     *
     * Once done editing a document, download the result.  Begin editing a document by calling begin-editing, then perform operations, then call finish-editing to get the result.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentFinishEditingTest() {
        FinishEditingRequest reqConfig = null;
        byte[] response = api.editDocumentFinishEditing(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Delete, remove slides from a PowerPoint PPTX presentation document
     *
     * Edits the input PowerPoint PPTX presentation document to remove the specified slides
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentPptxDeleteSlidesTest() {
        RemovePptxSlidesRequest reqConfig = null;
        byte[] response = api.editDocumentPptxDeleteSlides(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Replace string in PowerPoint PPTX presentation
     *
     * Replace all instances of a string in an Office PowerPoint Document (pptx)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentPptxReplaceTest() {
        ReplaceStringRequest reqConfig = null;
        byte[] response = api.editDocumentPptxReplace(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Append row to a Excel XLSX spreadsheet, worksheet
     *
     * Appends a row to the end of an Excel Spreadsheet worksheet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxAppendRowTest() {
        AppendXlsxRowRequest input = null;
        AppendXlsxRowResponse response = api.editDocumentXlsxAppendRow(input);

        // TODO: test validations
    }
    
    /**
     * Clear cell contents in an Excel XLSX spreadsheet, worksheet by index
     *
     * Clears, sets to blank, the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxClearCellByIndexTest() {
        ClearXlsxCellRequest input = null;
        ClearXlsxCellResponse response = api.editDocumentXlsxClearCellByIndex(input);

        // TODO: test validations
    }
    
    /**
     * Clear row from a Excel XLSX spreadsheet, worksheet
     *
     * Clears data from a specific row in the Excel Spreadsheet worksheet, leaving a blank row. Use the Get Rows And Cells API to enumerate available rows in a spreadsheet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxClearRowTest() {
        ClearXlsxRowRequest input = null;
        ClearXlsxRowResponse response = api.editDocumentXlsxClearRow(input);

        // TODO: test validations
    }
    
    /**
     * Create a blank Excel XLSX spreadsheet
     *
     * Returns a blank Excel XLSX Spreadsheet (XLSX) format file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxCreateBlankSpreadsheetTest() {
        CreateBlankSpreadsheetRequest input = null;
        CreateBlankSpreadsheetResponse response = api.editDocumentXlsxCreateBlankSpreadsheet(input);

        // TODO: test validations
    }
    
    /**
     * Create a new Excel XLSX spreadsheet from column and row data
     *
     * Returns a new Excel XLSX Spreadsheet (XLSX) format file populated with column and row data specified as input
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxCreateSpreadsheetFromDataTest() {
        CreateSpreadsheetFromDataRequest input = null;
        CreateSpreadsheetFromDataResponse response = api.editDocumentXlsxCreateSpreadsheetFromData(input);

        // TODO: test validations
    }
    
    /**
     * Delete, remove worksheet from an Excel XLSX spreadsheet document
     *
     * Edits the input Excel XLSX spreadsheet document to remove the specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxDeleteWorksheetTest() {
        RemoveXlsxWorksheetRequest reqConfig = null;
        byte[] response = api.editDocumentXlsxDeleteWorksheet(reqConfig);

        // TODO: test validations
    }
    
    /**
     * Disable Shared Workbook (legacy) in Excel XLSX spreadsheet
     *
     * Disable the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxDisableSharedWorkbookTest() {
        DisableSharedWorkbookRequest input = null;
        DisableSharedWorkbookResponse response = api.editDocumentXlsxDisableSharedWorkbook(input);

        // TODO: test validations
    }
    
    /**
     * Enable Shared Workbook (legacy) in Excel XLSX spreadsheet
     *
     * Enables the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxEnableSharedWorkbookTest() {
        EnableSharedWorkbookRequest input = null;
        EnableSharedWorkbookResponse response = api.editDocumentXlsxEnableSharedWorkbook(input);

        // TODO: test validations
    }
    
    /**
     * Get cell from an Excel XLSX spreadsheet, worksheet by cell identifier
     *
     * Returns the value of a specific cell based on its identifier (e.g. A1, B22, C33, etc.) in the Excel Spreadsheet worksheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxGetCellByIdentifierTest() {
        GetXlsxCellByIdentifierRequest input = null;
        GetXlsxCellByIdentifierResponse response = api.editDocumentXlsxGetCellByIdentifier(input);

        // TODO: test validations
    }
    
    /**
     * Get cell from an Excel XLSX spreadsheet, worksheet by index
     *
     * Returns the value and definition of a specific cell in a specific row in the Excel Spreadsheet worksheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxGetCellByIndexTest() {
        GetXlsxCellRequest input = null;
        GetXlsxCellResponse response = api.editDocumentXlsxGetCellByIndex(input);

        // TODO: test validations
    }
    
    /**
     * Get columns from a Excel XLSX spreadsheet, worksheet
     *
     * Returns the columns defined in the Excel Spreadsheet worksheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxGetColumnsTest() {
        GetXlsxColumnsRequest input = null;
        GetXlsxColumnsResponse response = api.editDocumentXlsxGetColumns(input);

        // TODO: test validations
    }
    
    /**
     * Get images from a Excel XLSX spreadsheet, worksheet
     *
     * Returns the images defined in the Excel Spreadsheet worksheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxGetImagesTest() {
        GetXlsxImagesRequest input = null;
        GetXlsxImagesResponse response = api.editDocumentXlsxGetImages(input);

        // TODO: test validations
    }
    
    /**
     * Get rows and cells from a Excel XLSX spreadsheet, worksheet
     *
     * Returns the rows and cells defined in the Excel Spreadsheet worksheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxGetRowsAndCellsTest() {
        GetXlsxRowsAndCellsRequest input = null;
        GetXlsxRowsAndCellsResponse response = api.editDocumentXlsxGetRowsAndCells(input);

        // TODO: test validations
    }
    
    /**
     * Get a specific row from a Excel XLSX spreadsheet, worksheet by path
     *
     * Returns the specific row and its cells defined in the Excel Spreadsheet worksheet based on the specified path.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxGetSpecificRowTest() {
        GetXlsxSpecificRowRequest input = null;
        GetXlsxSpecificRowResponse response = api.editDocumentXlsxGetSpecificRow(input);

        // TODO: test validations
    }
    
    /**
     * Get styles from a Excel XLSX spreadsheet, worksheet
     *
     * Returns the style defined in the Excel Spreadsheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxGetStylesTest() {
        GetXlsxStylesRequest input = null;
        GetXlsxStylesResponse response = api.editDocumentXlsxGetStyles(input);

        // TODO: test validations
    }
    
    /**
     * Get worksheets from a Excel XLSX spreadsheet
     *
     * Returns the worksheets (tabs) defined in the Excel Spreadsheet (XLSX) format file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxGetWorksheetsTest() {
        GetXlsxWorksheetsRequest input = null;
        GetXlsxWorksheetsResponse response = api.editDocumentXlsxGetWorksheets(input);

        // TODO: test validations
    }
    
    /**
     * Insert a new worksheet into an Excel XLSX spreadsheet
     *
     * Inserts a new worksheet into an Excel Spreadsheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxInsertWorksheetTest() {
        InsertXlsxWorksheetRequest input = null;
        InsertXlsxWorksheetResponse response = api.editDocumentXlsxInsertWorksheet(input);

        // TODO: test validations
    }
    
    /**
     * Rename a specific worksheet in a Excel XLSX spreadsheet
     *
     * Edits the input Excel XLSX spreadsheet document to rename a specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxRenameWorksheetTest() {
        RenameXlsxWorksheetRequest input = null;
        RenameXlsxWorksheetResponse response = api.editDocumentXlsxRenameWorksheet(input);

        // TODO: test validations
    }
    
    /**
     * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by cell identifier
     *
     * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet using its cell identifier (e.g. A1, B22, C33) in the worksheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxSetCellByIdentifierTest() {
        SetXlsxCellByIdentifierRequest input = null;
        SetXlsxCellByIdentifierResponse response = api.editDocumentXlsxSetCellByIdentifier(input);

        // TODO: test validations
    }
    
    /**
     * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by index
     *
     * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editDocumentXlsxSetCellByIndexTest() {
        SetXlsxCellRequest input = null;
        SetXlsxCellResponse response = api.editDocumentXlsxSetCellByIndex(input);

        // TODO: test validations
    }
    
}
