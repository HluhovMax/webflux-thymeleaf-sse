package io.mh.reactive.model;

import lombok.Data;

/**
 * @author mhlukhov on 9/10/2019
 */
@Data
public class Comment {

    private String author;
    private String message;
    private String timestamp;

    public Comment(String author, String message, String timestamp) {
        this.author = author;
        this.message = message;
        this.timestamp = timestamp;
    }
}
