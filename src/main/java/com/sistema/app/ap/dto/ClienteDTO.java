package com.sistema.app.ap.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
	   private UUID clientesId;
	    private String nombre;
	    private String correo;
	    private String telefono;

}
