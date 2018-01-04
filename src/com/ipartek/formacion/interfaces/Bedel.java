package com.ipartek.formacion.interfaces;

public class Bedel extends Persona implements Hablador {

	public String turno;
	public int antig;
	public Bedel(String nombre, int edad, String turno, int antig) {
		super(nombre, edad);
		this.turno = turno;
		this.antig = antig;
	}
	
	@Override
	public void hablar() {
		System.out.println("Hola soy un " + this.getClass().getSimpleName() + " y sé hablar");
		System.out.println("Sexo: " + this.nombre + ", edad: " + this.edad + ", turno: " + this.turno + ", Antigüedad: " + this.antig);
	}

}
