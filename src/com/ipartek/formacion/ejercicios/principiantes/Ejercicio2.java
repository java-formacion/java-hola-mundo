package com.ipartek.formacion.ejercicios.principiantes;

/**
 * Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, 
 * dos variables N y M de tipo double y asigna a cada una un valor.
 * A continuación muestra por pantalla:
 * El valor de cada variable.
 * La suma  X + Y
 * La diferencia  X – Y
 * El producto  X * Y
 * El cociente  X / Y
 * El resto  X % Y
 * La suma  N + M
 * La diferencia  N – M
 * El producto  N * M
 * El cociente  N / M
 * El resto  N % M
 * La suma X + N
 * El cociente Y / M
 * El resto Y % M
 * El doble de cada variable
 * La suma de todas las variables
 * El producto de todas las variables
 * @author java
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		int x = 5, y = 10;
		double n = 5.5, m = 2.25;
		
		System.out.println("X+Y: " + (x+y));
		System.out.println("X-Y: " + (x-y));
		System.out.println("X*Y: " + (x*y));
		System.out.println("X/Y: " + (x/y));
		System.out.println("X%Y: " + (x%y));
		System.out.println("N+M: " + (n+m));
		System.out.println("N-M: " + (n-m));
		System.out.println("N*M: " + (n*m));
		System.out.println("N/M: " + (n/m));
		System.out.println("N%M: " + (n%m));
		System.out.println("X+N: " + (x+n));
		System.out.println("Y/M: " + (y/m));
		System.out.println("Y%M: " + (y%m));
		System.out.println("Doble de X: " + (2*x));
		System.out.println("Doble de Y: " + (2*y));
		System.out.println("Doble de N: " + (2*n));
		System.out.println("Doble de M: " + (2*m));
		System.out.println("Suma de todas: " + (x+y+n+m));
		System.out.println("Producto de todas: " + (x*y*n*m));
		
	}

}
