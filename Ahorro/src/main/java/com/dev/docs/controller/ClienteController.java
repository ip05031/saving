package com.dev.docs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.docs.model.Cliente;
import com.dev.docs.service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	ClienteService servicio;
	
	@GetMapping("/clientes/list")
    public List<Cliente> list() {
        return servicio.getAllClientes();
    }

	 @PostMapping("/clientes/add")
    public void add(@RequestBody Cliente  cliente) {
        servicio.save(cliente);
    }
}
