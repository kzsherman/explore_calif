package com.amigoscode.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents (){
        List<Student> students = new ArrayList<>();
                students.add(
                new Student(UUID.randomUUID(),
                        "James",
                        "Bond",
                        "jamesbond@gmail.com",
                        Student.Gender.MALE
                ));
                students.add(
                new Student(UUID.randomUUID(),
                        "James",
                        "Bond",
                        "jamesbond@gmail.com",
                        Student.Gender.MALE
                ));
                return students;
    }
}
