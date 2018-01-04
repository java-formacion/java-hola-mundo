package com.ipartek.formacion.ejercicios.interfaces1;

public class Profesor extends Persona implements Hablador {

	String despacho = "";
	String email = "";

	public Profesor(String nombre, int edad, String despacho, String email) {
		super(nombre, edad);
		this.despacho = despacho;
		this.email = email;

	}

	public void hablar() {
		System.out.println("Soy un Profesor y se hablar");
	}
}
