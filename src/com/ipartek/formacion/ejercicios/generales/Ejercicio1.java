package com.ipartek.formacion.ejercicios.generales;

/**
 * Intercambiar el contenido de dos variables
 * 
 * @author Eder
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int aux;
		System.out.println("Inicialmente la variable a tiene el valor " + a);
		System.out.println("Inicialmente la variable b tiene el valor " + b);
		System.out.println("---------------------------------------------");
		aux = a;
		a = 5;
		b = aux;
		System.out.println("Finalmente la variable a tiene el valor " + a);
		System.out.println("Finalmente la variable b tiene el valor " + b);
	}

}
