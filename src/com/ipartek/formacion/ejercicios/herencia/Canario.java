package com.ipartek.formacion.ejercicios.herencia;

public class Canario extends Ave {
	
	
	public double tamanio;
	
	public Canario(String sexo, int edad) {
		super(sexo, edad);
		
	}
	
	public Canario(String sexo, int edad, double tamanio) {
		super(sexo, edad);
		this.tamanio = tamanio;
	}
	
	//Getters y Setters
	
	

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	
	//metodo

	public void altura(double tamanio) {
		if(tamanio>30) {
			System.out.println("Soy de tamaño Alto");
		}else if(tamanio>=15 && tamanio<=30) {
			System.out.println("Soy de tamaño Mediano");
		}else if(tamanio<15) {
			System.out.println("Soy de tamaño Bajo");
		}
		
	}

	@Override
	protected void cantar() {
		System.out.println("Pio-pio soy un Piolín");
		
	}
	
	

}
