package com.ipartek.formacion.interfaces;

public class Loro extends Ave implements Hablador {

	private char region;
	private String color;

	public Loro(char sexo, int edad, char region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}

	public char getRegion() {
		return region;
	}

	public void setRegion(char region) {
		this.region = region;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void hablar() {

		System.out.println("Soy un Loro");

	}

}
