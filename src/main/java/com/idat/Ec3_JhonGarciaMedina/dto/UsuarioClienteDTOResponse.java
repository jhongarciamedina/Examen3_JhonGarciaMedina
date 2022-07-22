package com.idat.Ec3_JhonGarciaMedina.dto;

import lombok.Data;

@Data
public class UsuarioClienteDTOResponse {
	
	private String token;

	public UsuarioClienteDTOResponse(String token) {
		super();
		this.token = token;
	}

	public UsuarioClienteDTOResponse() {
		super();
	}
	
	
	

}
