package com.hellozjf.study.jpa.repository;

import com.hellozjf.study.jpa.JpaApplicationTests;
import com.hellozjf.study.jpa.dataobject.Student;
import com.hellozjf.study.jpa.dataobject.Teacher;
import com.hellozjf.study.jpa.dataobject.University;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author hellozjf
 */
@Slf4j
public class UniversityRepositoryTest extends JpaApplicationTests {

    @Autowired
    private UniversityRepository universityRepository;

    @Test
    public void save() {
        University university = new University();
        university.setAddress("地址1");
        university.setName("大学1");
        universityRepository.save(university);
    }

    @Test
    public void findById() {
        Optional<University> university = universityRepository.findById(9L);
        log.debug("university = {}", university.get());
        for (Teacher teacher : university.get().getTeacherSet()) {
            log.debug("teacher = {}", teacher);
            for (Student student : teacher.getStudentSet()) {
                log.debug("student = {}", student);
            }
        }
    }
}
