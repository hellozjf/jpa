package com.hellozjf.study.jpa.dataobject;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

/**
 * @author hellozjf
 */
@Entity
@NamedEntityGraph(name = "University.all", attributeNodes = {
        @NamedAttributeNode(value = "teacherSet", subgraph = "Teacher.all")
}, subgraphs = {
        @NamedSubgraph(name = "Teacher.all", attributeNodes = {
                @NamedAttributeNode(value = "studentSet")
        })
})
@Data
@EqualsAndHashCode(callSuper = true, exclude = "teacherSet")
@ToString(callSuper = true, exclude = "teacherSet")
public class University extends BaseDataObject {

    private String address;

    private String name;

    @OneToMany(mappedBy = "university")
    private Set<Teacher> teacherSet;
}
