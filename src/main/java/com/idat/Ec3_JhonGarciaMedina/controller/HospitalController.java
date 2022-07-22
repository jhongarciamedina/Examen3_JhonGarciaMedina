package com.idat.Ec3_JhonGarciaMedina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.idat.Ec3_JhonGarciaMedina.dto.HospitalDTORequest;
import com.idat.Ec3_JhonGarciaMedina.dto.HospitalDTOResponse;
import com.idat.Ec3_JhonGarciaMedina.service.HospitalService;

@Controller
@RequestMapping("/api/v1/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	
	@GetMapping("/listarHospitales")
	public @ResponseBody List<HospitalDTOResponse> listarHospitales(){
		return hospitalService.listarHospitales();
	}
	@GetMapping("/listar/{id}")
	public @ResponseBody HospitalDTOResponse obtenerHospitalId(@PathVariable Integer id) {
		return hospitalService.obtenerHospital(id);
		
	}
	@PostMapping("/guardarHospitales")
	public void guardarAlumno(@RequestBody HospitalDTORequest hospital) {
		hospitalService.registrarHospital(hospital);
	}
	
	@PutMapping("/editarHospitales")
	public void actualizarAlumno(@RequestBody HospitalDTORequest hospital) {
		hospitalService.obtenerHospital(hospital.getIdHospitalDTO());
		hospitalService.editarHopital(hospital);
	}
	@DeleteMapping("/eliminar/id")
	public void eliminarAlumno(@PathVariable("id") Integer id) {
		hospitalService.eliminarHospital(id);
	}

}
