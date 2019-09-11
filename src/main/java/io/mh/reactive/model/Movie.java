package io.mh.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author mhlukhov on 9/11/2019
 */
@Data
@AllArgsConstructor
public class Movie {

    private String name;
    private Integer score;
}
