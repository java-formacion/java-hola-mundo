package com.ipartek.formacion.capitulo3;

public class Canario extends Ave{
	
	
	public float tamano;

	public Canario(String sexo, int edad, float tama�o) {
		super(sexo, edad);
		this.tamano = tama�o;
		
		
	}
	
	

	public Canario(String sexo, int edad) {
		super(sexo, edad);
		
		
	}
	
	public void calcularAltura() {
		
		if(tamano >30) System.out.println("Alto");
		else if(tamano<=30 && tamano>=15) System.out.println("Mediano");
		else System.out.println("Peque�o");
	}
	
	public  void cantar() {
	}

}
