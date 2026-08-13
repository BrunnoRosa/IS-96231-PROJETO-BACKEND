package com.example.helpdesk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecursosHumanos {
    @GetMapping("/recursos_humanos")

    public String setorRecursosHumanos(){
        return "Recursos Humanos: Camila Viana.";
    }
}
