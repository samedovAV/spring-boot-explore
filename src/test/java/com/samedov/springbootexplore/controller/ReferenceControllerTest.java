package com.samedov.springbootexplore.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.samedov.springbootexplore.repository.ReferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(ReferenceController.class)
class ReferenceControllerTest {
	
	@Autowired
	MockMvc mvc;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@MockBean
	ReferenceRepository referenceRepository;
	
	
	
}