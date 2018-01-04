package com.ipartek.formacion.ejercicios.interfaces1;

public class Canario extends Ave {

	String canta;

	public Canario(char sexo, int edad, String canta) {
		super(sexo, edad);
		this.canta = canta;
	}
}
