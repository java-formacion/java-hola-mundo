package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

/**
 * 
 * Escribe un programa Java que lee un número entero por teclado y obtiene y
 * muestra por pantalla el doble y el triple de ese número.
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		int numero = sc.nextInt();
		System.out.println("El numero que has escrito es: " + numero);
		System.out.println("El doble de " + numero + " es: " + (numero * 2));
		System.out.println("El triple de " + numero + " es: " + (numero * 3));

	}

}
