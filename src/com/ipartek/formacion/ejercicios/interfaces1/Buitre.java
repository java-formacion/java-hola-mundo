package com.ipartek.formacion.ejercicios.interfaces1;

public class Buitre extends Ave {

	double vVuelo = 0;
	double peso = 0;

	public Buitre(char sexo, int edad, double vVuelo, double peso) {

		super(sexo, edad);
		this.vVuelo = vVuelo;
		this.peso = peso;

	}

}
