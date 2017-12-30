package com.ipartek.formacion.ejercicios.EstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
 * @author mikel
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		double l1,l2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe el cateto de un triangulo rectangulo:");
		l1=sc.nextDouble();
		System.out.println("Escribe el  otro cateto de un triangulo rectangulo:");
		l2=sc.nextInt();
		sc.close();
		System.out.println("El area del triangulo es: "+(l1*l2)/2);

	}

}
