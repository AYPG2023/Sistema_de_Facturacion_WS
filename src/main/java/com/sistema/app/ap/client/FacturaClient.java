package com.sistema.app.ap.client;
import com.sistema.app.ap.entity.Factura;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "factura-service", url = "http://localhost:8083") 
public interface FacturaClient {

    @GetMapping("/facturas")
    List<Factura> findAll();

    @PostMapping("/facturas")
    Factura save(@RequestBody Factura factura);

    @PutMapping("/facturas/{id}")
    Factura update(@PathVariable UUID id, @RequestBody Factura factura);

    @DeleteMapping("/facturas/{id}")
    Integer deleteById(@PathVariable UUID id);
}