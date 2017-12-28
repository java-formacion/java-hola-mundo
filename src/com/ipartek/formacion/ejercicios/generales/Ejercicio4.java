package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Mostrar la tabla de multiplicar de un número.
 * 
 * @author Eder
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int num = sc.nextInt();

		System.out.println("La tabla de multiplicar del " + num + " es:");
		for (int i = 0; i < 10; i++) {
			System.out.println(num * i);
		}

	}

}
