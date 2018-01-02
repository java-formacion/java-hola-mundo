package com.ipartek.formacion.ejercicios.principiantes;

/**
 * 
 * Escribe un programa Java que realice lo siguiente: declarar una variable N de
 * tipo int, una variable A de tipo double y una variable C de tipo char y
 * asigna a cada una un valor. A continuación muestra por pantalla: El valor de
 * cada variable. La suma de N + A La diferencia de A - N El valor numérico
 * correspondiente al carácter que contiene la variable C.
 *
 */
public class Ejercicio1 {
	
	public static void main(String[] args) {
	int n=3;
	double a=5.6;
	char c='Z';
	System.out.println("El valor de N es: "+n);
	System.out.println("El valor de A es: "+a);
	System.out.println("El valor de C es: "+c);
	System.out.println("La suma de N + A es: "+(n+a));
	System.out.println("La resta de A-N es: "+(a-n));
	System.out.println("El valor numerico correspondiente a "+c+" es: "+(int)c);
	}
}
