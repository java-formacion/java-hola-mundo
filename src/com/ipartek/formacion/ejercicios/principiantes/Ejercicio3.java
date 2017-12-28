package com.ipartek.formacion.ejercicios.principiantes;

/**
 * Programa Java que declare una variable entera N y asígnale un valor. 
 * A continuación escribe las instrucciones que realicen lo siguiente: 
 * Incrementar N en 77, Decrementarla en 3, Duplicar su valor. 
 * @author java
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		int n = 2;
		
		System.out.println("El valor inicial de N es " + n);
		n+=77;
		System.out.println("n + 77 = " + n);
		n-=3;
		System.out.println("n - 3 = " + n);
		n*=2;
		System.out.println("n * 2 = " + n);

	}

}
