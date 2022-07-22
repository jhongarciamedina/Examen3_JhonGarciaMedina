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


import com.idat.Ec3_JhonGarciaMedina.dto.ClienteDTORequest;
import com.idat.Ec3_JhonGarciaMedina.dto.ClienteDTOResponse;
import com.idat.Ec3_JhonGarciaMedina.service.ClienteService;

@Controller
@RequestMapping("/api/v1/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping("/listarClientes")
	public @ResponseBody List<ClienteDTOResponse> listarClientes(){
		return clienteService.listarClientes();
	}
	@GetMapping("/listar/{id}")
	public @ResponseBody ClienteDTOResponse obtenerClienteId(@PathVariable Integer id) {
		return clienteService.obtenerCliente(id);
		
	}
	@PostMapping("/guardarClientes")
	public void guardarClientes(@RequestBody ClienteDTORequest cliente) {
		clienteService.registrarCliente(cliente);
	}
	
	@PutMapping("/editarClientes")
	public void actualizarAlumno(@RequestBody ClienteDTORequest cliente) {
		clienteService.obtenerCliente(cliente.getIdClienteDTO());
		clienteService.editarCliente(cliente);
	}
	@DeleteMapping("/eliminar/id")
	public void eliminarClientes(@PathVariable("id") Integer id) {
		clienteService.eliminarCliente(id);
	}

}
