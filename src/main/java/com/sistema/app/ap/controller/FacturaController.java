package com.sistema.app.ap.controller;

import com.sistema.app.ap.client.FacturaClient;
import com.sistema.app.ap.entity.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private FacturaClient facturaClient;

    @GetMapping
    public List<Factura> findAll() {
        return facturaClient.findAll();
    }

    @PostMapping
    public Factura save(@RequestBody Factura factura) {
        return facturaClient.save(factura);
    }

    @PutMapping("/{id}")
    public Factura update(@PathVariable UUID id, @RequestBody Factura factura) {
        return facturaClient.update(id, factura);
    }

    @DeleteMapping("/{id}")
    public Integer deleteById(@PathVariable UUID id) {
        return facturaClient.deleteById(id);
    }
}
