package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;
import com.cloudmersive.client.rt.invoker.BaseApi;

import com.cloudmersive.client.rt.model.AvailableCurrencyResponse;
import com.cloudmersive.client.rt.model.ConvertedCurrencyResult;
import com.cloudmersive.client.rt.model.ExchangeRateResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T20:52:10.524357Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CurrencyExchangeApi extends BaseApi {

    public CurrencyExchangeApi() {
        super(new ApiClient());
    }

    public CurrencyExchangeApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Converts a price from the source currency into the destination currency
     * Automatically converts the price in the source currency into the destination currency using the latest available currency exchange rate data.
     * <p><b>200</b> - OK
     * @param source Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc. (required)
     * @param destination Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc. (required)
     * @param sourcePrice Input price, such as 19.99 in source currency (required)
     * @return ConvertedCurrencyResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConvertedCurrencyResult currencyExchangeConvertCurrency(String source, String destination, Double sourcePrice) throws RestClientException {
        return currencyExchangeConvertCurrencyWithHttpInfo(source, destination, sourcePrice).getBody();
    }

    /**
     * Converts a price from the source currency into the destination currency
     * Automatically converts the price in the source currency into the destination currency using the latest available currency exchange rate data.
     * <p><b>200</b> - OK
     * @param source Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc. (required)
     * @param destination Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc. (required)
     * @param sourcePrice Input price, such as 19.99 in source currency (required)
     * @return ResponseEntity&lt;ConvertedCurrencyResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConvertedCurrencyResult> currencyExchangeConvertCurrencyWithHttpInfo(String source, String destination, Double sourcePrice) throws RestClientException {
        Object localVarPostBody = sourcePrice;
        
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'source' when calling currencyExchangeConvertCurrency");
        }
        
        // verify the required parameter 'destination' is set
        if (destination == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destination' when calling currencyExchangeConvertCurrency");
        }
        
        // verify the required parameter 'sourcePrice' is set
        if (sourcePrice == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sourcePrice' when calling currencyExchangeConvertCurrency");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("source", source);
        uriVariables.put("destination", destination);

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

        ParameterizedTypeReference<ConvertedCurrencyResult> localReturnType = new ParameterizedTypeReference<ConvertedCurrencyResult>() {};
        return apiClient.invokeAPI("/currency/exchange-rates/convert/{source}/to/{destination}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of available currencies and corresponding countries
     * Enumerates available currencies and the countries that correspond to these currencies.
     * <p><b>200</b> - OK
     * @return AvailableCurrencyResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AvailableCurrencyResponse currencyExchangeGetAvailableCurrencies() throws RestClientException {
        return currencyExchangeGetAvailableCurrenciesWithHttpInfo().getBody();
    }

    /**
     * Get a list of available currencies and corresponding countries
     * Enumerates available currencies and the countries that correspond to these currencies.
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;AvailableCurrencyResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AvailableCurrencyResponse> currencyExchangeGetAvailableCurrenciesWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<AvailableCurrencyResponse> localReturnType = new ParameterizedTypeReference<AvailableCurrencyResponse>() {};
        return apiClient.invokeAPI("/currency/exchange-rates/list-available", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Gets the exchange rate from the source currency into the destination currency
     * Automatically gets the exchange rate from the source currency into the destination currency using the latest available currency exchange rate data.
     * <p><b>200</b> - OK
     * @param source Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc. (required)
     * @param destination Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc. (required)
     * @return ExchangeRateResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExchangeRateResult currencyExchangeGetExchangeRate(String source, String destination) throws RestClientException {
        return currencyExchangeGetExchangeRateWithHttpInfo(source, destination).getBody();
    }

    /**
     * Gets the exchange rate from the source currency into the destination currency
     * Automatically gets the exchange rate from the source currency into the destination currency using the latest available currency exchange rate data.
     * <p><b>200</b> - OK
     * @param source Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc. (required)
     * @param destination Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc. (required)
     * @return ResponseEntity&lt;ExchangeRateResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExchangeRateResult> currencyExchangeGetExchangeRateWithHttpInfo(String source, String destination) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'source' when calling currencyExchangeGetExchangeRate");
        }
        
        // verify the required parameter 'destination' is set
        if (destination == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destination' when calling currencyExchangeGetExchangeRate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("source", source);
        uriVariables.put("destination", destination);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ExchangeRateResult> localReturnType = new ParameterizedTypeReference<ExchangeRateResult>() {};
        return apiClient.invokeAPI("/currency/exchange-rates/get/{source}/to/{destination}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
