package com.example.demo.dao;

import com.example.demo.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDao {

    List<Student> selectAllStudents();

    int insertStudent(UUID id, Student student); // there is not db here, if we have it, the UUID would be generated automatically

}
