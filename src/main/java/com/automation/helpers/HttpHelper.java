package com.automation.helpers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HttpHelper {

    private static RequestSpecification requestSpecification;

    // Initialize the base URI and other configurations
    static {
        RestAssured.baseURI = "https://your-api-base-url.com"; // Change this to your base URL
        requestSpecification = RestAssured.given();
    }

    // GET request
    public static Response get(String endpoint) {
        return requestSpecification
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    // POST request with JSON body
    public static Response post(String endpoint, String jsonBody) {
        return requestSpecification
                .body(jsonBody)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }

    // PUT request with JSON body
    public static Response put(String endpoint, String jsonBody) {
        return requestSpecification
                .body(jsonBody)
                .when()
                .put(endpoint)
                .then()
                .extract()
                .response();
    }

    // DELETE request
    public static Response delete(String endpoint) {
        return requestSpecification
                .when()
                .delete(endpoint)
                .then()
                .extract()
                .response();
    }

    // Add headers if needed
    public static void addHeader(String key, String value) {
        requestSpecification.header(key, value);
    }

    // Set query parameters
    public static void addQueryParam(String key, String value) {
        requestSpecification.queryParam(key, value);
    }

    // Example of setting Authorization
    public static void setAuth(String authToken) {
        requestSpecification.header("Authorization", "Bearer " + authToken);
    }

    // Reset the request specification if you want to clear previous configurations
    public static void resetRequestSpecification() {
        requestSpecification = RestAssured.given();
    }
}