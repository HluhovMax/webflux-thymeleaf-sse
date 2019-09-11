package io.mh.reactive.controller;

import io.mh.reactive.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

/**
 * @author mhlukhov on 9/11/2019
 */
@Controller
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public String movie(final Model model) {

        IReactiveDataDriverContextVariable mode =
                new ReactiveDataDriverContextVariable(movieRepository.findAll(), 1);

        model.addAttribute("movies", mode);

        return "movie";
    }
}
