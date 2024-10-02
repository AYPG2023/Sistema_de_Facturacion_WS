package com.sistema.app.ap.service;

import java.util.List;
import java.util.UUID;

import com.sistema.app.ap.entity.Factura;

public interface IFactura {
	List<Factura> findAll();

	Factura save(Factura factura);

	Factura update(UUID id, Factura factura);

	Integer deleteById(UUID id);
}