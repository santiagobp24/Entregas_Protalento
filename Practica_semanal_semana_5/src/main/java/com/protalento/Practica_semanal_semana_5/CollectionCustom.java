package com.protalento.Practica_semanal_semana_5;


public class CollectionCustom<T> {
	
	
	private T[] coleccion;

	public CollectionCustom(){
		
	}
	public CollectionCustom(T[] coleccion) {
		super();
		this.coleccion = coleccion;
	}

	public int size () {
		return coleccion.length;

	}

	public void addFirst(T elemento) {
		int cont=0;
		for (int var = coleccion.length-1; var >=0; var--) {
			if(coleccion[var]== null) {
				cont++;
			}
		}
		if(cont != 0) {
			int cont2 = 0;
			for (int var = coleccion.length-1; var >0; var--) {
				if(coleccion[var]==null) {
					cont2=1;
				}
				if(cont2==1) {
					if(coleccion[var-1]!= null) {
						coleccion[var]=coleccion[var-1];
					}else {
					}
				}
			}
			coleccion[0]=elemento;
		}else {
			System.out.println("no se puede agregar \""+elemento+"\" porque ya no hay más espacio en la colección");
		}

}
	public void add(T elemento) {
		int cont=0;
		for (int var = coleccion.length-1; var >=0; var--) {
			if(coleccion[var]== null || coleccion[var]=="") {
				cont++;
			}
		}
		if(cont!=0) {
			for (int var = 0; var <= coleccion.length-1; var++) {
				if (coleccion[var]==null || coleccion[var]=="") {
					coleccion[var]=elemento;
					break;
				}
			}
		}else {
			System.out.println("no se puede agregar \""+elemento+"\" porque ya no hay más espacio en la colección");
		}
	}

	public void addLast(T elemento) {
		int cont=0;
		for (int var = coleccion.length-1; var >=0; var--) {
			if(coleccion[var]== null) {
				cont++;
			}
		}
		if(cont!= 0) {
			int cont2 = 0;
			for (int var = 0; var <coleccion.length-1; var++) {
				if(coleccion[var]==null) {
					cont2=1;
				}
				if(cont2==1) {
					if(coleccion[var+1]!= null) {
						coleccion[var]=coleccion[var+1];
					}else {
						
					}
				}
			}
			
			coleccion[coleccion.length-1]=elemento;
		}else {
			System.out.println("no se puede agregar \""+elemento+"\" porque ya no hay más espacio en la colección");
		}
	}
	public T remove(T elemento) {
		int cont2 = 0;
		for (int var = 0; var < coleccion.length; var++) {
			if(coleccion[var]==elemento) {
				cont2=1;
			}
			if(cont2==1) {
				if(coleccion[var+1]!= null) {
					coleccion[var]= (T) "";
					System.out.println("ya se eliminó el elemento: "+elemento);
					break;
				}else {
					
				}
			}
		}
	return elemento;
	}
	public void removeAll() {
		for (int var = 0; var < coleccion.length; var ++) {
			coleccion[var]=null;
		}
	}

	public boolean empty() {
		int cont = 0;
		for(int var = 0; var < coleccion.length; var ++) {
			if (coleccion[var]==null) {
				cont++;
			}
		}
		if (cont==coleccion.length) {
			System.out.println("La colección está vacía");
			return true;
		}else{
			System.out.println("La colección no está vacía");
			return false;
			}
		}


	public T[] getColeccion() {
		return coleccion;
	}

	public void setColeccion(T[] coleccion) {
		this.coleccion = coleccion;
	}






}