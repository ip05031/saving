package com.dev.ahorro.bitacora.service;

@Service
public class ErrorServiceImpl implements ErrorService {

    private ErrorRepository errorRepository;

    public ErrorServiceImpl(ErrorRepository errorRepository) {
        this.errorRepository = errorRepository;
    }

    @Override
    public Error guardarError(Error error) {
        return errorRepository.save(error);
    }

    @Override
    public List<Error> obtenerErroresPorTrama(Long idTrama) {
        return errorRepository.findByTramaId(idTrama);
    }
}
Ten en cuenta que este código asume que ya tienes definida la entidad Error y el repositorio ErrorRepository.





