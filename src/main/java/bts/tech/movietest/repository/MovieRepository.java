package bts.tech.movietest.repository;

import bts.tech.movietest.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MovieRepository {

    private Map<Long, Movie> movieMap;
    private long movieId;

    public MovieRepository() {
        movieMap = new HashMap<>();
        movieId = 0;
    }

    public Map<Long, Movie> getMovieMap() {
        return movieMap;
    }

    public Movie getMovieId(long movieId) {
        return movieMap.get(movieId);
    }
}
