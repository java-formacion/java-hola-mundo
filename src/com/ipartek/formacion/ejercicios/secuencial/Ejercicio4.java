package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

/**
 * 
 * Programa que lea una cantidad de grados centígrados y la pase a grados
 * Fahrenheit. La fórmula correspondiente para pasar de grados centígrados a
 * fahrenheit es: F = 32 + ( 9 * C / 5)
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {

		float celsius = 0;
		float faren = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta la temperatura en ºC: ");
		celsius = sc.nextFloat();
		System.out.println("La temperatura de " + celsius + "ºC es de: " + (faren = 32 + (9 * celsius / 5)) + "ºF");

	}

}
