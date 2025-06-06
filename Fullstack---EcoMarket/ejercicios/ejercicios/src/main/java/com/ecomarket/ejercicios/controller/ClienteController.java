package com.ecomarket.ejercicios.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {
    @GetMapping("/index")
    public String getMethodName() {
        return "Bienvenidos al listado de clientes.";
    }
    
}
