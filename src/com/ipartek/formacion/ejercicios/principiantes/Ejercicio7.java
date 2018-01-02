package com.ipartek.formacion.ejercicios.principiantes;

/**
 * 
 * Escribe un programa java que declare una variable C de tipo entero y asígnale
 * un valor. A continuación muestra un mensaje indicando si el valor de C es
 * positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo
 * de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo.
 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 *
 */

public class Ejercicio7 {

	public static void main(String[] args) {

		int c = 100;
		System.out.println("El valor introducido es:\n" + ((c >= 0) ? "\nPositivo" : "\nNegativo")
				+ ((c % 2 == 0) ? "\nPar" : "\nImpar") + ((c % 5 == 0) ? "\nEs" : "\nNo es") + " multiplo de 5"
				+ ((c % 10 == 0) ? "\nEs" : "\nNo es") + " multiplo de 10" + ((c < 100) ? "\nEs menor" : "\nEs mayor")
				+ " de 100");

	}

}
