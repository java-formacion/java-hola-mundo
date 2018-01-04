package com.ipartek.formacion.practicaherencia;

public abstract class Ave {
	
	static int numAves = 0;
	
	private char sexo;
	private int edad;
	private DatosPersonales nombres;

	protected Ave(char sexo, int edad, String nombreDueno, String nombreAve) {
		this.sexo = sexo;
		this.edad = edad;
		this.nombres = new DatosPersonales(nombreAve, nombreDueno);
		numAves++;
	}
	
	protected char getSexo() {
		return sexo;
	}

	protected void setSexo(char sexo) {
		this.sexo = sexo;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected DatosPersonales getNombres() {
		return this.nombres;
	}
	
	protected void quienSoy() {
		System.out.println("Sexo: " + sexo + ", Edad: " + edad);
	}
	
	protected static void getNumAves() {
		System.out.println("Número de aves creadas: " + numAves);
	}
	
	abstract void cantar();

}
