package ejercicios.secuenciales;

import java.util.*;

/**
 * Programa que lea un número entero N de 5 cifras y muestre sus cifras igual
 * que en el ejemplo.
 * 
 * @author java
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Introduce un número de 5 cifras");
		n=sc.nextInt();
		System.out.println("La primera cifra es "+n/10000);
		System.out.println("Las dos primeras cifras son "+n/1000);
		System.out.println("Las dos primeras cifras son "+n/100);
		System.out.println("Las dos primeras cifras son "+n/10);
		System.out.println("El número completo es "+n);
	}

}
