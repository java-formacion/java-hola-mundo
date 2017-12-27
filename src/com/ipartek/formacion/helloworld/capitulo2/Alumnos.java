package com.ipartek.formacion.helloworld.capitulo2;

public class Alumnos {

	static String[] aAlumnos = { "Eder", "Janai", "Ander", "Edu",
			                    "Borja", "Mikel", "Judit", "",
			                    "Adrian", "Paul", "Pavel","Ivan",
			                    "", "Jagoba", "Eritz" };

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

	}

	static void listarVisionProfesor() {

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

		System.out.println("Numero de Alumnos = " + numeroAlumnos());
		System.out.println("-------------------------------------------");
		listar();

	}

}
