package com.idat.Ec3_JhonGarciaMedina.dto;

import lombok.Data;

@Data
public class ClienteDTORequest {
	
	private Integer idClienteDTO;
	private String nombreDTO;
	private Integer celularDTO;
	public ClienteDTORequest(Integer idClienteDTO, String nombreDTO, Integer celularDTO) {
		super();
		this.idClienteDTO = idClienteDTO;
		this.nombreDTO = nombreDTO;
		this.celularDTO = celularDTO;
	}
	public ClienteDTORequest() {
		super();
	}
	
	
	

}
