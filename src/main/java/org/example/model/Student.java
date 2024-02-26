package org.example.model;

public class Student {
    protected Integer studentId;
    protected String name;

    public Student(String name) {

        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }

    public String getStudentName() {
        return this.name;
    }
}


