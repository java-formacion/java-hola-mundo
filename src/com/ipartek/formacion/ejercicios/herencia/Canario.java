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
	
	//Getters y Setters
	
	
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	
	//metodo

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
