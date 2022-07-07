package com.protalento.Practica_semanal_semana_5;


public class App
{
    public static void main( String[] args ){
    	
    	
    	CollectionCustom <String> coleccion = new CollectionCustom<String>();
        String[] coleccion1 = new String[10];
        
       
        coleccion.setColeccion(coleccion1);

        coleccion.addLast("Alberto");
        for(int var=0; var<=coleccion.size()-1;var ++ ) {
            System.out.println(coleccion.getColeccion()[var]);
            }
        
        coleccion.addLast("Pedro");
        for(int var=0; var<=coleccion.size()-1;var ++ ) {
            System.out.println(coleccion.getColeccion()[var]);
            }
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
       
       
       
       
       
       
        }
    }
    
   
    