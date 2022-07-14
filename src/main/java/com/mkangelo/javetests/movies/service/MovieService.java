package com.mkangelo.javetests.movies.service;

import com.mkangelo.javetests.movies.data.MovieRepository;
import com.mkangelo.javetests.movies.model.Genre;
import com.mkangelo.javetests.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll().stream().filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }
}
