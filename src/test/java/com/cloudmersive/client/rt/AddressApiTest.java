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

import com.cloudmersive.client.rt.model.CountryListResult;
import com.cloudmersive.client.rt.model.GetTimezonesRequest;
import com.cloudmersive.client.rt.model.GetTimezonesResponse;
import com.cloudmersive.client.rt.model.ParseAddressRequest;
import com.cloudmersive.client.rt.model.ParseAddressResponse;
import com.cloudmersive.client.rt.model.ReverseGeocodeAddressRequest;
import com.cloudmersive.client.rt.model.ReverseGeocodeAddressResponse;
import com.cloudmersive.client.rt.model.ValidateAddressRequest;
import com.cloudmersive.client.rt.model.ValidateAddressResponse;
import com.cloudmersive.client.rt.model.ValidateCityRequest;
import com.cloudmersive.client.rt.model.ValidateCityResponse;
import com.cloudmersive.client.rt.model.ValidateCountryRequest;
import com.cloudmersive.client.rt.model.ValidateCountryResponse;
import com.cloudmersive.client.rt.model.ValidatePostalCodeRequest;
import com.cloudmersive.client.rt.model.ValidatePostalCodeResponse;
import com.cloudmersive.client.rt.model.ValidateStateRequest;
import com.cloudmersive.client.rt.model.ValidateStateResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressApi
 */
@Ignore
public class AddressApiTest {

    private final AddressApi api = new AddressApi();

    
    /**
     * Check if a country is a member of the European Union (EU)
     *
     * Checks if the input country is a member of the European Union or not.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressCheckEUMembershipTest() {
        ValidateCountryRequest input = null;
        ValidateCountryResponse response = api.addressCheckEUMembership(input);

        // TODO: test validations
    }
    
    /**
     * Validate and normalize country information, return ISO 3166-1 country codes and country name
     *
     * Validates and normalizes country information, and returns key information about a country, as well as whether it is a member of the European Union.  Also returns distinct time zones in the country.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressCountryTest() {
        ValidateCountryRequest input = null;
        ValidateCountryResponse response = api.addressCountry(input);

        // TODO: test validations
    }
    
    /**
     * Get a list of ISO 3166-1 countries
     *
     * Enumerates the list of ISO 3166-1 countries, including name, country codes, and more.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressCountryListTest() {
        CountryListResult response = api.addressCountryList();

        // TODO: test validations
    }
    
    /**
     * Geocode a street address into latitude and longitude
     *
     * Geocodes a street address into latitude and longitude.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressGeocodeTest() {
        ValidateAddressRequest input = null;
        ValidateAddressResponse response = api.addressGeocode(input);

        // TODO: test validations
    }
    
    /**
     * Get the currency of the input country
     *
     * Gets the currency information for the input country, including the ISO three-letter country code, currency symbol, and English currency name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressGetCountryCurrencyTest() {
        ValidateCountryRequest input = null;
        ValidateCountryResponse response = api.addressGetCountryCurrency(input);

        // TODO: test validations
    }
    
    /**
     * Get the region, subregion and continent of the country
     *
     * Gets the continent information including region and subregion for the input country.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressGetCountryRegionTest() {
        ValidateCountryRequest input = null;
        ValidateCountryResponse response = api.addressGetCountryRegion(input);

        // TODO: test validations
    }
    
    /**
     * Gets IANA/Olsen time zones for a country
     *
     * Gets the IANA/Olsen time zones for a country.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressGetTimezoneTest() {
        GetTimezonesRequest input = null;
        GetTimezonesResponse response = api.addressGetTimezone(input);

        // TODO: test validations
    }
    
    /**
     * Parse an unstructured input text string into an international, formatted address
     *
     * Uses machine learning and Natural Language Processing (NLP) to handle a wide array of cases, including non-standard and unstructured address strings across a wide array of countries and address formatting norms.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressParseStringTest() {
        ParseAddressRequest input = null;
        ParseAddressResponse response = api.addressParseString(input);

        // TODO: test validations
    }
    
    /**
     * Reverse geocode a lattitude and longitude into an address
     *
     * Converts lattitude and longitude coordinates into an address through reverse-geocoding.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressReverseGeocodeAddressTest() {
        ReverseGeocodeAddressRequest input = null;
        ReverseGeocodeAddressResponse response = api.addressReverseGeocodeAddress(input);

        // TODO: test validations
    }
    
    /**
     * Validate a street address
     *
     * Determines if an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.  Supports all major international addresses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressValidateAddressTest() {
        ValidateAddressRequest input = null;
        ValidateAddressResponse response = api.addressValidateAddress(input);

        // TODO: test validations
    }
    
    /**
     * Validate a City and State/Province combination, get location information about it
     *
     * Checks if the input city and state name or code is valid, and returns information about it such as normalized City name, State name and more.  Supports all major international addresses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressValidateCityTest() {
        ValidateCityRequest input = null;
        ValidateCityResponse response = api.addressValidateCity(input);

        // TODO: test validations
    }
    
    /**
     * Validate a postal code, get location information about it
     *
     * Checks if the input postal code is valid, and returns information about it such as City, State and more.  Supports all major countries.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressValidatePostalCodeTest() {
        ValidatePostalCodeRequest input = null;
        ValidatePostalCodeResponse response = api.addressValidatePostalCode(input);

        // TODO: test validations
    }
    
    /**
     * Validate a state or province, name or abbreviation, get location information about it
     *
     * Checks if the input state name or code is valid, and returns information about it such as normalized State name and more.  Supports all major countries.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressValidateStateTest() {
        ValidateStateRequest input = null;
        ValidateStateResponse response = api.addressValidateState(input);

        // TODO: test validations
    }
    
}