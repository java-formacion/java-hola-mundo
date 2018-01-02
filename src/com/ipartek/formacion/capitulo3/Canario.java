package com.ipartek.formacion.capitulo3;

public class Canario extends Ave{
	
	
	float tamaño;

	public Canario(String sexo, int edad, float tamaño) {
		super(sexo, edad);
		this.tamaño = tamaño;
		
		
	}

	public Canario(String sexo, int edad) {
		super(sexo, edad);
		
		
	}
	
	void calcularAltura(Canario c) {
		
		if(c.tamaño >30) System.out.println("Alto");
		else if(c.tamaño<=30 && c.tamaño>=15) System.out.println("Mediano");
		else System.out.println("Pequeño");
	}

}
