package com.validation.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validation.test.entity.Lead;
import com.validation.test.exception.LeadAlreadyExistsException;
import com.validation.test.repository.LeadRepository;

import java.util.Date;

@Service
public class LeadService {
    @Autowired
    private LeadRepository leadRepository;

    public String createLead(Lead lead) {
        if (leadRepository.existsByLeadId(lead.getLeadId())) {
            throw new LeadAlreadyExistsException("Lead Already Exists in the database with the lead id");
        }

        // Additional business logic and validations

        leadRepository.save(lead);
        return "Created Leads Successfully";
    }

    // Additional service methods
}

