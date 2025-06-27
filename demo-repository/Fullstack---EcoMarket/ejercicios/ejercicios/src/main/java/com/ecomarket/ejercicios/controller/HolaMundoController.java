package com.ecomarket.ejercicios.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping ("/api")
public class HolaMundoController {

    @GetMapping("/saludo/pedro")
    public String saludarPedro() {
        return "Hola a todos, mi nombre es Pedro, esta API es exclusiva para mi nombre.";
    }

    @GetMapping("/saludo/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return "Hola a todos, mi nombre es " + nombre;
    }
}