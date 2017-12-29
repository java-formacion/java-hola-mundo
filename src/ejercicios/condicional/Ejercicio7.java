package ejercicios.condicional;

import java.util.Scanner;

/**
 * Programa que lea dos números por teclado y muestre el resultado de la
 * división del primer número por el segundo. Se debe comprobar que el divisor
 * no puede ser cero.
 * 
 * @author eritzinho
 *
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduce un número");
		n1 = sc.nextInt();
		System.out.println("Introduce otro número");
		n2 = sc.nextInt();
		if (n2 == 0) {
			System.out.println("Error!");
		} else {
			System.out.println(n1 / n2);
		}

	}

}
