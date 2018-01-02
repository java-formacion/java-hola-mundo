package com.ipartek.formacion.ejercicios.Capitulo3.Practica1.Ejercicio2;

public class Ave {

	private char sexo;
	private int edad;
	private static int avesCreadas = 0;

	public Ave(char sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
		avesCreadas++;
	}
	

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static int getAvesCreadas() {
		return avesCreadas;
	}

	public static void setAvesCreadas(int avesCreadas) {
		Ave.avesCreadas = avesCreadas;
	}

	public void QuienSoy(Piolin p) {
		System.out.println("Sexo: " + p.getSexo() + " edad: " + p.getEdad());
	}

	public void QuienSoy(Loro l) {
		System.out.println("Sexo: " + l.getSexo() + " edad: " + l.getEdad());

	}

	public static void numAves() {
		System.out.println("Numero de aves creadas: " + avesCreadas);
	}

}
