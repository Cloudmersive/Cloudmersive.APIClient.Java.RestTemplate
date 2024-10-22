/*
 * currencyapi
 * The currency APIs help you retrieve exchange rates and convert prices between currencies easily.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.model.AvailableCurrencyResponse;
import com.cloudmersive.client.rt.model.ConvertedCurrencyResult;
import com.cloudmersive.client.rt.model.ExchangeRateResult;
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
 * API tests for CurrencyExchangeApi
 */
@Disabled
class CurrencyExchangeApiTest {

    private final CurrencyExchangeApi api = new CurrencyExchangeApi();

    
    /**
     * Converts a price from the source currency into the destination currency
     *
     * Automatically converts the price in the source currency into the destination currency using the latest available currency exchange rate data.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void currencyExchangeConvertCurrencyTest() {
        String source = null;
        String destination = null;
        Double sourcePrice = null;

        ConvertedCurrencyResult response = api.currencyExchangeConvertCurrency(source, destination, sourcePrice);

        // TODO: test validations
    }
    
    /**
     * Get a list of available currencies and corresponding countries
     *
     * Enumerates available currencies and the countries that correspond to these currencies.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void currencyExchangeGetAvailableCurrenciesTest() {

        AvailableCurrencyResponse response = api.currencyExchangeGetAvailableCurrencies();

        // TODO: test validations
    }
    
    /**
     * Gets the exchange rate from the source currency into the destination currency
     *
     * Automatically gets the exchange rate from the source currency into the destination currency using the latest available currency exchange rate data.
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void currencyExchangeGetExchangeRateTest() {
        String source = null;
        String destination = null;

        ExchangeRateResult response = api.currencyExchangeGetExchangeRate(source, destination);

        // TODO: test validations
    }
    
}
