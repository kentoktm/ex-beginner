package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class exam01Controller {

    @RequestMapping("")
    public String index() {
        return "exam01";
    }

    @RequestMapping("/login")
    public String login() {
        return "finished";
    }

}
