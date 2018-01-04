package com.ipartek.formacion.ejercicios.herencia;

public class Loro extends Ave {
	
	
	char region;
	String color;
	
	public Loro(String sexo, int edad, char region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}
	
	//Getters y Setters



	public char getRegion() {
		return region;
	}



	public void setRegion(char region) {
		if(region!='N' && region!='S' && region!='E' && region!='O') {
			System.out.println("La region es incorrecta");
		}else {
			this.region = region;
		}
		
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public void deDondeEres(char region) {
		/*if(region == 'N') {
			System.out.println("El loro es de Norte");
		}else if(region == 'S') {
			System.out.println("El loro es de Sur");
		}else if(region == 'E') {
			System.out.println("El loro es de Este");
		}else if(region == 'O') {
			System.out.println("El loro es de Oeste");
		}*/
		
		switch(region) {
		case 'N':
			System.out.println("El loro es de Norte");
			break;
		case 'S':
			System.out.println("El loro es de Sur");
			break;
		case 'E':
			System.out.println("El loro es de Este");
			break;
		case 'O':
			System.out.println("El loro es de Oeste");
			break;
			default:
				System.out.println("Introduce una region");
		}
	}

	@Override
	protected void cantar() {
		System.out.println("Piiio-piiiio loro bonito");
		
	}
	
	
}
