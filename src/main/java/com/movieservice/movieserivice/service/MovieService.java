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
        this.movies = List.of(new Movie());
    }

    public List<Movie> getMovies(){
        return this.movies;
    }

    public Movie getMovieById(Long id) {
        return this.getMovies().stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst()
                .orElseThrow(MovieNotFoundException::new);
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
