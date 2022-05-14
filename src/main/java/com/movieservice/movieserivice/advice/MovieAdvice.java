package com.movieservice.movieserivice.advice;

import com.movieservice.movieserivice.exception.IncorrectMovieException;
import com.movieservice.movieserivice.exception.MovieNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MovieAdvice {

    @ExceptionHandler(MovieNotFoundException.class)
    public ResponseEntity<String> handleMovieNotFoundException(MovieNotFoundException e){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(IncorrectMovieException.class)
    public ResponseEntity<String> handleIncorrectMovieException(IncorrectMovieException e){
        return ResponseEntity.badRequest().build();
    }
}
