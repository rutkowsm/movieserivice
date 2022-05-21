package com.movieservice.movieserivice.repository;

import com.movieservice.movieserivice.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
