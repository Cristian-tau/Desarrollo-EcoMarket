package com.ecomarket.controller;

import com.ecomarket.model.Paquete;
import com.ecomarket.service.PaqueteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/paquetes")
public class PaqueteController {

    @Autowired
    private PaqueteService paqueteService;

    @GetMapping
    public List<Paquete> obtenerTodos() {
        return paqueteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Paquete obtenerPorId(@PathVariable Long id) {
        return paqueteService.obtenerPorId(id);
    }

    @PostMapping
    public Paquete guardar(@RequestBody Paquete paquete) {
        return paqueteService.guardar(paquete);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        paqueteService.eliminar(id);
    }
}
