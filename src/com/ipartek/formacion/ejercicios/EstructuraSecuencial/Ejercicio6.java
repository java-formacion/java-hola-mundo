package com.ipartek.formacion.ejercicios.EstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
 * @author mikel
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		double km;
		double m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la velocidad en km/h:");
		km=sc.nextDouble();
		m=km*1000;
		System.out.println("La velocidad en metros es: "+m+"m/s");

	}

}
