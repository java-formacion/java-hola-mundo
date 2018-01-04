package com.ipartek.formacion.interfaces;

public class Alumno extends Persona {

	private String carrera;
	private String curso;

	public Alumno(String nombre, int edad, String carrera, String curso) {
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void hablar() {

		System.out.println("Soy un Alumno");

	}

}
