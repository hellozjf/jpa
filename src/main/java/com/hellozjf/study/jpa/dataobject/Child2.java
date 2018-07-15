package com.hellozjf.study.jpa.dataobject;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Child2 extends Parent {
    private String address;
}
