package com.ipartek.formacion.herencia;

public class Canario extends Ave {

	public double tamano;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Canario(char sexo, int edad) {
		super(sexo, edad);
	}

	public Canario(char sexo, int edad, double tamano) {
		super(sexo, edad);
		this.tamano = tamano;
	}

	public void altura(float tamano) {
		if (tamano > 30) {
			System.out.println("Alto");
		} else if ((tamano > 15) & (tamano < 30)) {
			System.out.println("Mediano");

		} else {
			System.out.println("Bajo");
		}
	}

}
