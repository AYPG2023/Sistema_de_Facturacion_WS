package com.sistema.app.ap.repository;

import com.sistema.app.ap.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ProductoRepository extends JpaRepository<Producto, UUID> {
}
