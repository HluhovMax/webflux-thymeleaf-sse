package io.mh.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author mhlukhov on 9/10/2019
 */
@Data
@AllArgsConstructor
public class Comment {

    private String author;
    private String message;
    private String timestamp;
}
