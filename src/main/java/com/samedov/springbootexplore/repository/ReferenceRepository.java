package com.samedov.springbootexplore.repository;

import com.samedov.springbootexplore.domain.Reference;
import com.samedov.springbootexplore.dto.ReferenceDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReferenceRepository extends JpaRepository<Reference, Integer> {

	List<ReferenceDto> findAllByName(String name);

}
