package com.dev.ahorro.bitacora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.ahorro.bitacora.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {

}

