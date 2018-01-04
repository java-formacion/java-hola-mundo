package com.ipartek.formacion.ejercicios.interfaces1;

public class Alumno extends Persona implements Hablador { //Para implementar una interface se añade el implements

	String carrera = "";
	String curso = "";

	public Alumno(String nombre, int edad, String carrera, String curso) {
		super(nombre, edad);
		this.carrera = carrera;
		this.curso = curso;

	}
	
	public void hablar() {
		System.out.println("Soy un Alumno y se hablar");
	}
	
	
	

}
