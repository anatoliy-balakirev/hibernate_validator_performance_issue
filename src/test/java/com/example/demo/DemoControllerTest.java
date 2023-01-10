package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import java.nio.file.Files;
import java.util.Collections;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoControllerTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoControllerTest.class);

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testEndpointWithValidation() throws Exception {
        execute("/endpoint_with_validation");
    }

    @Test
    void testEndpointWithExplicitValidation() throws Exception {
        execute("/endpoint_with_explicit_validation");
    }

    @Test
    void testEndpointWithoutValidation() throws Exception {
        execute("/endpoint_without_validation");
    }

    void execute(final String endpointName) throws Exception {
        final String jsonRequest = Files.readString(new ClassPathResource("com/example/demo/request.json").getFile()
                                                                                                                     .toPath());
        final HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);

        final long startTime = System.currentTimeMillis();
        LOGGER.info("Sending '{}' request...", endpointName);
        restTemplate.exchange(endpointName, HttpMethod.PUT, new HttpEntity<>(jsonRequest, headers), Void.class);
        LOGGER.info("It took {}ms to execute the '{}' request", (System.currentTimeMillis() - startTime), endpointName);
    }
}