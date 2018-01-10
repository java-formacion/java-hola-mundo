package com.ipartek.formacion.ejercicios.generales;
import java.util.*;
/**
 * 
 * Vamos a desarrollar el algoritmo para comprobar si un número es perfecto.
 * El programa pide por teclado un número y muestra si es perfecto o no. 
 * Mediante un bucle for sumaremos los divisores del número. 
 * Al final si esta suma es igual al número mostraremos el mensaje correspondiente.
 *
 */
public class Ejercicio_006 {

	public static void main(String[] args) {
		
        int i;
        int suma = 0;
        int n;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        
        n = sc.nextInt();
        
        for (i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1 
        	
            if (n % i == 0) {
                suma = suma + i;     // si es divisor se suma
            }
        }
        
        if (suma == n) {  // si el numero es igual a la suma de sus divisores es perfecto
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
        
        sc.close();
	}
}
