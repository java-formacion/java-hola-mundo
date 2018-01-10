package com.ipartek.formacion.ejercicios.generales;
import java.util.*;

/**
 * 
 * Programa que lea una serie de n�meros por teclado hasta que se lea un n�mero negativo. 
 * 
 * El programa indicar� cu�ntos n�meros acabados en 2 se han le�do.
 * 
 * Para saber si un n�mero acaba en dos o en general para saber en qu� d�gito termina un n�mero entero 
 * se divide el n�mero entre 10 y se obtiene el resto de esta divisi�n.
 *
 */

public class Ejercicio_005 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int n;
        int contador = 0;
        
        System.out.print("Introduce un n�mero entero: ");
        
        n = sc.nextInt();
        
        while(n>=0){
        	
              if(n%10==2)  //Si el n�mero acaba en dos
                 contador++;       //esta variable contendr� cu�ntos n�meros acabados en 2 se han le�do.
              
              System.out.print("Introduce otro n�mero entero: ");
              
              n = sc.nextInt();
    }
        System.out.println("Se han introducido " + contador + " n�meros acabados en 2");
        
        sc.close();
    }
}
