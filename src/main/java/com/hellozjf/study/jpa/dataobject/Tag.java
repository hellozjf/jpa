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
@NamedEntityGraph(name = "Tag.all", attributeNodes = {
        @NamedAttributeNode(value = "blogSet")
})
@Data
@EqualsAndHashCode(callSuper = true, exclude = "blogSet")
@ToString(callSuper = true, exclude = "blogSet")
public class Tag extends BaseDataObject {

    @NotNull
    @Column(unique = true)
    private String name;

    @ManyToMany(mappedBy = "tagSet")
    private Set<Blog> blogSet;
}
