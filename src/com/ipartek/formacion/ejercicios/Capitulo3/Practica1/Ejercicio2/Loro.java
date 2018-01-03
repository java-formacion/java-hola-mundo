package com.ipartek.formacion.ejercicios.Capitulo3.Practica1.Ejercicio2;

public class Loro extends Ave {

	private char region;
	private String color;

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

	public Loro(char sexo, int edad, char region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}

	public void deDondeEres(Loro l) {
		switch (l.getRegion()) {
		case 'n':
			System.out.println("Norte");
			break;

		case 's':
			System.out.println("sur");
			break;

		case 'e':
			System.out.println("Este");
			break;
		case 'o':
			System.out.println("Oeste");
			break;
		default:
			System.out.println("no has puesto bien el caracter de region");
			break;
		}

	}

}
