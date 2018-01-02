/**
 * 
 */
package com.ipartek.formacion.ejercicios.principiantes;

/**
 * Escribe un programa Java que declare una variable entera N y asígnale un
 * valor. A continuación escribe las instrucciones que realicen los siguientes:
 * Incrementar N en 77. Decrementarla en 3. Duplicar su valor.
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		int n = 80;
		System.out.println("N es " + n);
		System.out.println("N + 77 = " + (n = (n + 77)));
		System.out.println("N - 3 = " + (n = (n - 3)));
		System.out.println("N x 2 = " + (n = (n * 2)));
	}

}
