package com.example.helloweb.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Jonathan
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String telefono;
	private String email;
	private Date fechaContratacion;
	private String sexo;
}
