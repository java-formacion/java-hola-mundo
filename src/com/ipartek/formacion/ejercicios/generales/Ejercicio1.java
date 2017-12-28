package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Intercambiar el contenido de dos variables
 * @author java
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, aux;
		System.out.print("Introduzca valor de A: ");
        a = sc.nextInt();
        System.out.print("Introduzca Valor de B: ");
        b = sc.nextInt();
        
        System.out.println("Valores iniciales: A = " + a + "   B = " + b);
        
        aux = a;
        a = b;
        b = aux;
        
        System.out.println("Valores intercambiados: A = " + a + "   B = " + b);
		

	}

}
