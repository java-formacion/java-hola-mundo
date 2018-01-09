package com.ipartek.formacion.ejercicios.paraprincipiantes;

/*
 * Escribe un programa java que declare una variable B de tipo entero
 * y asígnale un valor. A continuación muestra un mensaje indicando 
 * si el valor de B es positivo o negativo. Consideraremos el 0 como 
 * positivo. Utiliza el operador condicional ( ? : ) dentro del println 
 * para resolverlo.
 * 
 */
public class Ejercicio_006 {
	
	public static void main(String[] args) {
		
		int b = -5;
		System.out.println(b + (b >= 0 ? " es positivo " : " es negativo "));
	}

}
