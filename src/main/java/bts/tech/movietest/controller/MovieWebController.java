package bts.tech.movietest.controller;

import bts.tech.movietest.model.Movie;
import bts.tech.movietest.service.MovieService;
import bts.tech.movietest.util.HandlebarsUtil;
import com.github.jknack.handlebars.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/movies")
public class MovieWebController {

    private MovieService movieService;

    @Autowired
    public MovieWebController(MovieService movieService){

        this.movieService = movieService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getAllMovies() throws IOException {

        Template template = HandlebarsUtil.compile("movie-list");

        Map<String, Object> values = new HashMap<>();
        values.put("movies", movieService.getAllMovies());

        return template.apply(values);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public void addMovie(Movie movie, HttpServletResponse response) throws IOException {

        movieService.addMovie(movie);
        response.sendRedirect("/movies");
    }
}
