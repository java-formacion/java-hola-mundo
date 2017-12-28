package ejerciciosEstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
F = 32 + ( 9 * C / 5)
 *
 */
public class ej4 {

	public static void main(String[] args) {
		float centrigrados;
		float fahrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce temperatura en grados centigrados, los decimales con coma");
		centrigrados = sc.nextFloat();
		fahrenheit= 32 + (9*centrigrados/5);
		System.out.println(centrigrados+" grados centigrados son "+ fahrenheit + " grados fahrenheit");

	}

}
