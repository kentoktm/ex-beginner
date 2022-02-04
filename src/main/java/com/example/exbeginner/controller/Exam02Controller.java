package com.example.exbeginner.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "exam02";
    }

    @RequestMapping("/total")
    public String total(String num) {
        session.setAttribute("num", num);

        return "exam02-result";
    }

    @RequestMapping("/next")
    public String next() {
        return "exam02-result";
    }

}
