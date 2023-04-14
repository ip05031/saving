package com.dev.ahorro.bitacora.controller;

@RestController
@RequestMapping("/documentos")
public class DocumentoController {

    @Autowired
    private DocumentoService documentoService;

    @GetMapping("/{id}")
    public ResponseEntity<Documento> getDocumentoById(@PathVariable Long id) {
        Documento documento = documentoService.getDocumentoById(id);
        if (documento == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(documento);
    }

    @PostMapping
    public ResponseEntity<Documento> createDocumento(@RequestBody Documento documento) {
        Documento createdDocumento = documentoService.createDocumento(documento);
        return ResponseEntity.created(URI.create("/documentos/" + createdDocumento.getId())).body(createdDocumento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Documento> updateDocumento(@PathVariable Long id, @RequestBody Documento documento) {
        if (!documentoService.documentoExists(id)) {
            return ResponseEntity.notFound().build();
        }
        documento.setId(id);
        Documento updatedDocumento = documentoService.updateDocumento(documento);
        return ResponseEntity.ok(updatedDocumento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDocumento(@PathVariable Long id) {
        if (!documentoService.documentoExists(id)) {
            return ResponseEntity.notFound().build();
        }
        documentoService.deleteDocumento(id);
        return ResponseEntity.noContent().build();
    }
}
