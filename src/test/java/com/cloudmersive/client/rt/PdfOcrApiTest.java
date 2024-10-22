/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.rt.model.PdfToLinesWithLocationResult;
import com.cloudmersive.client.rt.model.PdfToTextResponse;
import com.cloudmersive.client.rt.model.PdfToWordsWithLocationResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClientException;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PdfOcrApi
 */
@Disabled
class PdfOcrApiTest {

    private final PdfOcrApi api = new PdfOcrApi();

    
    /**
     * Returns the result of the Async Job - possible states can be STARTED or COMPLETED
     *
     * 
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void pdfOcrGetAsyncJobStatusTest() {
        String asyncJobID = null;

        PdfToTextResponse response = api.pdfOcrGetAsyncJobStatus(asyncJobID);

        // TODO: test validations
    }
    
    /**
     * Convert a PDF into text lines with location
     *
     * Converts a PDF into lines/text with location information and other metdata via Optical Character Recognition.  This API is intended to be run on scanned documents.  If you want to OCR photos (e.g. taken with a smart phone camera), be sure to use the photo/toText API instead, as it is designed to unskew the image first.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void pdfOcrPdfToLinesWithLocationTest() {
        org.springframework.core.io.Resource imageFile = null;
        String language = null;
        String preprocessing = null;

        PdfToLinesWithLocationResult response = api.pdfOcrPdfToLinesWithLocation(imageFile, language, preprocessing);

        // TODO: test validations
    }
    
    /**
     * Convert a PDF into words with location
     *
     * Converts a PDF into words/text with location information and other metdata via Optical Character Recognition.  This API is intended to be run on scanned documents.  If you want to OCR photos (e.g. taken with a smart phone camera), be sure to use the photo/toText API instead, as it is designed to unskew the image first.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void pdfOcrPdfToWordsWithLocationTest() {
        org.springframework.core.io.Resource imageFile = null;
        String language = null;
        String preprocessing = null;

        PdfToWordsWithLocationResult response = api.pdfOcrPdfToWordsWithLocation(imageFile, language, preprocessing);

        // TODO: test validations
    }
    
    /**
     * Converts an uploaded PDF file into text via Optical Character Recognition.
     *
     * 
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void pdfOcrPostTest() {
        org.springframework.core.io.Resource imageFile = null;
        String recognitionMode = null;
        String language = null;
        String preprocessing = null;

        PdfToTextResponse response = api.pdfOcrPost(imageFile, recognitionMode, language, preprocessing);

        // TODO: test validations
    }
    
}
