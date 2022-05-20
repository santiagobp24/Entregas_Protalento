package com.protalento.Practica_semanal_semana_4;


public class Avion extends Voladores implements Aterrizable {
	
	private int cantidadDeNeumaticos;
	

	public Avion(String nombreDelPiloto, Integer peso, int cantidadDeNeumaticos) {
		super(nombreDelPiloto, peso);
		this.cantidadDeNeumaticos = cantidadDeNeumaticos;
	}
	
	public Avion() {
	}


	public int getCantidadDeNeumaticos() {
		return cantidadDeNeumaticos;
	}


	public void setCantidadDeNeumaticos(int cantidadDeNeumaticos) {
		this.cantidadDeNeumaticos = cantidadDeNeumaticos;
	}
	
	public String getClase() {
		return "Avion";
	}
	

	@Override
	public String toString() {
		return "Avion [cantidadDeNeumaticos=" + cantidadDeNeumaticos + "]";
	}

	
	
	

}