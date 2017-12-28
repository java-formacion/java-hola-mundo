package ejercicios.secuenciales;

import java.util.*;

/**
 * 
 * @author java
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double velocidad;
		System.out.println("A qué velocidad circulabas en km/h?");
		velocidad = sc.nextDouble();
		System.out.println("La velocidad en m/s es: "+(velocidad*1000/3600));

	}

}
