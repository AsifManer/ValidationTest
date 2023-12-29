package com.validation.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.validation.test.controller.LeadController;
import com.validation.test.service.LeadService;

//Example test class for controller
@RunWith(MockitoJUnitRunner.class)

public class LeadControllerTest {
 @InjectMocks
 private LeadController leadController;

 @Mock
 private LeadService leadService;

 @Test
 public void testCreateLead_Success() {
     // Mock the service method and perform the test here
   
 }

 @Test
 public void testCreateLead_DuplicateLeadId() {
     // Mock the service method to throw LeadAlreadyExistsException and perform the test
    
 }

 // Additional test methods you can try here
}

