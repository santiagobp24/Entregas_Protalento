package com.protalento.Practica_semanal_semana_4;


public class Ovni extends Voladores{
	
	public Ovni(String nombreDelPiloto, Integer peso, int cantidadDeTripulantesExtraterrestres) {
		super(nombreDelPiloto, peso);
		this.cantidadDeTripulantesExtraterrestres=cantidadDeTripulantesExtraterrestres;
	}
	
	public Ovni() {
	}

	public int cantidadDeTripulantesExtraterrestres;

	public int getCantidadDeTripulantesExtraterrestres() {
		return cantidadDeTripulantesExtraterrestres;
	}

	public void setCantidadDeTripulantesExtraterrestres(int cantidadDeTripulantesExtraterrestres) {
		this.cantidadDeTripulantesExtraterrestres = cantidadDeTripulantesExtraterrestres;
	}

	@Override
	public String toString() {
		return "Ovni [cantidadDeTripulantesExtraterrestres=" + cantidadDeTripulantesExtraterrestres + "]";
	}
	public String getClase() {
		return "Ovni";
	}
	
	

}