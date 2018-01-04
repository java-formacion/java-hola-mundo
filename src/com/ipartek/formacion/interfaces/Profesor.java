package com.ipartek.formacion.interfaces;

public class Profesor extends Persona {

	private String despacho;
	private String email;

	public Profesor(String nombre, int edad, String despacho, String email) {
		super(nombre, edad);
		this.despacho = despacho;
		this.email = email;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void hablar() {

		System.out.println("Soy un Profesor y s� hablar");
		System.out.println("Nombre: " + this.getNombre() + "   " + "Edad: " + this.getEdad());
		System.out.println("Despacho: " + this.getDespacho() + "   " + "Email: " + this.getEmail());

	}

}
