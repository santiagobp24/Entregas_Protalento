package com.protalento.Practica_semanal_semana_5;


public class App
{
    public static void main( String[] args ){
    	
    	
    	CollectionCustom <String> coleccion = new CollectionCustom<>();
    	   
        String[] coleccion1 = new String[10];
       
        coleccion.setColeccion(coleccion1);

        coleccion.addLast("Alberto");
        coleccion.addFirst("Tomas");
        coleccion.addLast("Pedro");
        coleccion.add("Ana");
        coleccion.addLast("Julio");


        for(int var=0; var<=coleccion.size()-1;var ++ ) {
        System.out.println(coleccion.getColeccion()[var]);
        }
       
        System.out.println("------------------------------------------------");
        
        coleccion.addFirst("Brigit");
        coleccion.add("Sierra");
        coleccion.addLast("Manuel");
       
        for(int var=0; var<=coleccion.size()-1;var ++ ) {
        	System.out.println(coleccion.getColeccion()[var]);
        }

       
        coleccion.remove("Ana");
        coleccion.remove("Julio");
       
        System.out.println("------------------------------------------------");
       
        for(int var=0; var<=coleccion.size()-1;var ++ ) {
        	System.out.println(coleccion.getColeccion()[var]);
        }
       
        coleccion.removeAll();
        
        System.out.println("------------------------------------------------");
        
        for(int var=0; var<=coleccion.size()-1;var ++ ) {
        	System.out.println(coleccion.getColeccion()[var]);
        }
        
        coleccion.empty();

        coleccion.addFirst("federico");
        coleccion.addLast("sonia");
       
        System.out.println("------------------------------------------------");
       
        for(int var=0; var<=coleccion.size()-1;var ++ ) {
        	System.out.println(coleccion.getColeccion()[var]);
        }
       
       
        System.out.println("------------------------------------------------");
       
        coleccion.empty();
       
       
       
       
        }
    }
    
   
    