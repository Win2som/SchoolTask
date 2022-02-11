package com.company.models;

import com.company.enums.Gender;

public class Student extends Person{
    private int studentId;
    private String level;

    public Student(String fullName, int age, Gender gender, int studentId, String level) {
        super(fullName, age, gender);
        this.studentId = studentId;
        this.level = level;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
