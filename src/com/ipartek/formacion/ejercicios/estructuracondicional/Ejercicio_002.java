package com.ipartek.formacion.ejercicios.estructuracondicional;
import java.util.*;

/**
 * Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de 10.
 * Podemos comprobar si un n�mero entero es m�ltiplo de 10 si al dividirlo 
 * por 10 es resto de esta divisi�n es cero.
 * 
 */

public class Ejercicio_002 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("N�mero entero: ");
        
        n = sc.nextInt(); 
        
        if(n%10==0)
        	
           System.out.println("Este numero es m�ltiplo de 10");   
        
        else
        	
         System.out.println("Este numero no es m�ltiplo de 10");
        
        sc.close();
        
	}
}
