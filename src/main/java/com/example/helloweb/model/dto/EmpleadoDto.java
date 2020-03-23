package com.example.helloweb.model.dto;

import java.io.Serializable;
import java.util.Date;

import com.example.helloweb.model.enums.SexoEnum;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Jonathan
 *
 */
@Data
@AllArgsConstructor
public class EmpleadoDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nombre;
	private String telefono;
	private String email;
	private Date fechaContratacion;
	private SexoEnum sexo;
	
}
