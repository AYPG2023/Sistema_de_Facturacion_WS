package com.sistema.app.ap.implementacion;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.app.ap.entity.Cliente;
import com.sistema.app.ap.exception.ClienteNotFoundException;
import com.sistema.app.ap.repository.ClienteRepository;
import com.sistema.app.ap.service.IClientes;

@Service
public class ClientesServiceImpl implements IClientes {

    @Autowired
    private ClienteRepository clienteRepository;

    // Obtener todos los clientes
    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    // Guardar un cliente nuevo
    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Actualizar un cliente existente por ID
    @Override
    public Cliente update(UUID id, Cliente clienteActualizado) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new ClienteNotFoundException("Cliente no encontrado con ID: " + id));

        cliente.setNombre(clienteActualizado.getNombre());
        cliente.setCorreo(clienteActualizado.getCorreo());
        cliente.setTelefono(clienteActualizado.getTelefono());
        return clienteRepository.save(cliente);
    }

    // Eliminar un cliente por ID
    @Override
    public Integer deleteById(UUID id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new ClienteNotFoundException("Cliente no encontrado con ID: " + id));
        
        clienteRepository.delete(cliente);
        return 1; // Indicador de éxito, se podría devolver otro tipo de respuesta según sea necesario
    }
}