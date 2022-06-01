package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

import com.cloudmersive.client.rt.model.BotCheckResponse;
import com.cloudmersive.client.rt.model.GeolocateResponse;
import com.cloudmersive.client.rt.model.GeolocateStreetAddressResponse;
import com.cloudmersive.client.rt.model.IPIntelligenceResponse;
import com.cloudmersive.client.rt.model.IPReverseDNSLookupResponse;
import com.cloudmersive.client.rt.model.IPThreatResponse;
import com.cloudmersive.client.rt.model.TorNodeResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T10:52:45.902-07:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.IpAddressApi")
public class IpAddressApi {
    private ApiClient apiClient;

    public IpAddressApi() {
        this(new ApiClient());
    }

    @Autowired
    public IpAddressApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Geolocate an IP address to a street address
     * Identify an IP address&#39;s street address.  Useful for security and UX applications.
     * <p><b>200</b> - OK
     * @param value IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return GeolocateStreetAddressResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GeolocateStreetAddressResponse iPAddressGeolocateStreetAddress(String value) throws RestClientException {
        return iPAddressGeolocateStreetAddressWithHttpInfo(value).getBody();
    }

    /**
     * Geolocate an IP address to a street address
     * Identify an IP address&#39;s street address.  Useful for security and UX applications.
     * <p><b>200</b> - OK
     * @param value IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return ResponseEntity&lt;GeolocateStreetAddressResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GeolocateStreetAddressResponse> iPAddressGeolocateStreetAddressWithHttpInfo(String value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressGeolocateStreetAddress");
        }
        
        String path = apiClient.expandPath("/validate/ip/geolocate/street-address", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<GeolocateStreetAddressResponse> returnType = new ParameterizedTypeReference<GeolocateStreetAddressResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Get intelligence on an IP address
     * Identify key intelligence about an IP address, including if it is a known threat IP, known bot, Tor exit node, as well as the location of the IP address.
     * <p><b>200</b> - OK
     * @param value IP address to process, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return IPIntelligenceResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IPIntelligenceResponse iPAddressIpIntelligence(String value) throws RestClientException {
        return iPAddressIpIntelligenceWithHttpInfo(value).getBody();
    }

    /**
     * Get intelligence on an IP address
     * Identify key intelligence about an IP address, including if it is a known threat IP, known bot, Tor exit node, as well as the location of the IP address.
     * <p><b>200</b> - OK
     * @param value IP address to process, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return ResponseEntity&lt;IPIntelligenceResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IPIntelligenceResponse> iPAddressIpIntelligenceWithHttpInfo(String value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressIpIntelligence");
        }
        
        String path = apiClient.expandPath("/validate/ip/intelligence", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<IPIntelligenceResponse> returnType = new ParameterizedTypeReference<IPIntelligenceResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Check if IP address is a Bot client
     * Check if the input IP address is a Bot, robot, or otherwise a non-user entity.  Leverages real-time signals to check against known high-probability bots..
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return BotCheckResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BotCheckResponse iPAddressIsBot(String value) throws RestClientException {
        return iPAddressIsBotWithHttpInfo(value).getBody();
    }

    /**
     * Check if IP address is a Bot client
     * Check if the input IP address is a Bot, robot, or otherwise a non-user entity.  Leverages real-time signals to check against known high-probability bots..
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return ResponseEntity&lt;BotCheckResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BotCheckResponse> iPAddressIsBotWithHttpInfo(String value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressIsBot");
        }
        
        String path = apiClient.expandPath("/validate/ip/is-bot", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<BotCheckResponse> returnType = new ParameterizedTypeReference<BotCheckResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Check if IP address is a known threat
     * Check if the input IP address is a known threat IP address.  Checks against known bad IPs, botnets, compromised servers, and other lists of threats.
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return IPThreatResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IPThreatResponse iPAddressIsThreat(String value) throws RestClientException {
        return iPAddressIsThreatWithHttpInfo(value).getBody();
    }

    /**
     * Check if IP address is a known threat
     * Check if the input IP address is a known threat IP address.  Checks against known bad IPs, botnets, compromised servers, and other lists of threats.
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return ResponseEntity&lt;IPThreatResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IPThreatResponse> iPAddressIsThreatWithHttpInfo(String value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressIsThreat");
        }
        
        String path = apiClient.expandPath("/validate/ip/is-threat", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<IPThreatResponse> returnType = new ParameterizedTypeReference<IPThreatResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Check if IP address is a Tor node server
     * Check if the input IP address is a Tor exit node server.  Tor servers are a type of privacy-preserving technology that can hide the original IP address who makes a request.
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return TorNodeResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TorNodeResponse iPAddressIsTorNode(String value) throws RestClientException {
        return iPAddressIsTorNodeWithHttpInfo(value).getBody();
    }

    /**
     * Check if IP address is a Tor node server
     * Check if the input IP address is a Tor exit node server.  Tor servers are a type of privacy-preserving technology that can hide the original IP address who makes a request.
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return ResponseEntity&lt;TorNodeResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TorNodeResponse> iPAddressIsTorNodeWithHttpInfo(String value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressIsTorNode");
        }
        
        String path = apiClient.expandPath("/validate/ip/is-tor-node", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<TorNodeResponse> returnType = new ParameterizedTypeReference<TorNodeResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Geolocate an IP address
     * Identify an IP address Country, State/Provence, City, Zip/Postal Code, etc.  Useful for security and UX applications.
     * <p><b>200</b> - OK
     * @param value IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return GeolocateResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GeolocateResponse iPAddressPost(String value) throws RestClientException {
        return iPAddressPostWithHttpInfo(value).getBody();
    }

    /**
     * Geolocate an IP address
     * Identify an IP address Country, State/Provence, City, Zip/Postal Code, etc.  Useful for security and UX applications.
     * <p><b>200</b> - OK
     * @param value IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return ResponseEntity&lt;GeolocateResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GeolocateResponse> iPAddressPostWithHttpInfo(String value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressPost");
        }
        
        String path = apiClient.expandPath("/validate/ip/geolocate", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<GeolocateResponse> returnType = new ParameterizedTypeReference<GeolocateResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
    /**
     * Perform a reverse domain name (DNS) lookup on an IP address
     * Gets the domain name, if any, associated with the IP address.
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return IPReverseDNSLookupResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IPReverseDNSLookupResponse iPAddressReverseDomainLookup(String value) throws RestClientException {
        return iPAddressReverseDomainLookupWithHttpInfo(value).getBody();
    }

    /**
     * Perform a reverse domain name (DNS) lookup on an IP address
     * Gets the domain name, if any, associated with the IP address.
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
     * @return ResponseEntity&lt;IPReverseDNSLookupResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IPReverseDNSLookupResponse> iPAddressReverseDomainLookupWithHttpInfo(String value) throws RestClientException {
        Object postBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressReverseDomainLookup");
        }
        
        String path = apiClient.expandPath("/validate/ip/reverse-domain-lookup", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "text/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<IPReverseDNSLookupResponse> returnType = new ParameterizedTypeReference<IPReverseDNSLookupResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
