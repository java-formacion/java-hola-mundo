package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

/**
 * 
 * Programa Java que lea un número entero de 3 cifras y muestre por separado las
 * cifras del número.
 * 
 * Recuerda que la división entre enteros da como resultado la parte entera de
 * la división (sin decimales). Si por ejemplo N = 123 la operación N/10 da como
 * resultado 12 y no 12.3 Recuerda que el operador % obtiene el resto de la
 * división.
 *
 */

public class Ejercicio10 {

	public static void main(String[] args) {

		int numero = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entero de 3 cifras:");
		numero=sc.nextInt();
		while (numero < 100 || numero > 999) {
			System.out.println("Vuelve a intentarlo. De 3 cifras:");
			numero=sc.nextInt();
		}
		System.out.println("La primera cifra de " + numero + " es: " + numero / 100);
		System.out.println("La segunda cifra de "+numero+ " es: "+(numero/10)%10);
		System.out.println("La tercera cifra de "+numero+" es: "+(numero%100)%10);
	}

}
