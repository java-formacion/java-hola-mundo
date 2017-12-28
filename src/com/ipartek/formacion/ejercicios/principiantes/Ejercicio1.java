package com.ipartek.formacion.ejercicios.principiantes;

/**
 * Escribe un programa Java que realice lo siguiente: declarar una variable N de
 * tipo int, una variable A de tipo double y una variable C de tipo char y
 * asigna a cada una un valor. A continuación muestra por pantalla: El valor de
 * cada variable. La suma de N + A La diferencia de A - N El valor numérico
 * correspondiente al carácter que contiene -nla variable C. Si por ejemplo le
 * hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, se debe
 * mostrar por pantalla:
 * 
 * @author ur00
 *
 */
public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		int n = 2;
		double a = 2.2;
		char c = 'a';
		
		System.out.println("Variable a: " + n);
		System.out.println("Variable b: " + a);
		System.out.println("Variable c: " + c);
		
		System.out.println("n+a: " + (n+a));
		System.out.println("a-n: " + (a-n));
		System.out.println("Valor numerico c: " + (int) c);

	}

}
