package com.ipartek.formacion.ejercicios.estructurasecuencial;

import java.util.*;

/**
 * Programa Java que lea dos n�meros enteros por teclado y los muestre por pantalla.
 * @author java
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero por teclado: ");
		n1 = sc.nextInt();
		
		System.out.println("Introduce otro n�mero por teclado: ");
		n2 = sc.nextInt();
		
		System.out.println("Has introducido los n�meros: " + n1 + " y " + n2);
		
		sc.close();
		
	}

}
