package com.hellozjf.study.jpa.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@TableGenerator(        //一个类一张表，最重要的是要保证它们的id由一个生成器产生，@TableGenerator就是为了控制这个的
//        name = "t_gen",
//        table = "t_gen_table",
//        pkColumnName = "t_pk",
//        valueColumnName = "t_value",
//        pkColumnValue = "person_pk",
//        initialValue = 1,
//        allocationSize = 1
//)
@Data
public class Parent {
    @Id
    @GeneratedValue
//    @GeneratedValue(generator="t_gen", strategy=GenerationType.TABLE)//这个就是用表生成器生成的，用同一个生成器就可以控制它们的id不重复
    private Integer id;
    private String name;
}
