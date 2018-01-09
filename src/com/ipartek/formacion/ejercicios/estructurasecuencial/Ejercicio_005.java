package com.ipartek.formacion.ejercicios.estructurasecuencial;
import java.util.*;

/**
 * Ejercicio 5. Programa que lee por teclado el valor del radio de una circunferencia
 * y calcula y muestra por pantalla la longitud y el área de la circunferencia.
 * 
 * Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
 */

public class Ejercicio_005 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        double radio;
        double longitud;
        double area;
        
        System.out.println("Introduce radio de la circunferencia:");
        
        radio = sc.nextDouble();
        
        longitud = 2 * Math.PI * radio; 
        
        area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("Longitud de la circunferencia -> " + longitud);
        
        System.out.println("Area de la circunferencia -> " + area);
        
        sc.close();
	}
}
