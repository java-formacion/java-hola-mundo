package ejercicios.secuenciales;

import java.util.*;
/**
 * Programa que tome como dato de entrada un número que corresponde a la longitud del radio una esfera y nos calcula y escribe el volumen de la esfera que se corresponden con dicho radio.
 * @author java
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radio;
		System.out.println("De cuantos cm de longitud es el radio de la esfera?");
		radio = sc.nextDouble();
		System.out.println("El volumen de la esfera es "+(4.0/3)*Math.pow(radio, 3)*Math.PI+" cm");

	}

}
