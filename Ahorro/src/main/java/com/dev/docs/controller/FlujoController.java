package com.dev.ahorro.bitacora.controller;

@RestController
@RequestMapping("/api/flujo")
public class FlujoController {

    @Autowired
    private FlujoService flujoService;

    @GetMapping("/{id}")
    public ResponseEntity<FlujoDTO> obtenerFlujoPorId(@PathVariable Long id) {
        FlujoDTO flujoDTO = flujoService.obtenerFlujoPorId(id);
        if (flujoDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(flujoDTO);
    }

    @PostMapping
    public ResponseEntity<FlujoDTO> crearFlujo(@RequestBody FlujoDTO flujoDTO) {
        FlujoDTO flujoCreado = flujoService.crearFlujo(flujoDTO);
        if (flujoCreado == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(flujoCreado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FlujoDTO> actualizarFlujo(@PathVariable Long id, @RequestBody FlujoDTO flujoDTO) {
        flujoDTO.setId(id);
        FlujoDTO flujoActualizado = flujoService.actualizarFlujo(flujoDTO);
        if (flujoActualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(flujoActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarFlujo(@PathVariable Long id) {
        flujoService.eliminarFlujo(id);
        return ResponseEntity.noContent().build();
    }
}
