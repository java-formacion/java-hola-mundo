package com.ipartek.formacion.capitulo3;

public class Loro extends Ave implements Hablador {

	
	
	public String region;
	public String color;
	
	public Loro(String sexo, int edad, String region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
		
		
	}
	
	public void deDondeEres() {
		
		
		if(region.equalsIgnoreCase("N"))System.out.println("Norte");
		else if(region.equalsIgnoreCase("S"))System.out.println("Sur");
		else if(region.equalsIgnoreCase("E"))System.out.println("Este");
		else System.out.println("Oeste");
	}
	
	public  void cantar() {
		
		System.out.println("Piiio-piiiio loro bonito”");
	}

	
	public void hablar() {
		
		System.out.println("Hola soy un LORO y se hablar");
		System.out.println("Sexo: " + sexo + "        Edad: " + edad);
		System.out.println("Region: " + region + "          Color: " + color );
		System.out.println("");
	}
	
}
