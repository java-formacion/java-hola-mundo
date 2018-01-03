package com.ipartek.formacion.ejercicios.atributosaparte3;

public class Canario extends Ave {

	// public char sexo;
	// public int edad;
	protected double tamano;

	public Canario(char sexo, int edad,String nombreAve, String nombreDueno) {

		super(sexo, edad, nombreAve, nombreDueno);

	}

	public Canario(char sexo, int edad, String nombreAve, String nombreDueno, double tamano) {

		super(sexo, edad, nombreAve, nombreDueno);
		this.tamano = tamano;

	}
	
	public double getTamano() {
		return tamano;
	}
	
	public void setTamano (int tamano) {
		this.tamano=tamano;
	}

	public void altura() {

		System.out.println("El canario es:");

		if (this.tamano > 30) {
			System.out.println("Alto");
		} else if ((this.tamano <= 30) && (this.tamano >= 15)) {
			System.out.println("Mediano");
		} else if (this.tamano < 15) {
			System.out.println("Bajo");
		}
	}

}