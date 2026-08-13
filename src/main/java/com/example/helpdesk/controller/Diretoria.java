package com.example.helpdesk.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Diretoria {
    @GetMapping("/diretoria")
    public String SetorDiretoria(){
        return "Diretor Bruno Rosa";
    }
}
