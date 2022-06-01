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

import com.cloudmersive.client.rt.model.BotCheckResponse;
import com.cloudmersive.client.rt.model.GeolocateResponse;
import com.cloudmersive.client.rt.model.GeolocateStreetAddressResponse;
import com.cloudmersive.client.rt.model.IPIntelligenceResponse;
import com.cloudmersive.client.rt.model.IPReverseDNSLookupResponse;
import com.cloudmersive.client.rt.model.IPThreatResponse;
import com.cloudmersive.client.rt.model.TorNodeResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IpAddressApi
 */
@Ignore
public class IpAddressApiTest {

    private final IpAddressApi api = new IpAddressApi();

    
    /**
     * Geolocate an IP address to a street address
     *
     * Identify an IP address&#39;s street address.  Useful for security and UX applications.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void iPAddressGeolocateStreetAddressTest() {
        String value = null;
        GeolocateStreetAddressResponse response = api.iPAddressGeolocateStreetAddress(value);

        // TODO: test validations
    }
    
    /**
     * Get intelligence on an IP address
     *
     * Identify key intelligence about an IP address, including if it is a known threat IP, known bot, Tor exit node, as well as the location of the IP address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void iPAddressIpIntelligenceTest() {
        String value = null;
        IPIntelligenceResponse response = api.iPAddressIpIntelligence(value);

        // TODO: test validations
    }
    
    /**
     * Check if IP address is a Bot client
     *
     * Check if the input IP address is a Bot, robot, or otherwise a non-user entity.  Leverages real-time signals to check against known high-probability bots..
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void iPAddressIsBotTest() {
        String value = null;
        BotCheckResponse response = api.iPAddressIsBot(value);

        // TODO: test validations
    }
    
    /**
     * Check if IP address is a known threat
     *
     * Check if the input IP address is a known threat IP address.  Checks against known bad IPs, botnets, compromised servers, and other lists of threats.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void iPAddressIsThreatTest() {
        String value = null;
        IPThreatResponse response = api.iPAddressIsThreat(value);

        // TODO: test validations
    }
    
    /**
     * Check if IP address is a Tor node server
     *
     * Check if the input IP address is a Tor exit node server.  Tor servers are a type of privacy-preserving technology that can hide the original IP address who makes a request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void iPAddressIsTorNodeTest() {
        String value = null;
        TorNodeResponse response = api.iPAddressIsTorNode(value);

        // TODO: test validations
    }
    
    /**
     * Geolocate an IP address
     *
     * Identify an IP address Country, State/Provence, City, Zip/Postal Code, etc.  Useful for security and UX applications.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void iPAddressPostTest() {
        String value = null;
        GeolocateResponse response = api.iPAddressPost(value);

        // TODO: test validations
    }
    
    /**
     * Perform a reverse domain name (DNS) lookup on an IP address
     *
     * Gets the domain name, if any, associated with the IP address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void iPAddressReverseDomainLookupTest() {
        String value = null;
        IPReverseDNSLookupResponse response = api.iPAddressReverseDomainLookup(value);

        // TODO: test validations
    }
    
}
