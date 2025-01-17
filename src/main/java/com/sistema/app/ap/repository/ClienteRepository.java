package com.sistema.app.ap.repository;

import com.sistema.app.ap.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
	
}
