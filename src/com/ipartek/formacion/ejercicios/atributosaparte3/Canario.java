package com.ipartek.formacion.ejercicios.atributosaparte3;

public class Canario extends Ave {

	// public char sexo;
	// public int edad;
	public double tamano;

	public Canario(char sexo, int edad) {

		super(sexo, edad);

	}

	public Canario(char sexo, int edad, double tamano) {

		super(sexo, edad);
		this.tamano = tamano;

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