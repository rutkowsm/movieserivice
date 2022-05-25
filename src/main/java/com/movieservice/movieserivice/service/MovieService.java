package com.movieservice.movieserivice.service;

import com.movieservice.movieserivice.entity.Movie;
import com.movieservice.movieserivice.exception.MovieNotFoundException;
import com.movieservice.movieserivice.repository.MovieRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private List<Movie> movies;

    private final MovieRepo movieRepo;

    public MovieService(MovieRepo movieRepo){
        this.movieRepo = movieRepo;
    }

    public List<Movie> getMovies(){
        return movieRepo.findAll();
            }

    public Movie getMovieById(Long id) {
        return (Movie) movieRepo.getMovieById(id).orElseThrow(MovieNotFoundException::new);
    }

    public Movie addMovie(Movie movie){
        this.movies.add(movie);
        return movie;
    }

    public Movie editMovieById(Long id, Movie movie){
        movie.setId(id);
        this.addMovie(movie);
        return movie;
    }

    public void deleteMovie(Long id) {
        movieRepo.deleteById(id);
    }

}
