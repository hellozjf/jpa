package com.hellozjf.study.jpa.domain;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
public class Child2 extends Parent {
    private String address;
}
