package com.idat.EC02.service;

import java.util.List;
import com.idat.EC02.dto.request.UserRegister;
import com.idat.EC02.model.Usuario;

public interface UsuarioService {
	public void registrar(UserRegister usuario);
	public void actualizar(Usuario usuario);
	public void eliminar(Integer id);
	public Usuario buscarId(Integer id);
	public List<Usuario> listar();
}