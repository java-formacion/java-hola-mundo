package ejercicios.condicional;

import java.util.Scanner;

/**
 * Programa que lea un car�cter por teclado y compruebe si es una letra
 * may�scula
 * 
 * @author eritzinho
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letra;
		System.out.println("introduce una letra");
		letra = sc.next().charAt(0);
		if(Character.isUpperCase(letra)) {
			System.out.println("Introduciste una letra may�scula");
		}
		else {
			System.out.println("La letra es min�scula");
		}

	}

}
