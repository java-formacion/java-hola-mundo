package com.ipartek.formacion.clases;

public class Persona {

	public String nombre;
	public String apellido;
	public int edad;
	int numTelf;
	public static int estatico = 0;

	public Persona(String nombre, String apellido, int edad, int numTelf) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.numTelf = numTelf;

	}

	public Persona(String nombre, String apellido, int edad) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;

	}

}
