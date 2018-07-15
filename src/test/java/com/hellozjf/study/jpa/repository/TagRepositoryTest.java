package com.hellozjf.study.jpa.repository;

import com.hellozjf.study.jpa.JpaApplicationTests;
import com.hellozjf.study.jpa.dataobject.Tag;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hellozjf
 */
public class TagRepositoryTest extends JpaApplicationTests {

    @Autowired
    private TagRepository tagRepository;

    @Test
    public void save() {
        Tag tag = new Tag();
        tag.setName("标签22");
        Tag result = tagRepository.save(tag);
        Assert.assertNotNull(result);
    }
}
