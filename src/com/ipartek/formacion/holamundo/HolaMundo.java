package com.ipartek.formacion.holamundo;

import java.util.Scanner;

/**
 * Clase para realizar los priemeros ejercicios
 * 
 * @author Eder
 * @version 1.0
 *
 */
public class HolaMundo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		pintarMenu();

		System.out.println("Selecciona el Idioma:");
		int opcionMenu = sc.nextInt();

		System.out.println("Dime tu Nombre: ");
		sc = new Scanner(System.in);
		String nombre = sc.nextLine();

		System.out.println("Dime tu Apellido: ");
		sc = new Scanner(System.in);
		String apellido = sc.nextLine();

		// Mostrar por la consola
		System.out.println("Idioma " + opcionMenu + nombre + " " + apellido);

		System.out.println("Tu nomnre es \"Ander\" ");
	}

	private static void pintarMenu() {

		System.out.println("-------------------------");
		System.out.println("0 - Castellano");
		System.out.println("1 - Euskera");
		System.out.println("2 - Galego");
		System.out.println("3 - Catalán");
		System.out.println("-------------------------");
		System.out.println("");

	}

}
