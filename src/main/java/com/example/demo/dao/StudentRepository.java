package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

    public Student findByName(String name);
}
