package com.desenvolvimento.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.desenvolvimento.repositories.ClienteRepository;
//import com.desenvolvimento.resources.Cliente;

import javassist.tools.rmi.ObjectNotFoundException;

public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	//public ClienteService buscarPorCodigo(Integer codigo) {
	//Optional<Cliente> obj = clienteRepository.findById(codigo);
	//	return obj.orElseThrow(() -> new ObjectNotFoundException("codigp não encontrado: " + codigo));
	}


