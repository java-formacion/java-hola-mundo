package com.ipartek.formacion.ejercicios.interfaces1;

public class Loro extends Ave {

	char region;
	String color;

	public Loro(char sexo, int edad, char region, String color) {

		super(sexo, edad);
		this.region = region;
		this.color = color;

	}

}
