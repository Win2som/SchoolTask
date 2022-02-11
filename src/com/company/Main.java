package com.company;

import com.company.enums.Gender;
import com.company.enums.Roles;
import com.company.models.School;
import com.company.models.Staff;

public class Main {

    public static void main(String[] args) {
        School school = new School();
        System.out.println(school.getName());
        Staff newStaff = new Staff("Ebube", 10,  Gender.FEMALE, 1,
                Roles.TEACHER, "BSC");
        System.out.println(newStaff);
	// write your code here
    }
}
