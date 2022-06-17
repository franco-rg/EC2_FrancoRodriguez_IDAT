package com.idat.EC02.service;

import java.util.List;

import com.idat.EC02.dto.request.ProductoActualizar;
import com.idat.EC02.dto.request.ProductoRegistrar;
import com.idat.EC02.model.Productos;

public interface ProductosService {
	public void registrar(ProductoRegistrar producto);
	public void actualizar(ProductoActualizar producto);
	public void eliminar(Integer id);
	public Productos buscarId(Integer id);
	public List<Productos> listar();
}
