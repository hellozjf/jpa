package com.hellozjf.study.jpa.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator", discriminatorType=DiscriminatorType.STRING)//表示区分不同的对象的字段名
@DiscriminatorValue("person")//用来表示该对象是何种对象的,即区分器
@Data
public class Parent {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
}
