package com.dev.docs.model;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "peticion")
public class Root {
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//@Column
    private Cliente cliente;
	//@Column
    private Flujo flujo;
	//@Column
    private Trama trama;
	//@Column
    private ArrayList<Documento> documento;
	//@Column
    private ArrayList<Error> error;
}
