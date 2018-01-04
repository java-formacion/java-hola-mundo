package com.ipartek.formacion.interfaces;

public abstract class Ave {

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
		if ((sexo != 'M') && (sexo != 'H')) {
			System.out.println("El sexo es erroneo se pondrá HEMBRA por defecto");
			this.sexo = 'H';
		} else {
			this.sexo = sexo;
		}

	}

}
