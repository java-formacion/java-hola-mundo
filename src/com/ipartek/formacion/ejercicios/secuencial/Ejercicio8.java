package com.ipartek.formacion.ejercicios.secuencial;

import java.util.Scanner;

/**
 * 
 * Programa que tome como dato de entrada un n�mero que corresponde a la
 * longitud del radio una esfera y nos calcula y escribe el volumen de la esfera
 * que se corresponden con dicho radio.
 * 
 * La f�rmula para calcular el volumen de la esfera es v = (4/3)*PI*r^3
 * 
 * 
 * La operaci�n para calcular el volumen es: (4.0/3)* Math.PI * Math.pow(radio,
 * 3))
 * 
 * Debemos tener cuidado con la divisi�n entre n�meros enteros. Si hacemos 4/3
 * nos da como resultado 1, por eso se debe escribir al menos uno de los dos
 * n�meros como double. En este caso se ha puesto el numerador como double
 * simplemente escribiendo 4.0 y de esta forma el resultado de la divisi�n 4.0/3
 * ser� de tipo double.
 *
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Inserta la longitud del radio para calcular el volumen:");
		double radio = sc.nextDouble();
		System.out.println("El volumen de la esfera es de: "+((4.0/3.0)*Math.PI*Math.pow(radio, 3)));

	}

}
