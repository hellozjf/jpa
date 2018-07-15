package com.hellozjf.study.jpa.repository;

import com.hellozjf.study.jpa.JpaApplicationTests;
import com.hellozjf.study.jpa.dataobject.Student;
import com.hellozjf.study.jpa.dataobject.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @author hellozjf
 */
@Slf4j
public class TeacherRepositoryTest extends JpaApplicationTests {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private UniversityRepository universityRepository;

    @Test
    public void save() {
        Teacher teacher = new Teacher();
        teacher.setName("老师2");
        teacher.setUniversity(universityRepository.findById(9L).get());
        Teacher result = teacherRepository.save(teacher);
        assertNotNull(result);
    }

    @Test
    public void findById() {
        Optional<Teacher> teacher = teacherRepository.findById(11L);
        assertTrue(teacher.isPresent());
        log.debug("teacher = {}", teacher.get());
        for (Student student : teacher.get().getStudentSet()) {
            log.debug("student = {}", student);
        }
    }

    @Test
    public void findAll() {
        List<Teacher> teacherList = teacherRepository.findAll();
        for (Teacher teacher : teacherList) {
            log.debug("teacher = {}", teacher);
            for (Student student : teacher.getStudentSet()) {
                log.debug("student = {}", student);
            }
        }
    }
}