package com.company.models;

import com.company.enums.Gender;
import com.company.enums.Roles;

public class Staff extends Person {
    private int staffId;
    private Roles role;
    private String qualification;

    public Staff(String fullName, int age, Gender gender, int staffId, Roles role, String qualification) {
        super(fullName, age, gender);
        this.staffId = staffId;
        this.role = role;
        this.qualification = qualification;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", role=" + role +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
