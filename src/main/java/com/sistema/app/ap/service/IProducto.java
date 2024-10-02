package com.sistema.app.ap.service;

import java.util.List;
import java.util.UUID;

import com.sistema.app.ap.entity.Producto;
public interface IProducto {  
    List<Producto> findAll(); 
    Producto save(Producto producto);  
    Producto update(UUID id, Producto producto);  
    Integer deleteById(UUID id);  
}