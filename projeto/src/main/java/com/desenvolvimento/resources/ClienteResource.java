package com.desenvolvimento.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desenvolvimento.domain.Cliente;
import com.desenvolvimento.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService clienteService;
	
	//@RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
	 //public ResponseEntity<?> buscarPorCodigo(@PathVariable Integer codigo){
		// Cliente cliente = clienteService.buscarPorCodigo(codigo);
		 // return ResponseEntity.ok().body(codigo);
	}
	

