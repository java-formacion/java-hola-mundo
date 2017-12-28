package ejerciciosEstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa que tome como dato de entrada un número que corresponde a la longitud 
 * el radio una esfera y nos calcula y escribe el volumen de la esfera que se corresponden con dicho radio.

La fórmula para calcular el volumen de la esfera es 
v = (4/3)*PI*r^3

 *
 */
public class ej8 {

	public static void main(String[] args) {
		double r,v;
		System.out.println("introduce radio");
		Scanner sc = new Scanner (System.in);
		r= sc.nextDouble();
		v=(4.0/3)* Math.PI * Math.pow(r, 3);
		System.out.println("Volumen  = "  + v);
		

	}

}
