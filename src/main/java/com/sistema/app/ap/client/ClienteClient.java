package com.sistema.app.ap.client;

import com.sistema.app.ap.entity.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "cliente-service", url = "http://localhost:8081")
public interface ClienteClient {

    @GetMapping("/clientes")
    List<Cliente> findAll();

    @PostMapping("/clientes")
    Cliente save(@RequestBody Cliente cliente);

    @PutMapping("/clientes/{id}")
    Cliente update(@PathVariable UUID id, @RequestBody Cliente cliente);

    @DeleteMapping("/clientes/{id}")
    Integer deleteById(@PathVariable UUID id);
}