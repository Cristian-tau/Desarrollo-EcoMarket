package com.ecomarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ecomarket.cl.model.Proveedor;
import ecomarket.cl.service.ProveedorService;

@RestController
@RequestMapping("/api/proveedor")
public class ProveedorController {

    @Autowired
    private ProveedorService service;

    @GetMapping
    public List<Proveedor> fetchAll() {
        return service.fetchAll();
    }

    @GetMapping("/{id}")
    public Proveedor findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Proveedor save(@RequestBody Proveedor proveedor) {
        return service.save(proveedor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}

