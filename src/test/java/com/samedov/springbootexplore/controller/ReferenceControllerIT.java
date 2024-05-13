package com.samedov.springbootexplore.controller;

import com.samedov.springbootexplore.domain.Reference;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestClient;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ReferenceControllerIT {
	
	@LocalServerPort
	int randomServerPort;
	
	RestClient restClient;
	
	@BeforeEach
	void setUp() {
		restClient = RestClient.create("http://localhost:" + randomServerPort);
	}
	
	@Test
	void getAllReferences() {
		List<Reference> references = restClient.get()
				.uri("/api/references/all")
				.retrieve()
				.body(new ParameterizedTypeReference<>() {});
		
		assertNotNull(references);
	}
}