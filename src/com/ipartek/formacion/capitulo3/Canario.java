package com.ipartek.formacion.capitulo3;

public class Canario extends Ave{
	
	
	public float tamano;

	public Canario(String sexo, int edad, float tamaño) {
		super(sexo, edad);
		this.tamano = tamaño;
		
		
	}
	
	

	public Canario(String sexo, int edad) {
		super(sexo, edad);
		
		
	}
	
	public void calcularAltura() {
		
		if(tamano >30) System.out.println("Alto");
		else if(tamano<=30 && tamano>=15) System.out.println("Mediano");
		else System.out.println("Pequeño");
	}
	
	public  void cantar() {
	}

}
