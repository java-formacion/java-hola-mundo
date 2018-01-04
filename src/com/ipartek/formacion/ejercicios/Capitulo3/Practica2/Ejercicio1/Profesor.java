package com.ipartek.formacion.ejercicios.Capitulo3.Practica2.Ejercicio1;


public class Profesor extends Persona implements Hablador{
	private String  despacho, email;

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

	@Override
	public void hablar() {
		System.out.println("“Hola, soy un Profesor y se hablar");
		System.out.println("Nombre: "+this.getNombre()+" Edad: "+this.getEdad());
		System.out.println("Despacho: "+this.getDespacho()+" Email: "+this.getEmail());
		System.out.println();
		System.out.println();
		
	}

	
	

	

}
