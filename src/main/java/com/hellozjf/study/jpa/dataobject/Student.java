package com.hellozjf.study.jpa.dataobject;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author hellozjf
 */
@Entity
@NamedEntityGraph(name = "Student.all", attributeNodes = {
        @NamedAttributeNode(value = "teacher")
})
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Student extends BaseDataObject {

    private String name;

    @ManyToOne
    @JoinColumn(name = "teacherId")
    private Teacher teacher;
}
