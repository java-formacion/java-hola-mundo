package com.ipartek.formacion.ejercicios.generales;
import java.util.*;

/**
 * 
 * Programa que lea una serie de números por teclado hasta que se lea un número negativo. 
 * 
 * El programa indicará cuántos números acabados en 2 se han leído.
 * 
 * Para saber si un número acaba en dos o en general para saber en qué dígito termina un número entero 
 * se divide el número entre 10 y se obtiene el resto de esta división.
 *
 */

public class Ejercicio_005 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int n;
        int contador = 0;
        
        System.out.print("Introduce un número entero: ");
        
        n = sc.nextInt();
        
        while(n>=0){
        	
              if(n%10==2)  //Si el número acaba en dos
                 contador++;       //esta variable contendrá cuántos números acabados en 2 se han leído.
              
              System.out.print("Introduce otro número entero: ");
              
              n = sc.nextInt();
    }
        System.out.println("Se han introducido " + contador + " números acabados en 2");
        
        sc.close();
    }
}
