package com.example.helpdesk.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Geovane {

    @GetMapping("/Geovane")
    public String geovaneWelcome(){
        return "Bem-vindo a Página Geovane";
    }

    @GetMapping("/geodev")
    public String geovaneDev(){
        return "feito por: Geovane Ferreira";
    }
}
