package csv.academy.booksandauthors.controller;

import csv.academy.booksandauthors.exception.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = RecordNotFoundException.class)
    public ResponseEntity<Object> handleRecordNotFoundException(Exception e) {
        return new ResponseEntity<>("Record not found", HttpStatus.NOT_FOUND);
    }

}
