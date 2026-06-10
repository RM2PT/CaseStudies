package com.automatedtellermachinesystem.controller.generic;

import com.automatedtellermachinesystem.controller.generic.response.GenericResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public abstract class GenericController {

    protected <T> GenericResponse createSuccessResponse(String message) {
        return new GenericResponse(true, message,
                HttpStatus.OK.value());
    }

    protected <T> GenericResponse createSuccessResponse(T data) {
        return new GenericResponse(true,
                HttpStatus.OK.value(), data);
    }

}
