package com.samedov.springbootexplore.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ReferenceService {

    @Cacheable("references")
    public String getReferenceLinkByName(String name) {
        return findReferenceInSlowSource(name);
    }

    private String findReferenceInSlowSource(String name) {
        // some long processing
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Sample Book Name";}
}
