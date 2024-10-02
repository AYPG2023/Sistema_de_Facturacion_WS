package com.sistema.app.ap.implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.app.ap.entity.Factura;
import com.sistema.app.ap.exception.FacturaNotFoundException;
import com.sistema.app.ap.repository.FacturaRepository;
import com.sistema.app.ap.service.IFactura;

import java.util.List;
import java.util.UUID;

@Service
public class FacturaServiceImpl implements IFactura {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }

    @Override
    public Factura save(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public Factura update(UUID id, Factura facturaActualizada) {
        Factura factura = facturaRepository.findById(id)
                .orElseThrow(() -> new FacturaNotFoundException("Factura no encontrada con ID: " + id));

        factura.setClienteId(facturaActualizada.getClienteId());
        factura.setListaProductos(facturaActualizada.getListaProductos());
        factura.setTotal(facturaActualizada.getTotal());
        factura.setFecha(facturaActualizada.getFecha());
        return facturaRepository.save(factura);
    }

    @Override
    public Integer deleteById(UUID id) {
        Factura factura = facturaRepository.findById(id)
                .orElseThrow(() -> new FacturaNotFoundException("Factura no encontrada con ID: " + id));
        
        facturaRepository.delete(factura);
        return 1; // Indicador de éxito
    }
}