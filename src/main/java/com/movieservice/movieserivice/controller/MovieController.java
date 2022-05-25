package com.movieservice.movieserivice.controller;

import com.movieservice.movieserivice.entity.Movie;
import com.movieservice.movieserivice.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private MovieService movieService;

    MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/getmovies")
    public ResponseEntity<List<Movie>> getMovies(){
        return ResponseEntity.ok(this.movieService.getMovies());
    }

    @GetMapping("/getmovies/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        return ResponseEntity.ok(this.movieService.getMovieById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(this.movieService.addMovie(movie));
    }

    @PostMapping("/getmovies/{id}")
    public ResponseEntity<Movie> editMovieById(@PathVariable Long id, @RequestBody Movie movie){
        return ResponseEntity.ok(this.movieService.editMovieById(id, movie));
    }

    @DeleteMapping("/deletemovie/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }

}
