package com.ipartek.formacion.ejercicios.estructurasecuencial;
import java.util.*;

/*
 *  Programa Java que lea dos n�meros enteros por teclado 
 *  y los muestre por pantalla.
 */
public class Ejercicio_001 {

	public static void main(String[] args) {
		
        int a;
        int b;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un n�mero entero: ");
        
        a = sc.nextInt();

        System.out.println("Introduce otro n�mero entero: ");
        
        b = sc.nextInt();

        System.out.println("Ha introducido los n�meros: " + a + " y " + b);
        
        sc.close();
	}
	
}
