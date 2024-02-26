package org.example.service;

import org.example.model.Student;
import org.example.model.Teacher;

public class TeacherService {

    private int teacherId;
    public Teacher TeacherCreate(Teacher teacher){
        teacher.setTeacherId(this.teacherId + 1);
        this.teacherId++;
        return teacher;
    }
}
