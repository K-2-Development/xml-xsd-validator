package dev.k2.commons;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class XsdExceptionsAdvice {

    @ExceptionHandler(XsdNotFoundException.class)
    public ResponseEntity<String> handleXsdNotFoundException(XsdNotFoundException e) {
        return new ResponseEntity<>("Xsd Not Found\n" + e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(XmlParserException.class)
    public ResponseEntity<String> handleXmlParserException(XmlParserException e) {
        return new ResponseEntity<>("Xml could not be parsed\n" + e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
