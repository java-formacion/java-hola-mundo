package com.ipartek.formacion.herencia.ejercicio3;

public class Canario extends Ave {

	private int tamano;

	public Canario(char sexo, int edad, String nombreAve, String nombreDueno) {
		super(sexo, edad, nombreDueno, nombreDueno);
	}

	public Canario(char sexo, int edad, String nombreAve, String nombreDueno, int tamano) {
		super(sexo, edad, nombreDueno, nombreDueno);
		this.tamano = tamano;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
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
