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
 * API tests for ReceiptsApi
 */
@Disabled
class ReceiptsApiTest {

    private final ReceiptsApi api = new ReceiptsApi();

    
    /**
     * Convert a photo of a receipt into a CSV file containing structured information from the receipt
     *
     * Leverage Deep Learning to automatically turn a photo of a receipt into a CSV file containing the structured information from the receipt.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void receiptsPhotoToCSVTest() {
        org.springframework.core.io.Resource imageFile = null;

        Object response = api.receiptsPhotoToCSV(imageFile);

        // TODO: test validations
    }
    
}
