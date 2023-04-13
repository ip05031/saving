package com.dev.docs.test;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.docs.model.Address;
import com.dev.docs.model.Cliente;
import com.dev.docs.model.Flujo;
import com.dev.docs.model.Library;
import com.dev.docs.service.ClienteService;
import com.dev.docs.service.LibraryService;

public class Test {

	
	
	
	

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		Flujo f = new Flujo();
		ArrayList<Flujo> lista = new ArrayList<Flujo>();
		ClienteService s = new ClienteService();
		
		
		c.setNombre("Ivan Palacios");
		c.setNumeroUnico("12345");
		c.setEmail("ip05031@gmail.com");
		
		f.setCodigo("40");
		f.setEstado("exito");
		f.setHilo("AS1234");
		f.setNombre("Apertura cuenta ahorro");
		f.setReferencia("0012345678");
		f.setTimestamp("13/04/2023 10:21:00");
		
		lista.add(f);
		
		f.setCodigo("50");
		f.setEstado("fallo");
		f.setHilo("FW1234");
		f.setNombre("Apertura dap");
		f.setReferencia("007111678");
		f.setTimestamp("13/04/2023 10:21:00");
		
		lista.add(f);
		
		c.setFlujo(lista);
		
		s.save(c);
		
		
	}
	
	
}
