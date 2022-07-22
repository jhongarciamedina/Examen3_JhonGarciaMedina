package com.idat.Ec3_JhonGarciaMedina.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
@Table(name = "hospital")
public class Hospital implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHospital;
	private String nombre;
	private String descripcion;
	private String distrito;
	
	
	@ManyToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "reserva",
			joinColumns = @JoinColumn(name ="id_cliente",
			nullable = false, unique = true, 
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_cliente) references cliente (id_cliente)")),
			inverseJoinColumns =
	@JoinColumn(
			name="id_hospital",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_hospital) references hospital (id_hospital)")))
	
	private List<Cliente> cliente = new ArrayList<Cliente>();
	
	public Hospital(Integer idHospital, String nombre, String descripcion, String distrito, List<Cliente> cliente) {
		super();
		this.idHospital = idHospital;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.distrito = distrito;
		this.cliente = cliente;
	}

	public Hospital() {
		super();
	}
	
	






	
	
	

}
