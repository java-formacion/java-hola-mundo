package com.ipartek.formacion.ejercicios.clasepersona;

public class Persona {
	public String nombre;
	public String apellido;
	public int edad;
	public String telefono;
	public static int estatico = 0;
	
	//Primer constructor
	public Persona(String nombre, String apellido, int edad, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		
	}
	
	
	//Segundo constructor
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

}
