package com.sistema.app.ap.controller;

import com.sistema.app.ap.client.ProductoClient;
import com.sistema.app.ap.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoClient productoClient;

    @GetMapping
    public List<Producto> findAll() {
        return productoClient.findAll();
    }

    @PostMapping
    public Producto save(@RequestBody Producto producto) {
        return productoClient.save(producto);
    }

    @PutMapping("/{id}")
    public Producto update(@PathVariable UUID id, @RequestBody Producto producto) {
        return productoClient.update(id, producto);
    }

    @DeleteMapping("/{id}")
    public Integer deleteById(@PathVariable UUID id) {
        return productoClient.deleteById(id);
    }
}
