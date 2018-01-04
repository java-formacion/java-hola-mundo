package com.ipartek.formacion.capitulo3;

public class Bedel extends Persona implements Hablador{

	
	public String turno;
	public int antiguedad;
	
	
	public Bedel(String nombre, int edad, String turno, int antiguedad) {
		super(nombre, edad);
		this.turno = turno;
		this.antiguedad = antiguedad;
	}


	
	public void hablar() {
		
		System.out.println("Hola soy un BEDEL y se hablar");
		
	}
	
	
}
