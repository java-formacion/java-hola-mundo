package ejerciciosEstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa Java que lea dos n�meros enteros por teclado y los muestre por pantalla2
 
 *
 */
public class ej1 {

	public static void main(String[] args) {
		int a;
		int b;
		System.out.println("introduce un n�mero");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();	
		System.out.println("introduce un n�mero");
		b=sc.nextInt();	
		System.out.println("n�meros introducidos = "+ a + "  y  "+b);

	}

}
