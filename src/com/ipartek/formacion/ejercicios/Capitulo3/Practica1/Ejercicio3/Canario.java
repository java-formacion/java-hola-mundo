package com.ipartek.formacion.ejercicios.Capitulo3.Practica1.Ejercicio3;

public class Canario extends Ave {

	private double tamano;

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	public Canario(char sexo, int edad) {
		super(sexo, edad);
	}

	public Canario(char sexo, int edad, double tamano) {
		super(sexo, edad);
		this.tamano = tamano;
	}

	public void altura(Piolin p) {
		if (p.getTamano() > 30) {
			System.out.println("Alto");
		} else if (p.getTamano() < 30 && p.getTamano() > 15) {
			System.out.println("Mediano");
		} else if (p.getTamano() < 15) {
			System.out.println("Pequeño");
		}
	}

}
