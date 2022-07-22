package com.idat.Ec3_JhonGarciaMedina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.idat.Ec3_JhonGarciaMedina.model.UsuarioCliente;


@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioCliente, Integer> {
	UsuarioCliente findByUsuario(String usuario);
		
}
