package com.ecomarket.ejercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/sumar/{num1}/{num2}")
    public String sumar(@PathVariable int num1, @PathVariable int num2) {
        return "La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2);
    }

    @GetMapping("/restar/{num1}/{num2}")
    public String restar(@PathVariable int num1, @PathVariable int num2) {
        return "La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2);
    }

    @GetMapping("/multiplicar/{num1}/{num2}")
    public String multiplicar(@PathVariable int num1, @PathVariable int num2) {
        return "La multiplicación de " + num1 + " por " + num2 + " es: " + (num1 * num2);
    }

    @GetMapping("/dividir/{num1}/{num2}")
    public String dividir(@PathVariable int num1, @PathVariable int num2) {
        if (num2 != 0) {
            return "La división de " + num1 + " entre " + num2 + " es: " + (double) num1 / num2;
        } else {
            return "Error: No se puede dividir por cero.";
        }
    }
}