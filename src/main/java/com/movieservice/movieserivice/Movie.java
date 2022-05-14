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
    private enum genre {COMEDY, THRILLER, DOCUMENTARY, ACTION, DRAMA};

    public Movie() {
    }


    public Movie(Long id, String title, int yearOfRelease) {
        this.id = id;
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
