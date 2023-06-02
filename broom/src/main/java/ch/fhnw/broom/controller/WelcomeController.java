package ch.fhnw.broom.controller;

import org.springframework.web.bind.annotaion.RestController;
import org.springframework.web.bind.annotaion.GetMapping;

@RestController
public class WelcomeController {

    @GetMapping(value="welcome")
    public String getWelcomeString() {
        return "Welcome to ye ole broom shoppe!";
    }
}

