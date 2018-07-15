package com.hellozjf.study.jpa.repository;

import com.hellozjf.study.jpa.JpaApplicationTests;
import com.hellozjf.study.jpa.dataobject.Blog;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hellozjf
 */
public class BlogRepositoryTest extends JpaApplicationTests {

    @Autowired
    private BlogRepository blogRepository;

    @Test
    public void save() {
        Blog blog = new Blog();
        blog.setTitle("博客2");
        blog.setContent("博客2内容");
        Blog result = blogRepository.save(blog);
        Assert.assertNotNull(result);
    }
}