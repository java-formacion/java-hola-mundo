package com.ipartek.formacion.ejercicios.estructura.secuencial;

import java.util.Scanner;

/**
 * Programa Java que lea un n�mero entero de 3 cifras y muestre por separado las cifras del n�mero.
 * @author java
 *
 */

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduzca valor de N: ");
        n = sc.nextInt(); //supondremos que el n�mero introducido tiene 3 cifras
        System.out.println("Primera cifra de " + n + " -> " + (n/100)); 
        System.out.println("Cifra central de " + n + " -> " + (n/10)%10);
        System.out.println("�ltima cifra  de " + n + " -> " + (n%10));

	}

}
