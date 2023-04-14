package com.dev.ahorro.bitacora.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "trama")
public class Trama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTrama;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idFlujo")
    private Flujo flujo;
    
    @Column(name = "trama", columnDefinition="TEXT")
    private String trama;
    
    @Column(name = "response", columnDefinition="TEXT")
    private String response;

	public Long getIdTrama() {
		return idTrama;
	}

	public void setIdTrama(Long idTrama) {
		this.idTrama = idTrama;
	}

	public Flujo getFlujo() {
		return flujo;
	}

	public void setFlujo(Flujo flujo) {
		this.flujo = flujo;
	}

	public String getTrama() {
		return trama;
	}

	public void setTrama(String trama) {
		this.trama = trama;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

    // constructores, getters y setters
    
    
    
}

