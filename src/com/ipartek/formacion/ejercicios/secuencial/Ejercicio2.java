package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

/**
 * 
 * Programa Java que lea un nombre y muestre por pantalla: “Buenos dias
 * nombre_introducido”
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Buenos dias " + nombre);

	}

}
