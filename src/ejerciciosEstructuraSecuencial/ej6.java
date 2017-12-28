package ejerciciosEstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
 * @author java
 *
 */
public class ej6 {

	public static void main(String[] args) {
		double v;
		Scanner sc = new Scanner(System.in);
		System.out.println("por favor, introduzca velocidad en km/h");
		v=sc.nextDouble();
		System.out.println(v+"km/h son "+ v*1000/3600 + "m/s" );
	}

}
