package Ecomarket.SPA.cl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import Ecomarket.SPA.cl.model.Cliente;
import Ecomarket.SPA.cl.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
@Tag(name = "Cliente", description = "Operaciones relacionadas con los clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> fetchAll() {
        return service.fetchAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener clientes por id", description = "Obtiene una lista de todas los id")
    public Cliente findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Cliente save(@RequestBody Cliente cliente) {
        return service.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}

