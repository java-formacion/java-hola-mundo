package com.ipartek.formacion.helloworld;

import java.util.Scanner;

/**
 * Pedirle al usuario nombre, apellido e idioma.
 */

public class Saludo {

	public static void main(String[] args) {

		int num = 0;
		
		Scanner sc;

		sc = new Scanner(System.in);
		
		System.out.println("Dime tu Nombre, por favor:");

		String nombre = sc.nextLine();

		System.out.println("Dime tu Apellido:");
		
		String apellido = sc.nextLine();
		
		System.out.println("Selecciona el Idioma:");
		System.out.println("________________________");
		System.out.println("|	1 - Castellano	|");
		System.out.println("|	2 - Euskera	|");
		System.out.println("|	3 - Catalan	|");
		System.out.println("|	4 - Galego	|");
		System.out.println("|_______________________|");
		System.out.println("");
		
		num = sc.nextInt();
		
		switch (num) {
		
		case 1:
			
			System.out.println("Idioma: Castellano");
			
			break;
		case 2:
			
			System.out.println("Idioma: Euskera");
			
			break;
		case 3:
			
			System.out.println("Idioma: Catalan");
			
			break;
		case 4:
			
			System.out.println("Idioma: Gallego");
			
			break;
			
		default:
			break;
		}
		// Mostrar por la consola
		System.out.println("Nombre: " + nombre + " " + apellido);

		sc.close();
	}
}