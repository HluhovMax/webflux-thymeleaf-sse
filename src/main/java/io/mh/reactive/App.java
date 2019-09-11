package io.mh.reactive;

import io.mh.reactive.config.CustomGlobalProperties;
import io.mh.reactive.config.WordPressProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class App implements CommandLineRunner {

    private final WordPressProperties wordPressProperties;
    private final CustomGlobalProperties customGlobalProperties;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(customGlobalProperties);
        System.out.println(wordPressProperties);
    }
}
