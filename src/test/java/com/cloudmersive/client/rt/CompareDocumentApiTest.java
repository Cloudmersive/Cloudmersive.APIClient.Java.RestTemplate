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
 * API tests for CompareDocumentApi
 */
@Disabled
class CompareDocumentApiTest {

    private final CompareDocumentApi api = new CompareDocumentApi();

    
    /**
     * Compare Two Word DOCX
     *
     * Compare two Office Word Documents (docx) files and highlight the differences
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void compareDocumentDocxTest() {
        org.springframework.core.io.Resource inputFile1 = null;
        org.springframework.core.io.Resource inputFile2 = null;
        Boolean autorepair = null;

        byte[] response = api.compareDocumentDocx(inputFile1, inputFile2, autorepair);

        // TODO: test validations
    }
    
}
