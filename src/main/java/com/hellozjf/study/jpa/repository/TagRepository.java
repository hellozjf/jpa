package com.hellozjf.study.jpa.repository;

import com.hellozjf.study.jpa.dataobject.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hellozjf
 */
public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
}
