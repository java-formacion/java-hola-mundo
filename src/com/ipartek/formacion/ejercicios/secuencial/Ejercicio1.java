package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

/**
 * 
 * Programa Java que lea dos números enteros por teclado y los muestre por
 * pantalla.
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("Inserta el numero 1: "); 
		int numero1 = sc.nextInt();
		System.out.printf("Inserta el numero 2: ");
		int numero2 = sc.nextInt();
		System.out.println("El numero 1 es: " + numero1);
		System.out.println("El numero 2 es: " + numero2);

	}

}
