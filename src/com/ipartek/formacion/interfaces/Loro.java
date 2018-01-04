package com.ipartek.formacion.interfaces;

public class Loro extends Ave implements Hablador {

	public char region;
	public String color;
	
	public Loro(char sexo, int edad, char region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		
	}
	
}
