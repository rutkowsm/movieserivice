package com.movieservice.movieserivice.entity;

import javax.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int yearOfRelease;
    @Enumerated(EnumType.STRING)
    private Genre genre;

    public Movie() {
    }


    public Movie(Long id, String title, int yearOfRelease, Genre genre) {
        this.id = id;
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", Title=" + title +
                ", YearOfRelease=" + yearOfRelease +
                ", Genre=" + genre + "}";
    }
}
