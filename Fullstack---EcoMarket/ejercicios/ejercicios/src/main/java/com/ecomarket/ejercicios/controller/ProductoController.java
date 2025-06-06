package com.ecomarket.ejercicios.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v2/producto")
public class ProductoController {
    public class Producto {
        private int id;
        private String productName;

        public Producto() {}

        public Producto(int id, String productName) {
            this.id = id;
            this.productName = productName;
        }

        public int getId() {
            return this.id;
        }

        public String getProductName() {
            return this.productName;
        }

    }

    List<Producto> productos = Arrays.asList(
        new Producto(1,"Producto 1"),
        new Producto(2, "Producto 2"),
        new Producto(3, "Producto 3")
    );

    @GetMapping("/index")
    public String index() {
        return "Bienvenidos al listado de productos";
    }   

    @GetMapping("/{idProducto}")
    public String buscar(@PathVariable int idProducto) {
        for (Producto producto : productos) {
            if (producto.getId() == idProducto) {
                return "Producto encontrado: " + producto.getProductName();
            }
        }
        return "El producto no existe";
    }
    
}
