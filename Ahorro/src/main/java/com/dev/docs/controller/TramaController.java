package com.dev.ahorro.bitacora.controller;

@RestController
@RequestMapping("/tramas")
public class TramaController {
    
    @Autowired
    private TramaService tramaService;
    
    @GetMapping("/{id}")
    public ResponseEntity<Trama> obtenerTramaPorId(@PathVariable Long id) {
        Trama trama = tramaService.obtenerTramaPorId(id);
        if (trama != null) {
            return ResponseEntity.ok(trama);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/flujos/{idFlujo}")
    public ResponseEntity<List<Trama>> obtenerTramasPorFlujo(@PathVariable Long idFlujo) {
        List<Trama> tramas = tramaService.obtenerTramasPorFlujo(idFlujo);
        if (!tramas.isEmpty()) {
            return ResponseEntity.ok(tramas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/{idFlujo}")
    public ResponseEntity<Trama> crearTrama(@PathVariable Long idFlujo, @RequestBody Trama trama) {
        Trama tramaCreada = tramaService.crearTrama(idFlujo, trama);
        return ResponseEntity.status(HttpStatus.CREATED).body(tramaCreada);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Trama> actualizarTrama(@PathVariable Long id, @RequestBody Trama trama) {
        Trama tramaActualizada = tramaService.actualizarTrama(id, trama);
        if (tramaActualizada != null) {
            return ResponseEntity.ok(tramaActualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTrama(@PathVariable Long id) {
        boolean eliminada = tramaService.eliminarTrama(id);
        if (eliminada) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping
    public ResponseEntity<List<Trama>> obtenerTodasLasTramas() {
        List<Trama> tramas = tramaService.obtenerTodasLasTramas();
        if (!tramas.isEmpty()) {
            return ResponseEntity.ok(tramas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
