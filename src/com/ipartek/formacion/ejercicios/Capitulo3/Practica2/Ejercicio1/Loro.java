package com.ipartek.formacion.ejercicios.Capitulo3.Practica2.Ejercicio1;

public class Loro extends Ave implements Hablador{

	//sexo edad region color
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


	@Override
	public void hablar() {
		System.out.println("“Hola, soy un Loro y sé hablar");
		System.out.println("sexo: "+this.getSexo()+" Edad: "+this.getEdad());
		System.out.println("Color: "+this.getColor()+" Region: "+this.getRegion());
		System.out.println();
		System.out.println();
		
	}
	
	
	
	
	
}
