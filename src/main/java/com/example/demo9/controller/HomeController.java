package com.example.demo9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/","/index","/h","/home"})
    public String homeGet() {
        return "home";
    }


    @GetMapping("/admin/adminMenu")
    public String adminMenuGet() {
        return "admin/adminMenu";
    }

    @GetMapping("/error/accessDenied")
    public String accessDenied() {
        return "error/accessDenied";
    }
}
