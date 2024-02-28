package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class globalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(Exception ex){
        ErrorResponse er = new ErrorResponse();
        er.setStatus(HttpStatus.NOT_FOUND.value());
        er.setMessage(ex.getMessage());
        er.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(er,HttpStatus.NOT_FOUND);
    }
}
