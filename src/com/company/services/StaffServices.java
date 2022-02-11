package com.company.services;

import com.company.models.Applicant;
import com.company.models.School;
import com.company.models.Staff;
import com.company.models.Student;

import java.util.List;

public interface StaffServices {
    String teachAClass(Staff staff, String subject);
    String conductAssessment(String subject, List<Student> studentList);
    String admitNewStudent(Staff staff, Applicant applicant, School school);
}
