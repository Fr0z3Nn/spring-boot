package ru.project.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
