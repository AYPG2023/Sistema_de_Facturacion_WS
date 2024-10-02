package com.sistema.app.ap.service;

import java.util.List;
import java.util.UUID;
import com.sistema.app.ap.entity.Cliente;

public interface IClientes {

	List<Cliente> findAll();

	Cliente save(Cliente cliente);

	Cliente update(UUID id, Cliente cliente);

	Integer deleteById(UUID id);
}
