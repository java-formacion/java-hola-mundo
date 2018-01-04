package com.ipartek.formacion.interfaces;

public class Ave {

	private char sexo;
	public int edad;

	public Ave(char sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
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

}
