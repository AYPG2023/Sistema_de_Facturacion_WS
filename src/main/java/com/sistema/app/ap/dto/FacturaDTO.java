package com.sistema.app.ap.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacturaDTO {

	private UUID id;
	private UUID clienteId;
	private List<UUID> listaProductos;
	private BigDecimal total;
	private LocalDateTime fecha;

}
