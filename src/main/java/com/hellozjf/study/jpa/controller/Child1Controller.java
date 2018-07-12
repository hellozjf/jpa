package com.hellozjf.study.jpa.controller;

import com.hellozjf.study.jpa.domain.Child1;
import com.hellozjf.study.jpa.repository.Child1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hellozjf
 */
@RestController
@RequestMapping(path = "/child1")
public class Child1Controller {
    @Autowired
    private Child1Repository child1Repository;

    @PostMapping(path = "/add")
    public void add(Child1 child1) {
        child1Repository.save(child1);
    }

    @GetMapping(path = "/all")
    public List<Child1> listAll() {
        return child1Repository.findAll();
    }
}
