package com.ipartek.formacion.ejercicios.generales;
import java.util.*;

/**
 * 
 * COMPROBAR SI DOS NÚMEROS SON AMIGOS
 * Dos números enteros positivos A y B son números amigos si la suma de los 
 * divisores propios de A es igual a B y la suma de los divisores propios de B es igual a A.
 * 
 * Los divisores propios de un número incluyen la unidad pero no el propio número.
 *
 */

public class Ejercicio_007 {

	public static void main(String[] args) {
		
        int i;
        int suma = 0;
        int n1;
        int n2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce primer número: ");
        
        n1 = sc.nextInt();
        
        System.out.print("Introduce segundo número: ");
        
        n2 = sc.nextInt();
        
        for(i=1;i<n1;i++){  // for para sumar todos los divisores propios de n1
             if(n1%i==0){
                suma=suma+i;
             }
        }
        
        // si la suma de los divisores de n1 es igual a n2
        
        if(suma==n2){
           suma=0;
           for(i=1;i<n2;i++){  // sumo los divisores propios de n2
                if(n2%i==0){
                   suma=suma+i;
               }
           }
           
        // si la suma de los divisores de n2 es igual a n1
           
           if(suma==n1){
              System.out.println("Son Amigos");
           }else{
                   System.out.println("No son amigos");
           }
        }        
        else{
               System.out.println("No son amigos");
        }
        
        sc.close();
    }
}
