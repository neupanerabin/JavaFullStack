package com.example.demo.controller;

import com.example.demo.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestExampleController {
    List<Student> listOfStudent;
    public RestExampleController(List<Student> listOfStudents){
        listOfStudents=new ArrayList<>();
        listOfStudents.add(new Student(1,"Ram","Lama","Jorpati"));
        listOfStudents.add(new Student(2,"Ram","Lama","Jorpati1"));

        listOfStudents.add(new Student(3,"Ram","Lama","Jorpati2"));

        listOfStudents.add(new Student(4,"Ram","Lama","Jorpati3"));

        listOfStudents.add(new Student(5,"Ram","Lama","Jorpati4"));
        this.listOfStudent=listOfStudents;

    }
}
