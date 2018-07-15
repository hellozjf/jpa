package com.hellozjf.study.jpa.dataobject;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author hellozjf
 */
@Entity
@NamedEntityGraph(name = "Blog.all", attributeNodes = {
        @NamedAttributeNode(value = "tagSet")
})
@Data
@EqualsAndHashCode(callSuper = true, exclude = "tagSet")
@ToString(callSuper = true, exclude = "tagSet")
public class Blog extends BaseDataObject {

    @NotNull
    @Column(unique = true)
    private String title;

    private String content;

    @ManyToMany
    @JoinTable(name = "blogTagRelation",
            joinColumns = @JoinColumn(name = "blogId"),
            inverseJoinColumns = @JoinColumn(name = "tagId"))
    private Set<Tag> tagSet;
}
