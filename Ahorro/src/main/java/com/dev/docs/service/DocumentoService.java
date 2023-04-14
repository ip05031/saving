package com.dev.ahorro.bitacora.service;

public interface DocumentoService {
    Documento saveDocumento(Documento documento);
    List<Documento> getDocumentosByFlujoId(Long idFlujo);
}
