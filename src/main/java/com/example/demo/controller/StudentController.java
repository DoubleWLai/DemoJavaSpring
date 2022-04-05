package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "{name}")
    public Student getAllStudents(@PathVariable("name") String name) {
        return studentService.getStudent(name);
    }

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "added student";
    }

//    @PutMapping
//    public String updateStudent(@RequestBody Student student) {
//        studentService.updateStudent(student);
//        return "updated student";
//    }
//
//    @DeleteMapping(path = "{id}")
//    public String deleteStudent(@PathVariable("id") UUID id) {
//        studentService.deleteStudent(id);
//        return "deleted student";
//    }
}
