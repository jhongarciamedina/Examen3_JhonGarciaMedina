package com.idat.Ec3_JhonGarciaMedina.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Ec3_JhonGarciaMedina.dto.HospitalDTORequest;
import com.idat.Ec3_JhonGarciaMedina.dto.HospitalDTOResponse;
import com.idat.Ec3_JhonGarciaMedina.model.Hospital;
import com.idat.Ec3_JhonGarciaMedina.repository.HospitalRepository;

@Service
public class HospitalServiceImpl implements  HospitalService {
	@Autowired
	public 	HospitalRepository hospitalRepository;

	@Override
	public List<HospitalDTOResponse> listarHospitales() {
		List<HospitalDTOResponse> lista = new ArrayList<HospitalDTOResponse>();
		HospitalDTOResponse h= null;
		for(Hospital hospital : hospitalRepository.findAll()) {
			h= new HospitalDTOResponse();
			h.setIdHospitalDTO(hospital.getIdHospital());
			h.setNombreDTO(hospital.getNombre());
			h.setDescripcionDTO(hospital.getDescripcion());
			h.setDistritoDTO(hospital.getDistrito());
			lista.add(h);
		}
		return lista;
	}

	@Override
	public void registrarHospital(HospitalDTORequest hospital) {
		Hospital h = new Hospital();
		
		h.setIdHospital(hospital.getIdHospitalDTO());
		h.setNombre(hospital.getNombreDTO());
		h.setDescripcion(hospital.getDescripcionDTO());
		h.setDistrito(hospital.getDistritoDTO());
		hospitalRepository.save(h);
		
	}

	@Override
	public void editarHopital(HospitalDTORequest hospital) {
		Hospital h = new Hospital();
		
		h.setIdHospital(hospital.getIdHospitalDTO());
		h.setNombre(hospital.getNombreDTO());
		h.setDescripcion(hospital.getDescripcionDTO());
		h.setDistrito(hospital.getDistritoDTO());
		hospitalRepository.saveAndFlush(h);
		
	}

	@Override
	public void eliminarHospital(Integer id) {
		hospitalRepository.deleteById(id);
		
	}

	@Override
	public HospitalDTOResponse obtenerHospital(Integer id) {
		Hospital hospital= hospitalRepository.findById(id).orElse(null);
		HospitalDTOResponse h=new	HospitalDTOResponse();
		
		h.setIdHospitalDTO(hospital.getIdHospital());
		h.setNombreDTO(hospital.getNombre());
		h.setDescripcionDTO(hospital.getDescripcion());
		h.setDistritoDTO(hospital.getDistrito());
		return h;
	}

}
