package com.sistema.app.ap.dto;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDTO {
	
	private UUID productosId; 
	private String nombre;
	private BigDecimal precio;
	private Integer strock;
	
}
