package com.ipartek.formacion.variables;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Alumnos {
	
	static String[] aAlumnos = {
			"Eder", 
			"Janai",
			"Ander", 
			"Edu", 
			"Borja", 
			"Mikel", 
			"Judith", 
			"Arian", 
			"Paul", 
			"Pavel", 
			"Ivan", 
			"Jagoba", 
			"Eritz"
			};
	
	static int[] aNumeros = {3,0,1,8,7,2,5,4,6,9};
	
	/**
	 * Muestra por consola todo el listado de alumnos
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
	 * indica el numero de alumnos en clase
	 * @return int con el numero de alumnos
	 */
	static int numeroAlumnos() {
		return aAlumnos.length;
		
	}
	
	static void mostrar() {
		
		System.out.println( "Array desordenado");
		
		for (int i = 0; i < aNumeros.length; i++) {
			System.out.println( aNumeros[i]);
		}
	}
	
	static void ordenar() {
		System.out.println( "Array ordenado");
		
		Arrays.sort(aNumeros);
		
		for (int i = 0; i < aNumeros.length; i++) {
			System.out.println( aNumeros[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Numero de alumnos = " + numeroAlumnos());
		System.out.println("---------------------------------");
		listar();
		System.out.println("---------------------------------");
		listarVisionAlumno();
		System.out.println("---------------------------------");
		listarVisionProfesor();
		System.out.println("---------------------------------");
		mostrar();
		System.out.println("---------------------------------");
		ordenar();
	}
}


