package io.mh.reactive.config;

import io.mh.reactive.model.Menu;
import io.mh.reactive.model.Server;
import io.mh.reactive.model.Theme;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mhlukhov on 9/11/2019
 */
@Data
@Component
@PropertySource("classpath:global.properties")
@ConfigurationProperties("wordpress")
public class WordPressProperties {

    private List<Menu> menus = new ArrayList<>();
    private Theme theme;
    private List<Server> servers = new ArrayList<>();
}
