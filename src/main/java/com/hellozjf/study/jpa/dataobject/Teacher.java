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
@Data
@NamedEntityGraph(name = "Teacher.all", attributeNodes = {
        @NamedAttributeNode(value = "studentSet"),
        @NamedAttributeNode(value = "university")
})
@EqualsAndHashCode(callSuper = true, exclude = "studentSet")
@ToString(callSuper = true, exclude = "studentSet")
public class Teacher extends BaseDataObject {

    private String name;

    @OneToMany(mappedBy = "teacher")
    private Set<Student> studentSet;

    @ManyToOne
    @JoinColumn(name = "universityId")
    private University university;
}
