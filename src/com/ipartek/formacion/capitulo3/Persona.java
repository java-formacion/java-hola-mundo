package com.ipartek.formacion.capitulo3;

public class Persona {

	
	public String nombre;
	public String apellido;
	public int edad;
	public String telefono;
	public static int estatico = 0;
	
	
	public Persona(String nombre, String apellido, int edad, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
	}


	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	
	
	
}
