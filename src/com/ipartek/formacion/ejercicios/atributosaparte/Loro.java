package com.ipartek.formacion.ejercicios.atributosaparte;

public class Loro extends Ave {

	// public char sexo;
	// public int edad;
	public char region;
	public String color;

	public Loro(char sexo, int edad, char region, String color) {

		super(sexo, edad);
		this.region = region;
		this.color = color;

	}
	
	public void deDondeEres() {
		System.out.println("Es del:");
		switch (region)
		{
		case 'N':
			System.out.println("Norte");
			break;
		case 'S':
			System.out.println("Sur");
			break;
		case 'E':
			System.out.println("Este");
			break;
		case 'O':
			System.out.println("Oeste");
			break;
			
		}
	}
}