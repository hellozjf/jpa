package com.hellozjf.study.jpa.repository;

import com.hellozjf.study.jpa.dataobject.University;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author hellozjf
 */
public interface UniversityRepository extends JpaRepository<University, Long> {
    @Override
    @EntityGraph(value = "University.all")
    Optional<University> findById(Long aLong);
}
