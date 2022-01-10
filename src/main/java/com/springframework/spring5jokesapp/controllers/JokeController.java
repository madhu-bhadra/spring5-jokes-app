package com.springframework.spring5jokesapp.controllers;

import com.springframework.spring5jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String displayJokes(Model model){
        model.addAttribute("jokes", jokeService.getJokes());
        return "index";
    }

}
