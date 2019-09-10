package io.mh.reactive.repository;

import io.mh.reactive.model.Comment;
import io.mh.reactive.utils.CommentGenerator;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

/**
 * @author mhlukhov on 9/10/2019
 */
@Repository
public class ReactiveCommentRepository implements CommentRepository {

    @Override
    public Flux<Comment> findAll() {

        //simulate data streaming every 1 second.

        return Flux.interval(Duration.ofMillis(500))
                .onBackpressureDrop()
                .map(this::generateComment)
                .flatMapIterable(x -> x);
    }

    private List<Comment> generateComment(long interval) {

        Comment obj = new Comment(
                CommentGenerator.randomAuthor(),
                CommentGenerator.randomMessage(),
                CommentGenerator.getCurrentTimeStamp());

        return Collections.singletonList(obj);
    }
}
