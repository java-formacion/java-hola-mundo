package com.ipartek.formacion.ejercicios.principiantes;

/**
 * Escribe un programa Java que realice lo siguiente: declarar una variable N de
 * tipo int, una variable A de tipo double y una variable C de tipo char y
 * asigna a cada una un valor. A continuación muestra por pantalla: El valor de
 * cada variable. La suma de N + A La diferencia de A - N El valor numérico
 * correspondiente al carácter que contiene la variable C. Si por ejemplo le
 * hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, se debe
 * mostrar por pantalla:
 * 
 * @author ur00
 *
 */
public class Ejercicio1 {
	
	static int diferencia(int operador1, double operador2) {
		return (int) (operador2-operador1);
	}

	static int suma(int operador1, double operador2) {
		
		return (int) (operador1+operador2);
	}

	public static void main(String[] args) {
		int n = 5;
		double a = 4.56;
		char c = ('a');
		
		suma(n,a);
		diferencia(n,a);
		
		System.out.println("el resultado de la variable 1 es:"+n);
		System.out.println("el resultado de la variable 2 es:"+a);
		System.out.println("el resultado de las variable 3 es:"+c);
		
		System.out.println("la suma es: "+(n+a));
		System.out.println("la diferencia es: "+ (a-n));
		
		
	}

}
