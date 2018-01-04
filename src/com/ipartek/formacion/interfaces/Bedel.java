package com.ipartek.formacion.interfaces;

public class Bedel extends Persona implements Hablador {

	private String turno;
	private int antiguedad;

	public Bedel(String nombre, int edad, String turno, int antiguedad) {
		super(nombre, edad);
		this.turno = turno;
		this.antiguedad = antiguedad;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void hablar() {

		System.out.println("Soy un Bedel y sé hablar");
		System.out.println("Nombre: " + this.getNombre() + "   " + "Edad: " + this.getEdad());
		System.out.println("Turno: " + this.getTurno() + "   " + "Antiguedad: " + this.getAntiguedad());

	}

}
