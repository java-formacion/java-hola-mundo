package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

/**
 * 
 * Programa Java que lea un número entero N de 5 cifras y muestre sus cifras
 * igual que en el ejemplo. Por ejemplo para un número N = 12345 La salida debe
 * ser:
 * 
 * 5 45 345 2345 12345
 *
 */

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero = 0;
		
		System.out.println("Introduce un numero de 5 cifras");
		numero= sc.nextInt();
		
		while (numero<10000 || numero>99999) {
			System.out.println("Vuelve a intentar introducir un numero de 5 cifras");
			numero=sc.nextInt();
		}
		System.out.println(numero%10);
		System.out.printf("%2d%n",numero%100);//con %xd%n se muestra la cantidad de digitos indicados de un numero
		System.out.printf("%3d%n",numero%1000);
		System.out.printf("%4d%n",numero%10000);
		System.out.printf("%5d%n",numero);

	}

}
