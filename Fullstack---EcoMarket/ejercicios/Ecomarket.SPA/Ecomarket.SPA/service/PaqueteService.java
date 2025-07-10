package Ecomarket.SPA.cl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecomarket.SPA.cl.model.Paquete;
import Ecomarket.SPA.cl.repository.PaqueteRepository;

@Service
public class PaqueteService {

    @Autowired
    private Paquete repository;

    public List<Paquete> fetchAll() {
        return repository.findAll();
    }

    public Paquete findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Paquete save(Paquete paquete) {
        return repository.save(paquete);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}


