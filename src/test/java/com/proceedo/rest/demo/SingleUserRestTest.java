package com.proceedo.rest.demo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class SingleUserRestTest {

        private static final String URL = "https://reqres.in/api/users/{id}";

    @Test
    public void shouldRetrieveSingleUser() {
        int id = 2;

        when()
                .get(URL, id)
        .then()
                .statusCode(200)
                .body("data.id", equalTo(2))
                .body("data.email", equalTo("janet.weaver@reqres.in"));
    }
}
