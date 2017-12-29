package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

/**
 * 
 * Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
 * teclado.
 *
 */

public class Ejercicio6 {

	public static void main(String[] args) {

		double kmh = 0;
		double ms = 0;
		System.out.println("Introduce la velocidad en Km/h: ");
		Scanner sc = new Scanner(System.in);
		kmh = sc.nextDouble();
		ms = kmh * 1000 / 3600;
		System.out.println("La velocidad " + kmh + "Km/h es " + ms + "m/s");

	}

}
