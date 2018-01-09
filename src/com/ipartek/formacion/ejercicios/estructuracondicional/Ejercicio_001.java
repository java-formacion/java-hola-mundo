package com.ipartek.formacion.ejercicios.estructuracondicional;
import java.util.*;

/**
 * 
 * Programa Java que lea un número entero por teclado y calcule si es par o impar.
 * Podemos saber si un número es par si el resto de dividir el número entre 2 es igual a cero. 
 * En caso contrario el número es impar
 *
 */

public class Ejercicio_001 {
	
	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Introduzca Número entero: ");
        
        n = sc.nextInt(); 
        
        if(n%2==0)
        	
           System.out.println("Este numero es Par");  
        
        else
        	
            System.out.println("Este numero es Impar");  
        
        sc.close();
        
	}
}
