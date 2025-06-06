package com.ecomarket.inventarioLibros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarket.inventarioLibros.model.Libro;
import com.ecomarket.inventarioLibros.repository.LibroRepository;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    // Obtener todos los libros
    public List<Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

    // Guardar un nuevo libro
    public Libro saveLibro(Libro libro) {
        return libroRepository.guardar(libro);
    }

    // Buscar un libro por su ID
    public Libro getLibroById(int id) {
        return libroRepository.buscarPorId(id);
    }

    // Buscar un libro por su ISBN
    public Libro getLibroByIsbn(String isbn) {
        return libroRepository.buscarPorIsbn(isbn);
    }

    // Actualizar un libro existente
    public Libro updateLibro(Libro libro) {
        return libroRepository.actualizar(libro);
    }

    // Eliminar un libro por su ID
    public String deleteLibro(int id) {
        libroRepository.eliminar(id);
        return "Libro eliminado correctamente.";
    }
}
