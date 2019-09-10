package io.mh.reactive.repository;

import io.mh.reactive.model.Comment;
import reactor.core.publisher.Flux;

/**
 * @author mhlukhov on 9/10/2019
 */
public interface CommentRepository {

    Flux<Comment> findAll();
}
