package com.validation.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import com.validation.test.exception.LeadAlreadyExistsException;
import com.validation.test.repository.LeadRepository;
import com.validation.test.service.LeadService;

//Example test class for service
@RunWith(MockitoJUnitRunner.class)
public class LeadServiceTest {
 @InjectMocks
 private LeadService leadService;

 @Mock
 private LeadRepository leadRepository;

 @Test
 public void testCreateLead_Success() {
     // Mock repository methods and perform the test
     // ...
 }

 @Test(expected = LeadAlreadyExistsException.class)
 public void testCreateLead_DuplicateLeadId() {
     // Mock repository methods to return true and perform the test
     // ...
 }

 // Additional test methods
}

