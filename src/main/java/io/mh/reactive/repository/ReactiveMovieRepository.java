package io.mh.reactive.repository;

import io.mh.reactive.model.Movie;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import javax.validation.constraints.NotEmpty;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mhlukhov on 9/11/2019
 */
@Data
@Repository
@ConfigurationProperties
public class ReactiveMovieRepository implements MovieRepository {

    private static List<Movie> movie = new ArrayList<>();
    @NotEmpty
    private int duration;

    static {
        movie.add(new Movie("Polar (2019)", 64));
        movie.add(new Movie("Iron Man (2008)", 79));
        movie.add(new Movie("The Shawshank Redemption (1994)", 93));
        movie.add(new Movie("Forrest Gump (1994)", 83));
        movie.add(new Movie("Glass (2019)", 70));
    }

    @Override
    public Flux<Movie> findAll() {
        //Simulate big list of data, streaming it every 2 second delay
        return Flux.fromIterable(movie).delayElements(Duration.ofSeconds(duration));
    }
}
