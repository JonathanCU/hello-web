package com.example.helloweb.model.enums;

import lombok.Getter;

/**
 * @author Jonathan
 *
 */
@Getter
public enum SexoEnum {
	MASCULINO('M'),
	FENEMINO('F'),
	OTRO('O');
	
	private Character sexo;
	
	private SexoEnum(Character sexo) {
		this.sexo = sexo;
	}
}
