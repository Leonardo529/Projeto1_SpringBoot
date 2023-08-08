package br.gov.sp.fatec.god.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class GodController {
    
    @GetMapping
    public String ola(){
        return "Olá!";
    }
}
