package bts.tech.movietest;

import bts.tech.movietest.model.Movie;
import bts.tech.movietest.repository.MovieRepository;
import bts.tech.movietest.service.MovieService;

public class Main {

    public static void main(String[] args) {

        MovieService movieService = new MovieService(new MovieRepository());

        movieService.addMovie(new Movie("Love", 153, true));
        movieService.addMovie(new Movie("Hello", 160, false));
        movieService.addMovie(new Movie("OO7", 190, true));

        System.out.println(movieService.getAllMovies());
    }
}
