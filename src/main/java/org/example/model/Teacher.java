package org.example.model;

public class Teacher {
    protected Integer teacherId;
    protected String name;

    public Teacher( String name) {
            this.name = name;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                '}';
    }
}
