package com.ipartek.formacion.ejercicios.estructurasecuencial;
import java.util.*;

/**
 * 
 * Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año)
 *  y calcule su número de la suerte.
 *  
 *  El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento 
 *  y a continuación sumando las cifras obtenidas en la suma.
 *  
 *  Por ejemplo:
 *  
 *  Si la fecha de nacimiento es 12/07/1980 Calculamos el número de la suerte así: 
 *  
 *  12+7+1980 = 1999  1+9+9+9 = 28
 *  
 *  Número de la suerte: 28
 *
 */

public class Ejercicio_013 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int dia;
        int mes;
        int año;
        int suerte;
        int suma;
        int cifra1;
        int cifra2;
        int cifra3;
        int cifra4;
        
        System.out.println("Introduzca fecha de nacimiento");
        
        System.out.print("día: ");
        
        dia = sc.nextInt();
        
        System.out.print("mes: ");
        
        mes = sc.nextInt();
        
        System.out.print("año: ");
        
        año = sc.nextInt();
        
        suma = dia + mes + año;
        
        cifra1 = suma/1000;      //obtiene la primera cifra
        
        cifra2 = suma/100%10;  //obtiene la segunda cifra
        
        cifra3 = suma/10%10;   //obtiene la tercera cifra
        
        cifra4 = suma%10;        //obtiene la última cifra
        
        suerte = cifra1 + cifra2 + cifra3 + cifra4;
        
        System.out.println("Su número de la suerte es: " + suerte);
        
        sc.close();
        
	}
}
