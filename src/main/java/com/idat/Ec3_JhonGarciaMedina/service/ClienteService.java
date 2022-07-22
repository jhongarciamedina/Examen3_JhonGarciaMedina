package com.idat.Ec3_JhonGarciaMedina.service;

import java.util.List;


import com.idat.Ec3_JhonGarciaMedina.dto.ClienteDTORequest;
import com.idat.Ec3_JhonGarciaMedina.dto.ClienteDTOResponse;

public interface ClienteService {
	
	public List<ClienteDTOResponse> listarClientes();
	
	public void registrarCliente(ClienteDTORequest cliente);
	
	public void editarCliente(ClienteDTORequest cliente);
	
	public void eliminarCliente(Integer id);
	
	public ClienteDTOResponse obtenerCliente(Integer id);

}
