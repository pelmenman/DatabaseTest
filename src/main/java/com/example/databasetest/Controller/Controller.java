package com.example.databasetest.Controller;

import com.example.databasetest.model.Student;
import com.example.databasetest.model.StudentDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    StudentDatabase data;

    @GetMapping("/add")
    public @ResponseBody String add(@RequestParam String name,@RequestParam String surname,@RequestParam String groupName) {
        Student student = new Student(name, surname, groupName);
        data.save(student);
        return "Student is added!";
    }

    @GetMapping("/list")
    public @ResponseBody Iterable<Student> list() {
        return data.findAll();
    }
}
