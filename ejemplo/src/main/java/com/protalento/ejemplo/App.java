package com.protalento.ejemplo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	String[] coleccion1 = new String[10];
    	
    	collecion<String> coleccion = new collecion <String>(coleccion1);
    	
    	//coleccion.add("Ana");
    	
    	
    	
		
		
		  coleccion.add("x"); coleccion.add("maria"); coleccion.add("pedro");
		  coleccion.add("sol");
		 
		 
    	//coleccion.addFirst("Leon");
    	coleccion.addLast("Juan");
    	coleccion.addLast("maria");
    	coleccion.addLast("sebastian");
    	coleccion.addLast("sara");
    	//coleccion.addFirst("jorge");
    	
    	
    	for(int var = 0; var <coleccion1.length; var ++) {
    		System.out.println(coleccion.getElemento()[var]);
    	}
    	
    	
    	
    }
}
