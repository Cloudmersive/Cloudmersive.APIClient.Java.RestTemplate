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
 * API tests for ResizeApi
 */
@Disabled
class ResizeApiTest {

    private final ResizeApi api = new ResizeApi();

    
    /**
     * Resize an image while preserving aspect ratio
     *
     * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio.  Resize is EXIF-aware.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void resizePostTest() {
        Integer maxWidth = null;
        Integer maxHeight = null;
        org.springframework.core.io.Resource imageFile = null;

        byte[] response = api.resizePost(maxWidth, maxHeight, imageFile);

        // TODO: test validations
    }
    
    /**
     * Resize an image
     *
     * Resize an image to a specific width and specific height.  Resize is EXIF-aware.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void resizeResizeSimpleTest() {
        Integer width = null;
        Integer height = null;
        org.springframework.core.io.Resource imageFile = null;

        byte[] response = api.resizeResizeSimple(width, height, imageFile);

        // TODO: test validations
    }
    
}
