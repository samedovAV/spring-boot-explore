package com.samedov.springbootexplore.controller;

import com.samedov.springbootexplore.domain.Reference;
import com.samedov.springbootexplore.dto.ReferenceDto;
import com.samedov.springbootexplore.service.ReferenceService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/references")
@RequiredArgsConstructor
public class ReferenceController {

    private final ReferenceService referenceService;
	
	@GetMapping("/all")
    public List<Reference> getAllReferences() {
        return referenceService.getAllReferences();
    }

    @GetMapping("/{name}")
    public String getReferenceLinkByName(@PathVariable String name) {
        return referenceService.getReferenceLinkByName(name);
    }
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("")
	void createReference(@Valid @RequestBody ReferenceDto dto) {
		// some logic
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PutMapping("/{id}")
	void updateReference(@Valid @RequestBody ReferenceDto dto, @PathVariable Integer id) {
		// some logic
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	void deleteReference(@PathVariable Integer id) {
		// some logic
	}
}
