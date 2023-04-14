package com.dev.ahorro.bitacora.service;

public interface ErrorService {
    Error guardarError(Error error);
    List<Error> obtenerErroresPorTrama(Long idTrama);
}
