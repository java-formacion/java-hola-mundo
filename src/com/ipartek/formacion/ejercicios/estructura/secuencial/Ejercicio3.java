package com.ipartek.formacion.ejercicios.estructura.secuencial;

import java.util.Scanner;

/**
 * Escribe un programa Java que lee un n�mero entero por teclado y obtiene y muestra por pantalla 
 * el doble y el triple de ese n�mero.
 * @author java
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un n�mero entero:");
        numero = sc.nextInt();
        System.out.println("N�mero introducido: " + numero);
        System.out.println("Doble de " + numero + " -> "+ 2*numero);
        System.out.println("Triple de " + numero + " -> "+ 3*numero);

	}

}
