package com.vw360.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DemoController {
    @GetMapping("/")
    public String hello() {
        return "Hello, Swikrit with Gradle Kotlin !";
    }
}