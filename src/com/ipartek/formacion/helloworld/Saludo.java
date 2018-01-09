package com.ipartek.formacion.helloworld;

import java.util.Scanner;

/**
 * Clase para realizar por primeros ejercicos
 *
 * @author Ander Uraga Real
 * @version 1.0
 *
 */
public class Saludo {

	public static void main(String[] args) {

		/*
		 * Esto es un comentario de bloque Puede contener mas de una linea
		 *
		 */

		Scanner sc = new Scanner(System.in);

		pintarMenu();

		float notaExamen = 7.8f;
		float notaExamen2 = (float) 7.8;

		System.out.println("Selecciona el Idioma: ");
		int opcionMenu = sc.nextInt();

		System.out.println("Dime tu nombre, por favor:");

		sc = new Scanner(System.in);
		String nombre = sc.nextLine();

		System.out.println("Dime tu Apellido:");
		sc = new Scanner(System.in);
		String apellido = sc.nextLine();

		// Mostrar por la consola
		System.out.println("Idioma " + opcionMenu + " " + nombre + " " + apellido);
		
		sc.close();

	}

	private static void pintarMenu() {

		System.out.println("---------------------------");
		System.out.println("0 - Castellano");
		System.out.println("1 - Euskera");
		System.out.println("2 - Catalan");
		System.out.println("3 - Galego");
		System.out.println("---------------------------");
		System.out.println("");

	}

}
