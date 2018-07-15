package com.hellozjf.study.jpa.controller;

import com.hellozjf.study.jpa.dataobject.Parent;
import com.hellozjf.study.jpa.repository.ParentRepository;
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
@RequestMapping(path = "/parent")
public class ParentController {
    @Autowired
    private ParentRepository parentRepository;

    @PostMapping(path = "/add")
    public void add(Parent parent) {
        parentRepository.save(parent);
    }

    @GetMapping(path = "/all")
    public List<Parent> listAll() {
        return parentRepository.findAll();
    }
}
