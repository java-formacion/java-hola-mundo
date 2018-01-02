package com.ipartek.formacion.ejercicios.herencia;

public class Canario extends Ave {
	
	
	public String sexo;
	public int edad;
	public double tamanio;
	
	public Canario(String sexo, int edad) {
		super(sexo, edad);
		this.sexo = sexo;
		this.edad = edad;
		
	}
	
	public Canario(String sexo, int edad, double tamanio) {
		super(sexo, edad);
		this.sexo = sexo;
		this.edad = edad;
		this.tamanio = tamanio;
	}
	
	public void altura(double tamanio) {
		if(tamanio>30) {
			System.out.println("Alto");
		}else if(tamanio>15 || tamanio<30) {
			System.out.println("Mediano");
		}else if(tamanio<15) {
			System.out.println("Bajo");
		}
		
	}
	
	

}
