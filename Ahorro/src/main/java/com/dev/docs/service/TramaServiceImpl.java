package com.dev.ahorro.bitacora.service;

@Service
public class TramaServiceImpl implements TramaService {

    @Autowired
    private TramaRepository tramaRepository;

    @Override
    public Trama guardarTrama(Trama trama) {
        return tramaRepository.save(trama);
    }

    @Override
    public Trama obtenerTramaPorId(Long idTrama) {
        return tramaRepository.findById(idTrama)
                .orElseThrow(() -> new RecursoNoEncontradoException("Trama", "id", idTrama));
    }

    @Override
    public List<Trama> obtenerTodasLasTramas() {
        return tramaRepository.findAll();
    }
}
