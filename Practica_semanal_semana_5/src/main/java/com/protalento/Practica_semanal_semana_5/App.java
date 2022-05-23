package com.protalento.Practica_semanal_semana_5;


public class App
{
    public static void main( String[] args ){
    	
    	
    	CollectionCustom <String> coleccion = new CollectionCustom<String>();
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
        coleccion.add("fernando");
        coleccion.add("Amanda");
        coleccion.addLast("Lina");
        coleccion.addLast("Luis");
       
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
        coleccion.add("sergio");
        coleccion.addLast("pepper");
        coleccion.addFirst("teresa");
        coleccion.add("carol");
        coleccion.addLast("harol");
        coleccion.addLast("geral");
        coleccion.remove("sergio");
        coleccion.add("tor");
       
        System.out.println("------------------------------------------------");
       
        for(int var=0; var<=coleccion.size()-1;var ++ ) {
        	System.out.println(coleccion.getColeccion()[var]);
        }
        
       
       
        System.out.println("------------------------------------------------");
       
        coleccion.empty();
        
        for(int var=0; var<=coleccion.size()-1;var ++ ) {
        	System.out.println(coleccion.getColeccion()[var]);
        }
        
        coleccion.removeAll();
        coleccion.addLast("df");
        coleccion.remove("df");
        coleccion.empty();
        
        for(int var=0; var<=coleccion.size()-1;var ++ ) {
        	System.out.println(coleccion.getColeccion()[var]);
        }
       
       
       
       
        }
    }
    
   
    