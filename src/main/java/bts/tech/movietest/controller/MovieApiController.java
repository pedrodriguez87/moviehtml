package bts.tech.movietest.controller;

import bts.tech.movietest.model.Movie;
import bts.tech.movietest.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
@RequestMapping(path ="/api/movies")
public class MovieApiController {

    private MovieService movieService;

    @Autowired
    public MovieApiController(MovieService movieService) {

        this.movieService = movieService;
    }

    @RequestMapping(method = POST)
    public void addMovie(Movie movie) {

        this.movieService.addMovie(movie);

    }


}

