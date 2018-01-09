package com.ipartek.formacion.ejercicios.estructurasecuencial;
import java.util.*;

/* 
 * Programa que calcule el área de un triángulo en función de las longitudes de sus lados (a, b, c)
 * según la siguiente fórmula: area=raiz2(p(p-a)(p-b)(p-c)) donde p = (a+b+c)/2 
 */

public class Ejercicio_009 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        double a;
        double b;
        double c;
        double p;
        
        System.out.print("Introduzca longitud del primer lado del triángulo: ");
        
        a = sc.nextDouble();
        
        System.out.print("Introduzca longitud del segundo lado del triángulo: ");
        
        b = sc.nextDouble();
        
        System.out.print("Introduzca longitud del tercer lado del triángulo: ");
        
        c = sc.nextDouble();
        
        p = (a+b+c)/2;
        
    System.out.println("Area -> " +  Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    
    sc.close();
    
	}
}
