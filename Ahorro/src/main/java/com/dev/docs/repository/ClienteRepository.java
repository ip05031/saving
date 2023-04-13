package com.dev.docs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.docs.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
