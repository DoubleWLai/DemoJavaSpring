package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class Student {

    @Id
    private String id;

    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
