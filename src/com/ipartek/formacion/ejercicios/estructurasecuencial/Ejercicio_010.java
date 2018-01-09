package com.ipartek.formacion.ejercicios.estructurasecuencial;
import java.util.*;

/* 
 * Programa que lea un número de 3 cifras y muestre por pantalla las cifras del número
 */

public class Ejercicio_010 {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Introduzca valor de N: ");
        
        n = sc.nextInt(); //supondremos que el número introducido tiene 3 cifras
        
        System.out.println("Primera cifra de " + n + " -> " + (n/100)); 
        
        System.out.println("Cifra central de " + n + " -> " + (n/10)%10);
        
        System.out.println("Última cifra  de " + n + " -> " + (n%10));

        sc.close();
        
}
}