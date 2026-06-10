package com.automatedtellermachinesystem.controller.generic.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * This class provides a global exception handling mechanism for written APIs.
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({Exception.class})
    public String handleException(Exception ex) {
        log.error("GlobalExceptionHandler catched an exception!");
        log.error("Error message: " + ex.getMessage());
        return "This exception was caught by GlobalExceptionHandler! " + ex.getMessage();
    }
}
