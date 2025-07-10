package Ecomarket.SPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecomarket.SPA.model.Proveedor;
import Ecomarket.SPA.repository.ProveedorRepository;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository repository;

    public List<Proveedor> fetchAll() {
        return repository.findAll();
    }

    public Proveedor findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Proveedor save(Proveedor proveedor) {
        return repository.save(proveedor);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
