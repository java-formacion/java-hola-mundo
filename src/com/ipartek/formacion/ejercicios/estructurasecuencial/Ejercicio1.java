package com.ipartek.formacion.ejercicios.estructurasecuencial;

import java.util.*;

/**
 * Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
 * @author java
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número por teclado: ");
		n1 = sc.nextInt();
		
		System.out.println("Introduce otro número por teclado: ");
		n2 = sc.nextInt();
		
		System.out.println("Has introducido los números: " + n1 + " y " + n2);
		
		sc.close();
		
	}

}
