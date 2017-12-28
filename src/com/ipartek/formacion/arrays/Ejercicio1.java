package com.ipartek.formacion.arrays;

import java.util.Scanner;

/**
 * Calcular la media de una serie de números que se leen por teclado.
 * 
 * @author Eder
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		int[] numeros = new int[2];
		int total = 0;
		int cont = 0;

		for (int i = 0; i < numeros.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un numero: ");
			int num = sc.nextInt();
			numeros[i] = num;
		}

		for (int i = 0; i < numeros.length; i++) {
			total = total + numeros[i];
			cont++;
		}

		System.out.println("La variable total tien el valor: " + total);
		System.out.println("La variable cont tien el valor: " + cont);
		System.out.println("La media de los numeros introducidos es: " + (total / cont));

	}

}
