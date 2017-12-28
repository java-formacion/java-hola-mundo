package ejerciciosEstructuraSecuencial;

import java.util.Scanner;

/**
 * Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.

 *
 */
public class ej3 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("intoduce un número");
		a=sc.nextInt();
		System.out.println(" el doble de "+a+" es "+ a*2 + " y el triple es " +a*3);
	}

}
