package ejerciciosEstructuraSecuencial;

import java.util.Scanner;

/**
 * Escribe un programa Java que lee un n�mero entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese n�mero.

 *
 */
public class ej3 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("intoduce un n�mero");
		a=sc.nextInt();
		System.out.println(" el doble de "+a+" es "+ a*2 + " y el triple es " +a*3);
	}

}
