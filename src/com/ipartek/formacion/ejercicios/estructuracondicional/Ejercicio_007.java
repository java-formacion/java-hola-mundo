package com.ipartek.formacion.ejercicios.estructuracondicional;
import java.util.*;

/**
 * 
 * Programa que lea dos números por teclado y muestre el resultado 
 * de la división del primer número por el segundo. 
 * 
 * Se debe comprobar que el divisor no puede ser cero.
 *
 */

public class Ejercicio_007 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        double dividendo;
        double divisor;
        
        System.out.print("Introduzca el dividendo: ");
        
        dividendo = sc.nextDouble(); 
        
        System.out.print("Introduzca el divisor: ");
        
        divisor = sc.nextDouble(); 
        
        if(divisor==0)
           System.out.println("No se puede dividir por cero");    
        else{
            System.out.println(dividendo + " / " + divisor + " = " + dividendo/divisor);   
            System.out.printf("%.2f / %.2f = %.2f %n" , dividendo, divisor , dividendo/divisor);
		
            sc.close();
            
	}
}
}
