package com.ipartek.formacion.ejercicios.Capitulo3.Practica1.Ejercicio3;

public class Canario extends Ave {

	public double tamano;

	public Canario(char sexo, int edad, String nombreAve, String nombreDueno) {
		super(sexo, edad, nombreAve, nombreDueno);
	}

	public Canario(char sexo, int edad, String nombreAve, String nombreDueno, double tamano) {
		super(sexo, edad, nombreAve, nombreDueno);
		this.tamano = tamano;
	}

	public void altura(Piolin p) {
		if (tamano > 30) {
			System.out.println("Alto");
		} else if (tamano < 30 && tamano > 15) {
			System.out.println("Mediano");
		} else if (tamano < 15) {
			System.out.println("Pequeño");
		}
	}

	@Override
	public void cantar() {
		
	}

}
