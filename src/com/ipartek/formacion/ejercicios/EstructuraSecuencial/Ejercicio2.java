package com.ipartek.formacion.ejercicios.EstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
 * @author mikel
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		String nombre;
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe un nombre:");
		nombre=sc.nextLine();
		System.out.println("Buenos dias "+nombre);
	}

}
