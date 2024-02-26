package org.example.service;

import org.example.model.Student;
import org.example.model.StudentGroup;
import org.example.model.Teacher;

import java.util.List;

public class StudentGroupService  implements Service{

    @Override
    public StudentGroup studentGroupCreate(Teacher teacher, List<Student> studentList) {
        StudentGroup studentGroup = new StudentGroup(teacher, studentList);
        return studentGroup;
    }


}
