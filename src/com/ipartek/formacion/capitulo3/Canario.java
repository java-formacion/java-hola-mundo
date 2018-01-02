package com.ipartek.formacion.capitulo3;

public class Canario extends Ave{
	
	
	float tama�o;

	public Canario(String sexo, int edad, float tama�o) {
		super(sexo, edad);
		this.tama�o = tama�o;
		
		
	}

	public Canario(String sexo, int edad) {
		super(sexo, edad);
		
		
	}
	
	void calcularAltura(Canario c) {
		
		if(c.tama�o >30) System.out.println("Alto");
		else if(c.tama�o<=30 && c.tama�o>=15) System.out.println("Mediano");
		else System.out.println("Peque�o");
	}

}
