package com.dev.ahorro.bitacora.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    @Id
    @Column(name = "numero_unico", length = 15)
    private String numeroUnico;
    @Column(name = "nombre", length = 200)
    private String nombre;
    @Column(name = "nombre", length = 100)
    private String email;
    // constructores, getters, setters, etc.
	public String getNumeroUnico() {
		return numeroUnico;
	}
	public void setNumeroUnico(String numeroUnico) {
		this.numeroUnico = numeroUnico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    
    
}
