package com.idat.Ec3_JhonGarciaMedina.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Ec3_JhonGarciaMedina.dto.ClienteDTORequest;
import com.idat.Ec3_JhonGarciaMedina.dto.ClienteDTOResponse;
import com.idat.Ec3_JhonGarciaMedina.model.Cliente;
import com.idat.Ec3_JhonGarciaMedina.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	public 	ClienteRepository clienteRepository;

	@Override
	public List<ClienteDTOResponse> listarClientes() {
		List<ClienteDTOResponse> lista = new ArrayList<ClienteDTOResponse>();
		ClienteDTOResponse c= null;
		for(Cliente cliente : clienteRepository.findAll()) {
			c= new ClienteDTOResponse();
			c.setIdClienteDTO(cliente.getIdCliente());
			c.setNombreDTO(cliente.getNombre());
			c.setCelularDTO(cliente.getCelular());
			lista.add(c);
		}
		return lista;
	}

	@Override
	public void registrarCliente(ClienteDTORequest cliente) {
		Cliente c = new Cliente();
		c.setIdCliente(cliente.getCelularDTO());
		c.setNombre(cliente.getNombreDTO());
		c.setCelular(cliente.getCelularDTO());
		clienteRepository.save(c);
		
	}

	@Override
	public void editarCliente(ClienteDTORequest cliente) {
		Cliente c = new Cliente();
		c.setIdCliente(cliente.getCelularDTO());
		c.setNombre(cliente.getNombreDTO());
		c.setCelular(cliente.getCelularDTO());
		clienteRepository.saveAndFlush(c);
		
	}

	@Override
	public void eliminarCliente(Integer id) {
		clienteRepository.deleteById(id);
		
	}

	@Override
	public ClienteDTOResponse obtenerCliente(Integer id) {
		Cliente cliente= clienteRepository.findById(id).orElse(null);
		ClienteDTOResponse c=new	ClienteDTOResponse();
		c.setIdClienteDTO(cliente.getIdCliente());
		c.setNombreDTO(cliente.getNombre());
		c.setCelularDTO(cliente.getCelular());
		return c;
	}

}
