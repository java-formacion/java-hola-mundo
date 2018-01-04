package com.ipartek.formacion.interfaces;

public class Alumno extends Persona {

	private String carrera;
	private int curso;

	public Alumno(String nombre, int edad, String carrera, int curso) {
		super(nombre, edad);
		this.carrera = carrera;
		this.curso = curso;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public void hablar() {

		System.out.println("Soy un Alumno y sé hablar");
		System.out.println("Nombre: " + this.getNombre() + "   " + "Edad: " + this.getEdad());
		System.out.println("Carrera: " + this.getCarrera() + "   " + "Curso: " + this.getCurso());

	}

}
