package ejercicios.condicional;

import java.util.Scanner;

/**
 * Programa Java que lea un número entero por teclado y calcule si es par o
 * impar.
 * 
 * @author java
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Indica un número entero");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Ell número introducido es par");
		}
		else{
			System.out.println("El número es impar");
		}
	}

}
