package ejercicios.secuenciales;

import java.util.*;

/**
 * Programa Java que lea un n�mero entero N de 5 cifras y muestre sus cifras
 * igual que en el ejemplo.
 * 
 * @author java
 *
 */

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Escribe un n�mero de 5 cifras");
		n= sc.nextInt();
		System.out.println("La �ltima cifra es "+n%10);
		System.out.println("Las dos �ltimas cifras son "+n%100);
		System.out.println("Las tres �ltimas cifras son "+n%1000);
		System.out.println("Las cuatro �ltimas cifras son "+n%10000);
		System.out.println("El n�mero completo es "+n);
	}

}
