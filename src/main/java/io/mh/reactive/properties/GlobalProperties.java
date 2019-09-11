package io.mh.reactive.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author mhlukhov on 9/11/2019
 */
@Component
@ConfigurationProperties
@Validated
@Data
public class GlobalProperties {
    @Max(5)
    @Min(0)
    private int threadPool;
    @NotEmpty
    private String email;
}
