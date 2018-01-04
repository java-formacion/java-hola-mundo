package com.ipartek.formacion.capitulo3;

public class Alumno extends Persona implements Hablador{

	
	
	
	public String carrera;
	public int curso;
	
	public Alumno(String nombre, int edad, String carrera, int curso) {
		super(nombre, edad);
		this.carrera = carrera;
		this.curso = curso;
	}

	
	public void hablar() {
		
		System.out.println("Hola soy un ALUMNO y se hablar");
		System.out.println("Nombre: " + nombre + "        Edad: " + edad);
		System.out.println("Carrera: " + carrera + "       curso: " + curso );
		System.out.println("");
		
	}
	
	
	
}
