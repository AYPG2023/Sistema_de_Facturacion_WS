package com.sistema.app.ap.entity;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "clientes")
@Data
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // UUID auto-generado
	private UUID Clientes_id;

	@Column(nullable = false)
	private String nombre;

	@Column(name = "correo_electronico", length = 100, nullable = false, unique = true)
	private String correo;

	@Column(nullable = false)
	private String telefono;
}

