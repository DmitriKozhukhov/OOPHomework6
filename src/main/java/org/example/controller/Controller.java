package org.example.controller;

import org.example.model.Prefect;
import org.example.model.Student;
import org.example.model.StudentGroup;
import org.example.model.Teacher;
import org.example.service.SearchStudent;
import org.example.service.StudentGroupService;
import org.example.service.StudentService;
import org.example.service.TeacherService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller implements SearchStudent {

    protected StudentGroupService groupService;
    protected StudentService studentService;

    protected TeacherService teacherService;

    List<Student> studentList;


    public void run() {
        Student student1 = studentService.StudentCreate(new Student("Ivan Ivanov"));
        Student student2 = studentService.StudentCreate(new Student("Petr Petrov"));
        Student student3 = studentService.StudentCreate(new Student("Fedor Fedorov"));
        Prefect prefect1 = (Prefect) studentService.StudentCreate(new Prefect("Boris Borisov"));
        studentList = new ArrayList<>(Arrays.asList(student1, student2, student3, prefect1));
        Teacher teacher1 = teacherService.TeacherCreate(new Teacher("Isaac Newton"));
        StudentGroup group1 = groupService.studentGroupCreate(teacher1, studentList);
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println("teacher1 = " + teacher1);
        System.out.println("group1 = " + group1);
    }

    public Controller() {
        studentService = new StudentService();
        teacherService = new TeacherService();
        groupService = new StudentGroupService();
    }

    @Override
    public Student getStudentById(int id) {
        Student result = null;
        for (Student student : studentList) {
            if (student.getStudentId() == id){
                result = student;

            }
        }
        return result;
    }
}
