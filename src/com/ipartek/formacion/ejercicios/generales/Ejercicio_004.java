package com.ipartek.formacion.ejercicios.generales;
import java.util.*;

/**
 * 
 * Programa Java que lea un n�mero entero N y 
 * muestre la tabla de multiplicar de ese n�mero.
 *
 */

public class Ejercicio_004 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Introduce un n�mero entero: ");
        
        n = sc.nextInt();
        
        System.out.println("Tabla del " + n);
        
        for(int i = 1; i<=10; i++)
        	{
             System.out.println(n + " * " + i + " = " + n*i);
        	}
        sc.close();
	}
}