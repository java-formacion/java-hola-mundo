package com.ipartek.formacion.ejercicios.estructuracondicional;
import java.io.IOException;
import java.util.*;

/**
 * Programa que lea un car�cter por teclado y compruebe si es una letra may�scula
 */

public class Ejercicio_003 {
	
	public static void main(String[] args) throws IOException {
		
        Scanner sc = new Scanner(System.in);
        
        char car;
        
        System.out.print("Introduzca un car�cter: ");
        
        car = (char)System.in.read(); //lee un solo caracter
       
        if(Character.isUpperCase(car)) //utilizamos el m�todo isUpperCase de la clase Character
        	
           System.out.println("Es una letra may�scula");  
        
        else
        	
            System.out.println("No es una letra may�scula");   
        
        sc.close();
        
	}

}
