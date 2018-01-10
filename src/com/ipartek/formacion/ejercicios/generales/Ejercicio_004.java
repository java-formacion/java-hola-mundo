package com.ipartek.formacion.ejercicios.generales;
import java.util.*;

/**
 * 
 * Programa Java que lea un número entero N y 
 * muestre la tabla de multiplicar de ese número.
 *
 */

public class Ejercicio_004 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Introduce un número entero: ");
        
        n = sc.nextInt();
        
        System.out.println("Tabla del " + n);
        
        for(int i = 1; i<=10; i++)
        	{
             System.out.println(n + " * " + i + " = " + n*i);
        	}
        sc.close();
	}
}