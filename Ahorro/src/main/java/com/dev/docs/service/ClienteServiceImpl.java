package com.dev.ahorro.bitacora.service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente obtenerClientePorNumeroUnico(String numeroUnico) {
        return clienteRepository.findByNumeroUnico(numeroUnico)
                .orElseThrow(() -> new NoSuchElementException("Cliente no encontrado con número único: " + numeroUnico));
    }

    @Override
    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public void eliminarClientePorNumeroUnico(String numeroUnico) {
        clienteRepository.deleteByNumeroUnico(numeroUnico);
    }
}

