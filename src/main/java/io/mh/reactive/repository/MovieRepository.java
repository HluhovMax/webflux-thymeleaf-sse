package io.mh.reactive.repository;

import io.mh.reactive.model.Movie;
import reactor.core.publisher.Flux;

/**
 * @author mhlukhov on 9/11/2019
 */
public interface MovieRepository {

    Flux<Movie> findAll();
}
