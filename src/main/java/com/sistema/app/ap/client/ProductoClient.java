package com.sistema.app.ap.client;

import com.sistema.app.ap.entity.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "producto-service", url = "http://localhost:8082") 
public interface ProductoClient {

    @GetMapping("/productos")
    List<Producto> findAll();

    @PostMapping("/productos")
    Producto save(@RequestBody Producto producto);

    @PutMapping("/productos/{id}")
    Producto update(@PathVariable UUID id, @RequestBody Producto producto);

    @DeleteMapping("/productos/{id}")
    Integer deleteById(@PathVariable UUID id);
}