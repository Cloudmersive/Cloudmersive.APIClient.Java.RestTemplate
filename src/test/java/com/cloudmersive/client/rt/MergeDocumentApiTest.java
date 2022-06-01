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


package com.cloudmersive.client.rt;

import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MergeDocumentApi
 */
@Ignore
public class MergeDocumentApiTest {

    private final MergeDocumentApi api = new MergeDocumentApi();

    
    /**
     * Merge Two Word DOCX Together
     *
     * Combine two Office Word Documents (docx) into one single Office Word document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentDocxTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        byte[] response = api.mergeDocumentDocx(inputFile1, inputFile2);

        // TODO: test validations
    }
    
    /**
     * Merge Multple Word DOCX Together
     *
     * Combine multiple Office Word Documents (docx) into one single Office Word document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentDocxMultiTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        org.springframework.core.io.Resource inputFile3 = null;
        org.springframework.core.io.Resource inputFile4 = null;
        org.springframework.core.io.Resource inputFile5 = null;
        org.springframework.core.io.Resource inputFile6 = null;
        org.springframework.core.io.Resource inputFile7 = null;
        org.springframework.core.io.Resource inputFile8 = null;
        org.springframework.core.io.Resource inputFile9 = null;
        org.springframework.core.io.Resource inputFile10 = null;
        byte[] response = api.mergeDocumentDocxMulti(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);

        // TODO: test validations
    }
    
    /**
     * Merge Two HTML (HTM) Files Together
     *
     * Combine two HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentHtmlTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        byte[] response = api.mergeDocumentHtml(inputFile1, inputFile2);

        // TODO: test validations
    }
    
    /**
     * Merge Multple HTML (HTM) Files Together
     *
     * Combine multiple HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentHtmlMultiTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        org.springframework.core.io.Resource inputFile3 = null;
        org.springframework.core.io.Resource inputFile4 = null;
        org.springframework.core.io.Resource inputFile5 = null;
        org.springframework.core.io.Resource inputFile6 = null;
        org.springframework.core.io.Resource inputFile7 = null;
        org.springframework.core.io.Resource inputFile8 = null;
        org.springframework.core.io.Resource inputFile9 = null;
        org.springframework.core.io.Resource inputFile10 = null;
        byte[] response = api.mergeDocumentHtmlMulti(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);

        // TODO: test validations
    }
    
    /**
     * Merge Two PDF Files Together
     *
     * Combine two PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentPdfTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        byte[] response = api.mergeDocumentPdf(inputFile1, inputFile2);

        // TODO: test validations
    }
    
    /**
     * Merge Multple PDF Files Together
     *
     * Combine multiple PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentPdfMultiTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        org.springframework.core.io.Resource inputFile3 = null;
        org.springframework.core.io.Resource inputFile4 = null;
        org.springframework.core.io.Resource inputFile5 = null;
        org.springframework.core.io.Resource inputFile6 = null;
        org.springframework.core.io.Resource inputFile7 = null;
        org.springframework.core.io.Resource inputFile8 = null;
        org.springframework.core.io.Resource inputFile9 = null;
        org.springframework.core.io.Resource inputFile10 = null;
        byte[] response = api.mergeDocumentPdfMulti(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);

        // TODO: test validations
    }
    
    /**
     * Merge Two PNG Files Together
     *
     * Combine two PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentPngTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        byte[] response = api.mergeDocumentPng(inputFile1, inputFile2);

        // TODO: test validations
    }
    
    /**
     * Merge Multple PNG Files Together
     *
     * Combine multiple PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentPngMultiTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        org.springframework.core.io.Resource inputFile3 = null;
        org.springframework.core.io.Resource inputFile4 = null;
        org.springframework.core.io.Resource inputFile5 = null;
        org.springframework.core.io.Resource inputFile6 = null;
        org.springframework.core.io.Resource inputFile7 = null;
        org.springframework.core.io.Resource inputFile8 = null;
        org.springframework.core.io.Resource inputFile9 = null;
        org.springframework.core.io.Resource inputFile10 = null;
        byte[] response = api.mergeDocumentPngMulti(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);

        // TODO: test validations
    }
    
    /**
     * Merge Two PowerPoint PPTX Together
     *
     * Combine two Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentPptxTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        byte[] response = api.mergeDocumentPptx(inputFile1, inputFile2);

        // TODO: test validations
    }
    
    /**
     * Merge Multple PowerPoint PPTX Together
     *
     * Combine multiple Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentPptxMultiTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        org.springframework.core.io.Resource inputFile3 = null;
        org.springframework.core.io.Resource inputFile4 = null;
        org.springframework.core.io.Resource inputFile5 = null;
        org.springframework.core.io.Resource inputFile6 = null;
        org.springframework.core.io.Resource inputFile7 = null;
        org.springframework.core.io.Resource inputFile8 = null;
        org.springframework.core.io.Resource inputFile9 = null;
        org.springframework.core.io.Resource inputFile10 = null;
        byte[] response = api.mergeDocumentPptxMulti(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);

        // TODO: test validations
    }
    
    /**
     * Merge Two Text (TXT) Files Together
     *
     * Combine two Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentTxtTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        Object response = api.mergeDocumentTxt(inputFile1, inputFile2);

        // TODO: test validations
    }
    
    /**
     * Merge Multple Text (TXT) Files Together
     *
     * Combine multiple Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentTxtMultiTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        org.springframework.core.io.Resource inputFile3 = null;
        org.springframework.core.io.Resource inputFile4 = null;
        org.springframework.core.io.Resource inputFile5 = null;
        org.springframework.core.io.Resource inputFile6 = null;
        org.springframework.core.io.Resource inputFile7 = null;
        org.springframework.core.io.Resource inputFile8 = null;
        org.springframework.core.io.Resource inputFile9 = null;
        org.springframework.core.io.Resource inputFile10 = null;
        byte[] response = api.mergeDocumentTxtMulti(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);

        // TODO: test validations
    }
    
    /**
     * Merge Two Excel XLSX Together
     *
     * Combine two Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentXlsxTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        byte[] response = api.mergeDocumentXlsx(inputFile1, inputFile2);

        // TODO: test validations
    }
    
    /**
     * Merge Multple Excel XLSX Together
     *
     * Combine multiple Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentXlsxMultiTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        org.springframework.core.io.Resource inputFile3 = null;
        org.springframework.core.io.Resource inputFile4 = null;
        org.springframework.core.io.Resource inputFile5 = null;
        org.springframework.core.io.Resource inputFile6 = null;
        org.springframework.core.io.Resource inputFile7 = null;
        org.springframework.core.io.Resource inputFile8 = null;
        org.springframework.core.io.Resource inputFile9 = null;
        org.springframework.core.io.Resource inputFile10 = null;
        byte[] response = api.mergeDocumentXlsxMulti(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);

        // TODO: test validations
    }
    
}
