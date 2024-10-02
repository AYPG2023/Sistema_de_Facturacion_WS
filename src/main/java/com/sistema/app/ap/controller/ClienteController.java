package com.sistema.app.ap.controller;

import com.sistema.app.ap.client.ClienteClient;
import com.sistema.app.ap.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteClient clienteClient;

    @GetMapping
    public List<Cliente> findAll() {
        return clienteClient.findAll();
    }

    @PostMapping
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteClient.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente update(@PathVariable UUID id, @RequestBody Cliente cliente) {
        return clienteClient.update(id, cliente);
    }

    @DeleteMapping("/{id}")
    public Integer deleteById(@PathVariable UUID id) {
        return clienteClient.deleteById(id);
    }
}
