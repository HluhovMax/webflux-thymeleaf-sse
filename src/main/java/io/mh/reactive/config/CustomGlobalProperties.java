package io.mh.reactive.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author mhlukhov on 9/11/2019
 */
@Data
@Component
@PropertySource("classpath:global.properties")
@ConfigurationProperties
public class CustomGlobalProperties {

    private int threadPool;
    private String email;
}
