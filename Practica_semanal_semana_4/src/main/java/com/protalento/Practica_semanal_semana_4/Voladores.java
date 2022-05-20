package com.protalento.Practica_semanal_semana_4;


public abstract class Voladores {
	
	private String nombreDelPiloto;
	private Integer peso;
	private Integer velocidad;
	private String Clase;
	
	
	
	

	public String getClase() {
		return Clase;
	}

	public void setClase(String clase) {
		Clase = clase;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}
	
	public Voladores() {
	}

	public Voladores(String nombreDelPiloto, Integer peso) {
		super();
		this.nombreDelPiloto = nombreDelPiloto;
		this.peso=peso;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getNombreDelPiloto() {
		return nombreDelPiloto;
	}

	public void setNombreDelPiloto(String nombreDelPiloto) {
		this.nombreDelPiloto = nombreDelPiloto;
	}
	
	

}