package com.demo.studentApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @RequestMapping("/getStudents")
    public List<Student> getStudent(){

        return List.of(
                new Student(1,"sadid33",212),
                new Student(2,"sadid22",213),
                new Student(3,"sadid11",214)
        );

    }

}
