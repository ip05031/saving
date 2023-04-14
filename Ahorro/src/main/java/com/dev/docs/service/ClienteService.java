package com.dev.ahorro.bitacora.service;

import java.util.List;

import com.dev.ahorro.bitacora.model.Cliente;

public interface ClienteService {
    Cliente crearCliente(Cliente cliente);
    Cliente obtenerClientePorNumeroUnico(String numeroUnico);
    List<Cliente> obtenerTodosLosClientes();
    void eliminarClientePorNumeroUnico(String numeroUnico);
}

