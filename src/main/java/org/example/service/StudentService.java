package org.example.service;

import org.example.model.Student;

public class StudentService {
    private int studentId;

    public Student StudentCreate(Student student){
        student.setStudentId(studentId + 1);
        studentId++;
        return student;
    }

    public StudentService() {
    }
}
