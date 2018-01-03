package com.ipartek.formacion.ejercicios.atributosaparte3;

public class Loro extends Ave {

	// public char sexo;
	// public int edad;
	private char region;//asi evitamos otro valor diferente a NSEO
	public String color;

	public Loro(char sexo, int edad,String nombreAve, String nombreDueno, char region, String color) {

		super(sexo, edad, nombreAve, nombreDueno);
		this.region = region;
		this.color = color;

	}
	
	public char getRegion() {
		return region;
	}
	
	public void setRegion (char region) {
		if ((region!='N')&& (region!='S')&&(region!='E')&&(region!='O')) {
			System.out.println("La region es incorrecta. Por defecto va a ser Norte");
			this.region='N';
		}else {
			this.region=region;
		}
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