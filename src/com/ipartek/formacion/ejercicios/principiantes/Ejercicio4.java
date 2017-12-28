package com.ipartek.formacion.ejercicios.principiantes;

/**
 * Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor acada una. 
 * A continuación realiza las instrucciones necesarias para que: 
 * B tome el valor de C, 
 * C tome el valor de A, 
 * A tome el valor de D, 
 * D tome el valor de B.
 * @author java
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		int a=1, b=2, c=4, d=5, aux;
		
		System.out.println("Valores iniciales: ");
		System.out.println("Variable a = " + a);
		System.out.println("Variable b = " + b);
		System.out.println("Variable c = " + c);
		System.out.println("Variable d = " + d);
		
		aux = b;
		b = c;
		c = a;
		a = d;
		d = aux;
		
		
		
		System.out.println("Variable b toma valor de c -> b = " + b);
		System.out.println("Variable c toma valor de a -> c = " + c);
		System.out.println("Variable a toma valor de d -> a = " + a);
		System.out.println("Variable d toma valor de b -> d = " + d);

	}

}
