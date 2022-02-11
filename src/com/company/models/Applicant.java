package com.company.models;

import com.company.enums.Gender;

public class Applicant extends Person{
    private String qualification;
    private String address;

    public Applicant(String fullName, int age, Gender gender, String qualification, String address) {
        super(fullName, age, gender);
        this.qualification = qualification;
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
