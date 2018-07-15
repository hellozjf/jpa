package com.hellozjf.study.jpa.repository;

import com.hellozjf.study.jpa.dataobject.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hellozjf
 */
public interface ParentRepository extends JpaRepository<Parent, Integer> {
}
