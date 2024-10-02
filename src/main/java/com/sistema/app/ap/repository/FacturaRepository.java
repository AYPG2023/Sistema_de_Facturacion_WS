package com.sistema.app.ap.repository;

import com.sistema.app.ap.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface FacturaRepository extends JpaRepository<Factura, UUID> {
}