package com.idat.EC02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.idat.EC02.dto.request.ClienteActualizar;
import com.idat.EC02.dto.request.ClienteRegistro;
import com.idat.EC02.dto.response.ClienteDTO;
import com.idat.EC02.service.ClienteServiceImpl;

@RestController
@RequestMapping("/api/v1/cliente")
@CrossOrigin(origins = "*")
public class ClienteController {

	@Autowired
	ClienteServiceImpl serv;
	
	@RequestMapping(path = "/registrar", method = RequestMethod.POST)
	public ResponseEntity<Object> registrar(@RequestBody ClienteRegistro cliente){
		
		Map<String, Object> errors = new LinkedHashMap<>();
		Map<String, Object> exito = new LinkedHashMap<>();
	try {
		serv.registoCliente(cliente);
		exito.put("message", "Cliente registrado exitosamente");
		return new ResponseEntity<>(exito,HttpStatus.CREATED);
		
	}catch (Exception e) {
		// TODO: handle exception
		errors.put("message", "Error al Registrar");
		return new ResponseEntity<>(errors,HttpStatus.NOT_FOUND);
	}
		
	
	}

	@RequestMapping(path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Object> actualizar(@RequestBody ClienteActualizar cliente){
		
		Map<String, Object> errors = new LinkedHashMap<>();
		Map<String, Object> exito = new LinkedHashMap<>();
	try {
		serv.actualizarCliente(cliente);
		exito.put("message", "Cliente actualizado exitosamente");
		return new ResponseEntity<>(exito,HttpStatus.OK);
		
	}catch (Exception e) {
		// TODO: handle exception
		errors.put("message", "Error al Actualizar");
		return new ResponseEntity<>(errors,HttpStatus.NOT_FOUND);
	}
		
	
	}
	
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Object> listarId(@PathVariable Integer id){
		
		Map<String, Object> errors = new LinkedHashMap<>();
		Map<String, Object> exito = new LinkedHashMap<>();
	try {
		ClienteDTO cliente =serv.buscarCliente(id);
		exito.put("content", cliente);
		exito.put("message", "Cliente encontrado");
		return new ResponseEntity<>(exito,HttpStatus.OK);
		
	}catch (Exception e) {
		// TODO: handle exception
		errors.put("message", "Error cliente no encontrado");
		return new ResponseEntity<>(errors,HttpStatus.NOT_FOUND);
	}
		
	
	}
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<Object> listar(){
		
		Map<String, Object> errors = new LinkedHashMap<>();
		Map<String, Object> exito = new LinkedHashMap<>();
	try {
		List<ClienteDTO> cliente =serv.listarClientes();
		exito.put("content", cliente);
		exito.put("message", "Exito");
		return new ResponseEntity<>(exito,HttpStatus.OK);
		
	}catch (Exception e) {
		// TODO: handle exception
		errors.put("message", "Error");
		return new ResponseEntity<>(errors,HttpStatus.NOT_FOUND);
	}
		
	
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> eliminar(@PathVariable Integer id){
		
		Map<String, Object> errors = new LinkedHashMap<>();
		Map<String, Object> exito = new LinkedHashMap<>();
	try {
		serv.eliminar(id);
		exito.put("message", "Cliente eliminado");
		return new ResponseEntity<>(exito,HttpStatus.OK);
		
	}catch (Exception e) {
		// TODO: handle exception
		errors.put("message", "Error al eliminar");
		return new ResponseEntity<>(errors,HttpStatus.NOT_FOUND);
	}
		
	
	}
}
