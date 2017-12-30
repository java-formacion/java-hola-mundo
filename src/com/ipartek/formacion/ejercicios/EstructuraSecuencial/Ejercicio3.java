package com.ipartek.formacion.ejercicios.EstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
 * @author mikel
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		int numero;
		int doble;
		int triple;
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un numero:");
		numero=sc.nextInt();
		doble=numero*2;
		triple=numero*3;
		System.out.println("El numero es: "+numero+" el doble: "+doble+" y el triple: "+triple);
	}

}
