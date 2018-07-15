package com.hellozjf.study.jpa.repository;

import com.hellozjf.study.jpa.dataobject.BlogTagRelationship;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author hellozjf
 */
public interface BlogTagRelationshipRepository extends JpaRepository<BlogTagRelationship, Long> {
    @Override
    @EntityGraph(value = "BlogTagRelationship.all")
    List<BlogTagRelationship> findAll();
}
