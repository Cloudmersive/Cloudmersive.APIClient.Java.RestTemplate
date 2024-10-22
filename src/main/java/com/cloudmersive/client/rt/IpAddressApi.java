package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-22T03:15:48.283468600Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IpAddressApi extends BaseApi {

    public IpAddressApi() {
        super(new ApiClient());
    }

    public IpAddressApi(ApiClient apiClient) {
        super(apiClient);
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
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressGeolocateStreetAddress");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<GeolocateStreetAddressResponse> localReturnType = new ParameterizedTypeReference<GeolocateStreetAddressResponse>() {};
        return apiClient.invokeAPI("/validate/ip/geolocate/street-address", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressIpIntelligence");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<IPIntelligenceResponse> localReturnType = new ParameterizedTypeReference<IPIntelligenceResponse>() {};
        return apiClient.invokeAPI("/validate/ip/intelligence", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressIsBot");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<BotCheckResponse> localReturnType = new ParameterizedTypeReference<BotCheckResponse>() {};
        return apiClient.invokeAPI("/validate/ip/is-bot", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressIsThreat");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<IPThreatResponse> localReturnType = new ParameterizedTypeReference<IPThreatResponse>() {};
        return apiClient.invokeAPI("/validate/ip/is-threat", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressIsTorNode");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<TorNodeResponse> localReturnType = new ParameterizedTypeReference<TorNodeResponse>() {};
        return apiClient.invokeAPI("/validate/ip/is-tor-node", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<GeolocateResponse> localReturnType = new ParameterizedTypeReference<GeolocateResponse>() {};
        return apiClient.invokeAPI("/validate/ip/geolocate", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        Object localVarPostBody = value;
        
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'value' when calling iPAddressReverseDomainLookup");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<IPReverseDNSLookupResponse> localReturnType = new ParameterizedTypeReference<IPReverseDNSLookupResponse>() {};
        return apiClient.invokeAPI("/validate/ip/reverse-domain-lookup", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
