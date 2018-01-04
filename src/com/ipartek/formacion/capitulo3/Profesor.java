package com.ipartek.formacion.capitulo3;

public class Profesor extends Persona implements Hablador{

	
	public String despacho;
	public String email;
	
	
	public Profesor(String nombre, int edad, String despacho, String email) {
		super(nombre, edad);
		this.despacho = despacho;
		this.email = email;
	}


	
	public void hablar() {
		
		System.out.println("Hola soy un PROFESOR y se hablar");
		
	}
	
	
	
	
}
