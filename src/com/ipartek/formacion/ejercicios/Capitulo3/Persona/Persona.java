package com.ipartek.formacion.ejercicios.Capitulo3.Persona;

public class Persona {

	public String nombre,apellido;
	public int edad,telefono;
	public static int estatico=0;
	
	public Persona(String nombre,String apellido,int edad,int telefono) {
		super();
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.telefono=telefono;
	}
	public Persona(String nombre,String apellido,int edad) {
		super();//para llamar al constructor padre.
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
	}

}
