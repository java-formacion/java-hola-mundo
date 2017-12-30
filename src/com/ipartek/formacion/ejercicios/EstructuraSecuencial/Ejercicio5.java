package com.ipartek.formacion.ejercicios.EstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa que lee por teclado el valor del radio de una circunferencia y calcula y 
 * muestra por pantalla la longitud y el área de la circunferencia. 
 * Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2  
 * @author mikel
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		int r;
		double pi=3.1415926535;
		double longitud;
		double area;
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe el ratio de la circunferencia:");
		r=sc.nextInt();
		longitud=2*pi*r;
		area=pi*(r^2);
		System.out.println("La longitud de la circunferencia es: "+longitud);
		System.out.println("El area de la circunferencia es: "+area);
	}

}
