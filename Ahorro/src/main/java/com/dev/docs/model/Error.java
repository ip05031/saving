package com.dev.ahorro.bitacora.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "error")
public class Error {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idError;
    
    @ManyToOne
    @JoinColumn(name = "id_trama", nullable = false)
    private Trama trama;
    
    @Column(name = "codigo", length = 25)
    private String codigo;
    
    @Column(name = "mensaje", length = 250)
    private String mensaje;
    
    @Column(name = "nombre_clase", length = 50)
    private String nombreClase;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "timestamp")
    private Date timestamp;

	public Long getIdError() {
		return idError;
	}

	public void setIdError(Long idError) {
		this.idError = idError;
	}

	public Trama getTrama() {
		return trama;
	}

	public void setTrama(Trama trama) {
		this.trama = trama;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getNombreClase() {
		return nombreClase;
	}

	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

    // constructors, getters, and setters
    
    
    
    
}
