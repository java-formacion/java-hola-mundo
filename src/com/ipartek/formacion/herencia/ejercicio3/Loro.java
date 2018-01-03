package com.ipartek.formacion.herencia.ejercicio3;

public class Loro extends Ave {

	private char region;
	private String color;

	public Loro(char sexo, int edad, String nombreAve, String nombreDueno, char region, String color) {
		super(sexo, edad, nombreAve, nombreDueno);
		this.region = region;
		this.color = color;
	}

	public char getRegion() {
		return region;
	}

	public void setRegion(char region) {
		if ((region != 'N') && (region != 'S') && (region != 'E') && (region != 'O')) {
			System.out.println("La region es incorrecta por defecto será NORTE");
		} else {
			this.region = region;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void deDondeEres() {

		switch (this.region) {
		case 'N':
			System.out.println("Norte");
			break;
		case 'S':
			System.out.println("Sur");
			break;
		case 'O':
			System.out.println("Oeste");
			break;
		case 'E':
			System.out.println("Este");
			break;
		default:
			System.out.println("No has introducido una region valida");
		}

	}

}
