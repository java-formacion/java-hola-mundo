package com.ipartek.formacion.ejercicios.EstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
 * @author mikel
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un numero de 5 cifras: ");
		Integer numero=sc.nextInt();
		System.out.println(numero/10000);
		System.out.println(numero/1000);
		System.out.println(numero/100);
		System.out.println(numero/10);
		System.out.println(numero);
		sc.close();

	}

}
