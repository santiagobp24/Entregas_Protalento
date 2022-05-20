package com.protalento.Practica_semanal_semana_4;


import java.util.ArrayList;


public class App 
{
    public static void main( String[] args )
    {
    	Superman superman1 = new Superman("Clark", 90, "Español");
    	Avion avion1 = new Avion("Wilson", 16000, 4); 
    	Ovni ovni1 = new Ovni("Desconocido", 3000, 2);
    	Helicoptero helicoptero1 = new Helicoptero("María", 4000, 1, "negro");
    	
    	ArrayList<Voladores> voladores = new ArrayList<Voladores>();
    	voladores.add(superman1);
    	voladores.add(helicoptero1);
    	voladores.add(ovni1);
    	voladores.add(avion1);
    	
    	for(int aux = 0; aux <voladores.size(); aux ++) {
    		if(voladores.get(aux) instanceof Aterrizable ) {
    			System.out.println(voladores.get(aux).getClase()+" "+voladores.get(aux).getNombreDelPiloto()+" Puede aterrizar");
    		}else{
    			System.out.println(voladores.get(aux).getClase()+" "+voladores.get(aux).getNombreDelPiloto()+" No puede aterrizar");
    		}
    		
    	}
    	
    }
}