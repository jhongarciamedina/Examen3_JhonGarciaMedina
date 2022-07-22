package com.idat.Ec3_JhonGarciaMedina.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "usuariocliente")
public class UsuarioCliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	String usuario;
	String password;
	String rol;
	
	@OneToOne
	@JoinColumn(name = "id_cliente", nullable = false, unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_cliente) references cliente (id_cliente)"))
	private Cliente cliente;
	
	public UsuarioCliente(Integer idUsuario, String usuario, String password, String rol) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.password = password;
		this.rol = rol;
	}
	public UsuarioCliente() {
		super();
	}
	
	
	

}
