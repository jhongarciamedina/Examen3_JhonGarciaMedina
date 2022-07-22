package com.idat.Ec3_JhonGarciaMedina.service;

import java.util.List;

import com.idat.Ec3_JhonGarciaMedina.dto.HospitalDTORequest;
import com.idat.Ec3_JhonGarciaMedina.dto.HospitalDTOResponse;

public interface HospitalService {
	
	public List<HospitalDTOResponse >listarHospitales();
	
	public void registrarHospital(HospitalDTORequest hospital);
	
	public void editarHopital(HospitalDTORequest hospital);
	
	public void eliminarHospital(Integer id);
	
	public HospitalDTOResponse obtenerHospital(Integer id);

}
