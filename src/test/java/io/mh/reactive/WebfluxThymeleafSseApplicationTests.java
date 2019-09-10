package io.mh.reactive;

import io.mh.reactive.model.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebfluxThymeleafSseApplicationTests {

    @Autowired
    private WebTestClient webClient;

    @Test
    public void testCommentStream() {

        List<Comment> comments = webClient
                .get().uri("/comment/stream")
                .accept(MediaType.valueOf(MediaType.TEXT_EVENT_STREAM_VALUE))
                .exchange()
                .expectStatus().isOk()
                .returnResult(Comment.class)
                .getResponseBody()
                .take(3) // take 3 comment objects
                .collectList()
                .block();

        assert comments != null;
        comments.forEach(System.out::println);

        assertEquals(3, comments.size());
    }

}
