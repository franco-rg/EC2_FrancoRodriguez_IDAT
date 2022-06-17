package com.idat.EC02.service;

import java.util.List;

import com.idat.EC02.dto.request.BodegaActualizar;
import com.idat.EC02.dto.request.BodegaRegistrar;
import com.idat.EC02.model.Bodega;

public interface BodegaService {
	public void registo(BodegaRegistrar bodega);
	public void actualizarBodega(BodegaActualizar bodega);
	public List<Bodega> listar();
	public Bodega  buscarId(Integer id);
	public void eliminar(Integer id);
}
