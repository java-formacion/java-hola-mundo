package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Vamos a escribir el programa que calcula si dos números son amigos:
 * @author java
 *
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		int i,suma=0, n1, n2;
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

	}

}
