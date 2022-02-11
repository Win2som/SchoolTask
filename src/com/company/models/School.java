package com.company.models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class School {
    private final String name;
    private List<Staff> staffList;
    private List<Student> studentList;
    private List<Applicant> applicantList;

    public School() {
        this.name = "Decagon";
        this.staffList = new ArrayList<>();
        this.studentList = new ArrayList<>();
        this.applicantList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Applicant> getApplicantList() {
        return applicantList;
    }

    public void setApplicantList(List<Applicant> applicantList) {
        this.applicantList = applicantList;
    }
}
