package com.protalento.ejemplo;

public class collecion<T> {
	
	
	private T[] elemento;

	public T[] getElemento() {
		return elemento;
	}

	public void setElemento(T[] elemento) {
		this.elemento = elemento;
	}

	public collecion(T[] elemento) {
		super();
		this.elemento = elemento;
	}
	
	public T add(T elemento1) {
		for(int var = 0; var < elemento.length; var ++) {
			if( elemento[var]==null) {
				elemento[var]= elemento1;
				break;
			}
		}
		return elemento1;
	} 
	
	public T addFirst(T elemento1) {
		int contador = 0;
		int contador2= 0;
		int contador3=0;
		
        for(int var = elemento.length-1; var > 0; var --) {
			
			
			
			if( elemento [var]== null) {
				contador2++;
			}
			
		}
        if(contador2==elemento.length-1) {
        	elemento[0]=elemento1;
        	contador3=1;
        }
		
		
		for(int var = elemento.length-1; var > 0; var --) {
			
			
			
			if( elemento [var]== null && elemento[var-1]!=null) {
				contador=1;
			}
		}
		
		
		if(contador==1) {
			for(int var = elemento.length-1; var >0; var --) {
				elemento[var]= elemento[var-1];
			}
			if(contador3==0) {
				elemento[0]=elemento1;
			}
			
		}
		return elemento1;
	}
	
	
	
	public T addLast(T elemento1) {
		int contador=0;
		
		for(int var = 0; var < elemento.length-1; var ++) {
			if( elemento [var]== null && elemento[var+1]!=null) {
				contador=1;
			}
			if(contador==1) {
					elemento[var]= elemento[var+1];
					//elemento[var+1]= null;
				
				
			}
			
		}
		
		
		elemento[elemento.length-1]=elemento1;
		
		
		return elemento1;
	}

}
