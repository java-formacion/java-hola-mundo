package com.ipartek.formacion.ejercicios.estructura.secuencial;

import java.util.Scanner;

/**
 * Programa Java que calcule el �rea de un tri�ngulo en funci�n de las longitudes de sus lados (a, b, c),
 *  seg�n la siguiente f�rmula:  
	Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))
	donde p =  (a+b+c)/2
	Para calcular la ra�z cuadrada se utiliza el m�todo Math.sqrt() 
	 * @author java
 *
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double a,b,c,p;
        System.out.print("Introduzca longitud del primer lado del tri�ngulo: ");
        a = sc.nextDouble();
        System.out.print("Introduzca longitud del segundo lado del tri�ngulo: ");
        b = sc.nextDouble();
        System.out.print("Introduzca longitud del tercer lado del tri�ngulo: ");
        c = sc.nextDouble();
        p = (a+b+c)/2;
        System.out.println("Area -> " +  Math.sqrt(p*(p-a)*(p-b)*(p-c)));

	}

}
