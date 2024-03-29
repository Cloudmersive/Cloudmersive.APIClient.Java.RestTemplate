/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.model.EmailLead;
import com.cloudmersive.client.rt.model.LeadEnrichmentRequest;
import com.cloudmersive.client.rt.model.LeadEnrichmentResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LeadEnrichmentApi
 */
@Ignore
public class LeadEnrichmentApiTest {

    private final LeadEnrichmentApi api = new LeadEnrichmentApi();

    
    /**
     * Enrich an input lead with additional fields of data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void leadEnrichmentEnrichLeadTest() {
        LeadEnrichmentRequest request = null;
        LeadEnrichmentResponse response = api.leadEnrichmentEnrichLead(request);

        // TODO: test validations
    }
    
    /**
     * Get company information from email address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void leadEnrichmentGetCompanyInformationTest() {
        EmailLead request = null;
        LeadEnrichmentResponse response = api.leadEnrichmentGetCompanyInformation(request);

        // TODO: test validations
    }
    
}
