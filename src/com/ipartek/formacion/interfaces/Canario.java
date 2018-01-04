package com.ipartek.formacion.interfaces;

public class Canario extends Ave {

	public String canta;

	public Canario(char sexo, int edad, String canta) {
		super(sexo, edad);
		this.canta = canta;
	}
	
}
