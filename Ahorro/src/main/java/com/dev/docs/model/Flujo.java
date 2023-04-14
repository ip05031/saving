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
@Table(name = "flujo")
public class Flujo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFlujo;
    
    @Column(length = 4, nullable = false)
    private String codigo;
    
    @Column(length = 20, nullable = false)
    private String nombreFlujo;
    
    @Column(length = 25, nullable = false)
    private String referencia;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date timestamp;
    
    @Column(length = 10, nullable = false)
    private String hilo;
    
    @Column(length = 5, nullable = false)
    private String estado;
    
    @ManyToOne
    @JoinColumn(name = "numeroUnico")
    private Cliente cliente;

	public Long getIdFlujo() {
		return idFlujo;
	}

	public void setIdFlujo(Long idFlujo) {
		this.idFlujo = idFlujo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreFlujo() {
		return nombreFlujo;
	}

	public void setNombreFlujo(String nombreFlujo) {
		this.nombreFlujo = nombreFlujo;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getHilo() {
		return hilo;
	}

	public void setHilo(String hilo) {
		this.hilo = hilo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
    
    // Constructor, getters y setters
    
    
    
}
