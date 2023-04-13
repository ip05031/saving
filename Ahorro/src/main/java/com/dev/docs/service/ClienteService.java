package com.dev.docs.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.docs.model.Cliente;
import com.dev.docs.repository.ClienteRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ClienteService {

	@Autowired
	ClienteRepository repositorio;
	
	public ArrayList<Cliente> getAllClientes(){
		return (ArrayList<Cliente>) repositorio.findAll();
	}
	
	public void save(Cliente cliente) {
		repositorio.save(cliente);
	}
	
}
 