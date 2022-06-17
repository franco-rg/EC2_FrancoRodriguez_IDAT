package com.idat.EC02.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.EC02.dto.request.UserRegister;
import com.idat.EC02.model.Usuario;
import com.idat.EC02.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository repo;

	@Override
	public void registrar(UserRegister usuario) {
		// TODO Auto-generated method stub
		Usuario _usuario = new Usuario();
		
		_usuario.setPassword(usuario.getPassword());
		_usuario.setRol(usuario.getRol());
		_usuario.setUsuario(usuario.getUsuario());
		repo.save(_usuario);
		
	}

	@Override
	public void actualizar(Usuario usuario) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
	}

	@Override
	public Usuario buscarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}
}