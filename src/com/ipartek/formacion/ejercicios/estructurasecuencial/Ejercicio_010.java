package com.ipartek.formacion.ejercicios.estructurasecuencial;
import java.util.*;

/* 
 * Programa que lea un n�mero de 3 cifras y muestre por pantalla las cifras del n�mero
 */

public class Ejercicio_010 {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Introduzca valor de N: ");
        
        n = sc.nextInt(); //supondremos que el n�mero introducido tiene 3 cifras
        
        System.out.println("Primera cifra de " + n + " -> " + (n/100)); 
        
        System.out.println("Cifra central de " + n + " -> " + (n/10)%10);
        
        System.out.println("�ltima cifra  de " + n + " -> " + (n%10));

        sc.close();
        
}
}