package ejercicios.secuenciales;

import java.util.*;

/**
 * 
 * @author java
 *
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double grados;
		System.out.println("Cuantos grados centígrados tenemos? ");
		grados = sc.nextDouble();
		double fahrenheit = 32 + ((9 * grados) / 5);
		System.out.println("Eso son " + fahrenheit + " grados fahrenheit");
	}
}
