package ejerciciosEstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa Java que lea dos números enteros por teclado y los muestre por pantalla2
 
 *
 */
public class ej1 {

	public static void main(String[] args) {
		int a;
		int b;
		System.out.println("introduce un número");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();	
		System.out.println("introduce un número");
		b=sc.nextInt();	
		System.out.println("números introducidos = "+ a + "  y  "+b);

	}

}
