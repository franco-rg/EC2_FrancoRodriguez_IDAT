package com.idat.EC02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.idat.EC02.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	Usuario findByUsuario(String usuario);
}