package com.dev.ahorro.bitacora.model;

import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "documento")
public class Documento {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_doc")
    private Long idDoc;

    @Column(name = "tipo_doc", length = 8)
    private String tipoDoc;

    @Column(name = "codigo_doc", length = 4)
    private String codigoDoc;

    @Column(name = "nombre_doc", length = 50)
    private String nombreDoc;

    @Column(name = "cod_seguridad", length = 25)
    private String codSeguridad;

    @Column(name = "id_cmo_copia", length = 15)
    private String idCMOCopia;

    @Column(name = "id_cmo_org")
    private Long IdCmoOrg;

    @ManyToOne
    @JoinColumn(name = "id_flujo")
    private Flujo flujo;

	public Long getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(Long idDoc) {
		this.idDoc = idDoc;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getCodigoDoc() {
		return codigoDoc;
	}

	public void setCodigoDoc(String codigoDoc) {
		this.codigoDoc = codigoDoc;
	}

	public String getNombreDoc() {
		return nombreDoc;
	}

	public void setNombreDoc(String nombreDoc) {
		this.nombreDoc = nombreDoc;
	}

	public String getCodSeguridad() {
		return codSeguridad;
	}

	public void setCodSeguridad(String codSeguridad) {
		this.codSeguridad = codSeguridad;
	}

	public String getIdCMOCopia() {
		return idCMOCopia;
	}

	public void setIdCMOCopia(String idCMOCopia) {
		this.idCMOCopia = idCMOCopia;
	}

	public Long getIdCmoOrg() {
		return IdCmoOrg;
	}

	public void setIdCmoOrg(Long idCmoOrg) {
		IdCmoOrg = idCmoOrg;
	}

	public Flujo getFlujo() {
		return flujo;
	}

	public void setFlujo(Flujo flujo) {
		this.flujo = flujo;
	}

    // Constructor, getters y setters
    
    
    
}

