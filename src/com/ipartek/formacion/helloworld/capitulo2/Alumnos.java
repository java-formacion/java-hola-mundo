package com.ipartek.formacion.helloworld.capitulo2;

public class Alumnos {

	static String[] aAlumnos = { "Eder", "Janai", "Ander", "Edu", "Borja", "Mikel Larru", "Judit", "", "Adrian", "Paul",
			"Pavel", "Ivan", "", "Mikel Parra", "Jagoba", "Eritz" };

	/**
	 * Muestra por consola todos los Alumn@s con su poscion. ej:
	 *
	 * 0 - Pepe <br>
	 * 1 - Manolo <br>
	 * .... <br>
	 * etc <br>
	 */
	static void listar() {

		for (int i = 0; i < aAlumnos.length; i++) {
			System.out.println(aAlumnos[i]);
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

	/**
	 * Muestra el nombre del alumn@ que se presenta volunatario para comenzar a leer
	 * teoria
	 *
	 * @return String nombre del alumn@
	 */
	static String voluntarioLeer() {
		int numAleatorio = (int) (Math.random() * aAlumnos.length);
		return aAlumnos[numAleatorio];
	}

	/**
	 * indica el numero de alumnos en clase
	 *
	 * @return int con el numero de alumn@s
	 */
	static int numeroAlumnos() {
		return aAlumnos.length;
	}

	public static void main(String[] args) {

		// System.out.println("volunatio es: " + voluntarioLeer());

		// listarVisionProfesor();

		listarVisionAlumno();

		/*
		 * System.out.println("Numero de Alumnos = " + numeroAlumnos());
		 * System.out.println("-------------------------------------------"); listar();
		 */
	}

}
