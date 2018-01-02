package com.ipartek.formacion.capitulo3;

public class Loro extends Ave {

	
	
	String region;
	String color;
	
	public Loro(String sexo, int edad, String region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
		
		
	}
	
	void deDondeEres(Loro l) {
		
		
		if(l.region.equalsIgnoreCase("N"))System.out.println("Norte");
		else if(l.region.equalsIgnoreCase("S"))System.out.println("Sur");
		else if(l.region.equalsIgnoreCase("E"))System.out.println("Este");
		else System.out.println("Oeste");
	}
	
}
