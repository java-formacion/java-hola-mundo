package ejerciciosEstructuraSecuencial;

import java.util.Scanner;

/**
 *  Programa lea la longitud de los catetos de un tri�ngulo rect�ngulo y 
 *  calcule la longitud de la hipotenusa seg�n el teorema de Pit�goras.
 * 
 *
 */
public class ej7 {

	public static void main(String[] args) {
		double c1, c2;
		Scanner sc= new Scanner(System.in);
		System.out.println("introduce valor del primer cateto");
		c1= sc.nextDouble();
		System.out.println("introduce valor del segundo cateto");
		c2= sc.nextDouble();
		System.out.println("la hipotenusa es igual a:" + Math.sqrt(Math.pow(c1, 2)+Math.pow(c2, 2)));

	}

}
