package com.company.services.serviceImpls;

import com.company.enums.Roles;
import com.company.models.Applicant;
import com.company.models.School;
import com.company.models.Staff;
import com.company.models.Student;
import com.company.services.StaffServices;

import java.util.List;

public class StaffServiceImpl implements StaffServices {
    @Override
    public String teachAClass(Staff staff, String subject) {
        return staff.getFullName() + " is teaching " + subject + " now";
    }

    @Override
    public String conductAssessment(String subject, List<Student> studentList) {
        return studentList.size() + " students are currently taking assessment on " + subject;
    }

    @Override
    public String admitNewStudent(Staff staff, Applicant applicant, School school) {
        if (staff.getRole().equals(Roles.PRINCIPAL)) {
            if (school.getApplicantList().contains(applicant) ) {
                if (applicant.getQualification().equalsIgnoreCase("FSLC")) {
                    Student student = new Student(applicant.getFullName(), applicant.getAge(),
                            applicant.getGender(), school.getStudentList().size() + 1, "JSS 1");
                    school.getApplicantList().remove(applicant);
                    school.getStudentList().add(student);
                    return "Congratulations, you have been offered provisional admission";
                }
                return "Sorry, you are not qualified to be admitted";
            }
            return "Sorry, kindly apply to be considered for admission";
        } return "You are authorized to admit students";
    }
}
