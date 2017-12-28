package com.ipartek.formacion.ejercicios.estructuraSecuencial;

import java.util.Scanner;

/**
 * Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
 * @author Eder
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		System.out.println("Dime tu Nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Buenos días " + nombre);

	}

}
