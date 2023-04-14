package com.dev.ahorro.bitacora.service;

public interface TramaService {
    Trama guardarTrama(Trama trama);
    Trama obtenerTramaPorId(Long idTrama);
    List<Trama> obtenerTodasLasTramas();
}

