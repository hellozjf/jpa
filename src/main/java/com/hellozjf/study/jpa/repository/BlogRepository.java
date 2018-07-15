package com.hellozjf.study.jpa.repository;

import com.hellozjf.study.jpa.dataobject.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hellozjf
 */
public interface BlogRepository extends JpaRepository<Blog, Long> {
    Blog findByTitle(String title);
}
