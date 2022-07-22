package com.idat.Ec3_JhonGarciaMedina.dto;

import lombok.Data;

@Data
public class UsuarioClienteDTOResquest {
	
	private String usuario;
	private String password;
	public UsuarioClienteDTOResquest(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}
	public UsuarioClienteDTOResquest() {
		super();
	}
	
	
	
	
	

}
