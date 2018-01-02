package com.ipartek.formacion.ejercicios.principiantes;

/**
 * 
 * Programa java que declare cuatro variables enteras A, B, C y D y asígnale un
 * valor a cada una. A continuación realiza las instrucciones necesarias para
 * que: B tome el valor de C C tome el valor de A A tome el valor de D D tome el
 * valor de B
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int aux = 0;

		System.out.println("El valor de A es: " + a + "\nEl valor de B es: " + b + "\nEl valor de C es: " + c
				+ "\nEl valor de D es: " + d);
		aux = b;
		b = c;
		c = a;
		a = d;
		d = aux;
		System.out.println("\n\nDespues del cambio:\nEl valor de A es: " + a + "\nEl valor de B es: " + b
				+ "\nEl valor de C es: " + c + "\nEl valor de D es: " + d);

	}

}
