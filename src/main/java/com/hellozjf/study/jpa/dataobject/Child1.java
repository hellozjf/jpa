package com.hellozjf.study.jpa.dataobject;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Child1 extends Parent {
    private String email;
}
