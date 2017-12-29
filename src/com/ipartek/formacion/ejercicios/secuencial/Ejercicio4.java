package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

/**
 * 
 * Programa que lea una cantidad de grados cent�grados y la pase a grados
 * Fahrenheit. La f�rmula correspondiente para pasar de grados cent�grados a
 * fahrenheit es: F = 32 + ( 9 * C / 5)
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {

		float celsius = 0;
		float faren = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta la temperatura en �C: ");
		celsius = sc.nextFloat();
		System.out.println("La temperatura de " + celsius + "�C es de: " + (faren = 32 + (9 * celsius / 5)) + "�F");

	}

}
