package com.ipartek.formacion.herencia;

public class Loro extends Ave {

	public char region;
	public String color;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Loro(char sexo, int edad, char region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}

	public void deDondeEres(char region) {

		if (region == 'N') {
			System.out.println("Norte");
		} else if (region == 'S') {
			System.out.println("Sur");
		} else if (region == 'E') {
			System.out.println("Este");
		} else {
			System.out.println("Oeste");
		}

	}

}
