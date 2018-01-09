package com.ipartek.formacion.ejercicios.estructuracondicional;
import java.util.*;

/**
 * 
 * El programa lee por teclado tres números enteros y calcula y muestra el mayor de los tres.
 *
 */

public class Ejercicio_008 {

	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);
	      
	      int n1;
	      int n2;
	      int n3;
	      
	      System.out.print("Introduzca primer número: ");
	      
	      	n1 = sc.nextInt();
	      
	    System.out.print("Introduzca segundo número: ");
	    
	    	n2 = sc.nextInt();
	      
	      System.out.print("Introduzca tercer número: ");
	      
	        n3 = sc.nextInt();
	        
	        if(n1 > n2)
	           if(n1>n3)
	              System.out.println("El mayor es: " + n1);
	           else
	              System.out.println("el mayor es: " + n3);
	        else if(n2>n3)
	              System.out.println("el mayor es: " + n2);
	                else
	              System.out.println("el mayor es: " + n3);
	        
	        sc.close();
	        
	}
}
