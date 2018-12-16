package bts.tech.movietest;


import bts.tech.movietest.model.Movie;
import bts.tech.movietest.service.MovieService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    public CommandLineRunner createDummyData(MovieService movieService) {
        return args -> {

            movieService.addMovie(new Movie("Austin Powers",120, false));
            movieService.addMovie(new Movie("Home Coming",150, true));

        };
    }

}
