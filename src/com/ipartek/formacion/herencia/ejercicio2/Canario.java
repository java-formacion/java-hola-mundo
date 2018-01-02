package com.ipartek.formacion.herencia.ejercicio2;

public class Canario extends Ave {

	public double tamano;

	public Canario(char sexo, int edad) {
		super(sexo, edad);
	}

	public Canario(char sexo, int edad, double tamano) {
		super(sexo, edad);
		this.tamano = tamano;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	public void altura(double tamano) {
		
		if (tamano > 30) {
			System.out.println("Alto");
		} else if ((tamano > 15) & (tamano < 30)) {
			System.out.println("Mediano");

		} else {
			System.out.println("Bajo");
		}
		
	}

}
