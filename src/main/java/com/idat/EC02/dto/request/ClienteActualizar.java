package com.idat.EC02.dto.request;

public class ClienteActualizar {
	private Integer idClienteDTO;
	private String nombreDTO;
	private String direccionDTO;
	private String dniDTO;
	
	public ClienteActualizar() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getIdClienteDTO() {
		return idClienteDTO;
	}

	public void setIdClienteDTO(Integer idClienteDTO) {
		this.idClienteDTO = idClienteDTO;
	}

	public String getNombreDTO() {
		return nombreDTO;
	}
	
	public void setNombreDTO(String nombreDTO) {
		this.nombreDTO = nombreDTO;
	}
	
	public String getDireccionDTO() {
		return direccionDTO;
	}
	
	public void setDireccionDTO(String direccionDTO) {
		this.direccionDTO = direccionDTO;
	}
	
	public String getDniDTO() {
		return dniDTO;
	}
	
	public void setDniDTO(String dniDTO) {
		this.dniDTO = dniDTO;
	}
}
