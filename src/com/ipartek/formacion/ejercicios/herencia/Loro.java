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
	
	public void deDondeEres(char region) {
		if(region == 'N') {
			System.out.println("El loro es de " + region);
		}else if(region == 'S') {
			System.out.println("El loro es de " + region);
		}else if(region == 'E') {
			System.out.println("El loro es de " + region);
		}else if(region == 'O') {
			System.out.println("El loro es de " + region);
		}
	}
	
	
}
