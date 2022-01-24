package com.coderhouse.controleradvice.handle;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class MessageErrorHandle {
    @ResponseBody
    @ExceptionHandler(ProductError.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ErrorMessage messageErrorHandle(ProductError ex) {
        return new ErrorMessage(ex.getMessage());
    }
}
