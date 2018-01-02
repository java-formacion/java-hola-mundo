package com.ipartek.formacion.ejercicios.atributosaparte;

public class Ave {

	public char sexo;
	public int edad;
	static int numAves = 0;

	public Ave(char sexo, int edad) {

		this.sexo = sexo;
		this.edad = edad;
		Ave.numAves++;

	}

	public int avesCreadas() {
		
		System.out.println("El numero total de aves es" +numAves);
		return numAves;
		
	}
	
	public void quienSoy() {
		
		System.out.println("El sexo es "+this.sexo);
		System.out.println("La edad es "+this.edad);
		
	}

}