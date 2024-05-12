package com.samedov.springbootexplore.service;

import com.hazelcast.shaded.org.everit.json.schema.regexp.Regexp;
import com.samedov.springbootexplore.domain.Reference;
import com.samedov.springbootexplore.repository.ReferenceRepository;
import java.util.Collections;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReferenceService {

    private final ReferenceRepository referenceRepository;

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

    public List<Reference> getAllReferences() {
        return referenceRepository.findAll();
    }
}
