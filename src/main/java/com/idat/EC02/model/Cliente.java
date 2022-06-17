package com.idat.EC02.model;

import java.util.*;
import javax.persistence.*;

public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombre;
	private String direccion;
	private String dni;
	
	@ManyToMany(mappedBy = "cliente", cascade = {CascadeType.PERSIST,CascadeType.MERGE}) 
	private List<Productos> productos = new ArrayList<Productos>();
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
		
	public Cliente(Integer idCliente, String nombre, String direccion, String dni) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
	}

	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
}
