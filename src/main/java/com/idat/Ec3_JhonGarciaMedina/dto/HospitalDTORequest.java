package com.idat.Ec3_JhonGarciaMedina.dto;

import lombok.Data;

@Data
public class HospitalDTORequest {
	
	private Integer idHospitalDTO;
	private String nombreDTO;
	private String descripcionDTO;
	private String distritoDTO;
	public HospitalDTORequest(Integer idHospitalDTO, String nombreDTO, String descripcionDTO, String distritoDTO) {
		super();
		this.idHospitalDTO = idHospitalDTO;
		this.nombreDTO = nombreDTO;
		this.descripcionDTO = descripcionDTO;
		this.distritoDTO = distritoDTO;
	}
	public HospitalDTORequest() {
		super();
	}
	
	
	

}
