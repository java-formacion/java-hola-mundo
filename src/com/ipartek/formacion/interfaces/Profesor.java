package com.ipartek.formacion.interfaces;

public class Profesor extends Persona implements Hablador {

	public String despacho, email;

	public Profesor(String nombre, int edad, String despacho, String email) {
		super(nombre, edad);
		this.despacho = despacho;
		this.email = email;
	}

	@Override
	public void hablar() {
		System.out.println("Hola soy un " + this.getClass().getSimpleName() + " y sé hablar");
		System.out.println("Sexo: " + this.nombre + ", edad: " + this.edad + ", despacho: " + this.despacho + ", email: " + this.email);
	}

}
