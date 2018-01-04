package com.ipartek.formacion.ejercicios.Capitulo3.Practica2.Ejercicio1;

public class Bedel extends Persona implements Hablador{

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

	@Override
	public void hablar() {
		System.out.println("“Hola, soy un Bedel y sé hablar");
		System.out.println("Nombre: "+this.getNombre()+" edad: "+this.getEdad());
		System.out.println("Antiguedad: "+this.getAntiguedad()+"Turno: "+this.getTurno());
		System.out.println();
		System.out.println();
		
	}

	

	

}
