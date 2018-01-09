package com.ipartek.formacion.javapoo;

public class Persona {
	
	public String nombre, apellidos, telefono;
	public int edad;
	
	public static int numPersonas = 0;

	public Persona(String nombre, String apellidos, String telefono, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.edad = edad;
	}
	
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	

}
