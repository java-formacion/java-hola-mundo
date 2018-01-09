package com.ipartek.formacion.ejercicios.generales;
import java.util.*;
import java.io.*;

/**
 * 
 * Programa Java que calcula el n�mero de cifras que tiene un n�mero entero
 *
 */

public class Ejercicio_002 {

	public static void main(String[] args) throws IOException {
		
        Scanner sc = new Scanner(System.in);
        
        int n;
        int cifras;
        
        char car;
        
        do{
            System.out.print("Introduce un n�mero entero: ");
            
            n = sc.nextInt();
            
            cifras= 0;    //esta variable es el contador de cifras
            
            while(n!=0){             //mientras a n le queden cifras
                    n = n/10;         //le quitamos el �ltimo d�gito
                   cifras++;          //sumamos 1 al contador de cifras
            }
            
            System.out.println("El n�mero tiene " + cifras+ " cifras");
            
            System.out.print("Continuar? ");
            
            car = (char)System.in.read();
            
        }while(car!='n' && car != 'N');    
        
        sc.close();
        
    }
}

