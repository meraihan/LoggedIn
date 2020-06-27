package com.aziz.LoggedIn.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserveController {

    @GetMapping("/")
    public String landingPage() {
        return "index";
    }
    @GetMapping("/home")
    public String index() {
        return "home";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
