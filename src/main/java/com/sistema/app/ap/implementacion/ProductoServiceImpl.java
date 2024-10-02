package com.sistema.app.ap.implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.app.ap.entity.Producto;
import com.sistema.app.ap.exception.ProductoNotFoundException;
import com.sistema.app.ap.repository.ProductoRepository;
import com.sistema.app.ap.service.IProducto;

import java.util.List;
import java.util.UUID;

@Service
public class ProductoServiceImpl implements IProducto {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto update(UUID id, Producto productoActualizado) {
        Producto producto = productoRepository.findById(id)
                .orElseThrow(() -> new ProductoNotFoundException("Producto no encontrado con ID: " + id));

        producto.setNombre(productoActualizado.getNombre());
        producto.setPrecio(productoActualizado.getPrecio());
        producto.setStock(productoActualizado.getStock());
        return productoRepository.save(producto);
    }

    @Override
    public Integer deleteById(UUID id) {
        Producto producto = productoRepository.findById(id)
                .orElseThrow(() -> new ProductoNotFoundException("Producto no encontrado con ID: " + id));
        
        productoRepository.delete(producto);
        return 1; 
    }
}
