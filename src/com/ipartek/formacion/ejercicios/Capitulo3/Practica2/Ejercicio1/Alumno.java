package com.ipartek.formacion.ejercicios.Capitulo3.Practica2.Ejercicio1;

public class Alumno extends Persona {

	private int edad;
	private String nombre,carrera,curso;
	
	
	public Alumno(String nombre, int edad, int edad2, String nombre2, String carrera, String curso) {
		super(nombre, edad);
		edad = edad2;
		nombre = nombre2;
		this.carrera = carrera;
		this.curso = curso;
	}
	
	
	
	
	
	
}
