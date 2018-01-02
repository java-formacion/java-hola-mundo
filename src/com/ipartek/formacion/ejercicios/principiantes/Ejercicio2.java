package com.ipartek.formacion.ejercicios.principiantes;

/**
 * Escribe un programa Java que realice lo siguiente: declarar dos variables X e
 * Y de tipo int, dos variables N y M de tipo double y asigna a cada una un
 * valor. A continuación muestra por pantalla: El valor de cada variable. La
 * suma X + Y La diferencia X – Y El producto X * Y El cociente X / Y El resto X
 * % Y La suma N + M La diferencia N – M El producto N * M El cociente N / M El
 * resto N % M La suma X + N El cociente Y / M El resto Y % M El doble de cada
 * variable La suma de todas las variables El producto de todas las variables
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		int x = 1;
		int y = 2;
		double n = 3;
		double m = 4;
		System.out.println("El valor de X es: " + x);
		System.out.println("El valor de Y es: " + y);
		System.out.println("El valor de N es: " + n);
		System.out.println("El valor de M es: " + m);
		System.out.println("La suma de X + Y es: " + (x + y));
		System.out.println("La resta de X - Y es: " + (x - y));
		System.out.println("El producto de X x Y es: " + (x * y));
		System.out.println("El cociente de X / Y es: " + (x / y));
		System.out.println("El resto de X % Y es: " + (x % y));
		System.out.println("La suma de N + M es: " + (n + m));
		System.out.println("La resta de N - M es: " + (n - m));
		System.out.println("El producto de N x M es: " + (n * m));
		System.out.println("El cociente de N / M es: " + (n / m));
		System.out.println("El resto de N % M es: " + (n % m));
		System.out.println("La suma de X + N es: "+(x+n));
		System.out.println("El cociente de Y / M es: "+(y/m));
		System.out.println("El resto de Y % M es: "+(y%m));
		System.out.println("El doble de X es: "+(2*x)+"\nEl doble de Y es: "+(2*y)+"\nEl doble de M es: "+(2*m)+"\nEl doble de N es: "+(2*n));
		System.out.println("La suma de todas las variables es: "+(x+y+n+m));
		System.out.println("El producto de todas las variables es: "+(x*y*n*m));
		//La suma de todas las variables El producto de todas las variables
		
	}

}
