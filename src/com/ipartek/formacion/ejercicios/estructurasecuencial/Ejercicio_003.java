package com.ipartek.formacion.ejercicios.estructurasecuencial;
import java.util.*;

/**
 * 
 * Escribe un programa Java que lee un número entero por teclado 
 * y obtiene y muestra por pantalla el doble y el triple de ese número.
 *
 */
public class Ejercicio_003 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.println("Introduce un número entero:");
        
        n = sc.nextInt();
        
        System.out.println("Número introducido: " + n);
        
        System.out.println("Doble de " + n + " -> "+ 2*n);
        
        System.out.println("Triple de " + n + " -> "+ 3*n);
        
        sc.close();
	}
}
