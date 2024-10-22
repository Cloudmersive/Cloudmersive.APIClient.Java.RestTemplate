/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.rt;

import com.cloudmersive.client.rt.model.PosRequest;
import com.cloudmersive.client.rt.model.PosResponse;
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
 * API tests for PosTaggerApi
 */
@Disabled
class PosTaggerApiTest {

    private final PosTaggerApi api = new PosTaggerApi();

    
    /**
     * Part-of-speech tag a string, filter to adjectives
     *
     * Part-of-speech (POS) tag a string, find the adjectives, and return result as JSON
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void posTaggerTagAdjectivesTest() {
        PosRequest request = null;

        PosResponse response = api.posTaggerTagAdjectives(request);

        // TODO: test validations
    }
    
    /**
     * Part-of-speech tag a string, filter to adverbs
     *
     * Part-of-speech (POS) tag a string, find the adverbs, and return result as JSON
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void posTaggerTagAdverbsTest() {
        PosRequest request = null;

        PosResponse response = api.posTaggerTagAdverbs(request);

        // TODO: test validations
    }
    
    /**
     * Part-of-speech tag a string, filter to nouns
     *
     * Part-of-speech (POS) tag a string, find the nouns, and return result as JSON
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void posTaggerTagNounsTest() {
        PosRequest request = null;

        PosResponse response = api.posTaggerTagNouns(request);

        // TODO: test validations
    }
    
    /**
     * Part-of-speech tag a string, filter to pronouns
     *
     * Part-of-speech (POS) tag a string, find the pronouns, and return result as JSON
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void posTaggerTagPronounsTest() {
        PosRequest request = null;

        PosResponse response = api.posTaggerTagPronouns(request);

        // TODO: test validations
    }
    
    /**
     * Part-of-speech tag a string
     *
     * Part-of-speech (POS) tag a string and return result as JSON
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void posTaggerTagSentenceTest() {
        PosRequest request = null;

        PosResponse response = api.posTaggerTagSentence(request);

        // TODO: test validations
    }
    
    /**
     * Part-of-speech tag a string, filter to verbs
     *
     * Part-of-speech (POS) tag a string, find the verbs, and return result as JSON
     *
     * @throws RestClientException
     *          if the Api call fails
     */
    @Test
    void posTaggerTagVerbsTest() {
        PosRequest request = null;

        PosResponse response = api.posTaggerTagVerbs(request);

        // TODO: test validations
    }
    
}
