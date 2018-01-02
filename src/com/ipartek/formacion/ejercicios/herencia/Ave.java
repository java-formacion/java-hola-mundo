package com.ipartek.formacion.ejercicios.herencia;

public class Ave {
	public String sexo;
	public int edad;
	public static int numAves=0;
	
	//constructor
	public Ave(String sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
		numAves++;
		
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


	public static int getNumAves() {
		return numAves;
	}

	
	
	//metodos
	public static void setNumAves(int numAves) {
		Ave.numAves = numAves;
	}
	
	
	public void quienSoy(String sexo) {
		System.out.println("soy " + sexo);
		
	}


	

}
