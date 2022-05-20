package com.protalento.Practica_semanal_semana_4;


public class Superman extends Voladores{
	
	private String idiomaQueHabla;
	
	public Superman(String nombreDelPiloto, Integer peso, String idiomaQueHabla) {
		super(nombreDelPiloto, peso);
		this.idiomaQueHabla=idiomaQueHabla;
	}
	
	public Superman() {
	}

	@Override
	public String toString() {
		return "Superman [idiomaQueHabla=" + idiomaQueHabla + "]";
	}
	
	public String getClase() {
		return "Superman";
	}
	

	

}