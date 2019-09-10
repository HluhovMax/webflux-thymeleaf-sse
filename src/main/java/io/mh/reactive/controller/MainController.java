package io.mh.reactive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author mhlukhov on 9/10/2019
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String index(final Model model) {
        return "index";
    }
}
