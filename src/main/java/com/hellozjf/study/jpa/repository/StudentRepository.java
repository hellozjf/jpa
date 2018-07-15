package com.hellozjf.study.jpa.repository;

import com.hellozjf.study.jpa.dataobject.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hellozjf
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}