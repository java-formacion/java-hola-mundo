package com.ipartek.formacion.ejercicios.herencia;

public class Loro extends Ave {
	
	String sexo;
	int edad;
	char region;
	String color;
	
	public Loro(String sexo, int edad, char region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}
}
