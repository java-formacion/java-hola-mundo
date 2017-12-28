package com.ipartek.formacion.ejercicios.principiantes;

/**
 * Programa java que realice lo siguiente: declarar una variable N de tipo int,
 * una variable A de tipo double y una variable C de tipo char y asigna a cada
 * un un valor. A continuación muestra por pantalla: El valor de cada variable,
 * la suma de N + A, la diferencia de A - N, el valor numérico correspondiente
 * al carácter que contiene la variable C.
 * 
 * @author Eder
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		int n = 5;
		double a = 4.56;
		char c = 'a';

		System.out.println("La variable n tiene el valor: " + n);
		System.out.println("La variable a tiene el valor: " + a);
		System.out.println("La variable c tiene el caracter: " + c);

		System.out.println("La suma de n+a es: " + (n + a));
		System.out.println("La resta de a-n es: " + (a - n));
		System.out.println("El valor numerico del caracter " + c + " es: " + (int) c);

	}

}
