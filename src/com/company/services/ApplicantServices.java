package com.company.services;

import com.company.models.Applicant;

import java.util.List;

public interface ApplicantServices {
    String apply(Applicant applicant, List<Applicant> applicantList);
}
