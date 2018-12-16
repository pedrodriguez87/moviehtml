package bts.tech.movietest.service;

import bts.tech.movietest.model.Movie;
import bts.tech.movietest.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class MovieService {

    private MovieRepository movieRepo;
    private long movieId;
    private Movie movie;

    @Autowired
    public MovieService(MovieRepository movieRepo) {
        this.movieRepo = movieRepo;
        movieId = 0;
    }

    public void addMovie(Movie movie) {
        movieRepo.getMovieMap().put(movieId, movie);
        movieId++;
    }

    public List<Movie> getAllMovies() {
        return new ArrayList<>(movieRepo.getMovieMap().values());
    }

    public Movie getMovieById(long movieId) {
        return movieRepo.getMovieId(movieId);

    }

}
