package com.validation.test.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class LeadAlreadyExistsException extends RuntimeException {
    public LeadAlreadyExistsException(String message) {
        super(message);
    }
}

