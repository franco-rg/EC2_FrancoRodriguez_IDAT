package com.idat.EC02.dto.request;

public class UserRegister {
	
	private String usuario;
	private String password;
	private String rol;
	
	public UserRegister() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRol() {
		return rol;
	}
	
	public void setRol(String rol) {
		this.rol = rol;
	}
}
