package com.example.helpdesk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FinanceiroController {

    @GetMapping("/Financeiro")
    public String setorFinanceiro(){
        return "Bem-vindo ao Setor Financeiro";
    }

    @GetMapping("/dev")
    public String nomeDev(){
        return "feito por: Geovane Ferreira";
    }

}
