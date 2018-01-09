package com.ipartek.formacion.ejercicios.estructurasecuencial;
import java.util.*;

/* 
 * Programa que calcule el �rea de un tri�ngulo en funci�n de las longitudes de sus lados (a, b, c)
 * seg�n la siguiente f�rmula: area=raiz2(p(p-a)(p-b)(p-c)) donde p = (a+b+c)/2 
 */

public class Ejercicio_009 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        double a;
        double b;
        double c;
        double p;
        
        System.out.print("Introduzca longitud del primer lado del tri�ngulo: ");
        
        a = sc.nextDouble();
        
        System.out.print("Introduzca longitud del segundo lado del tri�ngulo: ");
        
        b = sc.nextDouble();
        
        System.out.print("Introduzca longitud del tercer lado del tri�ngulo: ");
        
        c = sc.nextDouble();
        
        p = (a+b+c)/2;
        
    System.out.println("Area -> " +  Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    
    sc.close();
    
	}
}
