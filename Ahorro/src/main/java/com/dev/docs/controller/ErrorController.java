package com.dev.ahorro.bitacora.controller;

@RestController
@RequestMapping("/api/error")
public class ErrorController {
    
    @Autowired
    private ErrorService errorService;
    
    @GetMapping("/{id}")
    public ResponseEntity<ErrorDTO> getErrorById(@PathVariable Long id) {
        ErrorDTO error = errorService.getErrorById(id);
        if (error != null) {
            return ResponseEntity.ok(error);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping("/")
    public ResponseEntity<ErrorDTO> crearError(@RequestBody ErrorDTO errorDTO) {
        ErrorDTO errorCreado = errorService.crearError(errorDTO);
        return ResponseEntity.ok(errorCreado);
    }
    
    @GetMapping("/trama/{id}")
    public ResponseEntity<String> getTramaByIdError(@PathVariable Long id) {
        String trama = errorService.getTramaByIdError(id);
        if (trama != null) {
            return ResponseEntity.ok(trama);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    // otros métodos para actualizar o borrar errores, etc.
}
