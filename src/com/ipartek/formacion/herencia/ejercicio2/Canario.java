package com.ipartek.formacion.herencia.ejercicio2;

public class Canario extends Ave {

	public int tamano;

	public Canario(char sexo, int edad) {
		super(sexo, edad);
	}

	public Canario(char sexo, int edad, int tamano) {
		super(sexo, edad);
		this.tamano = tamano;
	}

	public void getAltura() {

		if (this.tamano > 30) {
			System.out.println("Alto");
		} else if ((this.tamano >= 15) && (this.tamano <= 30)) {
			System.out.println("Mediano");

		} else {
			System.out.println("Bajo");
		}

	}

}
