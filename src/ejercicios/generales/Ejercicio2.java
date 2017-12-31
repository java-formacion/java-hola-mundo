package ejercicios.generales;

import java.util.*;

/**
 * Programa Java que pide un número entero por teclado y calcula y muestra el
 * número de cifras que tiene.
 * 
 * @author eritzinho
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cifras;
		System.out.println("Mete un número");
		n =sc.nextInt();
		cifras=0;
		while(n!=0) {
			n=n/10;
			cifras++;
		}		
		System.out.println("Este número tiene "+cifras+" cifras");
	}

}
