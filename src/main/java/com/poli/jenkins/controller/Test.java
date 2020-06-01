package com.poli.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/")
    public String hola() {
        return "tarea de jenkins";
    }

    @GetMapping("/hola")
    public String holitas() {
        return "Holitas";
    }

}
