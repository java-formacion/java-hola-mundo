package com.ipartek.formacion.capitulo2;

public class Alumnos {

	static String[] aAlumnos = { "Eder", "Janai", "Ander", "Edu", "Borja", "Mikel Larru", "Judit", "X", "Adrian",
			"Paul", "Pavel", "Ivan", "X", "Mikel Parra", "Jagoba", "Eritz" };

	/*
	 * Muestra por consola todos los Alumn@s con su posicion
	 * 
	 * Ej:
	 * 
	 * 0 - Pepe <br> 1 - Manolo <br> ...
	 */
	static void listar() {

		for (int i = 0; i < aAlumnos.length; i++) {
			System.out.println(i + " " + "-" + " " + aAlumnos[i]);
		}

	}

	static void listarVisionAlumno() {

		for (int i = 0; i < aAlumnos.length; i++) {

			System.out.print(aAlumnos[i] + ",    ");

			// saltar linea cada 4 alumnos
			if ((i + 1) % 4 == 0) {
				System.out.println("");
			}

		}
	}

	static void listarVisionProfesor() {

		for (int i = (aAlumnos.length - 1); i >= 0; i--) {

			System.out.print(aAlumnos[i] + ",    ");

			// saltar linea cada 4 alumnos
			if (i % 4 == 0) {
				System.out.println("");
			}

		}
	}

	/*
	 * Muesta el nombre del alumn@ que se presenta voluntario para leer
	 * 
	 * @return String nombre del alumno
	 */
	static String voluntario() {

		int numAleatorio = (int) (Math.random() * aAlumnos.length);

		return aAlumnos[numAleatorio];
	}

	/*
	 * Indica el numero de alimnosen clase
	 * 
	 * @return int con el numero de alumn@s
	 */
	static int numeroAlumnos() {

		return aAlumnos.length - 1;
	}

	public static void main(String[] args) {

		System.out.println("El voluntario es = " + voluntario());
		System.out.println("-------------------------------------------");

		System.out.println("Numero de Alumnos = " + numeroAlumnos());
		System.out.println("-------------------------------------------");
		listar();
		System.out.println("-------------------------------------------");
		listarVisionAlumno();
		System.out.println("-------------------------------------------");
		listarVisionProfesor();
	}

}
