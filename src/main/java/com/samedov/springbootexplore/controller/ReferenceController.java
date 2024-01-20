package com.samedov.springbootexplore.controller;

import com.samedov.springbootexplore.service.ReferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/references")
public class ReferenceController {

    @Autowired
    private ReferenceService referenceService;

    @GetMapping("/{name}")
    public String getReferenceLinkByName(@PathVariable("name") String name) {
        return referenceService.getReferenceLinkByName(name);
    }
}
