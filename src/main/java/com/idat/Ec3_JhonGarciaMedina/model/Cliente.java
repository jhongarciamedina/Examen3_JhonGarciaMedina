package com.idat.Ec3_JhonGarciaMedina.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombre;
	private Integer celular;
	
	@OneToOne(mappedBy = "cliente")
	private UsuarioCliente usuariocliente;
	
	@ManyToMany(mappedBy = "cliente", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Hospital> hospital= new ArrayList<Hospital>();

	public Cliente(Integer idCliente, String nombre, Integer celular, List<Hospital> hospitales) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.celular = celular;
	}

	public Cliente() {
		super();
	}
	
	
	
	

}
