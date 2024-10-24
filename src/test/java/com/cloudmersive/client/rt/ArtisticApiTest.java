/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
 * API tests for ArtisticApi
 */
@Disabled
class ArtisticApiTest {

    private final ArtisticApi api = new ArtisticApi();

    
    /**
     * Transform an image into an artistic painting automatically
     *
     * Uses machine learning to automatically transform an image into an artistic painting.  Due to depth of AI processing, depending on image size this operation can take up to 20 seconds.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void artisticPaintingTest() {
        String style = null;
        org.springframework.core.io.Resource imageFile = null;

        byte[] response = api.artisticPainting(style, imageFile);

        // TODO: test validations
    }
    
}
