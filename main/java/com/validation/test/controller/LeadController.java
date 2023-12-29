package com.validation.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.validation.test.entity.Lead;
import com.validation.test.exception.LeadAlreadyExistsException;
import com.validation.test.response.ApiErrorResponse;
import com.validation.test.response.ApiResponse;
import com.validation.test.service.LeadService;

@RestController
@RequestMapping("/api/leads")
public class LeadController {
    @Autowired
    private LeadService leadService;

    @PostMapping
    public ResponseEntity<?> createLead(@RequestBody Lead lead) {
        try {
            String response = leadService.createLead(lead);
            return ResponseEntity.ok(new ApiResponse("success", response));
        } catch (LeadAlreadyExistsException e) {
            return ResponseEntity.status(400).body(new ApiErrorResponse());
        }
    }

    // Additional controller methods
}

