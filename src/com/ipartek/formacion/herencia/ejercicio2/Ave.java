package com.ipartek.formacion.herencia.ejercicio2;

public class Ave {

	public char sexo;
	public int edad;
	public static int numAves = 0;

	public Ave(char sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
		Ave.numAves++;
	}

	public void quienSoy() {

		System.out.println("Mi sexo es: " + sexo);
		System.out.println("Mi edad es: " + edad);

	}

	public static void getNumAvesCreadas() {

		System.out.println("Se han creado: " + numAves + " aves");

	}

}
