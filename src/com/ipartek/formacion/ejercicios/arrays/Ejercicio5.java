package com.ipartek.formacion.ejercicios.arrays;

import java.util.Scanner;

/**
 * Contar el número de elementos positivos, negativos y ceros en un array de 10
 * enteros.
 * 
 * @author Eder
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		int[] numeros = new int[10];
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;

		for (int i = 0; i < numeros.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un numero: ");
			int num = sc.nextInt();
			numeros[i] = num;
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				negativos++;
			} else if (numeros[i] > 0) {
				positivos++;
			} else {
				ceros++;
			}
		}

		System.out.println("El total de numeros positivos es: " + positivos);
		System.out.println("El total de numeros negativos es: " + negativos);
		System.out.println("El total de ceros es: " + ceros);

	}

}
