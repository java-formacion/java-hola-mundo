package com.ipartek.formacion.herencia;

public class Ave {

	public char sexo;
	public int edad;
	static int numAves = 0;

	public Ave(char sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
		Ave.numAves++;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void quienSoy() {

		System.out.println("Mi sexo es: " + sexo);
		System.out.println("Mi edad es: " + edad);

	}

	public int avesCreadas() {

		return numAves;

	}

}
