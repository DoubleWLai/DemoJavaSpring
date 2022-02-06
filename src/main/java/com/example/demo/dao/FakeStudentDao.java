package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class FakeStudentDao implements StudentDao {

    private static List<Student> Database;

    @Override
    public List<Student> selectAllStudents() {
        return Database;
    }

    @Override
    public int insertStudent(UUID id, Student student) {
        return 0;
    }
}
