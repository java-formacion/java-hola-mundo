package com.ipartek.formacion.ejercicios.estructurasecuencial;
import java.util.*;

/**
 * 
 * Programa que lea un n�mero entero N de 5 cifras y muestre 
 * sus cifras igual que en el ejemplo.
 *
 * Por ejemplo para un n�mero N = 12345   La salida debe ser:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 */

public class Ejercicio_011 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Introduzca valor de n: ");
        
        n = sc.nextInt(); //supondremos que el n�mero introducido tiene 5 cifras
        
        System.out.println(n/10000);
        
        System.out.println(n/1000);
        
        System.out.println(n/100);
        
        System.out.println(n/10);
        
        System.out.println(n);
        
        sc.close();
        
	}
}
