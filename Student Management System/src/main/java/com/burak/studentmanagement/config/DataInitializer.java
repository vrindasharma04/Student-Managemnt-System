package com.burak.studentmanagement.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.burak.studentmanagement.dao.RoleDao;
import com.burak.studentmanagement.entity.Role;
import com.burak.studentmanagement.service.StudentService;
import com.burak.studentmanagement.service.TeacherService;
import com.burak.studentmanagement.user.UserDto;

/**
 * Seeds demo users on startup if they don't already exist.
 *
 * Demo accounts:
 *  - Student: student1 / 123
 *  - Teacher: teacher1 / 123
 */
@Component
public class DataInitializer implements ApplicationRunner {

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private RoleDao roleDao;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Ensure roles exist (data.sql should have inserted them already)
        Role studentRole = roleDao.findRoleByName("ROLE_STUDENT");
        Role teacherRole = roleDao.findRoleByName("ROLE_TEACHER");

        // Seed demo student
        if (studentService.findByStudentName("student1") == null && studentRole != null) {
            UserDto s = new UserDto();
            s.setUserName("student1");
            s.setPassword("123");
            s.setFirstName("Demo");
            s.setLastName("Student");
            s.setEmail("student1@example.com");
            s.setRole(studentRole);
            studentService.save(s);
        }

        // Seed demo teacher
        if (teacherService.findByTeacherName("teacher1") == null && teacherRole != null) {
            UserDto t = new UserDto();
            t.setUserName("teacher1");
            t.setPassword("123");
            t.setFirstName("Demo");
            t.setLastName("Teacher");
            t.setEmail("teacher1@example.com");
            t.setRole(teacherRole);
            teacherService.save(t);
        }
    }
}
