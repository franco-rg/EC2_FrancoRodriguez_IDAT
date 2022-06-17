package com.idat.EC02.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC02.dto.request.ProductoActualizar;
import com.idat.EC02.dto.request.ProductoRegistrar;
import com.idat.EC02.model.Productos;
import com.idat.EC02.repository.ProductoRepository;

@Service
public class ProductosServiceImpl implements ProductosService {
	
	@Autowired
	ProductoRepository repo;
	
	@Override
	public void registrar(ProductoRegistrar producto) {
		// TODO Auto-generated method stub
		Productos _producto = new Productos();
		_producto.setDescripcion(producto.getDescripcion());
		_producto.setPrecio(producto.getPrecio());
		_producto.setProducto(producto.getProducto());
		_producto.setStock(producto.getStock());
		repo.save(_producto);
	}

	@Override
	public void actualizar(ProductoActualizar producto) {
		// TODO Auto-generated method stub
		Productos _producto = new Productos();
		_producto.setDescripcion(producto.getDescripcion());
		_producto.setPrecio(producto.getPrecio());
		_producto.setProducto(producto.getProducto());
		_producto.setStock(producto.getStock());
		_producto.setIdProducto(producto.getIdProducto());
		repo.save(_producto);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Productos buscarId(Integer id) {
		// TODO Auto-generated method stub
		Optional<Productos> _producto = repo.findById(id);
		return _producto.get();
	}

	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
