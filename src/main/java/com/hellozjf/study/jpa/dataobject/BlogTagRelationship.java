package com.hellozjf.study.jpa.dataobject;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author hellozjf
 */
@Entity
@NamedEntityGraph(name = "BlogTagRelationship.all", attributeNodes = {
        @NamedAttributeNode(value = "blog"),
        @NamedAttributeNode(value = "tag")
})
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BlogTagRelationship extends BaseDataObject {

    @NotNull
    @ManyToOne
    @JoinColumn(name = "blogId")
    private Blog blog;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tagId")
    private Tag tag;
}
