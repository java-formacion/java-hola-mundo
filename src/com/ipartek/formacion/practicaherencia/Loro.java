package com.ipartek.formacion.practicaherencia;

public class Loro extends Ave {

	private char region;
	private String color;

	protected Loro(char sexo, int edad, char region, String color, String nombreAve, String nombreDueno) {
		super(region, edad, nombreAve, nombreDueno);
		this.region = region;
		this.setColor(color);
	}
	
	protected String getColor() {
		return this.color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected char getRegion() {
		return region;
	}

	protected void setRegion(char region) {
		this.region = region;
	}
	
	protected void deDondEres() {
		String p = "";
		switch(this.region) {
			case 'N':
				p = "Norte";
			break;
			case 'S':
				p = "Sur";
			break;
			case 'E':
				p = "Este";
			break;
			case 'O':
				p = "Oeste";
			break;
			default:
				p = "errónea: N, S, E, 0";
		}
		System.out.println("Región: " + p);
	}

	@Override
	void cantar() {
		System.out.println("Piiio-piiiio loro bonito");
	}

}
