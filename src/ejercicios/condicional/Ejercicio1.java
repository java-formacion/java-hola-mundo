package ejercicios.condicional;

import java.util.Scanner;

/**
 * Programa Java que lea un n�mero entero por teclado y calcule si es par o
 * impar.
 * 
 * @author java
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Indica un n�mero entero");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Ell n�mero introducido es par");
		}
		else{
			System.out.println("El n�mero es impar");
		}
	}

}
