package com.ipartek.formacion.ejercicios.estructura.secuencial;

import java.util.Scanner;

/**
 * Programa que lee por teclado el valor del radio de una circunferencia 
 * y calcula y muestra por pantalla la longitud y el �rea de la circunferencia. 
 * @author java
 *
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double radio, longitud, area;
        System.out.println("Introduce radio de la circunferencia:");
        radio = sc.nextDouble();
        longitud = 2 * Math.PI * radio; 
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("Longitud de la circunferencia -> " + longitud);
        System.out.println("Area de la circunferencia -> " + area);

	}

}
