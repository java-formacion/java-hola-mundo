package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

/**
 * 
 * Programa que lea un número entero N de 5 cifras y muestre sus cifras igual
 * que en el ejemplo. Por ejemplo para un número N = 12345 La salida debe ser: 1
 * 12 123 1234 12345
 *
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero=0;
		System.out.println("Inserta un numero de 5 digitos:");
		numero=sc.nextInt();
		while ((numero>99999) ||(numero<10000)) {
			System.out.println("Prueba a insertarlo otra vez:");
			numero=sc.nextInt();
		}
		System.out.println(numero/10000);
		System.out.println(numero/1000);
		System.out.println(numero/100);
		System.out.println(numero/10);
		System.out.println(numero);

	}

}
