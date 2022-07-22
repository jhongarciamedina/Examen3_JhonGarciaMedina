package com.idat.Ec3_JhonGarciaMedina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.Ec3_JhonGarciaMedina.dto.UsuarioClienteDTOResponse;
import com.idat.Ec3_JhonGarciaMedina.dto.UsuarioClienteDTOResquest;
import com.idat.Ec3_JhonGarciaMedina.security.JwtUtil;
import com.idat.Ec3_JhonGarciaMedina.security.UserDetailService;

@RestController
public class UsuarioClienteController {
	
	
	@Autowired
	private JwtUtil util;
	
	@Autowired
	private UserDetailService service;
	
	@RequestMapping(path = "/crearToken", method = RequestMethod.POST)
	public ResponseEntity<?> crearToken(@RequestBody UsuarioClienteDTOResquest dto){
		
		UserDetails detail=service.loadUserByUsername(dto.getUsuario());
		
		return ResponseEntity.ok(new UsuarioClienteDTOResponse(util.generateToken(detail.getUsername())));
		
	}

}
