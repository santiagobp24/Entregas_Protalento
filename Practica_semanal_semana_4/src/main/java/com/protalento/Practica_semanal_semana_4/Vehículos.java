package com.protalento.Practica_semanal_semana_4;

public abstract class Vehículos extends Voladores {
	
	private int cantidadDeMotores;
	private int cantidadDeAsientos;

	public Vehículos(String nombreDelPiloto, Integer peso, int cantidadDeMotores) {
		super(nombreDelPiloto, peso);
		this.cantidadDeMotores = cantidadDeMotores;
	}

	public Vehículos() {
		// TODO Auto-generated constructor stub
	}

	public int getCantidadDeMotores() {
		return cantidadDeMotores;
	}

	public void setCantidadDeMotores(int cantidadDeMotores) {
		this.cantidadDeMotores = cantidadDeMotores;
	}

	public int getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}

	public void setCantidadDeAsientos(int cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	}
	
	
	

}