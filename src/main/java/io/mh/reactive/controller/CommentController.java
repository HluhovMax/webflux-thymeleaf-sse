package io.mh.reactive.controller;

import io.mh.reactive.model.Comment;
import io.mh.reactive.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author mhlukhov on 9/10/2019
 */
@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentRepository commentRepository;

    @GetMapping(path = "/comment/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Comment> feed() {
        return this.commentRepository.findAll();
    }
}

