package com.dev.ahorro.bitacora.service;

public interface FlujoService {
    Flujo save(Flujo flujo);
    List<Flujo> findByNumeroUnico(String numeroUnico);
}
