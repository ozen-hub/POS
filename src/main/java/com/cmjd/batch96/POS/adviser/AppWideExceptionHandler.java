package com.cmjd.batch96.POS.adviser;

import com.cmjd.batch96.POS.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler(ClassNotFoundException.class)
    public ResponseEntity<StandardResponse> handleClassNotFoundException(ClassNotFoundException ex){
        return new ResponseEntity<>(
                new StandardResponse(404,ex.getMessage(),ex),
                HttpStatus.NOT_FOUND
        );
    }
}
