package com.ipartek.formacion.practicaherencia;

public class Ave {
	
	static int numAves = 0;
	
	private char sexo;
	private int edad;

	protected Ave(char sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
		numAves++;
	}
	
	protected void quienSoy() {
		System.out.println("Sexo: " + sexo + ", Edad: " + edad);
	}
	
	static void getNumAves() {
		System.out.println("Número de aves creadas: " + numAves);
	}

}
