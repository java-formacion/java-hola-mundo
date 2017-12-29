package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;
import java.math.PI;
import java.math.pow;

/**
 * 
 * Programa que lee por teclado el valor del radio de una circunferencia y
 * calcula y muestra por pantalla la longitud y el área de la circunferencia.
 * 
 * Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia =
 * PI*Radio^2
 *
 */

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double radio = 0;
		double longitud = 0;
		double area = 0;
		System.out.println("Inserta al radio para obtener la longitud: ");
		radio = sc.nextFloat();
		longitud = (2 * Math.PI * radio);
		area = (Math.PI * Math.pow(radio, 2));
		System.out.println("La longitud de la circunferencia es de: " + longitud);
		System.out.println("El area de la circunferencia es de: " + area);
	}

}
