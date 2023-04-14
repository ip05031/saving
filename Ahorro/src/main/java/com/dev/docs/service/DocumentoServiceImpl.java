package com.dev.ahorro.bitacora.service;

@Service
public class DocumentoServiceImpl implements DocumentoService {

    @Autowired
    private DocumentoRepository documentoRepository;

    @Override
    public Documento saveDocumento(Documento documento) {
        return documentoRepository.save(documento);
    }

    @Override
    public List<Documento> getDocumentosByFlujoId(Long idFlujo) {
        return documentoRepository.findByFlujoId(idFlujo);
    }
}
