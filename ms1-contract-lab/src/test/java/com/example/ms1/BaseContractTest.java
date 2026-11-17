package com.example.ms1;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

// Base class for the tests that Spring Cloud Contract generates from addition.yml
public abstract class BaseContractTest {

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new AdditionController());
    }
}
