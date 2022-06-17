package com.idat.EC02.service;
import java.util.List;

import com.idat.EC02.dto.request.ClienteActualizar;
import com.idat.EC02.dto.request.ClienteRegistro;
import com.idat.EC02.dto.response.ClienteDTO;

public interface ClienteService {
	public void registoCliente(ClienteRegistro cliente);
	public void actualizarCliente(ClienteActualizar cliente);
	public List<ClienteDTO> listarClientes();
	public ClienteDTO  buscarCliente(Integer id);
	public void eliminar(Integer id);
}