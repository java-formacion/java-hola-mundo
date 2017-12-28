package ejercicios.secuenciales;

import java.util.*;

/**
 * Programa Java que lea un número entero de 3 cifras y muestre por separado las cifras del número.
 * @author java
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Escribe un número de tres cifras");
		numero = sc.nextInt();
		System.out.println("La primera cifra de ese número es :"+numero/100);
		System.out.println("La segunda cifra es "+(numero/10)%10);
		System.out.println("La tercera cifra es "+numero%10);

	}

}
