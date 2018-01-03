package com.ipartek.formacion.herencia.ejercicio2;

public class Loro extends Ave {

	public char region;
	public String color;

	public Loro(char sexo, int edad, char region, String color) {
		super(sexo, edad);
		this.region = region;
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
