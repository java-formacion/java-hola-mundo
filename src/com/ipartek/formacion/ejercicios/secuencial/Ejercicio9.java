package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

/**
 * 
 * Programa Java que calcule el área de un triángulo en función de las
 * longitudes de sus lados (a, b, c), según la siguiente fórmula: Area =
 * RaizCuadrada(p*(p-a)*(p-b)*(p-c)) donde p = (a+b+c)/2 Para calcular la raíz
 * cuadrada se utiliza el método Math.sqrt()
 *
 */

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, c = 0;

		System.out.println("Inserta la longitud de a:");
		a = sc.nextDouble();

		System.out.println("Inserta la longitud de b:");
		b = sc.nextDouble();

		System.out.println("Inserta la longitud de c:");
		c = sc.nextDouble();

		double p = ((a + b + c) / 2);
		
		System.out.println("El area del triangulo es: "+(Math.sqrt(p*(p-a)*(p-b)*(p-c))));

	}

}
