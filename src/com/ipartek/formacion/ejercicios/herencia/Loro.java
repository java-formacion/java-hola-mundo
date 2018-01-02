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
	
	//Getters y Setters
	
	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
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
