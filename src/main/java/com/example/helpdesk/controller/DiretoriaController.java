package com.example.helpdesk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiretoriaController {

    @GetMapping("/Diretoria")
    public String setorDiretoria(){
        return "Diretoria";
    }

}
