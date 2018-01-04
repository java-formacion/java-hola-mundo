package com.ipartek.formacion.ejercicios.interfaces1;

public class Ave {

	private char sexo;
	public int edad;

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if (sexo != 'M' && sexo != 'H') {
			this.sexo = 'H';
		} else {
			this.sexo = sexo;
		}

	}

	public Ave(char sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
	}

}
