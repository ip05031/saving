package com.dev.ahorro.bitacora.service;

@Service
public class FlujoServiceImpl implements FlujoService {

    @Autowired
    private FlujoRepository flujoRepository;

    @Override
    public Flujo save(Flujo flujo) {
        return flujoRepository.save(flujo);
    }

    @Override
    public List<Flujo> findByNumeroUnico(String numeroUnico) {
        return flujoRepository.findByNumeroUnico(numeroUnico);
    }
}
