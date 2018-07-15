package com.hellozjf.study.jpa.repository;

import com.hellozjf.study.jpa.JpaApplicationTests;
import com.hellozjf.study.jpa.dataobject.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author hellozjf
 */
@Slf4j
public class StudentRepositoryTest extends JpaApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void save() {
        Student student = new Student();
        student.setName("学生4");
        student.setTeacher(teacherRepository.findById(12L).get());
        Student result = studentRepository.save(student);
        assertNotNull(result);
    }
}