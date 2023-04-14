package com.dev.ahorro.bitacora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.ahorro.bitacora.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
