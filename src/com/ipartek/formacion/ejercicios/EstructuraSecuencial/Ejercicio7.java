package com.ipartek.formacion.ejercicios.EstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa lea la longitud de los catetos de un triángulo rectángulo y 
 * calcule la longitud de la hipotenusa según el teorema de Pitágoras. 
 * @author mikel
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		double c1,c2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe el cateto de un triangulo rectangulo:");
		c1=sc.nextDouble();
		System.out.println("Escribe el  otro cateto de un triangulo rectangulo:");
		c2=sc.nextInt();
		sc.close();
		//System.out.println("El resultado es: "+);
		//(float) Math.sqrt(numero);
		System.out.println("Hipotenusa -> " +  Math.sqrt(Math.pow(c1,2)+ Math.pow(c2, 2)));
		//raiz cuadrada -->Math.sqrt()
		//al cubo Math.pow(variable,2)
		
	}

}
