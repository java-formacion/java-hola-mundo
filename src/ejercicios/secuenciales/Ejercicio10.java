package ejercicios.secuenciales;

import java.util.*;

/**
 * Programa Java que lea un n�mero entero de 3 cifras y muestre por separado las cifras del n�mero.
 * @author java
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Escribe un n�mero de tres cifras");
		numero = sc.nextInt();
		System.out.println("La primera cifra de ese n�mero es :"+numero/100);
		System.out.println("La segunda cifra es "+(numero/10)%10);
		System.out.println("La tercera cifra es "+numero%10);

	}

}
