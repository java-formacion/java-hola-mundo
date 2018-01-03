package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

/**
 * 
 * Programa lea la longitud de los catetos de un triángulo rectángulo y calcule
 * la longitud de la hipotenusa según el teorema de Pitágoras.
 *
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor del primer cateto:");
		double cateto1 = sc.nextDouble();
		System.out.println("Introduce el valor del segundo cateto:");
		double cateto2 = sc.nextDouble();
		System.out.println("La longitud de la hipotenusa es de: "+(Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2, 2))));
		
	}

}
