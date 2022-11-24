package dev.k2.commons;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class XsdExceptionsAdvice {

    @ExceptionHandler(XsdNotFoundException.class)
    public ResponseEntity<String> handleXsdNotFoundException(XsdNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
