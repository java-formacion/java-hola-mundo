package com.ipartek.formacion.ejercicios.paraprincipiantes;

/*
 * Escribe un programa java que declare una variable A de tipo entero 
 * y as�gnale un valor. A continuaci�n muestra un mensaje indicando si
 * A es par o impar. Utiliza el operador condicional ( ? : ) dentro del
 * println para resolverlo.
 * 
 */
public class Ejercicio_005 {

	public static void main(String[] args) {
		
        int a = 4;
        System.out.println(a + (a%2==0 ? " es par " : " es impar "));
        
	}
}
