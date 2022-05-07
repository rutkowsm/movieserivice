package com.movieservice.movieserivice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private int yearOfRelease;
    private enum genre {COMEDY, THRILLER, DOCUMENTARY, ACTION};

    public Movie() {
    }


    public Movie(Long id, String title, int yearOfRelease) {
        this.id = id;
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }
}
