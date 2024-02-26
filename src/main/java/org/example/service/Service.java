package org.example.service;

import org.example.model.Student;
import org.example.model.StudentGroup;
import org.example.model.Teacher;

import java.util.List;

public interface Service {
    StudentGroup studentGroupCreate(Teacher teacher, List<Student> studentList);
}
