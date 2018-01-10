package com.ipartek.formacion.ejercicios.generales;
import java.util.*;

/**
 * Programa que lea dos variables 
 * numéricas A y B e 
 * intercambie sus contenidos. 
 */

public class Ejercicio_001 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int a;
        int b;
        int aux;
        
        System.out.print("Introduzca valor de A: ");
        
        a = sc.nextInt();
        
        System.out.print("Introduzca Valor de B: ");
        
        b = sc.nextInt();
        
        System.out.println("Valores iniciales: A = " + a + "   B = " + b);
        
        //instrucciones para hacer el intercambio
        //se utiliza una variable auxiliar
        
        aux = a;
        a = b;
        b = aux;    
        
        System.out.println("Valores intercambiados: A = " + b + "   B = " + b);
        
        sc.close();
        
	}
}
