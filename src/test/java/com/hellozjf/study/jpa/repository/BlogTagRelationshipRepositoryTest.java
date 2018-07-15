package com.hellozjf.study.jpa.repository;

import com.hellozjf.study.jpa.JpaApplicationTests;
import com.hellozjf.study.jpa.dataobject.BlogTagRelationship;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author hellozjf
 */
@Slf4j
public class BlogTagRelationshipRepositoryTest extends JpaApplicationTests {

    @Autowired
    private BlogTagRelationshipRepository blogTagRelationshipRepository;

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private TagRepository tagRepository;

    @Test
    public void save() {
        BlogTagRelationship blogTagRelationship = new BlogTagRelationship();
        blogTagRelationship.setBlog(blogRepository.findByTitle("博客2"));
        blogTagRelationship.setTag(tagRepository.findByName("标签22"));
        blogTagRelationshipRepository.save(blogTagRelationship);
    }

    @Test
    public void findAll() {
        List<BlogTagRelationship> blogTagRelationshipList = blogTagRelationshipRepository.findAll();
        log.debug("BlogTagRelationship = {}", blogTagRelationshipList);
    }
}
