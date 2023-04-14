package com.dev.ahorro.bitacora.controller;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{numeroUnico}")
    public ResponseEntity<Cliente> getCliente(@PathVariable String numeroUnico) {
        Cliente cliente = clienteService.getClienteByNumeroUnico(numeroUnico);
        if (cliente != null) {
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente newCliente = clienteService.createCliente(cliente);
        return ResponseEntity.created(URI.create("/cliente/" + newCliente.getNumeroUnico())).body(newCliente);
    }

    @PutMapping("/{numeroUnico}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable String numeroUnico, @RequestBody Cliente cliente) {
        Cliente updatedCliente = clienteService.updateCliente(numeroUnico, cliente);
        if (updatedCliente != null) {
            return ResponseEntity.ok(updatedCliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{numeroUnico}")
    public ResponseEntity<Void> deleteCliente(@PathVariable String numeroUnico) {
        clienteService.deleteCliente(numeroUnico);
        return ResponseEntity.noContent().build();
    }
}
