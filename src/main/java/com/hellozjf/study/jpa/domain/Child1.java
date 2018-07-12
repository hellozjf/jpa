package com.hellozjf.study.jpa.domain;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
public class Child1 extends Parent {
    private String email;
}
