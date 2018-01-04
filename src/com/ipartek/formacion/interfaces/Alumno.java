package com.ipartek.formacion.interfaces;

public class Alumno extends Persona implements Hablador {
	
	public String carrera;
	public int curso;
	
	public Alumno(String nombre, int edad, String carrera, int curso) {
		super(nombre, edad);
		this.carrera = carrera;
		this.curso = curso;
	}

	@Override
	public void hablar() {
		System.out.println("Hola soy un " + this.getClass().getSimpleName() + " y sé hablar");
		System.out.println("Sexo: " + this.nombre + ", edad: " + this.edad + ", carrera: " + this.carrera + ", curso: " + this.curso);
	}
	
}
