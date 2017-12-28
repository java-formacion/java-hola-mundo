package com.ipartek.formacion.ejercicios.estructura.secuencial;

import java.util.Scanner;

/**
 * Programa lea la longitud de los catetos de un tri�ngulo rect�ngulo 
 * y calcule la longitud de la hipotenusa seg�n el teorema de Pit�goras.
 * @author java
 *
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double cateto1, cateto2;
        System.out.print("Introduzca longitud del primer cateto: ");
        cateto1 = sc.nextDouble();
        System.out.print("Introduzca longitud del segundo cateto: ");
        cateto2 = sc.nextDouble();
      System.out.println("Hipotenusa -> " +  Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2, 2)));

	}

}
