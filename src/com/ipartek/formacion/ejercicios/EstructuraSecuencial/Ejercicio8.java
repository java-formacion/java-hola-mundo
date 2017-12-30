package com.ipartek.formacion.ejercicios.EstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa que calcula el volumen de una esfera.
 * v=4/3xpixr3
 * @author mikel
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		double pi=3.1415926535;
		double r;
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe el valor de la radio");
		r=sc.nextDouble();
		System.out.println("El volumen es: "+4/3*pi*Math.pow(r, 3));
		sc.close();
		//raiz cuadrada -->Math.sqrt()
		//al cubo Math.pow(variable,2)
	}

}
