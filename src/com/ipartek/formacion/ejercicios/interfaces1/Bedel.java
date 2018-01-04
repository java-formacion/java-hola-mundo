package com.ipartek.formacion.ejercicios.interfaces1;

public class Bedel extends Persona implements Hablador {

	String turno = "";
	int antiguedad = 0;

	public Bedel(String nombre, int edad, String turno, int antiguedad) {
		super(nombre, edad);
		this.turno = turno;
		this.antiguedad = antiguedad;
	}
	
	public void hablar() {
		System.out.println("Soy un Bedel y se hablar");
	}
}
