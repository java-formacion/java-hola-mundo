package ejercicios.condicional;

import java.util.*;

/**
 * Programa que lea dos caracteres y compruebe si son iguales.
 * 
 * @author eritzinho
 *
 */

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c1, c2;
		System.out.println("Introduzca el primer caracter");
		c1 = sc.next().charAt(0);
		System.out.println("Introduzca el segundo caracter");
		c2 = sc.next().charAt(0);;
		if (c1 == c2) {
			System.out.println("Los caracteres son iguales");
		} else {
			System.out.println("Los caracteres son diferentes");
		}
	}
}
