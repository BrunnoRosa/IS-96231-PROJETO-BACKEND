package com.example.helpdesk.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrunoController {
    @GetMapping("/bruno")
    public String brunoController (){return "Minha Branch Teste";}
}
