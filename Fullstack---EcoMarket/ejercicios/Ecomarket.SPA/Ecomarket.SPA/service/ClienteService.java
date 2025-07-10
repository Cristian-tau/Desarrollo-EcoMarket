package Ecomarket.SPA.cl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecomarket.SPA.cl.parcial.model.Cliente;
import Ecomarket.SPA.cl.parcial.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> fetchAll() {
        return repository.findAll();
    }

    public Cliente findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

