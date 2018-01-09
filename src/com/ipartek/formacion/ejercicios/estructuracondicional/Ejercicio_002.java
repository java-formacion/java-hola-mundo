package com.ipartek.formacion.ejercicios.estructuracondicional;
import java.util.*;

/**
 * Programa que lea un número entero y muestre si el número es múltiplo de 10.
 * Podemos comprobar si un número entero es múltiplo de 10 si al dividirlo 
 * por 10 es resto de esta división es cero.
 * 
 */

public class Ejercicio_002 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Número entero: ");
        
        n = sc.nextInt(); 
        
        if(n%10==0)
        	
           System.out.println("Este numero es múltiplo de 10");   
        
        else
        	
         System.out.println("Este numero no es múltiplo de 10");
        
        sc.close();
        
	}
}
