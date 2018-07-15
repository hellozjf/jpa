package com.hellozjf.study.jpa.repository;

import com.hellozjf.study.jpa.dataobject.Teacher;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author hellozjf
 */
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Override
    @EntityGraph(value = "Teacher.all")
    Optional<Teacher> findById(Long aLong);

    @Override
    @EntityGraph(value = "Teacher.all")
    List<Teacher> findAll();
}
