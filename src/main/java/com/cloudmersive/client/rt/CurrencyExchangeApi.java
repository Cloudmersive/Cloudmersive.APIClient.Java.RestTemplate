package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.invoker.ApiClient;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-14T13:47:32.732-08:00[America/Los_Angeles]")
@Component("com.cloudmersive.client.rt.CurrencyExchangeApi")
public class CurrencyExchangeApi {
    private ApiClient apiClient;

    public CurrencyExchangeApi() {
        this(new ApiClient());
    }

    @Autowired
    public CurrencyExchangeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
        Object postBody = sourcePrice;
        
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
        String path = apiClient.expandPath("/currency/exchange-rates/convert/{source}/to/{destination}", uriVariables);

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

        ParameterizedTypeReference<ConvertedCurrencyResult> returnType = new ParameterizedTypeReference<ConvertedCurrencyResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
        Object postBody = null;
        
        String path = apiClient.expandPath("/currency/exchange-rates/list-available", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<AvailableCurrencyResponse> returnType = new ParameterizedTypeReference<AvailableCurrencyResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
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
        Object postBody = null;
        
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
        String path = apiClient.expandPath("/currency/exchange-rates/get/{source}/to/{destination}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ExchangeRateResult> returnType = new ParameterizedTypeReference<ExchangeRateResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
