package com.ipartek.formacion.ejercicios.estructurasecuencial;
import java.util.*;

/*
 *  Programa Java que lea dos números enteros por teclado 
 *  y los muestre por pantalla.
 */
public class Ejercicio_001 {

	public static void main(String[] args) {
		
        int a;
        int b;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número entero: ");
        
        a = sc.nextInt();

        System.out.println("Introduce otro número entero: ");
        
        b = sc.nextInt();

        System.out.println("Ha introducido los números: " + a + " y " + b);
        
        sc.close();
	}
	
}
